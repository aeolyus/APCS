import gpdraw.*;
/**
 * @Author Richard
 * @Date Jun 6, 2016
 * This draws a house a door, a triangular roof, and two windows.
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