package day4;

public class matirmony {

	public static void main(String[] args) {
		int age=24;//initializing and declaring variable and value
		String gender="Female"; //declaring value  and initializing
		if(gender=="Male") //checking gender using if statement
			{
			System.out.println("Your gender is male");
			System.out.println("gender saved successfully");
			if(age>=21) //checking age factor 
				{
				System.out.println("Eligible for marriage");
			}
			else {
				System.out.println("Not eligible for marriage");
			}
		}
			else if(gender=="Female")//checking if gender is equall to female
				{
				System.out.println("Your gender is Female");
			    System.out.println("gender saved successfully");
				
				if(age>=21) // checking age factor
					{
					System.out.println("Eligible for marriage");
				}
				else {
					System.out.println("Not eligible for marriage");
					}
			}
	}

}
