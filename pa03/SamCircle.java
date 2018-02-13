package pa03;

public class SamCircle extends CircleShape{
	private double speedChangeX = 2;
	private double speedChangeY = 4;

  public SamCircle(){
    super();
    this.radius *= Math.random()*2;
	this.color = new java.awt.Color(100,255,100); 
  }

  public void update(double dt){
	this.vx += dt*speedChangeX;
    if (this.vx <1){
    	this.speedChangeX *= -1;
    }else if (this.vx > 100){
    	this.speedChangeX *= -1;
    }	
    this.vy += dt*speedChangeY;
    if (this.vy <1){
    	this.speedChangeY *= -1;
    }else if (this.vy > 100){
    	this.speedChangeY *= -1;
    }
	super.update(dt);
  }
}