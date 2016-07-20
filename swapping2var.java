
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class swapping2var {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner sc=  new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
     temp=a;
     a=b;
     b=temp;
        System.out.println(a+""+b);
    }
}
