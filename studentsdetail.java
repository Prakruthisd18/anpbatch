package day8;
class student1{
	String name="Alex";
	int marks=80;
}
class student2{
	String name="Jacob";
	int marks=91;
}
public class studentsdetail {

	public static void main(String[] args) {
		student1 s1= new student1();
		student2 s2=new student2();
		System.out.println(s1.name);
		System.out.println(s1.marks);
		System.out.println(s2.name);
		System.out.println(s2.marks);
		
	}

}
