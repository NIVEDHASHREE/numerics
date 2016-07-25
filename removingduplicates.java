
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class removingduplicates {
    public static void main(String[] args) {
        String s1,s2=" ";
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        int l=s1.length();
        System.out.println("Length of the string is:"+l);
        char a;
        for(int i=0;i<l;i++){
            a=s1.charAt(i);
            if(a!='\0'){
             s2=s2+a;
             s1=s1.replace(a,'\0');
            }
        }
            System.out.println(s2); 
        
        
    }
}
