package patterns;

public class FullT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sp=3,star=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				if(i==3) {
					System.out.print("$");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
			sp--;
			star=star+2;
		}

	}

}
