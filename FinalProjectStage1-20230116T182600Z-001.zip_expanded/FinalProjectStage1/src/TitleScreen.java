import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TitleScreen extends ScreenFrame implements ActionListener{
	private JButton jbtNxt;
	private final Font TITLE_FONT = new Font("Arial", Font.BOLD, 40);
	private final Color TITLE_COLOR = Color.black;

	public TitleScreen() {
		super();
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 400, 30));
		this.getContentPane().setBackground(Color.lightGray);
		
		this.add(addCustomLabel("Final Project: Pong", TITLE_COLOR, TITLE_FONT));
		this.add(addCustomLabel("Students: Owen and Mandana", TITLE_COLOR, TITLE_FONT));
		this.add(addCustomLabel("Teacher: Ms. Xie", TITLE_COLOR, TITLE_FONT));
		this.add(addCustomLabel("Jan 13, 2023", TITLE_COLOR, TITLE_FONT));
		this.add(addCustomLabel("ICS3U1", TITLE_COLOR, TITLE_FONT));
		jbtNxt = addCustomButton("Next", 200, 75, Color.DARK_GRAY, Color.white, new Font("Arial", Font.BOLD, 20));
		jbtNxt.addActionListener(this);
		this.add(jbtNxt);	
		
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jbtNxt) {
			this.dispose();
			new MenuScreen();
		}
	}
	
}