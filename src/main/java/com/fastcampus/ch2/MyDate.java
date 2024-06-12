package com.fastcampus.ch2;

/*
getter()는 클래스안에 해당값을 가져오기 위함

setter()는 클래스안에 해당값을 수정하기위함 (컨트롤러에서 클라이언트측으로 매개변수받을때 MyDate클래스의 변수를 수정하기위함)
setter()없으면 jsp의 ${myDate.year}값이 나오지 않는다.
jsp에서 ${myDate.year}를 호출할때, SetterCall클래스처럼 setter()를 사용하기때문이다.
 */


public class MyDate {
	private int year;
	private int month;
	private int day;
	
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
	
	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
	
	
}
