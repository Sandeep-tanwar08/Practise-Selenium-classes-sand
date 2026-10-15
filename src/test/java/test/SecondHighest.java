package test;

public class SecondHighest {
	public static void main(String[] args) {
		
	
		int[] arr = {50, 20, 40};
		
		
	int first= Integer.MIN_VALUE;
	int second=Integer.MIN_VALUE;
	for(int num:arr) {
		
		if(num>first) {
			
			second=first;
			first=	num;
		}
		
		
		
		
		
		
		
	}
	
	System.out.println("Highest NUMBER:"+first);
	System.out.println("Second Highest NUMBER:"+second);
	}	

}
