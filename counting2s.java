
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class counting2s {
    public static void main(String[] args) {
        int n,d,r,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of range:");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            d=i%10;
            r=i/10;
            if(d==2){
                count=count+1;
            }
            if(r==2){
                count++;
            }
        
        }
        System.out.println("count is:"+count);
    }
    
}
