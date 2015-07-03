package gestion_institut;
import java.awt .*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing .*; 
import javax.swing.border .*;
import com.mysql.jdbc.Statement;

	public class Page1 extends JFrame implements ActionListener{
		JPanel panel1, panel2;
		Container contenu;
		JButton bouton;
		JLabel login;
		 JLabel pwd2 ;
		JTextField txtlogin;
		JPasswordField txtpass;
		String log;
		String pwd;
		
		public Page1 ( ) {
			/*initialisation du JFrame*/
			
			super ();
			login = new JLabel ("Login:     ");
			txtlogin =new JTextField("",15);
			pwd2 = new JLabel("Mot de passe:     ");
			txtpass = new JPasswordField("",15);
			
			this.setSize (new Dimension (500,250));
			this.setTitle("Authentification de l'utilisateur");
			this.setResizable ( false ); //on ne pourra pas agrandir la fenêtre
			/*récuperation du ContentPane*/
			Container contenu = this.getContentPane ();
			/*création des JPanel avec leur Layout Manager*/
			panel1 = new JPanel(new GridBagLayout ());
			panel2 = new JPanel ( );
			/*ajout des pannneaux au ContentPane,l'un au nord, l'autre au sud*/
			contenu.add (panel1, BorderLayout.CENTER);
			contenu.add(panel2, BorderLayout.AFTER_LAST_LINE);
			/*ajout de trois label et de trois zones de texte a panHaut*/
			panel1.add(login); panel1.add (txtlogin);System.out.println("\n");
			panel1.add(pwd2); panel1.add(txtpass);
			panel1.setBackground(Color.white);
			/*ajout d une bordure avec intiutlé a panHaut*/
			panel1.setBorder ( new TitledBorder("Saisissez votre Login et Mot de passe"));
			panel1.setSize(3, 3);
			/*ajout d une bordure epaisse a panel1*/
			Border b = BorderFactory.createLineBorder (Color.black .darker ( ) ,2) ;
			//panel1.setBorder (b);
			bouton=new JButton("Connecter");
			bouton.setBackground(Color.green);
			//bouton.setFont(Color.white);
			bouton.addActionListener(this);
			panel2.add(bouton);
		}
		
		
		
		public void actionPerformed(ActionEvent e) {
			if ( e.getSource ( ) == bouton)
			{
				 log= txtlogin.getText();
				 pwd= txtpass.getText();
				
				System.out.println("votre login est " +txtlogin.getText());
				System.out.println("votre password est"+pwd);
				
				Object mdp;
				Connecter conect = new Connecter(log,pwd);
				conect.verif();
				setVisible(false);
				//conect.setVisible(true);
				/*if(txtlogin.getText().equals("niang"))
			{
				Page2 page2 = new Page2();
				page2.setVisible(true);
				
				
				setVisible(false);
			}
				else{
					JOptionPane.showMessageDialog (this,"Login ou mot de passe incorrecte","erreur!",
							JOptionPane.INFORMATION_MESSAGE, null);
				}
				*/
								
						} 
		}
			
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Page1 page1 = new Page1();
      page1.setVisible(true);
      
				}
				 

	

}
