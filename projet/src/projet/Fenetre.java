package projet;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import projet.Fenetre;
import projet.Palette;
import projet.Proprieties;
import projet.Screen;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

public class Fenetre {

	public static JFrame frame;
    public JTextField textField;
    public Color color;
    public static Box verticalBox,verticalBox_1;
    public JToggleButton tglbtnButton;
    int b=128,r=0,j=0; /*color of titleBorber*/
    int x1=102,y1=204,z1=0;   /*color of lineborder*/
    int x2=50,y2=205,z2=50; /*proprieties button color */
    public JPanel panel ;
    public Box horizontalBox_2 ;
    static int s=0;
    JButton executer;
    
    /**
	 * Launch the application.
	 */
    
    
    
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre window = new Fenetre();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Fenetre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void paintComponent(Graphics g) {
	      try {
	         BufferedImage image = ImageIO.read(new File("/home/imane/git/firstTry/projet/BackGroundImage/background2.jpg"));
	         g.drawImage(image, 0, 0, null);
	      }
	      catch (IOException e) {
	         e.printStackTrace();
	      }
	   }
	
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getRootPane().setWindowDecorationStyle(6);
		frame.setTitle("Android AppMaker");
		frame.getContentPane().setBackground(new Color(250,250,250));
		frame.setBounds(100, 100, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setAlignmentX(Component.RIGHT_ALIGNMENT);
		horizontalBox.setBackground(new Color(255, 235, 205));
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setBackground(new Color(50, 205, 50));
		horizontalBox_1.setOpaque(true);
		
		JLabel lblProjectname = new JLabel("ProjectName");
		lblProjectname.setHorizontalAlignment(SwingConstants.CENTER);
		lblProjectname.setMaximumSize(new Dimension(150, 30));
		lblProjectname.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 15));
		lblProjectname.setForeground(new Color(128, 0, 0));
		horizontalBox_1.add(lblProjectname);
		
		
		//
		//button add new screen
		//
		
		JButton btn=new JButton("nvl fenetre");
		horizontalBox_1.add(btn);
		btn.setBounds(0, 0, 80, 40);
		btn.setBackground(new Color(144,238,144));
		
		btn.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent a){
				panel.add(new Screen("new Screen"));
				panel.updateUI();
				s++;
				}
			
			
		});
		
		
		
		
		
		
		
		verticalBox = Box.createVerticalBox();
		verticalBox.setFont(new Font("Arial", Font.BOLD, 13));
		//verticalBox.setBorder(new TitledBorder(new LineBorder(new Color(102, 204, 0), 3, true), "Palette", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 204)));
		verticalBox.setBorder(new TitledBorder(new LineBorder(new Color(x1, y1, z1), 3, true), "Palette", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(b,r,j)));
	    verticalBox.setBackground(new Color(153, 153, 153));
	
	    
		horizontalBox_2 = Box.createHorizontalBox();
		horizontalBox_2.setMaximumSize(new Dimension(0, 800));
		horizontalBox_2.setBackground(new Color(255, 255, 255));
		//horizontalBox_2.setBorder(new TitledBorder(new LineBorder(new Color(204, 255, 102), 2, true), "Viewer", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(153, 255, 204)));
		horizontalBox_2.setBorder(new TitledBorder(new LineBorder(new Color(x1, y1, z1), 2, true), "Viewer", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(b,r,j)));

		
		
		verticalBox_1 = Box.createVerticalBox();
		//verticalBox_1.setBorder(new TitledBorder(new LineBorder(new Color(102, 204, 0), 2, true), "Properties", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 204)));
		verticalBox_1.setBorder(new TitledBorder(new LineBorder(new Color(x1, y1, z1), 2, true), "Properties", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(b,r,j)));
		
		Box verticalBox_2 = Box.createVerticalBox();
		verticalBox_2.setBorder(new TitledBorder(new LineBorder(new Color(x1, y1, z1), 2, true), "compilation", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(b,r,j)));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(horizontalBox_1, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
				.addComponent(horizontalBox, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addComponent(verticalBox, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(horizontalBox_2, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(verticalBox_2, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
						.addComponent(verticalBox_1, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(horizontalBox, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(horizontalBox_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(verticalBox, GroupLayout.PREFERRED_SIZE, 405, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(horizontalBox_2, GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(verticalBox_1, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(verticalBox_2, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addContainerGap()))))
		);
		
		
		JScrollPane scrollPane = new JScrollPane();
		horizontalBox_2.add(scrollPane);
		
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setBorder(UIManager.getBorder("MenuItem.border"));
		panel.setBackground(new Color(152, 251, 152));
		
		
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		
		
		
		
		//
		panel.add(Screen.sc);
		
		executer = new JButton("executer");
		executer.setBorder(UIManager.getBorder("CheckBox.border"));
		Fenetre.frame.add(executer);
		executer.setBackground(new Color(200,200,200));
		verticalBox_2.add(executer);
		executer.setIcon(new ImageIcon(""));
	    executer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n = JOptionPane.showConfirmDialog(frame,  "vouler vs vraiment executer", "compilation",  JOptionPane.YES_NO_OPTION);
	    
		
				
				
					// ecriture dans .xml 
				
		}
			});
		
		
		
	     new Palette();
	    new Proprieties();
		
		JLabel lblAndroidAppmaker = new JLabel("Android AppMaker");
		lblAndroidAppmaker.setIcon(new ImageIcon("/home/imane/git/firstTry/projet/BackGroundImage/icone2.png"));
		lblAndroidAppmaker.setMaximumSize(new Dimension(300, 30));
		lblAndroidAppmaker.setForeground(new Color(0, 128, 0));
		lblAndroidAppmaker.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		lblAndroidAppmaker.setBackground(new Color(212, 208, 200));
		horizontalBox.add(lblAndroidAppmaker);
		frame.getContentPane().setLayout(groupLayout);
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}
}
