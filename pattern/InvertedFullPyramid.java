import java.util.*;
public class InvertedFullPyramid {
    public static void main(String[]args){
        System.out.println("Enter number of rows:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=num;i>=1;i--){
            for(int space=1;space<=num-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
        
    }
    
}
