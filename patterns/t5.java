package patterns;

public class t5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*********
		// ***$***
		//  *****
		//   ***
		//    *
		int sp=0,star=9;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
				if (i==2 & star==4 )
				{
					System.out.print("$");
				}
				else
				{
					System.out.print("*");
				}
			}
			
			
			System.out.println();
			sp++;
			star=star-2;
			
		}

	}

}
