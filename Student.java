package pratices_prblms;

public class Student {
	private int StudentId;
	private String StudentName;
	private String FirstName;
	private String LastName;
	private String InstituteName;
	private String CourseName;
	private String EMailId;
	private String MobileNumber;
	
	public Student(int StudentId , String StudentName) {
		this.StudentId = StudentId;
		this.StudentName = StudentName;
	}
	public Student() {
		this.StudentId = 2;
		this.StudentName = "Kusuma";
	}
	public void show() {
		System.out.println("My name is " + StudentName + " and my studentid number is " + StudentId  );
	}
	
	
	
    public void setStudentId(int StudentId) {
    	this.StudentId = StudentId;
    }
    public void setStudentName(String StudentName) {
    	this.StudentName = StudentName;
    }
    public void setFirstName(String FirstName) {
    	this.FirstName = FirstName;
    }
    public void setLastName(String LastName) {
    	this.LastName = LastName;
    }
    public void setInstituteName(String InstituteName) {
    	this.InstituteName = InstituteName;
    }
    public void setCourseName(String CourseName) {
    	this.CourseName = CourseName;
    }
    public void setEMailId(String EMailId) {
    	this.EMailId = EMailId ;
    }
    public void setMobileNumber(String MobileNumber) {
    	this.MobileNumber = MobileNumber ;
    }
    
    
    public int getStudentId() {
    	return this.StudentId;
    }
    public String getStudentName() {
    	return this.StudentName;
    }
    public String getFirstName() {
    	return this.FirstName;
    }
    public String getLastName() {
    	return this.LastName;
    }
    public String getInstituteName() {
    	return this.InstituteName;
    }
    public String getCourseName() {
    	return this.CourseName;
    }
    public String getEMailId() {
    	return this.EMailId;
    }
    public String getMobileNumber() {
    	return this.MobileNumber;
    }

}
