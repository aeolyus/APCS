import gpdraw.*;

/**
 * This draws a benzene ring symbol.
 * 
 * @author Richard Huang
 */
public class Benzene {
	
	private DrawingTool pencil;
	private SketchPad paper;
	
	public Benzene(){
		paper = new SketchPad(500, 500);
		pencil = new DrawingTool(paper);
	}
	
	public void draw(){
		//circle
		pencil.drawCircle(50);
		
		//pos
		pencil.up();
		pencil.move(100);
		pencil.down();
		pencil.setDirection(-30);
		
		//hex
		for(int i=0;i<7;i++){
		pencil.forward(100);
		pencil.turnRight(60);
		}
	}

}
