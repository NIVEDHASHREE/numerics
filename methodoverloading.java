/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class sample{
    public sample(){
        System.out.println("this is no argument method");
    }
    sample(int i,int j){
        System.out.println("this is parameterised method");
    }
}

public class methodoverloading {
    public static void main(String[] args) {
      sample s=new sample();
      sample s1=new sample(5,8);
    }
}

