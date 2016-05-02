package edu.saintjoe.cs.brianc.realworld;

public class StudentDriver {

	public static void main(String[] args) {
		// See what we can do about our class and students
		
		int studentCount = 0;
		
		Course cmp112 = new Course("CMP112A", "B. Capouch", "Core 125");
		
		Student nextStudent = new Student("Wiley Abbott", "M", 1, 18, "1:00 pm");
		// To put data into our private array, we had to write a mutator
		//  We pass it a filled-in Student record, and our "counter" which is studentCount
		cmp112.setStudent(nextStudent, (studentCount++));
		nextStudent = new Student("Jim Ballew", "M", 2, 19, "1:00 pm");
		cmp112.setStudent(nextStudent, studentCount++);
		nextStudent = new Student("Christine Black", "F", 1, 20, "1:00 pm");
		cmp112.setStudent(nextStudent, studentCount++);
		nextStudent = new Student("William Smith", "M", 1, 19, "1:00 pm");
		cmp112.setStudent(nextStudent, studentCount++);
		System.out.println(cmp112.toString()); 

	}

}
