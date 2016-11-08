class TimeSlot{ //assumes the time slot does not span more than one day
	//CLASS VARIABLES
	private int day, month, year, startHour, startMinute, endMinute, endHour;
	private int[] values = {day, month, year, startHour, startMinute, endHour, endMinute};
	//CONSTRUCTOR
	TimeSlot(int day, int month, int year, int startHour, int startMinute, int endHour, int endMinute){
		this.day = day;
		this.month = month;
		this.year = year;
		this.startHour = startHour;
		this.startMinute = startMinute;
		this.endMinute = endMinute;
		this.endHour = endHour;
	}
	//SETTERS AND GETTERS
	int getValue(value){
		return value[i];
	}
	void setDay(int day){
		this.day = day;
	}
	void setMonth(int month){
		this.month = month;
	}
	void setYear(int year){
		this.year = year;
	}
	void setStartHour(int startHour){
		this.startHour = startHour;
	}
	void setStartMinute(int startMinute){
		this.startMinute = startMinute;
	}
	void setEndHour(int endHour){
		this.endHour = endHour;
	}
	void setEndMinute(int endMinute){
		this.endMinute = endMinute;
	}
	//CHECKS WHETHER DAY1 AND DAY2 ARE THE SAME DAY, MONTH, AND YEAR
	boolean isSameDate(int day1, int month1, int year1, int day2, int month2, int year2){
		if(year1 == year2 && month1 == month2 && day1 == day2){
			return true;
		}else{
			return false;
		}
	}
	//DETERMINES WHETHER TIME1 IS LESS THAN TIME2
	boolean timeIsLessThan(int hour1, int minute1, int hour2, int minute2){
		if(hour1 < hour2 || (hour1 == hour2 && minute1 < minute2)){
			return true;
		}else{
			return false;
		}
	}
	//DETERMINES WHETHER TIME1 IS GREATER THAN TIME2
	boolean timeIsGreaterThan(int hour1, int minute1, int hour2, int minute2){
		if(hour1> hour2 || (hour1 == hour2 && minute2>minute1)){
			return true;
		}else{
			return false;
		}
	}
}