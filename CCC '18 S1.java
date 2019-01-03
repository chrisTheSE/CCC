/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.DecimalFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfV = scan.nextInt();
        DecimalFormat value = new DecimalFormat("#.0");
        double[] position = new double[numOfV];
        List<Double> sorted2 = new ArrayList<>();
        List<Double> sorted = new ArrayList<>();

        for (int i = 0; i < numOfV; i++) {
            sorted.add(scan.nextDouble());
        }

        Collections.sort(sorted);
        sorted2.addAll(sorted);

        for (int i = 1; i < numOfV - 1; i++) {
            sorted2.set(i, (((sorted.get(i) + sorted.get(i + 1)) / 2) - ((sorted.get(i) + sorted.get(i - 1)) / 2)));
        }
        
        sorted2.remove(sorted2.get(0));
        sorted2.remove(sorted2.get(sorted2.size() - 1));
        Collections.sort(sorted2);

        System.out.println(value.format(sorted2.get(0)));
    }
}
