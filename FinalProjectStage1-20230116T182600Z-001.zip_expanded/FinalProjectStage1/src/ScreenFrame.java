import java.awt.*;
import javax.swing.*;

public abstract class ScreenFrame extends JFrame{
	public ScreenFrame() {
		super("Pong");
		this.setSize(1000, 800);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	protected JButton addCustomButton(String text, int x, int y, int width, int height, Color fg, Color bg, Font font) {
		JButton button = new JButton(text);
		button.setBounds(x, y, width, height);
		button.setForeground(fg);
		button.setBackground(bg);
		button.setFont(font);
		button.setFocusable(false);
		return button;
	}
	protected JButton addCustomButton(String text, int width, int height, Color fg, Color bg, Font font) {
		JButton button = new JButton(text);
		button.setPreferredSize(new Dimension(width, height));
		button.setForeground(fg);
		button.setBackground(bg);
		button.setFont(font);
		button.setFocusable(false);
		return button;
	}
	protected JLabel addCustomLabel(String text, Color fg, Font font) {
		JLabel label = new JLabel(text);
		label.setForeground(fg);
		label.setFont(font);
		return label;
	}
	
}