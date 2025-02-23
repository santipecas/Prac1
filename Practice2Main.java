package edu.ceu.programming.practices;



public class Practice2Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the number of points as an argument.");
            return;
        }
        int points = Integer.parseInt(args[0]);
        double piApprox = Practice2.generatePiRecursive(points);

        
        System.out.println("Number PI is " + piApprox);
    }
}