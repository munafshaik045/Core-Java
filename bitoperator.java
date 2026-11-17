import java.util.*;

public class bitoperator{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st value: ");
		int a=sc.nextInt();
		System.out.print("Enter 2nd value: ");
		int b=sc.nextInt();
		System.out.println("=====**=====**=====");
		System.out.println("AND operation("+a+" & "+b+"): "+(a&b));
		System.out.println("OR operation("+a+" | "+b+"): "+(a|b));
		System.out.println("XOR operation("+a+" ^ "+b+"): "+(a^b));
		System.out.println("And operation( ~ "+a+" ): "+(~a));
		System.out.println("Left shift operation("+a+" << "+b+"): "+(a<<b));
		System.out.println("Right shift operation("+a+" >> "+b+"): "+(a>>b));
	}
}

