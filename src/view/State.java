package view;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class State {
	final static Color background = new Color(32, 83, 117);
	final static Color green_button = new Color(60, 179, 113);
	final static Color clear_button = new Color(112, 128, 144);
	final static Color red_button = new Color(220, 20, 60);
	final static Color blue_button = new Color(0, 191, 255);
//	  static final Color red_button      = new Color(255, 0, 0);

	final static Icon logo_small = new ImageIcon("libs/logo-small.png");
	final static Icon logo_big = new ImageIcon("libs/logo-big.png");

	public static MouseAdapter retureHomePage(JComponent c, JFrame main, HomePage homePage) { // if c was clicked , hide
																								// frame main and open a
																								// HomePage()
		return new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				JFrame homePageFrame = homePage;
				if (e.getSource().equals(c)) {
					homePageFrame.setVisible(true);
					homePageFrame.setLocationRelativeTo(null);
					homePageFrame.setSize(1200, 700);
					main.setVisible(false);
				}

			}
		};

	}

}
