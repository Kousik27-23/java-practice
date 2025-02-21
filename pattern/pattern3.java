import java.util.*;
public class pattern3 {
    public static void main(String[]args){
        System.out.println("Enter number of rows:");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int space=1;space<=rows-i;space++){
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
