
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class naturalnumsum {
    public static void main(String[] args) {
        int n,i,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        //while(num<=n){
        for(i=1;i<=n;i++){ 
        sum=sum+i;
           }
        System.out.println(sum);
    }
    
}
