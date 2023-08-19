package Basic;

public class FindFactorial {

	public static void main(String[] args) 
	{
		int i;
		int factorial=1;
		int number=6;
		for(i=1;i<=number;i++)
		{
			factorial=factorial*i;
		}
		System.out.println(factorial);

	}

}
