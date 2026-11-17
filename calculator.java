import java.util.*;
public class calculator{
  public static void main(String args[]){
    System.out.println("=====**Calculator**=====");
		System.out.print("Enter a oeration(+,-,*,/): ");
		char op=sc.next().charAt(0);
		System.out.print("Enter first number: ");
		int e=sc.nextInt();
		System.out.print("Enter second number: ");
		int f=sc.nextInt();
		System.out.println("=====**=====**=====");
		switch (op){
			case '+':
			System.out.println("Addition: "+(e+f));
			break;
			case '-':
			System.out.println("Subraction: "+(e-f));
			break;
			case '*':
			System.out.println("Multiplication: "+(e*f));
			break;
			case 4:
			System.out.println("Division: "+(e/f));
			break;
			default:
			System.out.println("Enter valid operator..!");
			break;
		}
		
	}
}
