package gestion_institut;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;



public class Enre_etudiant extends JFrame implements ActionListener {
	JPanel posetu, possco,poschoix; 
	Container page_etu;
	
	//PARTIE ENREGISTREMENT ETUDIANT
	GridBagConstraints gr;
	GridBagConstraints gr2;
	JTextField txtnom ;
	JLabel nom ;
	JTextField txtprenom ;
	JLabel prenom ;
	JTextField txtemail ;
	JLabel email; 
	JTextField txtddn ;
	JLabel ddn;
	JTextField txtldn ;
	JLabel ldn;
	JTextField txtadr ;
	JLabel adr;
	JTextField txttel ;
	JLabel tel;
	JLabel sexe;
	JRadioButton homme,femme,info,telecom,genie,meca,biologie,gestion;
	JRadioButton l1,l2,l3,master1,master2,doctorat,cours1,cours2;
	JTextField txtprenomtute ;
	JLabel prenomtute;
	JTextField txtnomtute ;
	JLabel nomtute;
	JTextField txtteltute ;
	JLabel teltute;
	JLabel cours;
	//PARTIE ENREGISTREMENT SCOLARITE
	JLabel departement;
	JComboBox txtdepartement;
	JLabel formation;
	JComboBox txtformation;
	JLabel niveau;
	JLabel annee;
	JComboBox txtannee;
	JTextField txtmontant ;
	JLabel montant;
	// PARTIE ENREGISTREMENT SCOLARITE
	JButton etape2 =null;
	JButton reset;
	JButton annuler;
	
	public static boolean connecte=false;
	
