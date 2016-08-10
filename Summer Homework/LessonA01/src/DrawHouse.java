import gpdraw.*;

/**
 * This draws a house with two windows, a door, and a triangular roof.
 * 
 * @author Richard Huang
 */
public class DrawHouse {

	private DrawingTool pencil;
	private SketchPad paper;

	public DrawHouse(){
		paper = new SketchPad(500, 500);
		pencil = new DrawingTool(paper);
	}

	public void draw(){
		//house
		pencil.drawRect(300,200);

		//roof
		pencil.up();
		pencil.move(150,100);
		pencil.down();
		pencil.move(0,150);
		pencil.move(-150,100);

		//windows
		pencil.up();
		pencil.move(75,50);
		pencil.down();
		pencil.drawRect(50,50);
		pencil.up();
		pencil.move(-75,50);
		pencil.down();
		pencil.drawRect(50,50);

		//door
		pencil.up();
		pencil.move(0,-50);
		pencil.down();
		pencil.drawRect(50,100);
	}
}
