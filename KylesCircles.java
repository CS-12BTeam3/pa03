package pa03;

import java.awt.Color;
import java.util.*;
import java.awt.Graphics;

/**
 * KylesCircles are circles which move at random speeds but the same direction 
 * on the board and change color randomly 
 * and have a color changing border in a specific order 
*/
public class KylesCircles extends CircleShape
{
//creates a new variable for the border color and 3 random ints that will represent
//the color of the circle 
  public Color borderColor;
  Random rand = new Random();
  private int r = rand.nextInt(250);
  private int g = rand.nextInt(250);
  private int b = rand.nextInt(250);
  private double vr=1.0;

  /**
   * creates the color and border color for the circle. the color was created above as well with
   * random integers and im just doign set 25's for the border color 
   */
  public KylesCircles()
  {
    super();
    this.borderColor = new java.awt.Color((int)(25),(int)(25), (int)(25),255);
    this.color = new java.awt.Color(r, g, b, 255);
  }

  public void update(double dt)
  {
    // i wanted to 
    // change the size of the circles random amounts!!
			this.radius += dt*vr;
      Random rand1 = new Random();
      int y = rand1.nextInt(10);
      int x = rand1.nextInt(12);
    if  (this.radius <10) this.vr *= (-1*y);
    else if (this.radius > 50) this.vr *= (-1*x);
    super.update(dt);
  }
}
