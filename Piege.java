package roborallyProject;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Piege extends Mur{
	ImageIcon imagePiege=new ImageIcon(new ImageIcon(this.getClass().getResource("explosion.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH));  //On redimensionnne notre image ‚Ä° la taille du JLabel

	public Piege(int x, int y) {
		super(x, y);
		this.setIcon(imagePiege);
		
	}

}
