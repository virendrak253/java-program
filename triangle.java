//question 7
// Java code for Inverse Pyramid 
import java.util.*; 

class GFG { 
	
	static void pyramid(int n) 
	{ 
		int i, j, num, gap; 
	
		// outer loop to handle number 
		// of rows n in this case 
		for (i = n; i >= 1; i--) { 
			
			// inner loop to create right triangle 
			// gaps on left side of pyramid 
			for (gap = n - 1; gap >= i; gap--) { 
				System.out.print(" "); 
				System.out.print(" "); 
			} 
			
			// initializing value corresponding 
			// to ASCII value of 'A' 
			num =1; 
	
			// loop to print characters on 
			// left side of pyramid 
			for (j = 0; j <= i; j++) { 
				System.out.print(num++ + " "); 
			} 
			
			// loop to print characters on 
			// right side of pyramid 
			for (j = i - 1; j > 0; j--) { 
				System.out.print(--num + " "); 
			} 
			
			System.out.println(""); 
		} 
	} 
	
	public static void main(String[] args) 
	{ 
		int n = 5; 
		pyramid(n); 
	
	} 
} 
