package patterns;
public class T6{
	public static void main(String[] args) {
		//  *
	//     **
//		  ***
//		 ****
//		  ***
//		   **
//		    *
		int star=1,sp=3;
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			if(i==4) {
				sp++;
				star--;
			}
			else {
				sp--;
				star++;
			}
			System.out.println();
		}
	}
}