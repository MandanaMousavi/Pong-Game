import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class InstructionsScreen extends ScreenFrame implements ActionListener{
	private ImageIcon bg;
	private PaintPanel canvas;
	private JButton jbtMenu;
	
	public InstructionsScreen() {
		super();
		bg = new ImageIcon("Images/bgPongInstructions.png");
		canvas = new PaintPanel();
		canvas.setLayout(null);
		canvas.add(jbtMenu = addCustomButton("Menu", 750, 650, 200, 80, Color.DARK_GRAY, Color.WHITE, new Font("Arial", Font.PLAIN, 25)));
		jbtMenu.addActionListener(this);
		this.add(canvas);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jbtMenu) {
			new MenuScreen();
			this.dispose();
		}
	}
	class PaintPanel extends JPanel{
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawImage(bg.getImage(),0,0,this.getWidth(),this.getHeight(),null);
		}
	}
}