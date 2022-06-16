import java.util.Scanner;

public class AvgofArray {
    public static void main(String[] args) {
          int [] arr = new int [] {6,7,8,9,10};  
        int sum=0, Avg = 0;  
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];
           Avg = sum/arr[i];
        }  
        System.out.println("Sum of all the elements of an array: " + Avg);  
    }  
} 