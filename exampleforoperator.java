package day2;

public class exampleforoperator {

	public static void main(String[] args) {
		System.out.println("---------Arithmetic Operators-----------");
		
		int num1=30;
		int num2=40;
		System.out.println("Addition " + (num1 + num2));
		System.out.println("Subtration " + (num1 - 12));
		System.out.println("Multiplication " + (num2 * 3));
		System.out.println("Division " + (num2/10));
		System.out.println("Modulas " + (num2 %3));
		
        System.out.println("--------arithmetic operators--------");	
        int x=10;
        x=x+5;
        System.out.println("value of x : "+x);
        x-=3;
        System.out.println("value of x : "+x);
        x/=2;
        System.out.println("value of x : "+x);
        x*=3;
        System.out.println("value of x : "+x);
        
        
        System.out.println("-----------comparison operators-------");
         int a=10;
         int b=20;
         System.out.println(a<b);//True
         System.out.println(a<=5);//False
         System.out.println(b>a);//True
         System.out.println(b>=50);//False
         System.out.println(a==b);//false
         System.out.println(a!=b);//True
         
         
         
         System.out.println("---------logical operator---------");
         int p=1;
         int q=2;
         boolean result=p<q && p==1;
         System.out.println(result);//True
         System.out.println(p<=4 || q==10);//True
         System.out.println(!true);//False
         System.out.println(!false);//True
         
         
         System.out.println("---------Unary Operator----------");
         int n=20;
         int m = n++  +  n--  +  ++n  +   n++   +   n--  +  ++n  -  --n;
         System.out.println(n);
         System.out.println(m);
         
         System.out.println("---------ternary operator--");
         int number2=300;
         
         int max=number1>number2 ? number1:number2;
         int m = n++  +  n--  +  ++n  +   n++   +   n--  +  ++n  -  --n;
         System.out.println("max of  two number is:" +max);
         
      }

}
