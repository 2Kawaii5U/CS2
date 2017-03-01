package poly.stu;

import java.util.ArrayList;

/**
 * Created by James Veith on 2/3/2015.
 */
public class PolyDerive {



    public static ArrayList<Integer> computeDerivative(ArrayList<Integer> poly){
        ArrayList<Integer> deriv = new ArrayList<Integer>(poly.size() - 1 );
        for (int i = 1; i < poly.size(); i++) {
            deriv.add(poly.get(i)*i);
        }
        if (poly.size()>1) {
            return deriv;
        }else{
            ArrayList<Integer> zero = new ArrayList<Integer>();
            zero.add(0);
            return zero;
        }
    }
}
