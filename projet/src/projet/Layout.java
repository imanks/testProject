package projet;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Box;
import javax.swing.border.LineBorder;



public class Layout implements KeyListener{

	static Box box ;

	static boolean isClicked=false;

	public Layout(String type){

		if(type=="H"){
box=Box.createHorizontalBox();
box.setBorder(new LineBorder(Color.BLUE,1,false));
box.setSize(Screen.sc.getWidth()-Screen.sc.xLayout-3, 30);
}

		if(type=="V"){
			
box=Box.createVerticalBox();
box.setBorder(new LineBorder(Color.BLUE,1,false));
box.setSize(30, Screen.sc.getHeight()-Screen.sc.yLayout-3);

}

		box.addKeyListener(this);

		box.addMouseListener(new MouseAdapter() {


public void mousePressed(MouseEvent e) {

	System.out.println("le meilleur");

	Screen.DC=	new DraggedComponent(Palette.tglClicked);

	box.add(Screen.DC.c);

	box.updateUI();
    //box.setSize(width, height);
	
	Screen.sc.updateUI();
	
}
});
}


public void keyPressed(KeyEvent k) {

if(k.getKeyCode()==KeyEvent.VK_DELETE){
System.out.println("rani hna :) ");
box.setVisible(false);
}
}

 public void keyReleased(KeyEvent arg0) {

}

 public void keyTyped(KeyEvent arg0) {

}
}