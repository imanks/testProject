package projet;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;


public class Screen extends JPanel {

	DraggedComponent DC,dc2;
	public static int tglClicked2; 
	
	public Screen(){
		setBorder(new MatteBorder(2, 2, 2, 3, (Color) new Color(51, 204, 0)));
		setBackground(new Color(51, 0, 51));
		setPreferredSize(new Dimension(270, 380));
		setMinimumSize(new Dimension(270, 300));
		setMaximumSize(new Dimension(270, 300));
		setLayout(null);
		
		JLabel lblScreen = new JLabel("Screen");
		lblScreen.setBorder(new LineBorder(new Color(51, 204, 0), 2, true));
		lblScreen.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblScreen.setHorizontalAlignment(SwingConstants.CENTER);
		lblScreen.setOpaque(true);
		lblScreen.setBackground(new Color(204, 255, 204));
		lblScreen.setBounds(0, 0, 270, 34);
		this.add(lblScreen);
		this.updateUI();
		
		
		
	
	addMouseListener(new MouseAdapter() {

		public void mousePressed(MouseEvent a) {
			// TODO Auto-generated method stub
			if(Palette.tglClicked=="Button"){
				DC=	new DraggedComponent("Button");	
				DC.c.setLocation(a.getX(), a.getY());
				
						
			}
            if(Palette.tglClicked=="Label"){
            	DC=	new DraggedComponent("Label");	
            	DC.c.setLocation(a.getX(), a.getY());
			}
            if(Palette.tglClicked=="Text Box"){
            	DC=	new DraggedComponent("Text Box");
            	DC.c.setLocation(a.getX(), a.getY());
            }
            if(Palette.tglClicked=="Radio Button"){
            	DC=	new DraggedComponent("Radio Button");	
            	DC.c.setLocation(a.getX(), a.getY());
            }
            if(Palette.tglClicked=="Slider"){
            	DC=	new DraggedComponent("Slider");	
            	DC.c.setLocation(a.getX(), a.getY());
            }
            Palette.tglClicked=null;
            
            if(a.getSource()=="Button"){
    			tglClicked2=1;
    		}
            if(a.getSource()=="Label"){
    			tglClicked2=2;

    		}
            if(a.getSource()=="Text Box"){
    			tglClicked2=3;

    		}
            if(a.getSource()=="Radio Button"){
    			tglClicked2=4;

    		}
            if(a.getSource()=="Slider"){
    			tglClicked2=5;

    		}
            
            
       add(DC.c);
       updateUI();
		}
		});
	
	
	
	
	
	event scr=new event();
	
	
	

	/*addMouseListener(new MouseAdapter(){
		public void mousePressed(MouseEvent scr) {
		
		if(scr.getSource()=="Button"){
			tglClicked2=1;
		}
        if(scr.getSource()=="Label"){
			tglClicked2=2;

		}
        if(scr.getSource()=="Text Box"){
			tglClicked2=3;

		}
        if(scr.getSource()=="Radio Button"){
			tglClicked2=4;

		}
        if(scr.getSource()=="Slider"){
			tglClicked2=5;

		}
	}
	
	});
	
}

	
      */
	
	
	
}
public class event implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent scr) {
		if(scr.getSource()=="Button"){
			tglClicked2=1;
			
		}
        if(scr.getSource()=="Label"){
			tglClicked2=2;

		}
        if(scr.getSource()=="Text Box"){
			tglClicked2=3;

		}
        if(scr.getSource()=="Radio Button"){
			tglClicked2=4;

		}
        if(scr.getSource()=="Slider"){
			tglClicked2=5;

		}
       
		
	}
	
	
}
}