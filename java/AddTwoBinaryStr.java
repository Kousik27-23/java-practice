import java.util.*;
public class AddTwoBinaryStr {
    public static void main(String[]args){
        System.out.println("Enter 1st binary number:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println("Enter 2nd binary number:");
        String b=sc.nextLine();
        int num1=Integer.parseInt(a,2);
        int num2=Integer.parseInt(b,2);
        int sum=num1+num2;
        String result=Integer.toBinaryString(sum);
        System.out.println("sum of" +a + "and" +b+ "is: "+result);
    }
}
