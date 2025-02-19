import java.util.*;
public class CheckArmstrong {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();
        int t,s=0,rev=0;
        t=num;
        while (num>0) {
            rev=num%10;
            s=s+rev*rev*rev;
            num=num/10;
        }
        if (t==s) {
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("not armstrong");
        }
    } 
    
}
