package projet;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Proprieties  {
	

	
	
	
	public Color color;
	
	JButton btnTextcolor;
	JButton btnBackground;
	int x2=50,y2=205,z2=50; /*proprieties button color */
	static JTextField textField;
	static JButton []widthAndheight ;


public Proprieties(){
		
	   
	
	
	JLabel lblText = new JLabel("text");
	
	lblText.setSize(new Dimension(100, 0));
	lblText.setAlignmentX(Component.CENTER_ALIGNMENT);
	lblText.setFont(new Font("Ubuntu Medium", Font.BOLD, 13));
	lblText.setForeground(Color.BLACK);
	Fenetre.verticalBox_1.add(lblText);


	 textField = new JTextField();
	textField.setAlignmentY(Component.TOP_ALIGNMENT);
	textField.setMaximumSize(new Dimension(300, 30));
	Fenetre.verticalBox_1.add(textField);
	textField.setColumns(10);
	textField.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(textField.getText()!=null){
				if(Screen.sc.DC.c instanceof JButton)
				 ((AbstractButton)Screen.sc.DC.c).setText(textField.getText());
				if(Screen.sc.DC.c instanceof JLabel)
					((JLabel)Screen.sc.DC.c).setText(textField.getText());
			}
		}
	});
	JSeparator separator_2 = new JSeparator();
	separator_2.setMaximumSize(new Dimension(300, 20));
	Fenetre.verticalBox_1.add(separator_2);
	
		
	
	btnTextcolor = new JButton("textColor");
	btnTextcolor.setBorder(UIManager.getBorder("CheckBox.border"));
	Fenetre.verticalBox_1.add(btnTextcolor);
	btnTextcolor.setBackground(new Color(x2,y2,z2));
    btnTextcolor.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
				
			color=JColorChooser.showDialog(null, "choose your color",Color.white );
	  
		    Screen.sc.DC.c.setForeground(color);
	}
		});
    
    
	JSeparator separator = new JSeparator();
	separator.setMaximumSize(new Dimension(300, 20));
	Fenetre.verticalBox_1.add(separator);
	
	btnBackground = new JButton("background");
	Fenetre.verticalBox_1.add(btnBackground);
	btnBackground.setBorder(UIManager.getBorder("CheckBox.border"));
	btnBackground.setBackground(new Color(x2,y2,z2));
	
	JSeparator separator_1 = new JSeparator();
	separator_1.setMaximumSize(new Dimension(300, 20));
	Fenetre.verticalBox_1.add(separator_1);
	
	
	
	
	
	btnBackground.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			color=JColorChooser.showDialog(null, "choose your color", Color.GRAY);
			Screen.sc.DC.c.setBackground(color);
					
	}
	    });
	JSeparator sep2 = new JSeparator();
	sep2.setMaximumSize(new Dimension(300, 20));
	Fenetre.verticalBox_1.add(sep2);
	
	
	
	
	
	//
	
	//size button 
	
	//
	
	JLabel size = new JLabel("Size");
	Fenetre.verticalBox_1.add(size);
	size.setBorder(UIManager.getBorder("CheckBox.border"));
	size.setBackground(new Color(x2,y2,z2));
	
	widthAndheight = new JButton[]{new JButton("largeur"),
			new JButton("Hauteur")};
	ActionListener action =new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent a) {
			int w=Screen.sc.DC.c.getWidth(),h=Screen.sc.DC.c.getHeight();
			try{
			if(a.getSource()==widthAndheight[0])
				{
				String s=	JOptionPane.showInputDialog(null,"Enter la largeur");
			w=Integer.parseInt(s);
				}
			else
				{
				String s=JOptionPane.showInputDialog(null,"Enter la Hauteur");
				h=Integer.parseInt(s);
				}
			}catch(Exception e ){
				
			}
			Screen.sc.DC.c.setSize(w, h);
	}
	    };
	    widthAndheight[0].addActionListener(action);
	    widthAndheight[1].addActionListener(action);
		Fenetre.verticalBox_1.add(widthAndheight[0]);
		widthAndheight[0].setBorder(UIManager.getBorder("CheckBox.border"));
		widthAndheight[0].setBackground(new Color(x2,y2,z2));
		Fenetre.verticalBox_1.add(widthAndheight[1]);
		widthAndheight[1].setBorder(UIManager.getBorder("CheckBox.border"));
		widthAndheight[1].setBackground(new Color(x2,y2,z2));
		
		
		
/*
 * 
 * 
addMouseListener(new MouseAdapter() {
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(Screen.tglClicked2==1){
			
			btnTextcolor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					color=JColorChooser.showDialog(null, "choose your color",Color.white );
			    sc.DC.c.setForeground(color);
			}
				});
			
			btnBackground.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					color=JColorChooser.showDialog(null, "choose your color", Color.GRAY);
					sc.DC.c.setBackground(color);
							
			}
			    });
			
			
		}
		
		
	}
	
	
	
	
});	
	*/
	
	
	
	


}	
}