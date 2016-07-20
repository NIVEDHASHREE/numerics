
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class sumofnumandodd {
     public static void main(String[] args) {
        int n,sum=0;
        //Scanner sc=new Scanner(System.in);
        //n=sc.nextInt();
    for(int i=0;i<=15;i++){
        sum=sum+i;
    }
    for(int i=15;i<45;i++){
        if(i%2!=0){
            sum=sum+i;
        }
    }
    
        //System.out.println(sum);
    
    }
}
