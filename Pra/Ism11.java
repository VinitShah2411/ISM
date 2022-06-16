import java.util.*; 
class Ism11{
    public static void main(String[] args){
        int a,b;
        int sum=0,flag=0;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Enter 1st number:-");
            a = sc.nextInt();
            System.out.println("Enter 2nd number:-");
            b = sc.nextInt();
            sum = a + b;
            System.out.println("Sum is:-"+sum);    
            System.out.println("Enter Choice:");
            System.out.println("0. Sum again");
            System.out.println("1. exit");
            flag = sc.nextInt();
            if(flag==1){
                
                break;
            }
        }while(true);
    }
}