import java.util.*;

public class controlstaements{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		/*System.out.print("Enter a number: ");
		int n=sc.nextInt();
		String result=(n%2==0)? "Even" : "Odd";
		System.out.println("=====**=====**=====");
		System.out.println(result+" Number");
		System.out.println("=====**=====**=====");
		System.out.print("Enter a number: ");
		int a=sc.nextInt();
		if(n<a){
			if(n>9){
				System.out.println("Nested condition is true");
			}
		}else if(n>a){
			System.out.println("Else if condition is true");
		}else{
			System.out.println("Else is printing");
		}*/
		/*System.out.println("=====**week calender**=====");
		System.out.print("Enter a number(1-7): ");
		int b=sc.nextInt();
		System.out.println("=====**=====**=====");
		switch (b){
			case 1:
			System.out.println("Monday");
			break;
			case 2:
			System.out.println("Tuesday");
			break;
			case 3:
			System.out.println("Wednesday");
			break;
			case 4:
			System.out.println("Thursday");
			break;
			case 5:
			System.out.println("Friday");
			break;
			case 6:
			System.out.println("saturday");
			break;
			case 7:
			System.out.println("Sunday");
			break;
			default:
			System.out.println("Enter Correct value");
			break;
		}*/
		/*System.out.println("=====**Months**=====");
		System.out.print("Enter a month number: ");
		int c=sc.nextInt();
		System.out.println("=====**=====**=====");
		switch (c){
			case 1:
			System.out.println("January");
			break;
			case 2:
			System.out.println("February");
			break;
			case 3:
			System.out.println("March");
			break;
			case 4:
			System.out.println("April");
			break;
			case 5:
			System.out.println("May");
			break;
			case 6:
			System.out.println("June");
			break;
			case 7:
			System.out.println("July");
			break;
			case 8:
			System.out.println("August");
			break;
			case 9:
			System.out.println("September");
			break;
			case 10:
			System.out.println("October");
			break;
			case 11:
			System.out.println("Novenber");
			break;
			case 12:
			System.out.println("December");
			default:
			System.out.println("Enter Correct value");
			break;
		}*/
		/*System.out.println("=====**dept**=====");
		System.out.print("Enter a department code: ");
		int d=sc.nextInt();
		System.out.println("=====**=====**=====");
		switch (d){
			case 1:
			System.out.println("CSE");
			break;
			case 2:
			System.out.println("CAI");
			break;
			case 3:
			System.out.println("CDS");
			break;
			case 4:
			System.out.println("CST");
			break;
			case 5:
			System.out.println("CSE-AI&ML");
			break;
			case 6:
			System.out.println("EEE");
			break;
			case 7:
			System.out.println("CIVIL");
			break;
			case 8:
			System.out.println("MECHANICAL");
			break;
			case 9:
			System.out.println("ECE");
			break;
			case 10:
			System.out.println("MBA");
			break;
			case 11:
			System.out.println("MCA");
			break;
			case 12:
			System.out.println("M.TECH");
			break;
			case 13:
			System.out.println("BBA");
			break;
			case 14:
			System.out.println("BCA");
			break;
			case 15:
			System.out.println("--");
			break;
			default:
			System.out.println("Enter Correct value");
			break;
		}*/
		/*System.out.println("=====**Calculator**=====");
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
		}*/
		System.out.println("=====**=======****=======**=====");
		System.out.println("=====**Looping Statements**=====");
		System.out.print("Enter a number to print table: ");
		int t=sc.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(t+" * "+i+" = "+(t*i));
		}
		
	}
}
