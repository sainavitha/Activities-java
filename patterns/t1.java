package patterns;

public class t1 {
public static void main(String []args) {
	
	int sp=4,star=1;
//	
//	  *
//   **
//  ***
// ****
//*****
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=sp;j++) {
			System.out.print(" ");   //    *
			                         //   ***
			                         //  *****
			                         // *******
			                         //*********
		}
		for(int k=1;k<=star;k++) {  
			System.out.print("*");
		}
		System.out.println();
		sp--;
		
		star=star+2;
	}
	
	
	                                                  
}                                                    
}
