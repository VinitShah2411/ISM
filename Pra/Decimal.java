import java.util.Scanner;  
class Decimal{  
    public static void main(String[] args) {  
       Scanner sc = new Scanner(System.in); 
       System.out.println("Enter Decimal Number"); 
       int no = sc.nextInt();
       String b= "";
       int t = no;
       while(t>0)
       {
           int r = t%2;
           t = t/2;
           b = r+b;
       }
    System.out.println("Binary number of "+no+" is "+b);  
    }    
} 
