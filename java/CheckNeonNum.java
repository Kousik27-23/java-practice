import java.util.*;
public class CheckNeonNum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();
        int square=num*num;
        int sum=0,temp;
        temp=square;
        while (temp!=0) {
            sum+=temp%10;
            temp/=10;
        }
        if (sum==num) {
            System.out.println(num+"is a neaon number");
        }
        else{
            System.out.println(num+"is not a neaon number");
        }

    }    
}
