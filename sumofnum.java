
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class sumofnum {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    for(int i=0;i<=n;i++){
        sum=sum+i;
    }
        System.out.println(sum);
    
    }
}
