package homework;

import java.util.Scanner;

public class AscendingDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	System.out.println("Enter the values") ;
		Scanner value = new Scanner(System.in);
		int val = value.nextInt();
		//int a[] = new int[val];
		int temp;
		int i;
	
		
		
		String name="Vignesh";
		char[] allChars = name.toCharArray();
		for
		for(i=0; i<val.length;i++)
		{
			
			//for (j=i+1;j<=a.length;j++)
			if(val[i]>val[i+1])
			{
	        temp = val[i+1];
			val[i+1] = val[i] ;
			val[i] = temp ;
	}
			
			}
						
						
			
		
	}

}
