//draws the example on 3G.21
import java.awt.*;

public class Assignment1 {
	public static void main(String[] args) {
		//starts the drawing panel
		DrawingPanel panel = new DrawingPanel(500,500);
		panel.setBackground(Color.YELLOW);
		Graphics face = panel.getGraphics();
		
		//creates circles for ears
		face.setColor(Color.BLUE);
		face.fillOval(100, 100, 100, 100);
		face.fillOval(300, 100, 100, 100);
		
		//creates box
		face.setColor(Color.RED);
		face.fillRect(150, 150, 200, 200);
		
		//creates line
		face.setColor(Color.BLACK);
		face.drawLine(150, 250, 350, 250);
	}

}
