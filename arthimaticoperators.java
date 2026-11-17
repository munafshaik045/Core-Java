import java.util.*;

public class arthamaticoperators{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter PettyCash: ");
		int pettycash=sc.nextInt();
		System.out.print("Enter Tiffen charges: ");
		int tiffen=sc.nextInt();
		System.out.print("Enter dinner charges: ");
		int dinner=sc.nextInt();
		int total_expense=tiffen+dinner;
		float avg=total_expense/30;
		int savings=pettycash-total_expense;
		System.out.println("=====**=====**=====");
		System.out.println("Total savings: "+savings);
		System.out.println("Total Amount: "+total_expense);
		System.out.println("Average Per Day: "+avg);
	}
}
