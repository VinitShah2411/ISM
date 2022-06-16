//Create Employee class and fetch data from user like emp name,salary,tax

import java.util.*;

class Employee {
    
        static void work()
        {
            Scanner sc = new Scanner(System.in);
            String emp_name;
            double salary,tax;
            System.out.println("Enter Name:-");
            emp_name = sc.next();
            System.out.println("Enter salary:-");
            salary = sc.nextDouble();
            System.out.println("How much tax you pay:-"); 
            tax = sc.nextDouble();
            hour(emp_name,salary,tax);
        }
        static void hour(String emp_name,double salary,double tax)
        {
            System.out.println("Name is:-"+emp_name); 
            System.out.println("Salary is:-"+salary); 
            System.out.println("Tax is:-"+tax);
        }
    public static void main(String[] args) {  
          work();
    }
}
            
            
            
            