package roborallyProject;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Tapis extends Drapeau{
	ImageIcon imageTapis=new ImageIcon(new ImageIcon(this.getClass().getResource("fleche haut.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH));  //On redimensionnne notre image ‚Ä° la taille du JLabel


	public Tapis(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		
		this.setIcon(imageTapis);
	}
	

}
