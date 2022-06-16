//Enter number one by one and show results:-
import java.util.*; 
class Odd{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num;
    int i;
    int x = 0;
    int y = 0;
    System.out.print("How many numbers you want to input: ");
    i = input.nextInt();
    for (;;) {
        i--;
        System.out.print("Please input a number : ");
        num = input.nextInt();
        if (num % 2 == 0) {
            x = x + num;
        } else {
            y = y + num;
        }
     System.out.println("Sum of even numbers is : " + x);
        System.out.println("Sum of odd numbers is : " + y);
        
    }    
    }
    }



--------------------------------------------------------------------



import java.util.*; 
class Odd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i=0,num=0;
        int sumOdd=0;
        int sumEven=0;
        System.out.println("Enter Digit:-");
        num = sc.nextInt();
        int temp[] = new int[num];
        for(i=0;i<temp.length;i++)
        {
            System.out.println("Enter Numbers:-");
            temp[i]=sc.nextInt();
           // for(i=0;i<temp.length;i++){
           if(temp[i]%2==0)
                sumEven = sumEven + temp[i];
            else
                sumOdd = sumOdd + temp[i]; 
                
        }
    System.out.println("Even sum: " + sumEven);
    System.out.println("Odd sum: " + sumOdd);
    }
}