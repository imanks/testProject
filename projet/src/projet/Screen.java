package projet;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;


public class Screen extends JPanel {
DraggedComponent DC;
Layout lay;
public static int tglClicked2;
JLabel lblScreen;
int x1=102,y1=204,z1=0; /*color of lineborder*/
int xLayout=3,yLayout=35;


public static final Screen sc=new Screen("Screen1");

public Screen(String s){
setBorder(new MatteBorder(2, 2, 2, 3, (Color) new Color(x1,y1,x1)));
setBackground(new Color(51, 0, 51));
setPreferredSize(new Dimension(270, 380));
setMinimumSize(new Dimension(270, 300));
setMaximumSize(new Dimension(270, 300));
setLayout(null);
lblScreen = new JLabel(s);
lblScreen.setBorder(new LineBorder(new Color(x1, y1, z1), 2, true));
lblScreen.setFont(new Font("Tahoma", Font.BOLD, 14));
lblScreen.setHorizontalAlignment(SwingConstants.CENTER);
lblScreen.setOpaque(true);
lblScreen.setBackground(new Color(230,230,250));
lblScreen.setBounds(0, 0, 270, 34);
this.add(lblScreen);
this.updateUI();


addMouseListener(new MouseAdapter() {
public void mousePressed(MouseEvent a) {
// TODO Auto-generated method stub
System.out.println("rani hna :"+Palette.tglClicked);
if(Palette.tglClicked=="Button"){
DC=	new DraggedComponent("Button");
DC.c.setLocation(a.getX(), a.getY());
add(DC.c);
}

if(Palette.tglClicked=="Label"){
DC=	new DraggedComponent("Label");
DC.c.setLocation(a.getX(), a.getY());
add(DC.c);
}

if(Palette.tglClicked=="Text Box"){
DC=	new DraggedComponent("Text Box");
DC.c.setLocation(a.getX(), a.getY());
add(DC.c);
}

if(Palette.tglClicked=="Radio Button"){
DC=	new DraggedComponent("Radio Button");
DC.c.setLocation(a.getX(), a.getY());
add(DC.c);
}

if(Palette.tglClicked=="Slider"){
DC=	new DraggedComponent("Slider");
DC.c.setLocation(a.getX(), a.getY());
add(DC.c);
}

if(Palette.tglClicked=="VLayout"){
lay=new Layout("V");
lay.box.setLocation(xLayout, yLayout);
add(lay.box);
xLayout+=31;
}

if(Palette.tglClicked=="HLayout"){
lay=new Layout("H");
lay.box.setLocation(xLayout, yLayout);
add(lay.box);
yLayout+=31;
}

Palette.tglClicked="";
updateUI();
lay.box.addKeyListener(new KeyAdapter() {

	
	public void keyPressed(KeyEvent k) {
// TODO Auto-generated method stub

		if(k.getKeyCode()==KeyEvent.VK_DELETE){
System.out.println("rani hna ffff");
lay.box.setVisible(false);
}
}
});
}

public void mouseExited(MouseEvent e) {entred=false;
getGraphics().setColor(Color.RED);

if(Palette.tglClicked=="VLayout"){
repaint();
}
if(Palette.tglClicked=="HLayout"){
repaint();
}
}


public void mouseEntered(MouseEvent e) {entred=true;
if(Palette.tglClicked=="VLayout"){
repaint();
}

if(Palette.tglClicked=="HLayout"){
repaint();
}}
});
}

public static boolean entred=false ;
public void paint(Graphics g1){
Graphics2D g=(Graphics2D)g1 ;

super.paint(g);
g.setColor(Color.red);

if(Palette.tglClicked=="VLayout"&&entred){
g.drawRect(xLayout, yLayout, 30, getHeight()-yLayout-8);
}

if(Palette.tglClicked=="HLayout"&&entred){
g.drawRect(xLayout,yLayout, getWidth()-xLayout-6, 30);
}
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

	if(scr.getSource()=="VLayout"){
tglClicked2=6;
}

	if(scr.getSource()=="HLayout"){
tglClicked2=7;
}
}
}
}