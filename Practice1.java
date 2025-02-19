package edu.ceu.programming.practices;


import java.util.Random;

public class Practice1 {
    
    public static double generatePiIterative(long steps) {
        Random rand = new Random();
        long insideCircle = 0;

        for (long i = 0; i < steps; i++) {
            double x = rand.nextDouble();
            double y = rand.nextDouble();
            
            if (x * x + y * y <= 1) {
                insideCircle++;
            }
        }
        
        return 4.0 * insideCircle / steps;
    }
}