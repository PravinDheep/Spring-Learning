package com.corejava;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
//import java.util.List;
enum WeekDays{
		//Enum,iterator cannot be used. use for-each
		//Vector
		//ArrayList
		//Collection
		MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
		public int value;
		private WeekDays(int value){
			this.value = value;
		}
	}
class Week{
	
	public static void main(String[] args) {
		for(WeekDays days : WeekDays.values()){
			System.out.println(days + ">>" + days.value);
		}
	}
}