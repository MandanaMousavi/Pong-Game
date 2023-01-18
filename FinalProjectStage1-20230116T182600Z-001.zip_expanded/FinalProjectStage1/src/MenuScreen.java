import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MenuScreen extends ScreenFrame implements ActionListener{
	private ImageIcon bg, bgGif;
	private JButton jbtPlay ,jbtInstructions, jbtScores, jbtExit;
	private PaintPanel canvas;
	private JLabel heading, labelGif;
	private final Color MENU_COLOR_FG = Color.DARK_GRAY, MENU_COLOR_BG = Color.white;
	private final Font MENU_FONT = new Font("Arial", Font.PLAIN, 25);

	MenuScreen(){
		super();

		bg = new ImageIcon("Images/bgMenu.png");
		canvas = new PaintPanel();
		canvas.setLayout(null);
		this.add(canvas);
		
		bgGif = new ImageIcon("images/Pong.gif");
		labelGif = new JLabel(bgGif);
		canvas.add(labelGif);
		labelGif.setBounds(130, 250, 500, 400);
		
		canvas.add(heading = addCustomLabel("Welcome to Pong!", Color.white, new Font("Arial", Font.BOLD, 60)));
		heading.setBounds(120, 25, 900, 150);

		jbtPlay = addCustomButton("Play", 750, 180, 200, 80, MENU_COLOR_FG, MENU_COLOR_BG, MENU_FONT);
		jbtPlay.addActionListener(this);
		canvas.add(jbtPlay);

		jbtInstructions = addCustomButton("Instructions", 750, 300, 200, 80, MENU_COLOR_FG, MENU_COLOR_BG, MENU_FONT);
		jbtInstructions.addActionListener(this);
		canvas.add(jbtInstructions);

		jbtScores = addCustomButton("Scores", 750, 420, 200, 80, MENU_COLOR_FG, MENU_COLOR_BG, MENU_FONT);
		jbtScores.addActionListener(this);
		canvas.add(jbtScores);

		jbtExit = addCustomButton("Exit", 750, 540, 200, 80, MENU_COLOR_FG, MENU_COLOR_BG, MENU_FONT);
		jbtExit.addActionListener(this);
		canvas.add(jbtExit);
	}
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == jbtPlay) {

			new DifficultyScreen();
			this.dispose();
		}
		else if(e.getSource() == jbtInstructions) {

			new InstructionsScreen();
			this.dispose();
		}
		else if(e.getSource() == jbtScores) {
		}
		else if(e.getSource() == jbtExit) {
			System.exit(0);
		}
	}
	class PaintPanel extends JPanel{
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawImage(bg.getImage(),0,0,this.getWidth(),this.getHeight(),null);
		}
	}

}