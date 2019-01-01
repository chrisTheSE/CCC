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
        int[] dist = new int[5];
        int totalDist =0;
        for (int i = 1; i < 5; i++){
            dist[i] = scan.nextInt();
        }
        dist[0] = 0;
        dist[4] = dist[4] + dist[3] + dist[2] + dist[1];
        dist[3] = dist[3] + dist[2] + dist[1];
        dist[2] = dist[2] + dist[1];
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.printf("%s ",(int)Math.abs(dist[j] - dist[i]));
            }
            System.out.println();
        }
        

    }

}
