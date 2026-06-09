public class Student {
    private String studentID;
    private String studentName;
    private double marks;

    public Student(String studentID, String studentName, double marks) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.marks = marks;
    }

    public String getStudentID() { 
		return studentID; 
	}
    public String getStudentName() { 
		return studentName; 
	}
    public double getMarks() { 
		return marks; 
		}

   
    public String toString() {
        return "ID: " + studentID + " | Name: " + studentName + " | Marks: " + marks;
    }
}
