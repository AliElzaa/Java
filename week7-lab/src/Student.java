

public class Student extends Person{

int [] marks = new int[5]; //makes the array length 5
String studentID;
String grade;
int finalmark;
//our instance variables

public Student(String name, String DoB, String studentID, int [] marks){ //our main constructor
	super(name, DoB); //inhert the variables from person
	this.studentID = studentID;
	this.marks = marks;
	//more variables
	

}

int getFinalMark() {
	int sum = 0;
	for(int i = 0; i < marks.length; i++) {
		sum += marks[i];
	} 
	  finalmark = sum / marks.length;
	return finalmark;
}  //this method calculates the average by storing each position with the array marks in a variable and dividing it by the length which returns the average

public String getGrade(){
//grading system
    if (this.getFinalMark() >= 70){
        return "A"; //if its above or equal to 70 return a
    }else if (this.getFinalMark() >= 60  && this.getFinalMark() < 70  ){
        return "B"; //if its above or equal to 60 but less than 70 return b
    }else if (this.getFinalMark() >= 50  && this.getFinalMark() < 60  ) {
        return "D";//if its above or equal to 50 but less than 60 return D
    }else if (this.getFinalMark() < 50  ) {
        return "F";//if its less than 50 return f
    }

    return null; //otherwise return null, as no grade has been set
}
		
}

