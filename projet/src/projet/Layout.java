package projet;


import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Box;
import javax.swing.border.LineBorder;
public class Layout implements KeyListener{
static Box box ;
static boolean isClicked=false;
public Layout(String type){
if(type=="H"){
box=Box.createHorizontalBox();
box.setBorder(new LineBorder(Color.RED,3,false));
box.setSize(Screen.sc.getWidth()-Screen.sc.xLayout-3, 30);
}
if(type=="V"){
box=Box.createVerticalBox();
box.setBorder(new LineBorder(Color.RED,3,false));
box.setSize(30, Screen.sc.getHeight()-Screen.sc.yLayout-3);
}
box.addKeyListener(this);
}
@Override
public void keyPressed(KeyEvent k) {
// TODO Auto-generated method stub
if(k.getKeyCode()==KeyEvent.VK_DELETE){
System.out.println("rani hna ya 7maar");
box.setVisible(false);
}
}
@Override
public void keyReleased(KeyEvent arg0) {
// TODO Auto-generated method stub
}
@Override
public void keyTyped(KeyEvent arg0) {
// TODO Auto-generated method stub
}
}