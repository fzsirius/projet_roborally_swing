package roborallyProject;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Window;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Fenetre extends JFrame {   //notre fenetre ne sera pas JFrame mais Fenetere
	
	
	public Fenetre() { //Constructeurs de Fenetre, les param�tres sont dans les setters
	
		// On va personnaliser notre fen�tre
		
	
	
	this.setTitle("RoboRally"); // d�finit un titre pour la fen�tre
	this.setSize(700,600); //d�finit la taille de la fen�tre en pixels. 1er param�tre:longeur et second param�tre:largeur
	this.setLocationRelativeTo(null); //On va positionner notre objet au centre
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fermer la fen�tre quand on clique sur la croix rouge (terminer le processus)
	this.setLayout(new BorderLayout());
	//this.setMinimumSize(new Dimension(500,500));
	this.setResizable(false);
	
	
	
	
	
	
	
	
	
	


	//pan.setBackground(Color.gray); //d�finition de la couleur de fond du panel "pan"
	
	
	
	
	//lab.setBackground(Color.BLACK);
	
	//pan.setBackground(Color.BLUE);
	
	

	//On ajoute des �l�ments graphiques
	
	
	}

}
