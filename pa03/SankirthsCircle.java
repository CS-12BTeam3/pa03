package pa03;
import java.awt.Color;
import java.awt.Graphics;

/**
 * SankirthsCircle are circles which move at a constant velocity
 * on the board and change color depending on the direction they are travelling,
 * and have a randomly color changing border
*/
public class SankirthsCircle extends CircleShape
{
//creates a new variable for the border color and 3 new ints that will represent
//the color of the circle and are changed depending on the direction of motion.
  public Color borderColor;
  private int r = 237;
  private int g = 255;
  private int b = 43;

  /**
   * create a Color/border color changing circle and set the fill color to
   * yellow and a random border color
   */
  public SankirthsCircle()
  {
    super();
    this.borderColor = new java.awt.Color((int)(255*Math.random()),(int)(255*Math.random()), (int)(255*Math.random()),255);
    this.color = new java.awt.Color(r, g, b, 255);
  }

  /**
   * rewrites the draw method so that the border color can be changed unlike in
   * CircleShape.java
   */
  public void draw( Graphics g )
  {
    int u = (int)(x-radius);
    int v = (int)(y-radius);
    int w = (int)(2*radius);
    int h = w;
    g.setColor( color );
    g.fillOval( u,v,w,h );
    g.setColor(this.borderColor);
    g.drawOval(u,v,w,h );
  }

  /**
	 * update the circle as usual, but also change the border color to a random
   * color. If it is moving right, then the circle should be blue. If moving
	 * left, then it should be yellow. If it is not changing in the x-direction,
   * then it appears red.
	 */
  public void update(double dt)
  {
    // change the properties of the CircleShape after dt seconds have elapsed.
			this.borderColor = new java.awt.Color((int)(255*Math.random()), (int)(255*Math.random()), (int)(255*Math.random()), 255);
      if(vx<0)
      {
        this.color = new java.awt.Color(this.r, this.g, this.b, 255);
      }
      if(vx>0)
      {
        this.color = new java.awt.Color(255-this.r, 255-this.g, 255-this.b, 255);
      }
      if (vx ==0)
      {
        this.color = new java.awt.Color(255, 0, 0, 255);
      }
      super.update(dt);
  }
}
