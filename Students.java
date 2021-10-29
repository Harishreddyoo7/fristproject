package pratices_prblms;

import java.util.Scanner;

public class Students {
	String name , gender , address ;
	int age,totalMarks;
	final int roll_no = 0;
	long phone_no;
	public Students() {
		this.name = "Devi";
		this.age = 21;
	    this.gender = "Female";
	    this.totalMarks = 90;
	    this.phone_no = 9951774407l;
	    this.address = "Visakhapatnam";
	}
	public Students(String name, int age , String gender , int roll_no , int totalMarks,long phone_no,String address) {
		this.name = name;
		this.age = age;
	    this.gender = gender;
	    this.totalMarks = totalMarks;
	    this.phone_no = phone_no;
	    this.address = address;
	}
	public Students(String name, int age , String gender , int totalMarks,long phone_no,String address) {
		this.name = name;
		this.age = age;
	    this.gender = gender;
	    this.totalMarks = totalMarks;
	    this.phone_no = phone_no;
	    this.address = address;
	}
	public Students(Students totalMarks, Students address,Students age){
        this.totalMarks = totalMarks.totalMarks;
        this.address = address.address;
        this.age = age.age;
	}
	    
	    public void studentDetails() {
	    	System.out.println(name);
			System.out.println(age);
			System.out.println(gender);
			System.out.println(roll_no);
			System.out.println(totalMarks);
			System.out.println(phone_no);
			System.out.println(address);
			
			
	    }
		
	public static void main(String[] args) {
		Students student1 = new Students() ;
		student1.studentDetails();
		
		Students student2 = new Students("Harish",21,"Male",1,85,7036262856l,"Viskhapatnam Andhra Pradesh") ;
		student2.studentDetails();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the student:");
		String name = scan.next();
		System.out.println("Enter the age of the student:");
		int age = scan.nextInt();
		System.out.println("Enter the gender of the student:");
		String gender = scan.next();
		System.out.println("Enter the totalMarks of the student:");
		int totalMarks = scan.nextInt();
		System.out.println("Enter the address of the student:");
		String address = scan.next();
		System.out.println("Enter the phone no of the student:");
		long phone_no  = scan.nextLong();
		scan.close();
		
		Students student3 = new Students(name,age,gender,totalMarks,phone_no,address);
		student3.studentDetails();
		
		Students student4 = new Students("Kusuma",26,"Female",4,83,7396350171l,"Viskhapatnam Andhra Pradesh");
		student4.studentDetails();
		
		Students student5 = new Students(student2,student2,student3);
		student5.studentDetails();
		
		System.out.println("Topper of the class is "+student1.name + " with total marks "+ student1.totalMarks);
		
	}

}
