
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class leapyear {
    public static void main(String[] args) {
        int yr;
        Scanner sc=new Scanner(System.in);
        yr=sc.nextInt();
        if(yr%4==0)
            System.out.println("its leap year");
        else
            System.out.println("its non-leap year");
    }
    
}
