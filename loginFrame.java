import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.util.HashSet;
import java.util.Set;

public class loginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField_1;
    private JList<String> list;
    private Set<String> items;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try 
				{
					loginFrame frame = new loginFrame();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public loginFrame() {
		items = new HashSet<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 510);
		contentPane = new JPanel();
		contentPane.setToolTipText("A\r\nB\r\nC");
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel register = new JPanel();
		register.setEnabled(false);
		register.setBounds(9, 10, 1, 450);
		contentPane.add(register);
		register.setLayout(null);
		
		JPanel login = new JPanel();
		login.setBounds(9, 10, 1, 450);
		contentPane.add(login);
		login.setLayout(null);
		
		JPanel menu = new JPanel();
		menu.setBounds(9, 10, 1, 450);
		contentPane.add(menu);
		menu.setLayout(null);
		
		JPanel SC = new JPanel();
		SC.setBounds(9, 10, 730, 450);
		contentPane.add(SC);
		SC.setLayout(null);
		
		register.setVisible(true);
		login.setVisible(false);
		menu.setVisible(false);
		SC.setVisible(false);
		
		//Register menu
		
		JButton registB1 = new JButton("Register");
		registB1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("Hello");
				register.setVisible(false);
				login.setVisible(true);
			}
		});
		registB1.setBounds(560, 395, 90, 30);
		register.add(registB1);
		
		JLabel lblNewLabel_2 = new JLabel("Full name");
		lblNewLabel_2.setBounds(440, 35, 65, 14);
		register.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setBounds(440, 335, 65, 14);
		register.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(450, 65, 240, 20);
		register.add(textField_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(450, 365, 240, 20);
		register.add(passwordField);
		
		JLabel lblNewLabel_4 = new JLabel("Gmail");
		lblNewLabel_4.setBounds(440, 95, 49, 14);
		register.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(450, 125, 240, 20);
		register.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Phone number");
		lblNewLabel_5.setBounds(440, 155, 105, 14);
		register.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(450, 185, 240, 20);
		register.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Birthday");
		lblNewLabel_6.setBounds(440, 215, 49, 14);
		register.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(450, 245, 240, 20);
		register.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Gender");
		lblNewLabel_7.setBounds(440, 275, 49, 14);
		register.add(lblNewLabel_7);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) 
			{
			}
		});
		rdbtnNewRadioButton.setBounds(485, 305, 73, 23);
		register.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			}
		});
		rdbtnFemale.setBounds(560, 305, 111, 23);
		register.add(rdbtnFemale);
		
		JLabel lblNewLabel = new JLabel("ADMISSION PAGE");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel.setBounds(92, 35, 219, 36);
		register.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TDG University");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(62, 95, 271, 54);
		register.add(lblNewLabel_1);
		
		//Login menu
		
		JLabel lblNewLabel_8 = new JLabel("TDG UNIVERSITY LOGIN PAGE");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 35));
		lblNewLabel_8.setBounds(111, 0, 545, 93);
		login.add(lblNewLabel_8);
		
		JButton loginB = new JButton("Login");
		loginB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				login.setVisible(false);
				menu.setVisible(true);
			}
		});
		loginB.setBounds(215, 265, 89, 23);
		login.add(loginB);
		
		textField_4 = new JTextField();
		textField_4.setBounds(130, 135, 269, 20);
		login.add(textField_4);
		textField_4.setColumns(10);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(130, 195, 270, 20);
		login.add(passwordField_1);
		
		JLabel lblNewLabel_9 = new JLabel("Gmail");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(100, 105, 73, 14);
		login.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Passsword");
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(100, 165, 108, 14);
		login.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Your detail(s) are incorrect");
		lblNewLabel_11.setBounds(195, 240, 140, 14);
		login.add(lblNewLabel_11);
		
		JButton registB2 = new JButton("Register");
		registB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				register.setVisible(true);
				login.setVisible(false);
			}
		});
		registB2.setBounds(215, 311, 89, 23);
		login.add(registB2);
		
		JLabel lblNewLabel_12 = new JLabel("Welcome to TDG University");
		lblNewLabel_12.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_12.setBounds(195, 30, 315, 30);
		menu.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Welcome TDG University! Congratulations on being accepted. ");
		lblNewLabel_13.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_13.setBounds(45, 71, 620, 21);
		menu.add(lblNewLabel_13);
		
		JLabel lblNewLabel_15 = new JLabel("The following below are information about the instructions and choosing a subject. Thank you and congratulations again!");
		lblNewLabel_15.setBounds(45, 90, 670, 14);
		menu.add(lblNewLabel_15);
		
		JLabel lblNewLabel_14 = new JLabel("Please click the button below this message in order to pick a course and the subjects that it offers.");
		lblNewLabel_14.setBounds(45, 160, 600, 14);
		menu.add(lblNewLabel_14);
		
		JButton studentC = new JButton("Student center");
		studentC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				menu.setVisible(false);
				SC.setVisible(true);
			}
		});
		studentC.setBounds(45, 250, 117, 23);
		menu.add(studentC);
		
		JButton logout = new JButton("Logout");
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				menu.setVisible(false);
				login.setVisible(true);
			}
		});
		logout.setBounds(600, 10, 89, 23);
		menu.add(logout);
		
		JLabel lblNewLabel_17_1 = new JLabel("Course");
		lblNewLabel_17_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_17_1.setBounds(310, 110, 67, 14);
		SC.add(lblNewLabel_17_1);
		
		JLabel lblNewLabel_16 = new JLabel("Select a Course and Subject");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_16.setBounds(213, 11, 320, 40);
		SC.add(lblNewLabel_16);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				menu.setVisible(true);
				SC.setVisible(false);
			}
		});
		back.setBounds(30, 25, 89, 23);
		SC.add(back);
		
		JList subj = new JList();
		subj.setModel(new AbstractListModel() {
			String[] values = new String[] {"Programming Languages", "Data Structures and Algorithms", "Operating Systems", "Computer Architecture", "Artificial Intelligence"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		subj.setBounds(500, 135, 190, 110);
		SC.add(subj);
		
		JLabel lblNewLabel_17 = new JLabel("Subjects\r\n");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_17.setBounds(535, 110, 67, 14);
		SC.add(lblNewLabel_17);
		
		JButton btnNewButton = new JButton("Finalize");
		btnNewButton.setBounds(535, 256, 90, 23);
		SC.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Enroll");
		btnNewButton_1.setBounds(410, 370, 89, 23);
		SC.add(btnNewButton_1);
		
		JComboBox course = new JComboBox();
		course.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{
				if (e.getStateChange() == java.awt.event.ItemEvent.SELECTED) 
				{
			        int selectedIndex = course.getSelectedIndex();
			        if (selectedIndex == 0)
			        {
			        	System.out.println("Comp Sci");
			        }
			        else if (selectedIndex == 1)
			        {
			        	System.out.println("IT");
			        }
			        else if (selectedIndex == 2)
			        {
			        	System.out.println("IS");
			        }
			        else if (selectedIndex == 3)
			        {
			        	System.out.println("EMC");
			        }
			    }
			}
		});
		course.setModel(new DefaultComboBoxModel(new String[] {"Computer Science", "Information Technology", "Information System", "Entertainment and Multimedia Computing"}));
		course.setBounds(240, 135, 220, 25);
		SC.add(course);
	}
}
