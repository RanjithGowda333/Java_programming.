import java.util.*;   //TO know the Itarations of the loop (While Loop)in the program.
public class class22_9_4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();int sum=0;
        while(n>0){
            int dig=n%10;
            sum+=dig;
            n=n/10;
        }
        System.out.println("Sum of digits:"+sum);
    }
}