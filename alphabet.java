
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class alphabet {
    public static void main(String[] args) {
        char ch;
         Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        if((ch>=65&&ch<=91)||(ch>=97&&ch<=123)){
            System.out.println("given char is alphabet");  
        }
        else 
            System.out.println("given char is not an alphabet");
    }
    
}
