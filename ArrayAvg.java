import java.util.*;

class ArrayAvg{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		int[] num=new int[5];
	
		for(int i=0; i<5; i++){
			System.out.println("Enter Number: ");
			num[i]=in.nextInt();}
		
		int sum=0;  float avg=0;
		for(int x:num)
			sum=sum+x;
	
		avg=sum/5;
	
		System.out.println("Average: "+ avg);
	}
}