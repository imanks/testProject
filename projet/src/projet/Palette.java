package projet;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Palette  implements ActionListener{
	
	
	
	
	JToggleButton [] jtb= new JToggleButton[5];
	int i;	
	public static String tglClicked; 
	
	

	
public Palette(){
	

    ButtonGroup bg = new ButtonGroup();
    String[] n={"Button","Label","Text Box","Radio Button","Slider"};
	for(i=0; i<jtb.length ;i++){
        jtb[i]=new JToggleButton(n[i]);
        jtb[i].setFont(new Font("Arial", Font.BOLD, 12));
		jtb[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jtb[i].setBackground(new Color(204, 204, 153));
		jtb[i].setMaximumSize(new Dimension(140, 23));
		jtb[i].addActionListener(this);
		bg.add(jtb[i]);
		Fanetre.verticalBox.add(jtb[i]);		
		
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
	}


}
