package projet;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.Box;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Dimension;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class Fanetre {

	public JFrame frame;
    public JTextField textField;
    public Color color;
    public static Box verticalBox,verticalBox_1;
    public JToggleButton tglbtnButton;
    int b=128,r=0,j=0; /*color of titleBorber*/
	/**
	 * Launch the application.
	 */
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fanetre window = new Fanetre();
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
	public Fanetre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getRootPane().setWindowDecorationStyle(6);
		frame.setTitle("Android AppMaker");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setAlignmentX(Component.RIGHT_ALIGNMENT);
		horizontalBox.setBackground(new Color(255, 235, 205));
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setBackground(new Color(154, 205, 50));
		horizontalBox_1.setOpaque(true);
		
		JLabel lblProjectname = new JLabel("ProjectName");
		lblProjectname.setHorizontalAlignment(SwingConstants.CENTER);
		lblProjectname.setMaximumSize(new Dimension(150, 30));
		lblProjectname.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 15));
		lblProjectname.setForeground(new Color(128,0,0));
		horizontalBox_1.add(lblProjectname);
		
		verticalBox = Box.createVerticalBox();
		verticalBox.setFont(new Font("Arial", Font.BOLD, 13));
		//verticalBox.setBorder(new TitledBorder(new LineBorder(new Color(102, 204, 0), 3, true), "Palette", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 204)));
		verticalBox.setBorder(new TitledBorder(new LineBorder(new Color(102, 204, 0), 3, true), "Palette", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(b,r,j)));
	    verticalBox.setBackground(new Color(153, 153, 153));
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		horizontalBox_2.setMaximumSize(new Dimension(0, 800));
		horizontalBox_2.setBackground(new Color(255, 255, 255));
		//horizontalBox_2.setBorder(new TitledBorder(new LineBorder(new Color(204, 255, 102), 2, true), "Viewer", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(153, 255, 204)));
		horizontalBox_2.setBorder(new TitledBorder(new LineBorder(new Color(204, 255, 102), 2, true), "Viewer", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(b,r,j)));

		
		
		verticalBox_1 = Box.createVerticalBox();
		//verticalBox_1.setBorder(new TitledBorder(new LineBorder(new Color(102, 204, 0), 2, true), "Properties", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 204)));
		verticalBox_1.setBorder(new TitledBorder(new LineBorder(new Color(102, 204, 0), 2, true), "Properties", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(b,r,j)));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(horizontalBox_1, GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(verticalBox, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(horizontalBox_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(verticalBox_1, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addComponent(horizontalBox, GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(horizontalBox, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(horizontalBox_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(verticalBox, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
						.addComponent(horizontalBox_2, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
						.addComponent(verticalBox_1, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
					.addGap(0))
		);
		
		
		
		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("MenuItem.border"));
		panel.setBackground(new Color(204, 255, 153));
		horizontalBox_2.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		
		
		
		//
		final Screen sc=new Screen();
		panel.add(sc);
	    
		
		
		
	     new Palette();
	     new Proprieties();
		
		JLabel lblAndroidAppmaker = new JLabel("Android AppMaker");
		lblAndroidAppmaker.setIcon(new ImageIcon("D:\\Documents and Settings\\REDA\\Bureau\\Image1.png"));
		lblAndroidAppmaker.setMaximumSize(new Dimension(300, 30));
		lblAndroidAppmaker.setForeground(new Color(154, 205, 50));
		lblAndroidAppmaker.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		lblAndroidAppmaker.setBackground(new Color(212, 208, 200));
		horizontalBox.add(lblAndroidAppmaker);
		frame.getContentPane().setLayout(groupLayout);
		
		
		
		
		
		JLabel lblText = new JLabel("text");
		lblText.setSize(new Dimension(100, 0));
		lblText.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblText.setFont(new Font("Ubuntu Medium", Font.BOLD, 13));
		lblText.setForeground(Color.BLACK);
		verticalBox_1.add(lblText);
	

		textField = new JTextField();
		textField.setAlignmentY(Component.TOP_ALIGNMENT);
		textField.setMaximumSize(new Dimension(300, 30));
		verticalBox_1.add(textField);
		textField.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setMaximumSize(new Dimension(300, 20));
		verticalBox_1.add(separator_2);
		
			
		
		JButton btnTextcolor = new JButton("textColor");
		btnTextcolor.setBorder(UIManager.getBorder("CheckBox.border"));
		verticalBox_1.add(btnTextcolor);
		btnTextcolor.setBackground(new Color(153, 204, 102));
        btnTextcolor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				color=JColorChooser.showDialog(null, "choose your color",Color.white );
		sc.DC.c.setForeground(color);}
			});
	    
	    
		JSeparator separator = new JSeparator();
		separator.setMaximumSize(new Dimension(300, 20));
		verticalBox_1.add(separator);
		
		JButton btnBackground = new JButton("background");
		verticalBox_1.add(btnBackground);
		btnBackground.setBorder(UIManager.getBorder("CheckBox.border"));
		btnBackground.setBackground(new Color(153, 204, 102));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setMaximumSize(new Dimension(300, 20));
		verticalBox_1.add(separator_1);
		btnBackground.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				color=JColorChooser.showDialog(null, "choose your color", Color.GRAY);
				sc.DC.c.setBackground(color);
						
			}
		});
		
		
		
		
		
		
		
		
		
		
	}	
}

