public class table{
  public static void main(String args[]){
    for(int j=1;j<=40;j++){
			System.out.println("Table "+j+" is started\n");
			for(int i=1;i<=10;i++){
				System.out.println(j+" * "+i+" = "+(j*i));
			}
			System.out.println("\nTable "+j+" is completed\n");
			System.out.println("\n---------------------\n");
		}
  }
}
