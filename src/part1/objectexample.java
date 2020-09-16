
package part1;
import TurtleGraphics.*;
import BreezySwing.*;


public class objectexample {


    public static void main(String[] args) {
        Pen p1 = new StandardPen();
        
        /* multi line comment
        Objects are created from a CLASS
        p1 is and INSTANCE (Object) of the pen class
        Instantiating an object = naking an object
        */
        p1.move(25);
        p1.move(-30,50);
        /*
        p1. --> brings up a list of methods (abilities) that p1 has
        Some methods are found directly in Pen
        Others are INHERITED from the "Class of all classes" --> Object
        //examples --> to String, hashCose, compareTo
        */
        SketchPadWindow w = new SketchPadWindow(500,500);
        WigglePen wp = new WigglePen(w);
        Pen rp = new RainbowPen(w);
        
        /*
        It is common to have more than one way to make an object
        Can make a Pen with a custom window or default window
        */
        
        wp.move(200);
        rp.setDirection(145);
        rp.move(100);
        
        /*
        Even though wp and rp are different TYPES of pens
        They respond to the same commands as p1
        Since all 3 pens have the "pen" class are their Parent
        Pen is where most of these methods are defined and the 3
        actual pens inherit these methods
        */
    }
    
}
