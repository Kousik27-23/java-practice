import java.util.Scanner;

public class Pattern7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows=sc.nextInt();
        int a=2*(rows-1);
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int space=1;space<=a;space++){          
                System.out.print(" ");
            }
            
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            a-=2;
            
        }
        sc.close();
    
}
}
