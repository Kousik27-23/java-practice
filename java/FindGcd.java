import java.util.*;
public class FindGcd {
    public static void main(String[]args){
        System.out.println("Enter 1st number:");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int num2=sc.nextInt();
        int a=num1,b=num2;
        while (b!=0) {
            int c=b;
            b=a%b;
            a=c;
        }
        System.out.println("GCD is: "+a);
    }
    
}
