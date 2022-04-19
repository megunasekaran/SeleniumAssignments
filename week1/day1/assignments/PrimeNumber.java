package week1.day1.assignments;



public class PrimeNumber {

	



public static void main (String args[])
	{
		int num = 13;
		boolean isPrime = true;
		for(int i=2; i<=num; i++)
		{
			if(num%2==0)
			{
			System.out.println(num +" "+"is not a prime number");	
			isPrime = false;
			break;
			}
			
		}
		if(isPrime==true)
		{
			System.out.println(num + " "+ "is a prime number");
		}
		
	}
   }

}
