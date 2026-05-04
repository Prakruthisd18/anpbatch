package lab2;
import java.util.*;
public class TriangleChecker {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);

	        double a = sc.nextDouble();
	        double b = sc.nextDouble();
	        double c = sc.nextDouble();
	        if (a + b > c && a + c > b && b + c > a) {
	            System.out.println("Valid Triangle");

	            if (a == b && b == c) {
	                System.out.println("Equilateral");
	            } else if (a == b || b == c || a == c) {
	                System.out.println("Isosceles");
	            } else {
	                System.out.println("Scalene");
	            }

	            double[] sides = {a, b, c};
	            Arrays.sort(sides); 

	            if (Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2)) {
	                System.out.println("Right Triangle");
	            } else {
	                System.out.println("Not a Right Triangle");
	            }

	        } else {
	            System.out.println("Invalid Triangle");
	        }

	        sc.close();
	    }
	}

