/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n =scan.nextInt();
        int occupied = 0;
        String space1, space2;
        space1 = scan.next();
        space2 = scan.next();
        
        for (int i = 0;i < n;i++) {
            if ((space1.charAt(i) == space2.charAt(i)) && space1.charAt(i) != '.') {
                occupied++;
            }
        }
        System.out.println(occupied);

        

    }

}
