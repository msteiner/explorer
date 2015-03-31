package org.ms.explorer.dataset;

import org.ms.explorer.convert.sense.radiation.HSBColor;
import org.ms.explorer.type.sense.radiation.HSB;

public class SetHSB {
  
  public HSB createHSB() {
    
    return createHSB(HSBColor.BLUE);
  }
  
  public HSB createHSB(HSBColor color) {
    return color.getHSB();
  }
}
