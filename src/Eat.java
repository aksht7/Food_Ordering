import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Eat extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eat frame = new Eat();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Eat() {
		setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(160, 40, 1060, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lbl1 = new JLabel("");
		lbl1.setForeground(new Color(0, 206, 209));
		lbl1.setBounds(-20, 83, 1044, 638);
		contentPane.add(lbl1);
		Image imgg = new ImageIcon(this.getClass().getResource("/eatt.jpg")).getImage();
		lbl1.setIcon(new ImageIcon(imgg));
		
		JButton bt1 = new JButton("Get Started");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order open= new order();
				open.setVisible(true);
			}
		});
		bt1.setBackground(new Color(255, 255, 255));
		bt1.setForeground(new Color(0, 191, 255));
		bt1.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 45));
		bt1.setBounds(721, 27, 323, 56);
		bt1.setLayout(null);
		bt1.setBorder(null);
		contentPane.add(bt1);

	}
}
