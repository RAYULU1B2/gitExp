import java.util.Scanner;
import java.lang.Math;
class AmstrongNumbersPrinting
{
	public static boolean isOfAmstrong(int num)
	{
		int temp, count=0, last=0, sum=0;
		temp = num;
		while(temp>0)
		{
			temp = temp/10;
			count++;
		}
		temp = num;
		while(temp>0)
		{
			last = temp%10;
			sum	 += (Math.pow(last,count));
			temp = temp/10;
		}
		if(sum==num)
			return true;
		else
			return false;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit upto which you need Amstrong Numbers : ");
		int n = sc.nextInt();
		System.out.println("The Amstrong Numbers upto "+n+" are : ");
		for(int i=0; i<=n; i++)
		{
			if(isOfAmstrong(i))
				System.out.print(i+",");
		}
	}			
}

			
		
		