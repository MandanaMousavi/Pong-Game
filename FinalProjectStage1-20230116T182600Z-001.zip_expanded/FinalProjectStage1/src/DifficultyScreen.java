import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DifficultyScreen extends ScreenFrame implements ActionListener{
	private JButton jbtScore, jbtMenu;
	private PaintPanel canvas = new PaintPanel();
	private JLabel label;
	private final Color DIFFICULTY_COLOR_FG = Color.DARK_GRAY, DIFFICULTY_COLOR_BG = Color.white;
	private final Font DIFFICULTY_FONT = new Font("Arial", Font.PLAIN, 25);
	
	DifficultyScreen(){
		super();
		
		canvas.setLayout(null);
		this.add(canvas);
		
		label = addCustomLabel("Scores", Color.black, new Font("Arial", Font.BOLD, 50));
		label.setBounds(100, -200, this.getWidth() - 1, this.getHeight() - 1 );
		canvas.add(label);

		jbtScore = addCustomButton("Score", 25, 300, 300, 200, DIFFICULTY_COLOR_FG, DIFFICULTY_COLOR_BG, DIFFICULTY_FONT);
		jbtScore.addActionListener(this);
		canvas.add(jbtScore);
		
		jbtMenu = addCustomButton("Menu", 750, 650, 200, 80, DIFFICULTY_COLOR_FG, DIFFICULTY_COLOR_BG, DIFFICULTY_FONT);
		jbtMenu.addActionListener(this);
		canvas.add(jbtMenu);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jbtScore) {
			
		}
		else if(e.getSource() == jbtMenu) {

			new MenuScreen();
			this.dispose();
		}

	}
	class PaintPanel extends JPanel{
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
		}
	}

}