import java.util.*;
public class CalSi {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principle:");
        int p=sc.nextInt();
        System.out.println("Enter time");
        int t=sc.nextInt();
        System.out.println("Enter rate of interest:");
        float r=sc.nextFloat();
        float si=(p*t*r)/100;
        System.out.println("SIMPLE INTEREST IS: "+si);
    }
    
}
