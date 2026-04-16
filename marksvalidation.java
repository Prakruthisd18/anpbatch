package day3;

public class marksvalidation {

	public static void main(String[] args) {
		int m=80;
		if(m<=100 && m>=81)
		{
			System.out.println("Distinction");
		}
		else if(m<=80 && m>=60)
		{
			System.out.println("First Class");
			
		}
		else if(m<=59 && m>=35)
		{
			System.out.println("secind class");
		}
		else
		{
			System.out.println("Fail");
		}
		

	}

}
