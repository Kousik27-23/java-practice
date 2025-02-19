import java.util.*;
public class FindLargest {
    public static void main(String[]args){
        System.out.println("Enter 1st number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b=sc.nextInt();
        System.out.println("Enter 3rd number:");
        int c=sc.nextInt();
        if (a>b&&a>c) {
            System.out.println("a is largest");   
        }
        else if (b>c) {
            System.out.println("b is largest");
            
        }
        else{
            System.out.println("c is largest");
        }
    }
    
}
