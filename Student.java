import java.util.Scanner;
class StudentDemo{
	private int Rno;
	private String Name;
	
	void setdata(int a,String name) {
		Rno=a;
		Name=name;
	}
	
	void showdata() {
		System.out.println("Roll no is : "+Rno+ " & name is : " +Name);
	}
	
}
public class Student {

	public static void main(String[] args) {
		StudentDemo e3 =new StudentDemo();
		e3.setdata(51, "Mohini");
		e3.showdata();
		StudentDemo e1 =new StudentDemo();
		e1.setdata(52, "Akash");
		e1.showdata();
		StudentDemo e2 =new StudentDemo();
		e2.setdata(53, "Parag");
		e2.showdata();
		
	}

}
