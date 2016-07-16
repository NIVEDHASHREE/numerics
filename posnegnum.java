
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class posnegnum {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>0)
            System.out.println("given num is positive");
        else if(n<0)
            System.out.println("given num is negative");
        else
            System.out.println("given num is zero");
    }

    
    
}