	public Enre_etudiant()
	{
		super();
		this.setTitle("inscription de l'etudiant");
		this.setSize(750,550);
		page_etu = this.getContentPane();
		page_etu.setLayout ( null ) ; 
		page_etu.setBackground(Color.white);
		
		
		//PARTIE ENREGISTREMENT ETUDIANT 
		
		
		posetu = new JPanel(); 
		posetu.setBounds (10,20,370,380);
		posetu.setBorder( new TitledBorder("__Renseignements de l'etudiant")); 
		
		//posetu.setBackground (Color.YELLOW); 
		
		
		
		page_etu.add(posetu); 
		Border b = BorderFactory.createLineBorder (Color.ORANGE .darker ( ) ,5) ;
		//posetu.setBorder (b); 
		
		
		
		nom = new JLabel("NOM  :   "); 
		txtnom =  new JTextField();
		txtnom.setPreferredSize(new Dimension(200, 25));
		txtnom.setLocation(12,10);
		txtnom.setBorder(BorderFactory.createLineBorder(Color.RED));
		
		//Font polic = new Font("Tahoma", Font.ITALIC, 35);
		//nom.setFont(polic);
		nom.setPreferredSize(new Dimension(150, 20));
		posetu.add(nom);
		posetu.add(txtnom);
		
		
		
		prenom = new JLabel("PRENOM  :   "); 
		prenom.setPreferredSize(new Dimension(150, 25));
		posetu.add(prenom);
		txtprenom =  new JTextField();
		txtprenom.setPreferredSize(new Dimension(200, 25));
        posetu.add(txtprenom);
        
        
        email = new JLabel("EMAIL  :   "); 
		email.setPreferredSize(new Dimension(150, 25));
		posetu.add(email);
		txtemail =  new JTextField();
		txtemail.setPreferredSize(new Dimension(200, 25));
        posetu.add(txtemail);
        
        
        ddn = new JLabel("Date de naissance  :   "); 
		ddn.setPreferredSize(new Dimension(150, 25));
		posetu.add(ddn);
		txtddn =  new JTextField();
		txtddn.setPreferredSize(new Dimension(200, 25));
		txtddn.setText("1999/11/21");
        posetu.add(txtddn);
        
        ldn = new JLabel("Lieu de naissance  :   "); 
		ldn.setPreferredSize(new Dimension(150, 25));
		posetu.add(ldn);
		txtldn =  new JTextField();
		txtldn.setPreferredSize(new Dimension(200, 25));
        posetu.add(txtldn);
        
        adr = new JLabel("Adresse du domicile  :   "); 
		adr.setPreferredSize(new Dimension(150, 25));
		posetu.add(adr);
		txtadr =  new JTextField();
		txtadr.setPreferredSize(new Dimension(200, 25));
        posetu.add(txtadr);
        
        tel = new JLabel("Telephone  :   "); 
		tel.setPreferredSize(new Dimension(150, 25));
		posetu.add(tel);
		txttel =  new JTextField();
		txttel.setPreferredSize(new Dimension(200, 25));
        posetu.add(txttel);
        
        sexe = new JLabel("sexe de l'etudiant  :   "); 
		sexe.setPreferredSize(new Dimension(150, 25));
		posetu.add(sexe);
        homme= new JRadioButton ("HOMME");
        femme= new JRadioButton ("FEMME");
        posetu.add(femme);
        posetu.add(homme);
        ButtonGroup groupe2 = new ButtonGroup(); 
		groupe2.add(femme);
		groupe2.add(homme);
		
		prenomtute = new JLabel("Prenom du tuteur  :   "); 
		prenomtute.setPreferredSize(new Dimension(150, 25));
		posetu.add(prenomtute);
		txtprenomtute =  new JTextField();
		txtprenomtute.setPreferredSize(new Dimension(200, 25));
	    posetu.add(txtprenomtute);
	    
	    nomtute = new JLabel("Nom du tuteur  :   "); 
		nomtute.setPreferredSize(new Dimension(150, 25));
		posetu.add(nomtute);
		txtnomtute =  new JTextField();
		txtnomtute.setPreferredSize(new Dimension(200, 25));
	    posetu.add(txtnomtute);
	    
	    teltute = new JLabel("Telephone du tuteur  :   "); 
		teltute.setPreferredSize(new Dimension(150, 25));
		posetu.add(teltute);
		txtteltute =  new JTextField();
		txtteltute.setPreferredSize(new Dimension(200, 25));
	    posetu.add(txtteltute);
		
		//PARTIE ENREGISTREMENT SCOLARITE
		
		
		possco = new JPanel(); 
		possco.setBounds ( 400,20,320,380);
		possco.setBorder( new TitledBorder("scolarité  etudiant")); 
		//possco.setBackground (Color.GRAY); 
		
		Border c = BorderFactory.createLineBorder (Color.ORANGE .darker ( ) ,5) ;
		//possco.setBorder (c);
		page_etu.add(possco); 
		
		departement = new JLabel("DEPARTEMENT  :   "); 
		departement.setPreferredSize(new Dimension(110, 20));
		 info= new JRadioButton ("Informatique");
	     telecom= new JRadioButton ("Telecom");
	     genie= new JRadioButton ("Genie civile");
	     meca= new JRadioButton ("Mecanique");
	     gestion= new JRadioButton ("Gestion");
	     biologie= new JRadioButton ("Biologie");
	     possco.add(departement);
	     possco.add(info);
	     possco.add(telecom);
	     possco.add(genie);
	     possco.add(meca);
	     possco.add(gestion);
	     possco.add(biologie);
	     info.setPreferredSize(new Dimension(200, 15));
	     telecom.setPreferredSize(new Dimension(87, 15));
	     genie.setPreferredSize(new Dimension(200, 15));
	     meca.setPreferredSize(new Dimension(87, 15));
	     gestion.setPreferredSize(new Dimension(200, 15));
	     biologie.setPreferredSize(new Dimension(87, 15));
	     
	     ButtonGroup groupe3 = new ButtonGroup(); 
			groupe3.add(info);
			groupe3.add(telecom);
			groupe3.add(genie);
			groupe3.add(meca);
			groupe3.add(gestion);
			groupe3.add(biologie);
	     
	     niveau = new JLabel("NIVEAU  :   "); 
	     niveau.setPreferredSize(new Dimension(110, 20));
			 l1= new JRadioButton ("Licence 1");
		     l2= new JRadioButton ("Licence 2");
		     l3= new JRadioButton ("Licence 3");
		     master1= new JRadioButton ("Master 1");
		     master2= new JRadioButton ("Master 2");
		     doctorat= new JRadioButton ("Doctorat");
		     possco.add(niveau);
		     possco.add(l1);
		     possco.add(master1);
		     possco.add(l2);
		     possco.add(master2);
		     possco.add(l3);
		     possco.add(doctorat);
		     l1.setPreferredSize(new Dimension(200, 15));
		     l2.setPreferredSize(new Dimension(200, 15));
		     l3.setPreferredSize(new Dimension(200, 15));
		     master1.setPreferredSize(new Dimension(87, 15));
		     master2.setPreferredSize(new Dimension(87, 15));
		     doctorat.setPreferredSize(new Dimension(87, 15));
		     
		     ButtonGroup groupe4 = new ButtonGroup(); 
				groupe4.add(l1);
				groupe4.add(l2);
				groupe4.add(l3);
				groupe4.add(master1);
				groupe4.add(master2);
				groupe4.add(doctorat);
		
				
			cours = new JLabel("HEURES DE COURS  :   "); 
			cours.setPreferredSize(new Dimension(150, 20));
			cours1= new JRadioButton ("cours du jour");
			cours2= new JRadioButton ("cours du soir");
			
			 cours1.setPreferredSize(new Dimension(200, 35));
			 cours2.setPreferredSize(new Dimension(100, 35));
			     
			    ButtonGroup groupe5 = new ButtonGroup(); 
					groupe5.add(cours1);
					groupe5.add(cours2);
			possco.add(cours);
			possco.add(cours1);
			possco.add(cours2);
				
		annee = new JLabel("ANNEE SCOLAIRE  :   "); 
		annee.setPreferredSize(new Dimension(150, 40));
		String tabfor[] =  {"annee scolaire","2014-2015","2015-2016","2016-2017","2017-2018","2019-2020"}; 
		txtannee =  new  JComboBox(tabfor);
		
		txtannee.setPreferredSize(new Dimension(150, 25));
		possco.add(annee);
		possco.add(txtannee);
		
		
		
		/*montant = new JLabel("MONTANT  :   "); 
		montant.setPreferredSize(new Dimension(150, 20));
		posetu.add(montant);
		txtmontant =  new JTextField();
		txtmontant.setPreferredSize(new Dimension(150, 25));
        posetu.add(txtmontant);
        possco.add(montant);
		possco.add(txtmontant);*/
		
		
		//PARTIE ENREGISTREMENT choix
		
		
		poschoix = new JPanel(); 
		poschoix.setBounds (150,450,400,50);
		//poschoix.setBorder( new TitledBorder("Enregistrement")); 
		poschoix.setBackground (Color.black); 
		Border d = BorderFactory.createLineBorder (Color.ORANGE .darker ( ) ,5) ;
		//poschoix.setBorder (d); 
		page_etu.add(poschoix); 
		
		
		
		etape2 = new JButton("continuer a la comptabilité");
 	    etape2.addActionListener (this);
 	    poschoix.add(etape2) ;
 	    
 	   annuler = new JButton("annuler");
	   annuler.addActionListener (this);
	   poschoix.add(annuler) ;
	   
	   reset = new JButton("reset");
	   reset.addActionListener (this);
	   poschoix.add(reset) ;
		
	}

