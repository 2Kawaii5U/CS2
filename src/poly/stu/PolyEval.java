package poly.stu;

import java.util.ArrayList;

/**
 * Created by James Veith on 2/3/2015.
 */
public class PolyEval {
    //Unused constructor, made private to avoid javadoc generation.
    private PolyEval(){}

    public static double evaluate( ArrayList<Integer> poly, double x ){
        double y = 0.0;
        for (int i = 0; i < poly.size(); i++) {
            y += poly.get(i) * Math.pow( x, i );
        }
        return y;
    }

    public static boolean isZero( ArrayList<Integer> poly ){
        return (poly.size() == 1) && (poly.get(0) == 0);
    }
}
