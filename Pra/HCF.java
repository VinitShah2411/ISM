import java.util.*; 
class HCF{
    public static void main(String[] args){
        int i,a,b,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:-");
        a = sc.nextInt();
        System.out.println("Enter First number:-");
        b = sc.nextInt();
        for(i=1; i<a || i<b;i++)
        {
            if(a%i==0 && b%i==0)
            count=i;
        }
    System.out.println("HCF of Entered number: " + count);
    }
}