package cal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;


public class Dbmgr {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	
	ArrayList<Memo> al = new ArrayList<Memo>();
	
	String jdbcDriver = "jdbc:mysql://localhost:3306/jsp";
	String dbUser = "joy";
	String dbPass = "joy123";
	
	public Dbmgr(){
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection connect(){
		try {
			conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public void insert(Memo mem){
		String query = "insert into calendar values(0,?,?,?,?)";
		
		try {
			conn=connect();
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,mem.getName());
			pstmt.setString(2,mem.getMemo());
			pstmt.setString(3,mem.getPass());
			pstmt.setTimestamp(4, cal(mem.getYear(),mem.getMonth(),mem.getDay()));
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private Timestamp cal(String year, String month, String day) {
		Calendar ca=Calendar.getInstance();
		ca.set(Integer.parseInt(year),Integer.parseInt(month)-1,Integer.parseInt(day));
		
		return new Timestamp(ca.getTimeInMillis());
	}
	
	public ArrayList<Memo> selectlist(String yy, String mm, String dd){
		if(mm.length()<2) mm = "0"+mm;
		if(dd.length()<2) dd = "0"+dd;
		String st = yy+"-"+mm+"-"+dd;
		
		String query = "SELECT * from calendar WHERE date_FORMAT(wdate,'%Y-%m-%d')='"+st+"'";
		
		try {
			conn=connect();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				Memo mem = new Memo();
				mem.setNo(rs.getInt("no"));
				mem.setName(rs.getString("name"));
				mem.setPass(rs.getString("pass"));
				mem.setMemo(rs.getString("memo"));
				toStr(mem,rs.getTimestamp("wdate"));
				
				al.add(mem);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return al;
	}
	
	private void toStr(Memo mem, Timestamp t) {
		Calendar ca = Calendar.getInstance();
		
		ca.setTimeInMillis(t.getTime());
		String yy = String.valueOf(ca.get(Calendar.YEAR));
		String mm = String.valueOf(ca.get(Calendar.MONTH)+1);
		String dd = String.valueOf(ca.get(Calendar.DAY_OF_MONTH));
		mem.setYear(yy);
		mem.setMonth(mm);
		mem.setDay(dd);
	}
	
	public void delete(String no){
		String query = "delete from calendar where no=?";
		
		try {
			conn = connect();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, no);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void update(Memo mem, String no){
		String query = "update calendar set (?,?,?,?,?)";
		try {
			conn=connect();
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, no);
			pstmt.setString(2,mem.getName());
			pstmt.setString(3,mem.getMemo());
			pstmt.setString(4,mem.getPass());
			pstmt.setTimestamp(5, cal(mem.getYear(),mem.getMonth(),mem.getDay()));
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void Close(){
		if (stmt != null)
			try {
				stmt.close();
			} catch (SQLException ex) {}
		
		if (rs != null)
			try {
				rs.close();
			} catch (SQLException ex) {}
		
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException ex) {}
		if (conn != null)
			try {
				conn.close();
			} catch (SQLException ex) {}
	}
}