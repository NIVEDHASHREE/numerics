
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class revanum {
    public static void main(String[] args) {
        int num,r=0,d;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while(num>0){
            d=num%10;
            r=r*10+d;
            num=num/10;
        }
        System.out.println(r);
    }
}
