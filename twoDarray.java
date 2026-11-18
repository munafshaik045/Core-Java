public class twoDarray{
	public static void main(String args[]){
		int n=3;
		int a[][]=new int[n][n];
		int sum=0,c=1;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=c*10;
				c++;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(a[i][j]+" ");
				sum+=a[i][j];
			}
			System.out.println();
		}
		System.out.println("Sum= "+sum);
	}
}