	public static void main( String [] args) {  
		 
		// TODO Auto-generated method stub
		Enre_etudiant enre_etudiant = new Enre_etudiant();
		enre_etudiant.setVisible(true);
		 
	 }

	public void actionPerformed(ActionEvent c) {
	
		if(c.getSource() == annuler){
			Page2 page2= new Page2();
			this.setVisible(false);
			page2.setVisible(true);	
			
		}
		
		if(c.getSource() == reset){
			
			Enre_etudiant page= new Enre_etudiant();
			this.setVisible(false);
			page.setVisible(true);	
			
		}
		
        if(c.getSource() == etape2){
			
			Page4 page4= new Page4();
			this.setVisible(false);
			page4.setVisible(true);	
			
			//insertion
			
			//sexe
			String sex="";
			 if (homme.isSelected()){
	    		   sex="HOMME";
	    	  }
	    	  
	    	  if (femme.isSelected()){
	    		   sex="FEMME";
	    	  }
	    	  
	    	  System.out.println(sex);
	    	  //niveau
	    	  String nivo="";
	    	  if (l1.isSelected()){
	    		   nivo="Licence_1";
	    	  }
	    	  
	    	  if (l2.isSelected()){
	    		   nivo="Licence_2";
	    	  }
	    	  if (l3.isSelected()){
	    		   nivo="Licence_3";
	    	  }
	    	  
	    	  if (master1.isSelected()){
	    		   nivo="Master_1";
	    	  }
	    	  if (master2.isSelected()){
	    		   nivo="Master_2";
	    	  }
	    	  if (doctorat.isSelected()){
	    		   nivo="Doctorat";
	    	  }
	    	  
	    	  System.out.println(nivo);
	    	  //departement
	    	  String dept="";
	    	  if (info.isSelected()){
	    		   dept="Informatique";
	    	  }
	    	  
	    	  if (genie.isSelected()){
	    		   dept="Genie_Civile";
	    	  }
	    	  if (telecom.isSelected()){
	    		   dept="Telecom";
	    	  }
	    	  
	    	  if (gestion.isSelected()){
	    		   dept="Gestion";
	    	  }
	    	  if (meca.isSelected()){
	    		   dept="Mecanique";
	    	  }
	    	  if (biologie.isSelected()){
	    		   dept="Biologie";
	    	  }
	    	  
	    	  System.out.println(dept);
	    	  //heur de cours
	    	  String heure="";
	    	  if (cours1.isSelected()){
	    		   heure="Cour_du_jour";
	    	  }
	    	  
	    	  if (cours2.isSelected()){
	    		   heure="Cours_du_soir";
	    	  }
	    	  System.out.println(heure);
	    	  //annee scolaire
	    	  String annee;
	    	   annee=  txtannee.getSelectedItem().toString();
	    	   System.out.println(annee);
	    	   
	       Insertion zd= new Insertion(txtprenom.getText(),txtnom.getText(),txtemail.getText(), 
txtddn.getText(),txtldn.getText(), txttel.getText(), txtadr.getText(),sex,txtprenomtute.getText(),txtnomtute.getText(),
txtteltute.getText(),dept,nivo,heure,annee);
	       zd.verif2();
	        setVisible(false);
			
		}
		
	} 
	
	

}
