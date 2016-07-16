
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class activity12 {
    public static void main(String[] args) {
        int i;
        int[] a=new int[10];
        Scanner obj= new Scanner(System.in);
        System.out.println("the array is:");
        for(i=0;i<10;i++){
            a[i]=obj.nextInt();
            System.out.println(a[i]);
        }
        System.out.println("the reversed array is:");
        for(i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
    
}


