/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog4;

import java.util.Scanner;

/**
 *
 * @author jestevezrial
 */
public class Prog4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float base,altura;
       Scanner obx= new Scanner(System.in);
       System.out.print("teclea base:");
       base= obx.nextFloat();
       System.out.print(System.getProperty("line.separator"));
       System.out.print("teclea altura:");
       altura= obx.nextFloat();
       System.out.print("area:"+base*altura/2);
    }
    
}
