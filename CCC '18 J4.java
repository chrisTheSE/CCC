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
        int n = scan.nextInt();
        int[][] sunFlower = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sunFlower[i][j] = scan.nextInt();
            }

        }

        while (true) {
            if (sunFlower[0][0] < sunFlower[n - 1][n - 1] && sunFlower[0][0] < sunFlower[0][n - 1] && sunFlower[0][0] < sunFlower[n - 1][0]) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.printf("%s ", sunFlower[i][j]);
                    }
                    System.out.println();
                }
                break;
            } else {
                sunFlower = rotate(sunFlower);
            }

        }
    }

    public static int[][] rotate(int[][] flower) {
        int days = flower.length;
        int[][] rotatedFlower = new int[days][days];
        for (int i = 0; i < days; i++) {
            for (int j = 0; j < days; j++) {
                rotatedFlower[j][(days - 1) - i] = flower[i][j];
            }
        }
        return rotatedFlower;
    }
}
