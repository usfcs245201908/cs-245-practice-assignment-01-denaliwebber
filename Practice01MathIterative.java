public class Practice01MathIterative implements Practice01Math
{
	public int fact (int n) throws Exception
	{
		if (n<0)
			throw new Exception();
		int i, sum=1;
		for (i=2;i<=n;i++)
		{
			sum*=i;
		}
		return sum;
	}

	
	public int fib (int n) throws Exception
	{
		if (n<0)
			throw new Exception();
		if (n==0 || n==1)
			return n;
		int temp, prev=0, curr=1, i;
		for (i=1; i<n; i++)
		{
			temp=curr;
			curr+=prev;
			prev=temp;
		}
		return curr;
	}
}