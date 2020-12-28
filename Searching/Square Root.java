import java.util.Scanner;
class SquareRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			long a = sc.nextInt();
			SquareRoot obj = new SquareRoot;
			System.out.println(obj.floorSqrt(a));
		}
	}
}
class SquareRoot
{
     long floorSqrt(long x)
	 {
		return (long)Math.floor(Math.sqrt(x));
	 }
}
