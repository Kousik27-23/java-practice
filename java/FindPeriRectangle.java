import java.util.*;
public class FindPeriRectangle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length:");
        float l=sc.nextFloat();
        System.out.println("Enter breadth:");
        Float b=sc.nextFloat();
        float peri=2*(l+b);
        System.out.println("Perimeter of rectangle is: "+peri);
    }
}
