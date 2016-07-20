
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class name {
    public static void main(String[] args) {
        //char[] name=new char[20];
        String title,name;
        Scanner sc=new Scanner(System.in);
                title=sc.nextLine();
        name=sc.next();
        char[] ch=name.toCharArray();
        //for(int i=0;i<name.length;i++){
        //name[i]=sc.next();}
        System.out.println(title+","+ch[0]);
    }
}
