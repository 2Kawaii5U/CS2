package poly.stu;

import java.util.ArrayList;

/**
 * Created by James Veith on 2/3/2015.
 */
public class PolyRoot {

    private static double EPSILON = 0.0001;
    private static double INITIAL_GUESS = 0.1;
    private static int    MAX_ITERATIONS = 100;

    private PolyRoot(){}

    public static double computeRoot( ArrayList<Integer> poly ){
        return newtonsMethod(poly, INITIAL_GUESS, 1);
    }

    private static double newtonsMethod(ArrayList<Integer> poly, double x0, int iter){

        double x1 = x0 - (PolyEval.evaluate(poly, x0) / PolyEval.evaluate(PolyDerive.computeDerivative(poly), x0));

        if ( iter <= MAX_ITERATIONS && Math.abs(PolyEval.evaluate(poly, x1) - PolyEval.evaluate(poly, x0)) > EPSILON ) {
            return newtonsMethod(poly, x1, iter + 1);
        }else {
            return x1;
        }
    }
}
