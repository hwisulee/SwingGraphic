package graphic;

import javax.swing.*;
import java.awt.*;

public class graphics extends JFrame {
	private Main_Panel panel = new Main_Panel();
	
	public graphics() {
		PointerInfo pointerInfo = MouseInfo.getPointerInfo();
		String tmp = null;
		
		setTitle("My Face by graphics");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JLabel M_pointer = new JLabel("Mouse Position : " + pointerInfo.getLocation().toString());		
		M_pointer.setHorizontalAlignment(JLabel.CENTER);
		
		c.add(M_pointer, BorderLayout.NORTH);
		c.add(panel, BorderLayout.CENTER);
		setSize(300, 300);
		setResizable(false);
		setVisible(true);
		
		while(true) {
			pointerInfo = MouseInfo.getPointerInfo(); 
			
			if (pointerInfo.getLocation().toString().equals(tmp) == false) {
				tmp = pointerInfo.getLocation().toString(); 
				M_pointer.setText("Mouse Position : " + pointerInfo.getLocation().toString()); 
			}
		}
	}
	
	class Main_Panel extends JPanel {
		private static final long serialVersionUID = 1L;
		
		Color Skin_Color = new Color(255, 224, 205);
		Color brown = new Color(134, 103, 83);
		Color darkbrown = new Color(88, 67, 55);
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Skin_Color);
			g.fillOval(45, 25, 200, 200);
			g.fillArc(20, 100, 70, 60, 90, 180);
			g.fillArc(200, 100, 70, 60, 270, 180);

			g.setColor(Color.white);
			g.fillOval(85, 100, 40, 40);
			g.fillOval(165, 100, 40, 40);
			g.setColor(brown);
			g.fillOval(95, 105, 30, 30);
			g.fillOval(175, 105, 30, 30);
			g.setColor(darkbrown);
			g.fillOval(105, 112, 15, 15);
			g.fillOval(185, 112, 15, 15);

			g.setColor(Color.pink);
			g.fillOval(130, 130, 30, 20);

			g.setColor(Color.black);
			g.drawArc(80, 80, 50, 50, 0, 180);
			g.drawArc(160, 80, 50, 50, 0, 180);
			g.drawArc(120, 130, 50, 50, 180, 180);
			
			g.fillArc(45, 0, 200, 150, 0, 180);
			g.fillArc(40, 50, 40, 100, 90, 180);
			g.fillArc(210, 50, 40, 100, 270, 180);
			g.fillArc(23, 25, 90, 70, 245, 180);
			g.fillArc(100, 25, 90, 70, 120, 180);
			g.fillArc(150, 25, 90, 70, 120, 180);
			g.fillArc(180, 25, 90, 70, 120, 180);
			
			g.drawRect(75, 100, 60, 50);
			g.drawRect(155, 100, 60, 50);
			g.drawLine(135, 130, 155, 130);
			g.drawLine(50, 80, 75, 120);
			g.drawLine(245, 80, 215, 120);
		}
	}
	

	public static void main(String[] args) {
		new graphics();
	}

}
