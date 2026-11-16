import java.util.*;

public class hello {
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("========================================");
		System.out.println("===========**Enter Details**============");
        int age=sc.nextInt();
        float marks=sc.nextFloat();
        char grade=sc.next().charAt(0);
        String result=sc.next();
        long total_marks=sc.nextLong();
        double avg=sc.nextDouble();
        System.out.println("=======================");
        System.out.println("-----------------------");
        System.out.println("=======================");
        System.out.println("HEllo World..!");
        System.out.println("=======================");
        System.out.println("Age(Int): "+age);
        System.out.println("Marks(Float): "+marks);
        System.out.println("Grade(Char): "+grade);
        System.out.println("Result(String): "+result);
        System.out.println("Total(long): "+total_marks);
        System.out.println("Average(Double): "+avg);
        System.out.println("=======================");
        System.out.println("=======================");
    }
}
