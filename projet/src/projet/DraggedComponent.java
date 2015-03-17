package projet;

import java.awt.Component;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;




public class DraggedComponent 
implements MouseMotionListener,FocusListener{

	
	
	  static JComponent c;
	   private int xMouse;
	   private int yMouse;
	
	public static boolean isDeleted=false;
	   
public DraggedComponent(String type){
 		
     	if(type=="Button"){
	c=new JButton("NewButton");	
		}
     	
        if(type=="Label"){
	c=new JLabel("Label");
	c.setOpaque(true);
	
	c.updateUI();


	isDeleted=true;
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
		c.addMouseListener(new MouseAdapter() {
			@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		xMouse=e.getX();
		yMouse=e.getY();

	}
		});
		c.addFocusListener(this);
		c.addMouseMotionListener(this);
		JPopupMenu popupMenu = new JPopupMenu();
		popupMenu.add("Supprimer");
		addPopup(c, popupMenu);
		c.addKeyListener(new KeyAdapter() {
		public void keyPressed(KeyEvent ke){
		if(ke.getKeyCode()==KeyEvent.VK_DELETE)
		c.setVisible(false);
		}});
		
	}
	
	
	
	
	
	//
	public static void resizeComponent(JComponent c ,int w,int h){
		c.setSize(w, h);	
		}





	@Override
	public void mouseDragged(MouseEvent e) {
		int x=c.getX()+(e.getX()-xMouse),y=c.getY()+(e.getY()-yMouse);
	
		if(e.getSource()==c && x>=0 && (x+c.getWidth())<270
				&&y>=35 && (y+c.getHeight())<380){
			c.setLocation(x, y);
			
		}
		
	}





	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void focusGained(FocusEvent f) {
		c=(JComponent) f.getSource();
		if(c instanceof JLabel && isDeleted)
		c.setVisible(false);
		System.out.println("rani hna");
	}





	@Override
	public void focusLost(FocusEvent arg0) {
		isDeleted=false;
		System.out.println("manich hna");
	}

static boolean one=false;
static int oneTime=0;
	private static void addPopup(final Component component, final JPopupMenu popup) {
	popup.addMouseListener(new MouseAdapter() {
	public void mouseClicked(MouseEvent e) {
				c.setVisible(false);		}
	});
		component.addMouseListener(new MouseAdapter() {
		
		
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
					oneTime++;one=true;
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}


	
}
