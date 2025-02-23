package edu.ceu.programming.practices;

import java.util.Random;

public class Practice2 {

    private static Random random = new Random();

    private static int countPointsInsideCircle(int pointsLeft, int pointsInside) {
        if (pointsLeft == 0) {
            return pointsInside;
        }
        double x = random.nextDouble();
        double y = random.nextDouble();
        if (x * x + y * y <= 1.0) {
            pointsInside++;
        }
        return countPointsInsideCircle(pointsLeft - 1, pointsInside);
    }

    public static double generatePiRecursive(int totalPoints) {
        int pointsInside = countPointsInsideCircle(totalPoints, 0);
        return 4.0 * pointsInside / totalPoints;
    }
}