import java.util.*;
public class SwaptwoNum {
    public static void main(String[]args){
        System.out.println("Enter 1st number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("swap two number is:a="+a+",b="+b);
    }
    
}
