package cal;

import java.util.Calendar;

public class Calen {
 private Calendar ca = null;

 private int year;
 private int month;
 private int day;
 private int last;
 private int week;
 private int pryear;
 private int prmonth;
 private int nextyear;
 private int nextmonth;
 private int tyear;
 private int tmonth;
 private int tday;
 public void set(String ye, String mo, String da) {
  ca = Calendar.getInstance();
  tyear=ca.get(Calendar.YEAR);
  tmonth=ca.get(Calendar.MONTH)+1;
  tday=ca.get(Calendar.DAY_OF_MONTH);
  if (ye != null || mo != null) {
   if (da == null) {
    ca.set(Integer.parseInt(ye),
      Integer.parseInt(mo) - 1, 1);
   } else {
    ca.set(Integer.parseInt(ye),
      Integer.parseInt(mo) - 1, Integer.parseInt(da));
   }
  }
  year=ca.get(Calendar.YEAR);
  month=ca.get(Calendar.MONTH)+1;
  day=ca.get(Calendar.DAY_OF_MONTH);
  ca.set(year,month-1, 1);
  last=ca.getActualMaximum(Calendar.DATE);
  week=ca.get(Calendar.DAY_OF_WEEK);
  if(month==1){
        pryear=year-1;
        prmonth=12;
  }else{
     pryear=year;
     prmonth=month-1;
  }
  if(month==12){
     nextyear=year+1;
     nextmonth=1;
  }else{
     nextyear=year;
     nextmonth=month+1;
  }
 }
 public int getTyear() {
	return tyear;
}
public int getTmonth() {
	return tmonth;
}
public int getTday() {
	return tday;
}
public Calendar getCa() {
  return ca;
 }
 public void setCa(Calendar ca) {
  this.ca = ca;
 }
 public int getYear() {
  return year;
 }
 public void setYear(int year) {
  this.year = year;
 }
 public int getMonth() {
  return month;
 }
 public void setMonth(int month) {
  this.month = month;
 }
 public int getDay() {
  return day;
 }
 public void setDay(int day) {
  this.day = day;
 }
 public int getLast() {
  return last;
 }
 public void setLast(int last) {
  this.last = last;
 }
 public int getWeek() {
  return week;
 }
 public void setWeek(int week) {
  this.week = week;
 }
 public int getPryear() {
  return pryear;
 }
 public void setPryear(int pryear) {
  this.pryear = pryear;
 }
 public int getPrmonth() {
  return prmonth;
 }
 public void setPrmonth(int prmonth) {
  this.prmonth = prmonth;
 }
 public int getNextyear() {
  return nextyear;
 }
 public void setNextyear(int nextyear) {
  this.nextyear = nextyear;
 }
 public int getNextmonth() {
  return nextmonth;
 }
 public void setNextmonth(int nextmonth) {
  this.nextmonth = nextmonth;
 }
}