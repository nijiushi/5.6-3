public class cc{
	public static void main(String[] args)	{
	System.out.println(rec(9));
	}
	public static int rec(int n){
		if(n>0)
		{
			int result=n*rec(n-1);
		return result;
		}
		else 
		{
			return 1;
		}
	}
}
