import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter size of array:"); 
          int size = sc.nextInt();
          int [] arr = new int[size];
          for (int i = 0; i < arr.length; i++) {  
            System.out.println("Enter  Array  "+i+"  index  :");
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		for(int i=0; i<arr.length;i++){
			if(arr[i] == x)
			System.out.println("x found at index : "+ i);
		}
    }	
}