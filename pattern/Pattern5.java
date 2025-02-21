import java.util.*;
public class Pattern5 {
    public static void main(String[]args){
        System.out.println("Enter number of rows:");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                if (i==j) {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
