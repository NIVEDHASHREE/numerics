/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package milestone3lc;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class numlessthansmallnum {
    public static void main(String[] args) {
        int i,b;
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array:");
        for(i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        if(arr[0]==0){
            System.out.println("least number is:0");
        }
        else{
            b=arr[0]-1;
            System.out.println("least num is"+b);
        }
    }
}
