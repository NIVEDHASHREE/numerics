/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package milestone3lc;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class divby3 {
    public static void main(String[] args) {
        int i;
        int[] arr=new int[5];
        int[] brr=new int[5];
       int[] crr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("array is:");
        for(i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<5;i++){
            if(arr[i]%3==0){
                brr[i]=arr[i];
               }            
            }
        if(brr.length<0){
        System.out.println("Numbers exactly divisible by 3");
        for(int j:brr){
            if(j!=0){
              System.out.println(""+j);  
            }
        }}
        else{
            System.out.println("No numbers present");
        }
              }
        
       }

