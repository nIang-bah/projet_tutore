package gestion_institut;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
//import javax.swing.event.MenuListener;
import javax.swing.event.MenuListener.*;

import com.sun.glass.events.MouseEvent;

public class Page3 extends JFrame {
   

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	Container contenu;
	JPanel panel1,panel2,panel3;
	JLabel nom, prenom, date_naiss, adresse, tel,email,nationnalite, classe,nomtut,prenomtut,teltut;	
	JTextField txtnom,txtprenom,txtdate,txtadr,txttel,txtmail,txtnat,txtclass,txtnomtut,txtprenomtut,txtteltut;	
	JButton sauvegarder,annuler,continuer,quitter,a,b;
	
	//GridBagConstraints gr;
	public Page3(){
		  this.setSize(400, 400);
		contenu = this.getContentPane ();
		sauvegarder = new JButton("SAUVEGARDER");
		annuler = new JButton("ANNULER");
		continuer = new JButton("ANNULER");quitter = new JButton("ANNULER");
		a = new JButton("ANN");b = new JButton("ANN");
		
		//contenu.setSize (new Dimension (700,520));
		//contenu.setLayout (new GridBagLayout()) ;
		
		panel1 = new JPanel();
		panel1.setBounds(0, 50, 250, 250);
			panel1.add(continuer);
			panel1.add(quitter);
			//contenu.add(panel1);
			panel1.setBorder ( new TitledBorder("Saisissez votre Login et Mot de passe"));
			panel2 = new JPanel();
			panel2.setBounds(250, 50, 250, 250);
			panel2.add(sauvegarder);
			panel2.add(annuler);
			panel2.setBorder ( new TitledBorder("Saisissez votre Login et Mot de passe"));
			
			panel3 = new JPanel(new GridBagLayout ());
			panel3.add(a);panel3.add(b);
			this.setTitle("Inscription Etudiant");
		  
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   // this.setLocationRelativeTo(null);
			
			//panel1.setLayout();
			panel1.setBackground(Color.white);
			contenu.add (panel1, BorderLayout.EAST);
			contenu.add (panel2, BorderLayout.WEST);
			contenu.add (panel3, BorderLayout.SOUTH);
			
			
		
	//instanciation des labels et textfield
		nom = new JLabel ("Nom:     ");txtnom =new JTextField("",15); 
		prenom = new JLabel ("Prenoom:     ");txtprenom =new JTextField("",15);
		date_naiss = new JLabel ("Date de naissance:     ");txtdate =new JTextField("",15);
		adresse = new JLabel ("Ardesse:     ");txtadr =new JTextField("",15);
		tel = new JLabel ("Telecphone:     ");txttel =new JTextField("",15);
		email = new JLabel ("Email:     ");txtmail =new JTextField("",15);
		nationnalite = new JLabel ("Nationnalité:     ");txtnat =new JTextField("",15);
		classe = new JLabel ("Classe:     ");txtclass =new JTextField("",15);
		nomtut = new JLabel ("Nom :     ");txtnomtut =new JTextField("",15);
		prenomtut = new JLabel ("Prenom :     ");txtnomtut =new JTextField("",15);
		teltut = new JLabel ("Nom:     ");txtteltut =new JTextField("",15);
		
		nom.setHorizontalAlignment(2);
		panel2.add(nom);
		nom.setPreferredSize( new Dimension(50,100));
		nom.setBounds(100, 100, 100, 100);
		panel2.add(txtnom);
		panel1.add(prenom);
		prenom.setPreferredSize( new Dimension(100,100));
		panel1.add(txtprenom);
		panel1.add(date_naiss);panel1.add(txtdate);
		//panel1.add(email);panel1.add(txtmail);
		//panel1.add(tel);panel1.add(txttel);
		//panel1.add(nationnalite);panel1.add(txtnat);
		//panel1.add(classe);panel1.add(txtclass);
		//panel2.add(nomtut);panel1.add(txtnomtut);
		//panel1.add(prenomtut);panel1.add(txtprenomtut);
		//panel1.add(teltut);panel1.add(txtteltut);
		
	    
	}//fin constructeur

	 // static void main(String[] args) {
		// TODO Auto-generated method stub
		// Page3 page3 = new Page3();
		  //page3.setVisible(true);
	//}

}//fin classe


