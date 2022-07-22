package Programs;

class Student{
	
	int rollno;
	String name;
	float Tot_mark;
	
	Student(){
		   this.name = "Rani" ;
		   this.rollno = 123;
		   this.Tot_mark = 490;
		   
		}
	Student(int r ,String n, float f){
		this.name=n;
		this.rollno=r;
		this.Tot_mark=f;
		
		
	}
	public void display() {
		System.out.println("Student name :"+ name);
		System.out.println("Student Roll no : "+ rollno);
		System.out.println("Student Total Mark "+ Tot_mark + "\n");
		}
	
}

public class ConstructorTypes {

	public static void main(String[] args) {
		System.out.println("Default constructor Example");
		Student stu1 = new Student();
		stu1.display();
		System.out.println("Parameter constructor Example");
		Student stu2 =new Student(145,"Keerthi",450);
		stu2.display();
		
		

	}

}
