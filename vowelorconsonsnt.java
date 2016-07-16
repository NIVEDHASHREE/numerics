
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class vowelorconsonsnt {
    public static void main(String[] args) {
        char a;
        Scanner sc=new Scanner(System.in);
        a=sc.next().charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
        {
            System.out.println("given char is vowel");
        }
        else
            System.out.println("given char is consonant");
    }
    
}
