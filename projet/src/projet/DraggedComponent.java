package projet;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;




public class DraggedComponent 
implements MouseListener,MouseMotionListener {

	
	
	   JComponent c;
	   private int xMouse;
	   private int yMouse;
	
	
	   
public DraggedComponent(String type){
 		
     	if(type=="Button"){
	c=new JButton("NewButton");	
	}
     	
        if(type=="Label"){
	c=new JLabel("Label");
	}
        
        if(type=="Radio Button"){
	c= new JRadioButton("Radio Button");
    }
        
        if(type=="Slider"){
	c=new JSlider(0,100);
    }
        
        if(type=="Text Box"){
	c=new JTextField();
    }
        
        
        c.setSize(120, 25);
		c.addMouseListener(this);
		c.addMouseMotionListener(this);
		
		
	}
	
	
	
	
	
	//
	public static void resizeComponent(JComponent c ,int w,int h){
		c.setSize(w, h);	
		}





	@Override
	public void mouseDragged(MouseEvent e) {
		if(e.getSource()==c){
			c.setLocation(c.getX()+(e.getX()-xMouse), c.getY()+(e.getY()-yMouse));
		}
		
	}





	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("x = "+e.getX()+"  y = "+e.getY());
	}





	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
		
	}





	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		xMouse=e.getX();
		yMouse=e.getY();

	}

/*public static void main(String arg[]){
	DraggedComponent comp=	new DraggedComponent("Button");
	JFrame f = new JFrame("Hayet");
	f.setSize(400, 500);
	f.setLayout(null);
	f.getContentPane().add(comp.c);
	f.setLocationRelativeTo(null);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
}*/



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}	
}
