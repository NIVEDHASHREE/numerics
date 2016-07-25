
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class hashprogram {
    public static void main(String[] args) {
        char ch='#';
        int n,i,j;

        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print(ch);
            }
            
            System.out.print(" ");
        }
    }
}
