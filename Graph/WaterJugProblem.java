package Graph;

public class WaterJugProblem {
    public boolean canMeasureWater(int x, int y, int target) {
        if (x + y < target) {
            return false;
        }
        // If target is 0, it's always possible to measure
        if (target == 0) {
            return true;
        }
        // If target is exactly one of the jug's capacity or the sum of both
        if (target == x || target == y || target == x + y) {
            return true;
        }
        // Use the mathematical approach to solve this problem:
        // It's possible to measure target if and only if target is a multiple of the GCD of x and y
        return target % gcd(x, y) == 0;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
