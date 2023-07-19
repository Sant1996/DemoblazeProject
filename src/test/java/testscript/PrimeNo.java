package testscript;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=29;
		boolean flag = true;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flag=false;
			}
		
		}
		if(!flag)
		{
			System.out.println(n+" is not a prime number");
		}
		else
		{
			System.out.println(n+" Is prime no");
		}
		

	}

}
