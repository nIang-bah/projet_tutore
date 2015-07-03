package gestion_institut;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;


public class Page5 extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel pospay,posbouton; 
	Container contenu;
	JTextField txtprenomresp ;
	JLabel prenomresp;
	JTextField txtnomresp ;
	JLabel nomresp;
	JTextField txtid ;
	JLabel idetude;
	JTextField txtmontant ;
	JLabel montant;
	JLabel mois;
	JRadioButton janv,fev,mars,avril,mai,juin,july,aout,sept,oct,nov,dec,liquide,cheque;
	JLabel modepay;
	JTextField txtcheque ;
	JButton terminer =null;
	JButton reset;
	JButton annuler,retour;
	String id;
	static int idetud;
	
	public Page5(int idetud)
	{
	//this.idetud=idetud;
	 System.out.println("nnb "+this.idetud);
    }
	
	public Page5()
	{
		 
		super();
		pospay = new JPanel();
		posbouton = new JPanel();
		this.setTitle("Enregistrement de paiement");
		this.setSize(550,550);
		contenu = this.getContentPane();
		contenu.add(pospay);
		contenu.setLayout ( null ) ; 
		contenu.setBackground(Color.white);
		prenomresp = new JLabel("Prenom du tuteur  :   "); 
		prenomresp.setPreferredSize(new Dimension(150, 25));
		pospay.add(prenomresp);
		txtprenomresp =  new JTextField();
		txtprenomresp.setPreferredSize(new Dimension(200, 25));
	    pospay.add(txtprenomresp);
	    nomresp = new JLabel("Nom du responsable  :   "); 
		nomresp.setPreferredSize(new Dimension(200, 25));
		pospay.add(nomresp);
		txtnomresp =  new JTextField();
		txtnomresp.setPreferredSize(new Dimension(200, 25));
	    pospay.add(txtnomresp);
	    
	    idetude = new JLabel("Identifiant de l'etudiant  :   "); 
		idetude.setPreferredSize(new Dimension(190, 25));
		pospay.add(idetude);
		txtid =  new JTextField();
		txtid.setPreferredSize(new Dimension(160, 25));
	    pospay.add(txtid);
		
	    mois = new JLabel("SCOLARITE DU(des) MOIS    :   "); 
		mois.setPreferredSize(new Dimension(350, 20));
		janv= new JRadioButton ("Janvier");
		janv.setPreferredSize(new Dimension(85, 15));
	     fev= new JRadioButton ("Fevrier");
	     fev.setPreferredSize(new Dimension(225, 15));
	     mars= new JRadioButton ("Mars");
	     avril= new JRadioButton ("Avril");
	     avril.setPreferredSize(new Dimension(230, 15));
	     mai= new JRadioButton ("Mai");
	     juin= new JRadioButton ("Juin");
	     juin.setPreferredSize(new Dimension(300, 15));
	     july= new JRadioButton ("Juillet");
	     //july.setPreferredSize(new Dimension(250, 15));
	     oct= new JRadioButton ("Octobre");
	     oct.setPreferredSize(new Dimension(190, 15));
	     nov= new JRadioButton ("Novembre");
	     dec= new JRadioButton ("Decembre");
	     dec.setPreferredSize(new Dimension(200, 15));
	     pospay.add(mois);
	     pospay.add(oct);
	     pospay.add(nov);
	     pospay.add(dec);
	     pospay.add(janv);
	     pospay.add(fev);
	     pospay.add(mars);
	     pospay.add(avril);
	     pospay.add(mai);
	     pospay.add(juin);
	     pospay.add(july);
	     
	      
		   // pospay = new JPanel(); 
			pospay.setBounds ( 20,20,425,400);
			pospay.setBorder( new TitledBorder("renseignements comptables")); 
			nomresp.setPreferredSize(new Dimension(150, 25));
			
			 montant = new JLabel("Montant payé  :   "); 
			 montant.setPreferredSize(new Dimension(200, 25));
			 montant.setPreferredSize(new Dimension(150, 25));
			 pospay.add(montant);
			 txtmontant =  new JTextField();
			 txtmontant.setPreferredSize(new Dimension(200, 25));
			 pospay.add(txtmontant);
			
			modepay = new JLabel("Modalité de paiement  :   ");
			pospay.add(modepay);
			liquide= new JRadioButton ("En espece");
		    cheque= new JRadioButton ("Par checque");
		    cheque.setPreferredSize(new Dimension(300, 25));
		   pospay.add(liquide);
		pospay.add(cheque);
		txtcheque = new JTextField();
		txtcheque.setText("numero du checque");
		txtcheque.setPreferredSize(new Dimension(200, 25));
		pospay.add(txtcheque);
		
		//contenu.add(pospay);
		posbouton = new JPanel(); 
		posbouton.setBounds (30,450,400,50);
		contenu.add(posbouton);
		terminer = new JButton ("Enregistrer");
		terminer.addActionListener(this);
		reset = new JButton ("reset");
		reset.addActionListener(this);
		annuler = new JButton ("annuler");
		retour = new JButton ("Retour");
		retour.addActionListener(this);
		posbouton.add(retour);
		posbouton.add(terminer);
		posbouton.add(reset);
		
		
		 ButtonGroup groupe3 = new ButtonGroup(); 
			groupe3.add(liquide);
			groupe3.add(cheque);	
			
			
			
			}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == terminer){
			
//insertion
			
			//sexe
			String mois="";
			 if (oct.isSelected()){
	    		   mois="Octobre";
	    	  }
	    	  
	    	  if (nov.isSelected()){
	    		   mois=mois+" Novembre";
	    	  }
	    	  
	    	  if (dec.isSelected()){
	    		  mois=mois+" Decembre";
	    	  }
	    	  
	    	  if (janv.isSelected()){
	    		  mois=mois+" Janvier";
	    	  }
	    	  if (fev.isSelected()){
	    		  mois=mois+" Fevrier";
	    	  }
	    	  
	    	  if (mars.isSelected()){
	    		  mois=mois+" Mars";
	    	  }
	    	  if (avril.isSelected()){
	    		  mois=mois+" Avril";
	    	  }
	    	  if (mai.isSelected()){
	    		  mois=mois+" Mai";
	    	  }
	    	  if (juin.isSelected()){
	    		  mois=mois+" Juin";
	    	  }
	    	  if (july.isSelected()){
	    		  mois=mois+" Juillet";
	    	  }
	    	  
	    	  System.out.println(mois);
	    	  String modalite="";
	    	  if (liquide.isSelected()){
	    		  modalite=" En espece";
	    	  }
	    	  String numch=txtcheque.getText();
	    	  if (cheque.isSelected()){
	    		  modalite=" Par checque";
	    		 
	  			System.out.println(numch);
	    	  }
	    	  
	    	  System.out.println(modalite);
			String mont=txtmontant.getText();
			System.out.println(mont);
			
			id=txtid.getText();
			idetud=Integer.parseInt(String.valueOf(id));
			System.out.println("njnjn"+this.idetud);
			
			Insertion2 zg= new Insertion2( this.idetud,mois,mont,modalite,numch);
	 	       zg.verif2();
	 	        setVisible(false);
	 	        
			Page2 page2= new Page2();
			this.setVisible(false);
			page2.setVisible(true);	
				
		}
		if(e.getSource() == reset){
			Page5 page5= new Page5();
			this.setVisible(false);
			page5.setVisible(true);	
			
		}
		
		if(e.getSource() == retour){
			Afichage1 pag;
			try {
				pag = new Afichage1();
				this.setVisible(false);
				pag.setVisible(true);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
				
			
		}
	}

public static void main( String [] args) {  

	// TODO Auto-generated method stub
	
	Page4 page4 = new Page4();
	page4.setVisible(true);
}}



