import java.util.Scanner;

class Swap{
	public static void main(String[] args){
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for a:");
		System.out.println("Enter number for b:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before swap:"+a+"  "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After swap:"+a+"  "+b);
		System.out.println( );
	}
}
