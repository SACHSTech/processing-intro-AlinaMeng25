import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(85, 201, 217);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    //fill(255);
    rect(75, 75, 300, 300);

    rect(150, 150, 200, 200);

    ellipse(250, 250, 100, 100);  

    line(0, 0, 500, 500);
    line(0, 500, 500, 0);

  }
  
  // define other methods down here.
}