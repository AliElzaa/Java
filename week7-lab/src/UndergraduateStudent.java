import java.util.Arrays;//imports the array class
public class UndergraduateStudent extends Student{ //this extends from the class student

 int year;

 String course;
//instance variables

UndergraduateStudent(String name, String DoB, String studentID, int[] marks, int year, String course){ //this is the constructor for the class
	super(name, DoB, studentID, marks); //here we are inherting the variables from the previous class
	this .year = year; 
	this.course = course;
	//our variables within the constructor
}
	int getFinalMark(){
		int fullMark = 0; //we define a variable starting at 0
		Arrays.sort(marks);  //this sorts the array in ascending order

		for  ( int i =1; i < marks.length; i++) { //goes through the array
			fullMark += marks[i]; //and makes the variable equal to largest 3 grades within the array

	}
	fullMark /= 3; //returns the average of the best 3 grades
	return fullMark;
}

	public String getGrade(){

        if (this.getFinalMark() >= 40){ //if the grade is above or equal to 40
            return "Pass"; //return pass
        }else if (this.getFinalMark() < 40) { //if it is less than 40
            return "Fail"; //return fail
        }

        return null; //otherwise return null as no grades have been set
    }

public String toString(){
	return super.toString() + " Student year: " + this.year + " program of study: " + this.course; //prints out every string
}
}
