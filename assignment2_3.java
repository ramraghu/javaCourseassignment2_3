package com.acadgild.learnJava;

public class assignment2_3 {
	public static void main(String[] args) {
		int p,q;
		//Loop through the lines 
		for(p = 1; p <= 5; p++)
		{
			//Loop through positions in each line 
			for(q = 1; q <= 5; q++){
				/*       1,3
					2,2        2,4
				3,1 		          3,5
  					4,2      4,4
      					 5,3
 */
				if(p - q == 2 || q - p == 2 || ((p == q) && (p % 2 == 0) ))   {
				System.out.print(" a");}
				else  { 
					if ((p - q == 1 || q - p == 1 )&& (p > 1 && p < 5 ) &&
							(q > 1 && q < 5 )){ 
/*
 *     2,3
    3,2   3,4
       4,3
 */
						System.out.print(" b");
					} else	{
//     3,3
						if ( p== 3 && q == 3) {
							System.out.print(" c");
						} else
					System.out.print("  ");
						}}
				}
			System.out.println();
			}
	}
}
	


