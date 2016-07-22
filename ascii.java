
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ascii {
    public static void main(String[] args) {
        String s,s1;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
       int n=s.length();
        char arr;
       char ch[]=s.toCharArray();
        for(int i=0;i<n;i++){
             arr=(char) (ch[i]-1);  
            
             if((ch[i]-1)=='`' || (ch[i]-1)=='`'){
                 arr=(char) (ch[i]+25);}
               System.out.print(arr);
                
             }
        
    }

} 