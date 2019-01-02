/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.*;

public class Main {

    private static void getReachablePages(Node node, Set<Integer> pages) {
        if (!pages.contains(node.values)) {
            pages.add(node.values);
            node.children.forEach(a -> {
                getReachablePages(a, pages);
            });
        }
    }

    private static int getShortestPath(List<Node> nodesToCheck, int level) {
        level++;
        List<Node> childNodes = new ArrayList<>();
        for (Node node : nodesToCheck) {
            if (node.children.size() == 0) {
                return level;
            } else {
                for (Node child : node.children) {
                    childNodes.add(child);
                }
            }
        }
        return getShortestPath(childNodes, level);
    }

    public static void main(String[] args) {
        int totalPages;
        Map<Integer, Node> pageMap = new HashMap<>();

        Scanner scan = new Scanner(System.in);
        totalPages = scan.nextInt();

        //Creates a node then adds a value to each node, then adds a value and the node into the hashmap
        for (int i = 0; i < totalPages; i++) {
            Node node = new Node();
            node.values = i + 1;
            pageMap.put(i + 1, node);
        }

        //add the children to each node
        for (int i = 0; i < totalPages; i++) {
            int num = scan.nextInt();
            for (int j = 0; j < num; j++) {
                int page = scan.nextInt();
                pageMap.get(i + 1).children.add(pageMap.get(page));
            }
        }

        //are all pages reachable?
        Set<Integer> pages = new HashSet<>();
        getReachablePages(pageMap.get(1), pages);
        if (pages.size() == totalPages) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

        //get shortest path
        int level = 0;
        List<Node> nodesToCheck = new ArrayList<>();
        nodesToCheck.add(pageMap.get(1));
        System.out.println(getShortestPath(nodesToCheck, level));
    }
}

 class Node {

        public int values;
        public List<Node> children;

        public Node() {
            children = new ArrayList<Node>();
        }
    }
