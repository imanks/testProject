package projet;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
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

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;




public class DraggedComponent 
implements MouseMotionListener,FocusListener{

	
	
	  static JComponent c;
	   private int xMouse;
	   private int yMouse;
	
	public static boolean isDeleted=false;
	public static void resizeComponent(Component c ,int w,int h){
	c.setSize(w, h);	
	}
	
	   
	
public DraggedComponent(String type){
	
	   if(type=="panel"){
		   c=new JPanel();
		   c.setSize(120, 25);
	   }
	
 		
     	if(type=="Button"){
	c=new JButton("NewButton");	
	 c.setSize(120, 25);
		}
     	
        if(type=="Label"){
	c=new JLabel("Label");
	c.setOpaque(true);
	
	c.updateUI();
	 c.setSize(120, 25);

	isDeleted=true;
	}
        
        if(type=="Radio Button"){
	c= new JRadioButton("Radio Button");
	 c.setSize(120, 25);
        }
        
        if(type=="Slider"){
	c=new JSlider(0,100);
	 c.setSize(120, 25);
    }
        
        if(type=="Text Box"){
	c=new JTextField();
	 c.setSize(120, 25);
    }
        if(type=="VLayout"){
        	c=Box.createVerticalBox();
        	c.setBorder(new LineBorder(Color.BLUE,3,false));
        	 c.setSize( 30,310);
        }
        if(type=="HLayout"){
        	c=Box.createHorizontalBox();
        	c.setBorder(new LineBorder(Color.BLUE,2,false));
       	 c.setSize(250, 30);

        }
      
   /*     if(type=="Formlayout"){
        	Fenetre.frame.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {},
        			new RowSpec[] {}));
        }
        */
        
       






c.addMouseListener(new MouseAdapter() {
			
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		xMouse=e.getX();
		yMouse=e.getY();

	}
	
	
	/*public void mouseDragged(MouseEvent e ){
		int x=c.getX()+(e.getX()-xMouse);
		int y=c.getY()+(e.getY()-yMouse);	
	
		
		
		if(c.getCursor().getType()==Cursor.E_RESIZE_CURSOR)
		resizeComponent(c, e.getX(), c.getHeight());
		else
			if(c.getCursor().getType()==Cursor.S_RESIZE_CURSOR)
		resizeComponent(c, c.getWidth(), e.getY());
			else			
		if(c.getCursor().getType()==Cursor.SE_RESIZE_CURSOR)
			resizeComponent(c, e.getX(), e.getY());
		else c.setLocation(x,y );
		}
		
		boolean res=false; boolean coinx=false,coiny=false;
	
	
	public void mouseMoved(MouseEvent e ){
	
	if(e.getX()>(c.getWidth()-2))
		{coinx=true;
		c.setCursor(new Cursor(Cursor.E_RESIZE_CURSOR));
		System.out.println("rani hna");}else
		if(e.getY()>(c.getHeight()-2)){
		c.setCursor(new Cursor(Cursor.S_RESIZE_CURSOR));
		if(coinx)coiny=true;	
	}else {coiny=false;
		c.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		{coinx=false;
		c.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
	}
	
	if(coinx&coiny){
		c.setCursor(new Cursor(Cursor.SE_RESIZE_CURSOR));
	}
	}*/
	
	
	
	
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
	




	
	
	
	
	
	public void mouseDragged(MouseEvent e) {
		int x=c.getX()+(e.getX()-xMouse),y=c.getY()+(e.getY()-yMouse);
	
		if(e.getSource()==c && x>=0 && (x+c.getWidth())<270
				&&y>=35 && (y+c.getHeight())<380){
			c.setLocation(x, y);
			
		}
		
		
	}





	
	public void focusGained(FocusEvent f) {
		c=(JComponent) f.getSource();
		if(c instanceof JLabel && isDeleted)
		c.setVisible(false);
		System.out.println("rani hna");
	}





	
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


	
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	
}
