import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n,flag,no;
        int prime=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n"); //Entered value stored in n
        int sum=0;
        for (int i = 2; prime <= 100; i++) 
        {
            no=i;
            flag=0;
            for(int j = 2 ; j <= no; j++) 
            {
                if(no%j==0)
                {
                    flag=1;
                }
            }
            if(temp==0)
            {
                System.out.print(","+no);
            }
        }
    }
}
        
            
       
       
