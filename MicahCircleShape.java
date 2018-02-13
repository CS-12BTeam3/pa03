package pa03;
import java.awt.Color;
import java.awt.Graphics;



public class MicahCircleShape extends CircleShape{

  private Color randomcolor;

  //the constructor sets randomcolor to a random color, and overrrides the default constructor for the color and radius
  public MicahCircleShape(){
    super();
    this.randomcolor = new Color((int)(255*Math.random()),(int)(255*Math.random()),(int)(255*Math.random()));
    this.color = new java.awt.Color(56,17,36);
    this.radius = 30 + (int)(40*Math.random());

  }

  //this method draws the normal circles but also has a string that is a random color
  public void draw( Graphics g ) {

    int u = (int)(x-radius);
    int v = (int)(y-radius);
    int w = (int)(2*radius);
    int h = w;
    g.setColor(this.color);
    g.fillOval(u,v,w,h);
    g.setColor(this.randomcolor);
    g.drawOval(u,v,w,h);

		String name = "micah";
		g.drawString(name,(int)(u+(radius/2)),(int)(v+radius));

  }

  public void update(double dt){
	   super.update(dt);
  }


}
