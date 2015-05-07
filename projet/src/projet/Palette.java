package projet;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Palette  implements ActionListener{
	
	
	
	
	JToggleButton [] jtb= new JToggleButton[7];
	int i;	
	public static String tglClicked; 
	public static JComboBox comboBox;
	public static JLabel lbl;

	
public Palette(){
	

    ButtonGroup bg = new ButtonGroup();
    String[] n={"Button","Label","Text Box","Radio Button","Slider","VLayout","HLayout"};
	for(i=0; i<jtb.length ;i++){
        jtb[i]=new JToggleButton(n[i]);
        jtb[i].setFont(new Font("Arial", Font.BOLD, 12));
		jtb[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jtb[i].setBackground(new Color(169,169,169));
		jtb[i].setBorder(UIManager.getBorder("CheckBox.border"));
		jtb[i].setMaximumSize(new Dimension(140, 23));
		jtb[i].addActionListener(this);
		bg.add(jtb[i]);
		Fenetre.verticalBox.add(jtb[i]);		
	}
	
	
    JSeparator separator = new JSeparator();
	separator.setMaximumSize(new Dimension(300, 20));
	Fenetre.verticalBox.add(separator);
	
	JLabel lblText = new JLabel("BackGroundImage");
	lblText.setSize(new Dimension(100, 0));
	lblText.setAlignmentX(Component.CENTER_ALIGNMENT);
	lblText.setFont(new Font("Ubuntu Medium", Font.BOLD, 13));
	lblText.setForeground(Color.BLACK);
	Fenetre.verticalBox.add(lblText);
	
	comboBox = new JComboBox();
	comboBox.setMaximumSize(new Dimension(200, 30));
	comboBox.setModel(new DefaultComboBoxModel(new String[] {"image1", "image2", "image3"}));
	comboBox.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
            comboAction();			
		}

		
	});
	
	
	
	/*
	
	*/
	
	
    
	comboBox.updateUI();
	
	
	Fenetre.verticalBox.add(comboBox);
	
	
	
	
	
	 lbl=new JLabel();
	Screen.sc.add(lbl);
	
	
	}

public void comboAction(){
	lbl.setIcon(null);
	if(comboBox.getModel().getSelectedItem()=="image2"){
		lbl.setVisible(true);
		lbl.setSize(290, 450);
		lbl.setIcon(new ImageIcon("/home/imane/git/firstTry/projet/BackGroundImage/image2.jpg"));
		comboBox.updateUI();

	}
		
	if(comboBox.getModel().getSelectedItem()=="image1"){
		
		lbl.setVisible(true);
		lbl.setSize(290, 450);
		lbl.setIcon(new ImageIcon("/home/imane/git/firstTry/projet/BackGroundImage/image1.jpg"));
		comboBox.updateUI();
	}
	if(comboBox.getModel().getSelectedItem()=="image3"){
		
		lbl.setVisible(true);
		lbl.setSize(290, 450);
		lbl.setIcon(new ImageIcon("/home/imane/git/firstTry/projet/BackGroundImage/image3.jpg"));
		comboBox.updateUI();

	}
}



	@Override
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub
		
		if(a.getSource()==jtb[0]){
			tglClicked=jtb[0].getText();
		}
        if(a.getSource()==jtb[1]){
			tglClicked=jtb[1].getText();

		}
        if(a.getSource()==jtb[2]){
			tglClicked=jtb[2].getText();

		}
        if(a.getSource()==jtb[3]){
			tglClicked=jtb[3].getText();

		}
        if(a.getSource()==jtb[4]){
			tglClicked=jtb[4].getText();

		}
        if(a.getSource()==jtb[5]){
			tglClicked=jtb[5].getText();

		}
        if(a.getSource()==jtb[6]){
			tglClicked=jtb[6].getText();

		}
        
        
	}


}
