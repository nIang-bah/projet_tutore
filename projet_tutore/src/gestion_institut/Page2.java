package gestion_institut;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
//import javax.swing.event.MenuListener;
import javax.swing.event.MenuListener.*;

import com.sun.glass.events.MouseEvent;

@SuppressWarnings("serial")
public class Page2 extends JFrame implements ActionListener {
 // private Panneau pan = new Panneau();
  private JPanel container = new JPanel();
  JPanel panBas = new JPanel ( );
  JLabel text,text1;
  JButton sauvegarder, annuler;
  JButton inscription, modification,affichage,aPropos,acceuil,quitter,comptabilite;
  private JMenuBar menuBar = new JMenuBar();

  public Page2(){
	  sauvegarder = new JButton("SAUVEGARDER");
	  annuler = new JButton("ANNULER");
	  sauvegarder.addActionListener(this);
	  //boutons du menu
	  acceuil = new JButton("   Menu || Acceuil    ");
	  inscription = new JButton("    Inscription    ");
	  comptabilite = new JButton("    comptabilité    ");
	  modification = new JButton("    Modifier    ");
	  affichage= new JButton("     Affichage    ");
	  quitter = new JButton("    Quitter     ");
	  aPropos = new JButton("    À propos     ");
	  text = new JLabel("<html><body>ceci est une application de gestion d'institut programmer sous le langage java<br /><br />L'institut N.B.S pour Naby Business School est un nouveau etablissement de prestige.<br />" +
	  		" IL vous garantit un enseignement de qualité avec un diplome reconnu par le CAMES.<br /><br />Avec un siege situer sur la corniche ouest de Dakar et d'emembrer sur cinq regions du<br /> senegal pour ainsi faire " +
	  		"benefier au maximum d'etudiant Senegalais une maitrise des metiers du future. <br /><br />Son programme pedagogique tourne sur les axes suivantes:<ul><li> la gestion et le management<li> le Genie mecanique<li> le Genie civil<li> la Biologie<li> l'informatique<li> les Telecommunications<br /><br />" +
	  		"</body></html>");
	  text.setPreferredSize(new Dimension(500,350));
	  text1 = new JLabel("Naby Business School N.B.S___corniche Ouest dakar.");
	  
	  //action pour menu
	  inscription.addActionListener(this);
	  quitter.addActionListener(this);
	  comptabilite.addActionListener(this);
	  aPropos.addActionListener(this);
	  affichage.addActionListener(this);
	  
	  menuBar.setBackground(Color.lightGray);
	  menuBar.setBounds(3,5, 8, 15);
	  menuBar.setBorderPainted(true);
	  Border b = BorderFactory.createLineBorder (Color.red .darker ( ) ,1) ;
	  Border c = BorderFactory.createLineBorder (Color.black .darker ( ) ,3) ;
		 
	  acceuil.setBorder(b);
	  acceuil.setBackground(Color.LIGHT_GRAY);
	  inscription.setBorder(b);
	  comptabilite.setBorder(b);
	  modification.setBorder(b);
	  affichage.setBorder(b);
	  quitter.setBorder(b);
	  aPropos.setBorder(b);
	 
    this.setTitle("Gestion institut");
    this.setSize(610, 500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);

    container.setBackground(Color.white);
    panBas.setBackground(Color.white);
    container.setLayout(new BorderLayout());
   panBas.setSize(500, 400);
   panBas.add (text);
   panBas.add (text1);
   container.add(panBas, BorderLayout.CENTER);
   panBas.setBorder( new TitledBorder("__Presentation de l'institut N.B.S"));
    
    this.setContentPane(container);
    this.initMenu();
    this.setVisible(true);  
  }

  private void initMenu(){
    //Ajout des menus dans la barre de menus
	  menuBar.add(acceuil);
    menuBar.add(inscription);
    menuBar.add(comptabilite);
    menuBar.add(affichage);
    menuBar.add(modification);
    menuBar.add(quitter);
    menuBar.add(aPropos);

    //Ajout de la barre de menus sur la fenêtre
    this.setJMenuBar(menuBar);
  }

public void actionPerformed1(ActionEvent i) {
	// TODO Auto-generated method stub
	
	
  }

public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == quitter){
		Page1 page1= new Page1();
		page1.setVisible(true);
		setVisible(false);
		
	}
	
	if(e.getSource() == inscription){
		Enre_etudiant page3= new Enre_etudiant();
		this.setVisible(false);
		page3.setVisible(true);	
		
	}
	
	if(e.getSource() == aPropos){
		Apropos propo= new Apropos();
		this.setVisible(false);
		propo.setVisible(true);	
		
	}
	
	if(e.getSource() == affichage){
		Afichage2 afich;
		try {
			afich = new Afichage2();
			this.setVisible(false);
			afich.setVisible(true);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
		
	}
	
	if(e.getSource() == comptabilite){
		
		try {
			Afichage1 page;
			page = new Afichage1();
			page.setVisible(true);	
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.setVisible(false);
		
		
	}
}


}

  

