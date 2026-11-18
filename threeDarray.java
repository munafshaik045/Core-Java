public class twoDarray{
	public static void main(String args[]){
		int n=3;
		int a[][][]=new int[n][n][n];
		int sum=0,c=1;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				for(int k=0;k<n;k++){
					a[i][j][k]=c*10;
					c++;
				}
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				for(int k=0;k<n;k++){
					System.out.print(a[i][j][k]+" ");
					sum+=a[i][j][k];
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Sum= "+sum);
	}
}

