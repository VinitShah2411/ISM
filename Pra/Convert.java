import java.util.*;  
class Convert{  
    public static void main(String[] args) {  
       double meter,inches;
       System.out.println("39.37 inch=1 meter \n");
       System.out.println("Enter the value of in inches"); 
       Scanner sc = new Scanner(System.in); 
       inches = sc.nextDouble(); 
       meter = inches/39.37;
       System.out.println("Number in inches: "+meter);  
    }    
} 