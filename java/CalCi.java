import java.util.Scanner;

public class CalCi {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principle:");
        int p=sc.nextInt();
        System.out.println("Enter time");
        int t=sc.nextInt();
        System.out.println("Enter rate of interest:");
        float r=sc.nextFloat();
        System.out.println("Enter number of interset per year:");
        int n=sc.nextInt();
        r=r/100;
        double amount=p*Math.pow(1+r/n,n*t);
        double ci=amount-p;
        System.out.println("principal amount:"+p);
        System.out.println("total amount: "+amount);
        System.out.println("compound interest: "+ci);
    }
}
