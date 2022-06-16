import java.util.*;  
class Reverse{  
    public static void main(String[] args) {  
       int i,temp;
       System.out.println("Enter 3 digit:-");
       Scanner sc = new Scanner(System.in);
       i = sc.nextInt();
       while(i>0){
           temp = i %10;
           i = i / 10;
          System.out.print(temp); 
       }
       
    }    
}