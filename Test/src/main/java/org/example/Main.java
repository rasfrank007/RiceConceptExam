package org.example;

public class Main {
    public static void main(String[] args) {
        int[] testInput = {1,1,1,1,1,2,2,2,2,2,2,3};
        System.out.println("Hello world!");

        Solution solution = new Solution();
        System.out.println(solution.getUnpairedElement(testInput));
    }
}