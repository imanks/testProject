package projet;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Proprieties  {
	

	
	
	
	public Color color;
	
	JButton btnTextcolor;
	JButton btnBackground;
	int x2=50,y2=205,z2=50; /*proprieties button color */
	
	


public Proprieties(){
		
	   
	
	
	JLabel lblText = new JLabel("text");
	
	lblText.setSize(new Dimension(100, 0));
	lblText.setAlignmentX(Component.CENTER_ALIGNMENT);
	lblText.setFont(new Font("Ubuntu Medium", Font.BOLD, 13));
	lblText.setForeground(Color.BLACK);
	Fenetre.verticalBox_1.add(lblText);


	JTextField textField = new JTextField();
	textField.setAlignmentY(Component.TOP_ALIGNMENT);
	textField.setMaximumSize(new Dimension(300, 30));
	Fenetre.verticalBox_1.add(textField);
	textField.setColumns(10);
	
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
	
/*
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
