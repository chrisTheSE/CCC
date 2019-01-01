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
        int[] num = new int[4];

        for (int i = 0; i < 4; i++) {
            num[i] = scan.nextInt();
        }

        if ((num[0] == 8 || num[0] == 9) && (num[3] == 8 || num[3] == 9) && (num[1] == num[2])) {
            System.out.println("ignore");
        } else {
            System.out.println("answer");
        }

    }

}
