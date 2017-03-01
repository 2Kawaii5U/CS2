import turtle.Turtle;

import java.util.Scanner;

/**
 * Created by James Veith on 2/3/2015.
 */
public class HTree {
    private static int MAX_SEGMENT_LENGTH = 1024;

    public HTree(){}

    public static void drawHTree( Turtle t, int length, int depth) {
        if (depth > 0) {

            // start in center of H, move to upper right
            t.goForward( length/2 );
            t.turnLeft(90);
            t.goForward(length / 2);
            t.turnRight(90);

            // recurse
            drawHTree( t, length / 2, depth - 1 );

            // move to lower right of H
            t.turnRight(90);
            t.goForward(length);
            t.turnLeft(90);

            // recurse
            drawHTree( t, length / 2, depth - 1 );

            // move to upper left of H
            t.turnLeft(90);
            t.goForward(length / 2);
            t.turnLeft(90);
            t.goForward(length);
            t.turnRight(90);
            t.goForward(length / 2);
            t.turnRight(90);

            // recurse
            drawHTree( t, length / 2, depth - 1 );

            // move to lower left of H
            t.turnRight(90);
            t.goForward(length);
            t.turnLeft(90);

            // recurse
            drawHTree( t, length / 2, depth - 1 );

            // return to center of H
            t.turnLeft(90);
            t.goForward(length / 2);
            t.turnRight(90);
            t.goForward(length / 2);

        }
    }
    public static Turtle init(int length, int depth){
        Turtle trtl = new Turtle(0,0,0);
        trtl.setWorldCoordinates(-length*2, -length*2, length*2, length*2);
        trtl.setCanvasTitle( "H-Tree, depth: " + depth );
        return trtl;
    }

    public static void main(String[] args) {

        if (args.length < 1){
            System.out.print("Usage: python3 HTree #");
            return;
        }

        int depth = Integer.parseInt(args[0]);

        if ( depth < 0 ) {
            System.out.print("The depth must be greater than or equal to 0");
            return;
        }

        drawHTree(init(MAX_SEGMENT_LENGTH, depth), MAX_SEGMENT_LENGTH, depth);

        System.out.print("Exit the window to close the program");
        return;
    }
}
