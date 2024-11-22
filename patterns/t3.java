package patterns;

public class t3 {
public static void main(String[] args) {
	//*****
    // ****
	//  *** 
	//   **
	//    *
	int star=5,sp=0;
	for(int i=1;i<=5;i++) {
		for(int k=1;k<=sp;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
		System.out.println();
		
		sp++;
		star--;
	}
}
}
