package Basic;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int rev=0;
		int temp=0;
		while(num!=0)
		{
			temp=num%10;
			
			rev=rev+temp;
			
			
			num=num/10;
			if(num!=0)
			{
				rev=rev*10;
			}
		}
		System.out.println("Reverse of a number :"+rev);
		

	}

}
