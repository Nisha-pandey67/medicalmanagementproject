package intermediateproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;




public class AboutUs
{
	
	AboutUs()
	{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		
		//create aboutusframe Jframe
		final JFrame aboutusframe = new JFrame("About Us");
		aboutusframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
		aboutusframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aboutusframe.setVisible(true);
		aboutusframe.setLayout(null);
		
		//create Background Image for JFrame
		JLabel bgimage = new JLabel(new ImageIcon("Images//aboutus.jpg"));
		
		aboutusframe.setContentPane(bgimage);
                
                
        // CREATE HEADERPANEL JPANEL
        JPanel headerpanel = new JPanel();
        headerpanel.setLayout(null);
        headerpanel.setBounds(10,10,screenSize.width-20,100);
        //headerpanel.setBackground(Color.cyan);
        headerpanel.setBorder(new BevelBorder(BevelBorder.RAISED)); 

        // CREATE HEADERPANELSH JPANEL
        JPanel headerpanelsh = new JPanel();
        headerpanelsh.setLayout(null);
        headerpanelsh.setBounds(16,16,screenSize.width-20,100);
        headerpanelsh.setBackground(new Color(200, 200, 200));            

        // CREATE HEADING JLABEL
        JLabel heading = new JLabel("XYZ HOSPITAL");
        Font font = new Font("Garamond", Font.BOLD, 35);
        heading.setFont(font);
        heading.setForeground(new Color(111, 150, 116));            
        heading.setBounds(screenSize.width-700,30,700,45);

        JLabel heading1 = new JLabel("XYZ HOSPITALL");
        Font font1 = new Font("Garamond", Font.BOLD, 35);
        heading1.setFont(font1);
        heading1.setForeground(new Color(192, 123, 112));            
        heading1.setBounds(screenSize.width-697,33,700,45);
            
  
        // LOGO
        ImageIcon image = new ImageIcon("C:\\Users\\diabolicfeak\\Documents\\NetBeansProjects\\hms\\src\\Images\\logo.png");
        JLabel label = new JLabel("", image, JLabel.CENTER);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add( label, BorderLayout.CENTER );
        panel.setBounds(50,5,100,90);
		
		
        //create mainbodypanel JPanel
        JPanel mainbodypanel = new JPanel();
        mainbodypanel.setLayout(null);
        mainbodypanel.setBorder(new EtchedBorder(EtchedBorder.RAISED));
        mainbodypanel.setBounds(5,110,screenSize.width-10,screenSize.height-(screenSize.height/4));
        mainbodypanel.setBackground(new Color(0,0,0,0));


        String text = "OUR MISSION";
        String text1 = "To provide the highest quality care and service for all people in the prevention, diagnosis and treatment of human illness.";
        String text2 = "ABOUT US";
        String text3 = "At Simpsons Military Hospital, our staff, faculty, students, volunteers and supporters are dedicated to improving the lives of people and families affected by psychiatric illness. As the largest psychiatric affiliate of Harvard Medical School, Simpsons has been meeting the needs of individuals and families with psychiatric illness since our founding in 1811. We are here to help you.";

        JTextArea aboutustext = new JTextArea();
        aboutustext.setText(text);
        aboutustext.append(System.getProperty("line.separator"));
        aboutustext.append(System.getProperty("line.separator"));
        aboutustext.append(text1);
        aboutustext.append(System.getProperty("line.separator"));
        aboutustext.append(System.getProperty("line.separator"));
        aboutustext.append(text2);
        aboutustext.append(System.getProperty("line.separator"));
        aboutustext.append(System.getProperty("line.separator"));
        aboutustext.append(text3);
        aboutustext.setFont(new Font("TimesNewRoman",Font.PLAIN,20));
        aboutustext.setLineWrap(true);
        aboutustext.setWrapStyleWord(true);
        aboutustext.setEditable(false);
        aboutustext.setOpaque(true);


        aboutustext.setBackground(new Color(255,255,255,125));
        aboutustext.setBounds(100,100,screenSize.width/2,screenSize.height/2);


        aboutusframe.pack();


        //add headerpanel
        aboutusframe.add(headerpanel);
        aboutusframe.add(headerpanelsh);
        headerpanel.add(heading);
        headerpanel.add(heading1);
        headerpanel.add(panel);

        //add mainbodypanel
        
        aboutusframe.add(mainbodypanel);
        // mainbodypanel.add(founder1);
        // mainbodypanel.add(founder1name);
        // mainbodypanel.add(founder2);
        // mainbodypanel.add(founder2name);
        mainbodypanel.add(aboutustext);	
				
		
    }
	
	public static void main(String a[])
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new AboutUs();
			}
		});
	}
}