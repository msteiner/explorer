package org.ms.explorer.convert.sense.radiation;

import org.ms.explorer.type.sense.radiation.HSB;

import java.util.ArrayList;
import java.util.List;

public enum HSBColor {

    BLACK("black", new HSB(null, null, 0)),
    RED("red", new HSB(0, 100, 100)),
    YELLOW("yellow", new HSB(60, 100, 100)),
    BROWN("brown", new HSB(24, 75, 36)),
    WHITE("white", new HSB(null, 0, 100)),
    GREEN("green", new HSB(120, 100, 100)),
    DARKGREEN("dark green", new HSB(120, 100, 50)),
    CYAN("cyan", new HSB(180, 100, 100)),
    BLUE("blue", new HSB(240, 100, 100)),
    MAGENTA("magenta", new HSB(300, 100, 100));

    private String                    name;
    private HSB                       hsb;
    private static List<HSBColor> list = null;

    static {
        list = new ArrayList<HSBColor>();
        list.add(BLACK);
        list.add(RED);
        list.add(YELLOW);
        list.add(BROWN);
        list.add(WHITE);
        list.add(GREEN);
        list.add(DARKGREEN);
        list.add(CYAN);
        list.add(BLUE);
        list.add(MAGENTA);
    }

    HSBColor(String name, HSB hsb) {
        this.name = name;
        this.hsb = hsb;
    }

    public String getName() {
        return this.name;
    }

    public HSB getHSB() {
        return this.hsb;
    }

    public String getName(HSB hsb) {
      
      
  	/*
  	 BLACK     =   -,   -,   0
    RED       =   0, 100, 100
    YELLOW    =  60, 100, 100
    BROWN     =  24,  75,  36
    WHITE     =   -,   0, 100
    GREEN     = 120, 100, 100
    DARKGREEN = 120, 100,  50
    CYAN      = 180, 100, 100
    BLUE      = 240, 100, 100
    MAGENTA   = 300, 100, 100 
  	 */
        return "NOT_YET_IMPLEMENTED.";
    }
}