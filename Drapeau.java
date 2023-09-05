package roborallyProject;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Drapeau extends Robott {
	ImageIcon imageDrapeau=new ImageIcon(new ImageIcon(this.getClass().getResource("drapeau.jpg")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH));  //On redimensionnne notre image ‚Ä° la taille du JLabel


	
	public Drapeau(int x, int y) {
		super(x,y);
		this.setIcon(imageDrapeau);
	}
	
	


		
	}

