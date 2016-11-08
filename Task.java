class Task{
	private int dueDay, dueMonth, dueYear, dueHour, dueMinute;
	private int count1 = 0;
	private int[] dueDate = {dueDay, dueMonth, dueYear, dueHour, dueMinute};
	Task(int dueDay, int dueMonth, int dueYear, int dueHour,int dueMinute){
		this.dueDay =dueDay;
		this.dueMonth = dueMonth;
		this.dueYear = dueYear;
		this.dueHour = dueHour;
		this.dueMinute = dueMinute;
	}
	int[] getDueDate(){
		return dueDate;
	}
	void setDueDay(int dueDay){
		this.dueDay = dueDay;
	}
	void setDueMonth(int dueMonth){
		this.dueMonth = dueMonth;
	}
	void setDueYear(int dueYear){
		this.dueYear = dueYear;
	}
	void setDueHour(int dueHour){
		this.dueHour = dueHour;
	}
	void setDueMinute(int dueMinute){
		this.dueMinute = dueMinute;
	}
	void addTimeSlot(int dayOfWeek, int day, int month, int year, int startHour, int startMinute, int endHour, int endMinute){
		//timeslots is from Scheduler class; provides array of TimeSlot objects for each day of month (31 days, max)
		TimeSlot ts = new TimeSlot(day, month, year, startHour, startMinute, endMinute, endHour);
		boolean freeSpot = false;
		if(ts.isSameDate(ts.getDay(),ts.getMonth(), ts.getYear(), Scheduler.timeslots[day][0].getDay(), Scheduler.timeslots[day][0].getMonth(), Scheduler.timeslots[day][0].getYear()){
			//check if time of day is taken; if yes, enter another timeslot, if no, enter the new timeslot given
			for(int i = 0; i < Scheduler.numSlotsPerDay; i++){
				if(ts.timeIsLessThan(startHour, Scheduler.timeslots[day][i].getStartHour,startMinute, Scheduler.timeslots[day][i].getStartMinute)||
				 ts.timeisGreaterThan(startHour, Scheduler.timeslots[day][i].getEndHour,startMinute, Scheduler.timeslots[day][i].getEndMinute)) {
					//set new time slot
					Scheduler.timeslots[day][] = ts;
				}
			}
		}
		else{
			//enter the new time slot
			for(int i = 0; i < Scheduler.numSlotsPerDay; i++){
				
			}
		}
		//BETTER WAY THAN GIANT IF STATEMENT???
		for(int i = 0; i < Scheduler.numSlotsPerDay; i++){ //loop through each posible time slot of the dayOfWeek given
			if(Scheduler.timeslots[dayOfWeek][i].getDay() == day && Scheduler.timeslots[dayOfWeek][i].getMonth() == month && Scheduler.timeslots[dayOfWeek][i].getyear() == year && 
			(((Scheduler.timeslots[dayOfWeek][i].startHour < startHour && Scheduler.timeslots[dayOfWeek][i].endHour < startHour)&& Scheduler.timeslots[dayOfWeek][i].endHour < startHour)// if the start time is less than the previous start and end time
			|| (Scheduler.timeslots[dayOfWeek][i].startHour > endHour &&))
			}
		}
		Scheduler.timeslots[dayOfWeek][???] = new TimeSlot(day, month, year, startHour, startMinute, endMinute, endHour);
	}
	void isValid(TimeSlot ){

	}
}