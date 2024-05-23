import java.util.Scanner;
public class Main
{
    public static int C (int n,int k)
    {
        if(k == 0 || k == n)
        {
            return 1;
        }
        else
        {
            return C(n - 1,k -1) + C(n-1, k);
        }
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,k,h;
		h = input.nextInt();
		for(n = 0;n<=h;n++)
		{
		    for(k=0;k<=n;k++)
		    {
		        System.out.print(C(n,k) + "  ");
		    }
		    System.out.println();
		}
	}
}
