
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class countdigitofint {
    public static void main(String[] args) {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
    
}
