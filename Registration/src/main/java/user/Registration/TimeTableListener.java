package user.Registration;

import jakarta.persistence.PostLoad;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PostRemove;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreRemove;
import jakarta.persistence.PreUpdate;

public class TimeTableListener {
	@PrePersist
	public void sundayTeachers(TimeTable dayOnDuty) {
		dayOnDuty.day = DaysOfTheWeek.FRIDAY;
		System.out.println("Day of the week:" + dayOnDuty.day);
	}
	@PostPersist
	public void teacherDetails(TimeTable teacherDetails) {
		System.out.println("This is what you have stored in the database: " + "\n"
				+ "Teacher: " + teacherDetails.teacherName + "\n"
				+ "Subject: " + teacherDetails.subject + "\n"
				+ "Day of the week: " + teacherDetails.day);
	}
	@PreRemove
	public void preRemove(TimeTable preRemove) {
		System.out.println("Are you you want to remove this teacher?");
	}
	@PostRemove
	public void postRemove(TimeTable postRemove) {
		System.out.println("You have successfully removed a teacher from the database.");
	}
	@PreUpdate
	public void preUpdate(TimeTable preUpdate) {
		System.out.println("Are you sure you want to update this teacher's record");
	}
	@PostUpdate
	public void postUpdate(TimeTable postUpdate) {
		postUpdate.subject = "Economics";
	}
	@PostLoad
	public void postLoad(TimeTable postLoad) {
		System.out.println("Record loaded from the datebase:" + "\n"
	+ "Teacher: " + postLoad.teacherName + "\n"
	+ "Subject: " + postLoad.subject + "\n"
	+ "Day of the week: " + postLoad.day);
	}
		public static void main(String[] args) {
		

	}

}
