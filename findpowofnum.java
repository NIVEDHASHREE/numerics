
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class findpowofnum {
    public static void main(String[] args) {
        int i,n,p,z = 0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        p=sc.nextInt();
        for(i=0;i<p;i++){
           z=n*n; 
        }
        System.out.println(z);
        
    }
}
