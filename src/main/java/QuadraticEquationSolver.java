import java.util.*;

public class QuadraticEquationSolver {

        public double[] solve(int a, int b, int c) {
            int discriminant = b*b - 4*a*c;
            double squareOfDiscriminant = Math.sqrt(discriminant);
            double[] result = new double[] {};
            if (discriminant > 0) {
                double firstRoot = ((-b) + squareOfDiscriminant)/(2*a);
                double secondRoot = ((-b) - squareOfDiscriminant)/(2*a);
                double maxRoot = Math.max(firstRoot, secondRoot);
                double minRoot = Math.min(firstRoot, secondRoot);
                result = new double[] {maxRoot, minRoot};
                return result;
            }

            if (discriminant == 0) {
                double root = (-b) / (2*a);
                result = new double[] {root};
                return result;
            }

            return result;
        }

    //Test output
    public static void main(String[] args) {
        double[] equation = new QuadraticEquationSolver().solve(1, -2, -3); // [3.0, -1.0]
        System.out.println(Arrays.toString(equation));
        double[] equation2 = new QuadraticEquationSolver().solve(1, 12, 36); // [-6]
        System.out.println(Arrays.toString(equation2));
        double[] equation3 = new QuadraticEquationSolver().solve(5, 3, 7); // []
        System.out.println(Arrays.toString(equation3));
    }
}


