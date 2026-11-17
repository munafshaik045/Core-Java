public class oddeventtables{
  public static void main(String args[]){
    System.out.println("Odd Tables: \n");
		for(int j=1;j<=40;j++){
			if(j%2!=0){
			System.out.println("Table "+j+" is started\n");
			for(int i=1;i<=10;i++){
				System.out.println(j+" * "+i+" = "+(j*i));
			}
			System.out.println("\nTable "+j+" is completed\n");
			System.out.println("\n---------------------\n");
		}
		}
		System.out.println("\n\n");
		System.out.println("Even Tables: \n");
		for(int j=1;j<=40;j++){
			if(j%2==0){
				System.out.println("Table "+j+" is started\n");
				for(int i=1;i<=10;i++){
					System.out.println(j+" * "+i+" = "+(j*i));
				}
				System.out.println("\nTable "+j+" is completed\n");
				System.out.println("\n---------------------\n");
			}
		}
  }
}
