import java.util.*;
public class deptcode{
  public static void main(String args[]){
    System.out.println("=====**dept**=====");
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
		}
  }
}
