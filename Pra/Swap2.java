import java.util.*;  
class Swap2{  
    public static void main(String[] args) {  
       int a, b;  
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of a and b");  
       a = sc.nextInt();  
       b = sc.nextInt();  
       System.out.println("before swapping numbers: "+a +"  "+ b);  
       a = a + b;
       b = a - b;
       a = a - b;
       System.out.println("After swapping: "+a +"   " + b);  
       System.out.println( );  
    }    
} 
