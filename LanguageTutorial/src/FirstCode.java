/*
 * 			$ $ $ $
 * 			$     $
 * 			$     $	
 * 			$ $ $ $
 * 
 * */

public class FirstCode {
	public static void main(String []args){
				
		int i,j;
		for(i=0;i<=4;i++){
			for(j=0;j<=4;j++){
				if(i==0 || i==4 || j==0 || j==4)
					System.out.print("$ ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

/*
 * 
 *  int a = 65;
 *	char c = a;
 *  printf("%c", c);
 * 
 * 
 */