import java.util.Scanner;

public class StarPascleTriangle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int space=1;space<=rows-i-1;space++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

}
