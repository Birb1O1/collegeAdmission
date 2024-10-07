//package testJava;
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
import javax.swing.ButtonGroup;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.util.HashSet;
import java.util.Set;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import javax.swing.ListModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import javax.swing.event.*;
import java.awt.Dimension;
import java.awt.ComponentOrientation;

public class loginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JPasswordField pass;
	private JTextField gmail;
	private JTextField pNum;
	private JTextField bday;
	private JTextField gmailL;
	private JPasswordField passL;
    private JList<String> list;
    private Set<String> items;
    
    public String selectedCourse = "";
    private JTextField iGPA;
    
    // Student information
    
    public String studentName = "";
    public String studentGmail = "";
    public long studentPhoneNum = 0;
    public String birthday = "";
    public Character gender;
    public String password = "";
    public int GPA = 0;
    
    public String studentName1 = "";
    public String studentGmail1 = "";
    public long studentPhoneNum1 = 0;
    public String birthday1 = "";
    public Character gender1;
    public String password1 = "";
    
    public boolean realNum = true;
    public boolean realNum1 = true;
    
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
		Set<String> itemCS = new HashSet<>();
		Set<String> itemIT = new HashSet<>();
		Set<String> itemIS = new HashSet<>();
		Set<String> itemEMC = new HashSet<>();
		
		DefaultListModel<String> CSsubj = new DefaultListModel<>();
		CSsubj.addElement("Programming Languages");CSsubj.addElement("Data Structures and Algorithms");CSsubj.addElement("Operating Systems");CSsubj.addElement("Computer Architecture");CSsubj.addElement("Artificial Intelligence");
		DefaultListModel<String> ITsubj = new DefaultListModel<>();
		ITsubj.addElement("Networking Fundamentals");ITsubj.addElement("Database Management Systems");ITsubj.addElement("Web Development");ITsubj.addElement("Information Security");ITsubj.addElement("Cloud Computing");
		DefaultListModel<String> ISsubj = new DefaultListModel<>();
		ISsubj.addElement("Systems Analysis and Design");ISsubj.addElement("Business Process Modeling");ISsubj.addElement("Enterprise Resource Planning (ERP)");ISsubj.addElement("IT Project Management");ISsubj.addElement("Decision Support Systems");
		DefaultListModel<String> EMCsubj = new DefaultListModel<>();
		EMCsubj.addElement("Game Development");EMCsubj.addElement("Multimedia Systems");EMCsubj.addElement("Animation Techniques");EMCsubj.addElement("Digital Audio and Video Production");EMCsubj.addElement("Virtual Reality and Augmented Reality");
		DefaultListModel<String> subjStore = new DefaultListModel<>();
		DefaultListModel<String> lName = new DefaultListModel<>();
		DefaultListModel<String> lEmail = new DefaultListModel<>();
		DefaultListModel<Long> lNum = new DefaultListModel<>();
		DefaultListModel<String> courseChosen = new DefaultListModel<>();
		DefaultListModel<String> lBday = new DefaultListModel<>();

		// JPANEL SETUP
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 510);
		contentPane = new JPanel();
		contentPane.setToolTipText("A\r\nB\r\nC");
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel register = new JPanel();
		register.setPreferredSize(new Dimension(20, 10));
		register.setEnabled(false);
		register.setBounds(9, 10, 730, 450);
		contentPane.add(register);
		register.setLayout(null);
		
		JPanel loginFrame = new JPanel();
		loginFrame.setBounds(9, 10, 730, 450);
		contentPane.add(loginFrame);
		loginFrame.setLayout(null);
		
		JPanel menu = new JPanel();
		menu.setBounds(9, 10, 730, 450);
		contentPane.add(menu);
		menu.setLayout(null);
		
		JPanel SC = new JPanel();
		SC.setBounds(9, 10, 730, 450);
		contentPane.add(SC);
		SC.setLayout(null);
		
		register.setVisible(true);
		loginFrame.setVisible(false);
		menu.setVisible(false);
		SC.setVisible(false);
		
		// Setting up JPANEL END
		
		
		
		//Register menu
		
		JLabel admiPage = new JLabel("ADMISSION PAGE");
		admiPage.setFont(new Font("Arial", Font.PLAIN, 25));
		admiPage.setBounds(92, 35, 219, 36);
		register.add(admiPage);
		
		JLabel tdgText = new JLabel("TDG University");
		tdgText.setFont(new Font("Arial", Font.PLAIN, 40));
		tdgText.setBounds(62, 95, 271, 54);
		register.add(tdgText);
		
		JLabel errorNum = new JLabel("PLEASE INPUT A PROPER NUMBER");
		errorNum.setForeground(new Color(255, 0, 0));
		errorNum.setBounds(300, 405, 245, 15);
		register.add(errorNum);
		
		errorNum.setVisible(false);
		
		JButton registB1 = new JButton("Register");
		registB1.setBounds(530, 395, 90, 30);
		register.add(registB1);
		
		JLabel lblNewLabel_2 = new JLabel("Full name");
		lblNewLabel_2.setBounds(440, 35, 65, 14);
		register.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setBounds(440, 335, 65, 14);
		register.add(lblNewLabel_3);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(450, 65, 240, 20);
		register.add(name);
		
		pass = new JPasswordField();
		pass.setBounds(450, 365, 240, 20);
		register.add(pass);
		
		JLabel lblNewLabel_4 = new JLabel("Gmail");
		lblNewLabel_4.setBounds(440, 95, 49, 14);
		register.add(lblNewLabel_4);
		
		gmail = new JTextField();
		gmail.setBounds(450, 125, 240, 20);
		register.add(gmail);
		gmail.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Phone number");
		lblNewLabel_5.setBounds(440, 155, 105, 14);
		register.add(lblNewLabel_5);
		
		JTextField pNum = new JTextField(20);
		pNum.setMinimumSize(new Dimension(20, 20));
		pNum.setBounds(450, 185, 240, 20);
		register.add(pNum);
		
		JLabel lblNewLabel_6 = new JLabel("Birthday");
		lblNewLabel_6.setBounds(440, 215, 49, 14);
		register.add(lblNewLabel_6);
		
		bday = new JTextField();
		bday.setBounds(450, 245, 240, 20);
		register.add(bday);
		bday.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Gender");
		lblNewLabel_7.setBounds(440, 275, 49, 14);
		register.add(lblNewLabel_7);
		
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton male = new JRadioButton("Male");

		JRadioButton female = new JRadioButton("Female");
		
		male.setBounds(485, 305, 73, 23);
		register.add(male);
		female.setBounds(560, 305, 111, 23);
		register.add(female);
		group.add(male);
		group.add(female);
		
		// End of registration menu
		
		
		
		//login menu
		
		JLabel lblNewLabel_8 = new JLabel("TDG UNIVERSITY LOGIN PAGE");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 35));
		lblNewLabel_8.setBounds(111, 0, 545, 93);
		loginFrame.add(lblNewLabel_8);
		
		JButton loginFrameB = new JButton("Login");
		loginFrameB.setBounds(215, 265, 89, 23);
		loginFrame.add(loginFrameB);
		
		// Login panel
		
		gmailL = new JTextField();
		gmailL.setBounds(130, 135, 269, 20);
		loginFrame.add(gmailL);
		gmailL.setColumns(10);
		
		passL = new JPasswordField();
		passL.setBounds(130, 195, 270, 20);
		loginFrame.add(passL);
		
		JLabel lblNewLabel_9 = new JLabel("Gmail");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(100, 105, 73, 14);
		loginFrame.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Passsword");
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(100, 165, 108, 14);
		loginFrame.add(lblNewLabel_10);
		
		JLabel detailsIncor = new JLabel("Your detail(s) are incorrect");
		detailsIncor.setBounds(185, 240, 200, 14);
		loginFrame.add(detailsIncor);
		
		detailsIncor.setVisible(false);
		
		JButton registB2 = new JButton("Register");
		
		// Login panel declaration end
		
		
		
		// Menu panel declaration
		
		JLabel lblNewLabel_12 = new JLabel("Welcome to TDG University");
		lblNewLabel_12.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_12.setBounds(195, 30, 315, 30);
		menu.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Welcome TDG University! Congratulations on being accepted. ");
		lblNewLabel_13.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_13.setBounds(45, 71, 620, 21);
		menu.add(lblNewLabel_13);
		
		JLabel lblNewLabel_15 = new JLabel("The following below are information about the instructions and choosing a subject.");
		lblNewLabel_15.setBounds(45, 90, 590, 14);
		menu.add(lblNewLabel_15);
		
		JLabel lblNewLabel_14 = new JLabel("Please click the button below this message in order to pick a course and the subjects that it offers.");
		lblNewLabel_14.setBounds(45, 315, 600, 14);
		menu.add(lblNewLabel_14);
		
		JButton studentC = new JButton("Student center");
		studentC.setBounds(45, 350, 145, 23);
		menu.add(studentC);
		
		JButton logout = new JButton("Logout");
		logout.setBounds(600, 10, 89, 23);
		menu.add(logout);
		
		JLabel name_1 = new JLabel("Name:");
		name_1.setBounds(45, 140, 49, 20);
		menu.add(name_1);
		
		JLabel phoneNum = new JLabel("Phone number:");
		phoneNum.setBounds(45, 165, 102, 20);
		menu.add(phoneNum);
		
		JLabel email_1 = new JLabel("Email:");
		email_1.setBounds(45, 190, 49, 20);
		menu.add(email_1);
		
		JLabel birthday_1 = new JLabel("Birthday:");
		birthday_1.setBounds(45, 215, 85, 20);
		menu.add(birthday_1);
		
		JLabel courseCh = new JLabel("Course:");
		courseCh.setBounds(45, 240, 49, 20);
		menu.add(courseCh);
		
		
		// Menu student info
		
		
		JList<String> mName = new JList<>(lName);
		mName.setBounds(140, 140, 150, 20);
		menu.add(mName);
		
		JList <Long>mNum = new JList<>(lNum);
		mNum.setBounds(140, 165, 150, 20);
		menu.add(mNum);
		
		JList <String> mEmail = new JList<>(lEmail);
		mEmail.setBounds(140, 190, 150, 20);
		menu.add(mEmail);
		
		JList <String> mBday = new JList<>(lBday);
		mBday.setBounds(140, 215, 150, 20);
		menu.add(mBday);
		
		JList<String> mCourse = new JList<>(courseChosen);
		mCourse.setBounds(140, 240, 150, 20);
		menu.add(mCourse);
		
		// End of studentMenu info and MENU EVENTS ***************
		
		
		
		// Student Center menu START ********************
		
		JLabel lblNewLabel_17_1 = new JLabel("Course");
		lblNewLabel_17_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_17_1.setBounds(270, 75, 67, 14);
		SC.add(lblNewLabel_17_1);
		
		JLabel lblNewLabel_16 = new JLabel("Select a Course and Subject");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_16.setBounds(213, 11, 320, 40);
		SC.add(lblNewLabel_16);
		
		JButton back = new JButton("Back");
		back.setBounds(30, 25, 89, 23);
		SC.add(back);
		
		
		JLabel lblNewLabel_17_1_1 = new JLabel("GPA");
		lblNewLabel_17_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_17_1_1.setBounds(55, 75, 40, 14);
		SC.add(lblNewLabel_17_1_1);
		
		
		// Subject selecter UI
		
		JList<String> blank = new JList<String>();
		blank.setBounds(460, 100, 230, 110);
		SC.add(blank);
		
		JList<String> subjCS = new JList<>(CSsubj);

		subjCS.setModel(new AbstractListModel() {
			String[] values = new String[] {"Programming Languages", "Data Structures and Algorithms", "Operating Systems", "Computer Architecture", "Artificial Intelligence"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		subjCS.setBounds(460, 100, 230, 110);
		SC.add(subjCS);
		
		JList subjIT = new JList();
		subjIT.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		subjIT.setModel(new AbstractListModel() {
			String[] values = new String[] {"Networking Fundamentals", "Database Management Systems", "Web Development", "Information Security", "Cloud Computing"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		subjIT.setBounds(460, 100, 230, 110);
		SC.add(subjIT);
		
		JList subjIS = new JList();
		subjIS.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		subjIS.setModel(new AbstractListModel() {
			String[] values = new String[] {"Systems Analysis and Design", "Business Process Modeling", "Enterprise Resource Planning (ERP)", "IT Project Management", "Decision Support Systems"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		subjIS.setBounds(460, 100, 230, 110);
		SC.add(subjIS);
		
		JList subjEMC = new JList();
		subjEMC.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		subjEMC.setModel(new AbstractListModel() {
			String[] values = new String[] {"Game Development", "Multimedia Systems", "Animation Techniques", "Digital Audio and Video Production", "Virtual Reality and Augmented Reality"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		subjEMC.setBounds(460, 100, 230, 110);
		SC.add(subjEMC);
		
		// Subjects per course end
		
		JList<String> chSubj = new JList<>(subjStore);
		chSubj.setBounds(460, 279, 230, 110);
		SC.add(chSubj);

		JLabel lblNewLabel_18 = new JLabel("Chosen subjects");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_18.setBounds(510, 254, 129, 14);
		SC.add(lblNewLabel_18);
		
		
		JLabel lblNewLabel_17 = new JLabel("Subjects\r\n");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_17.setBounds(540, 75, 67, 14);
		SC.add(lblNewLabel_17);
		
		
		JComboBox course = new JComboBox();
		
		course.setModel(new DefaultComboBoxModel(new String[] {"Computer Science", "Information Technology", "Information System", "Entertainment and Multimedia Computing"}));
		course.setBounds(180, 100, 250, 25);
		
        selectedCourse = "Computer Science";
        course.setSelectedIndex(-1);
        
        System.out.println(selectedCourse);
		SC.add(course);
		
		JLabel congrats = new JLabel("Congratulations!");
		congrats.setFont(new Font("Times New Roman", Font.BOLD, 15));
		congrats.setBounds(213, 186, 135, 20);
		SC.add(congrats);
		
		
		JLabel enrolled = new JLabel("You are now enrolled to TDG University!");
		enrolled.setFont(new Font("Times New Roman", Font.BOLD, 15));
		enrolled.setBounds(145, 218, 285, 20);
		SC.add(enrolled);
		
		JLabel pick = new JLabel("Pick a subject!");
		pick.setForeground(new Color(255, 0, 0));
		pick.setFont(new Font("Tahoma", Font.BOLD, 15));
		pick.setBounds(515, 220, 122, 14);
		SC.add(pick);
		
		pick.setVisible(false);
		congrats.setVisible(false);
		enrolled.setVisible(false);
		
		JButton enroll = new JButton("Enroll");
		enroll.setBounds(305, 400, 89, 23);
		SC.add(enroll);
		
		iGPA = new JTextField();
		iGPA.setBounds(30, 95, 90, 25);
		SC.add(iGPA);
		iGPA.setColumns(10);
		
		JButton reset = new JButton("Reset");
		reset.setBounds(30, 400, 89, 23);
		SC.add(reset);
		
		JLabel sorry = new JLabel("Sorry you did not pass for this course.");
		sorry.setFont(new Font("Times New Roman", Font.BOLD, 15));
		sorry.setBounds(155, 255, 259, 14);
		SC.add(sorry);
		
		JLabel lblNewLabel = new JLabel("Please click on \r\nthe subject you \r\nwould like to \r\ntake on the \r\nsubject list.\r\n");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblNewLabel.setBounds(30, 366, 472, 23);
		SC.add(lblNewLabel);
		
		sorry.setVisible(false);
		
		
		
		// ************ EVENTS *********
		
		
		
		
		
		//Registration page events
		
		male.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				gender = 'M';
				System.out.println("Male");
			}
		});

		female.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				gender = 'F';
				System.out.println("Female");
			}
		});
		
        name.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateLabel();
            }

            private void updateLabel()  
            {
            	studentName = name.getText();
                // Do something with the text here
                System.out.println("Text: " + studentName);
            }
        });
		
        gmail.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateLabel();
            }

            private void updateLabel()  
            {
            	studentGmail = gmail.getText();
                // Do something with the text here
                System.out.println("Gmail: " + studentGmail);
            }
        });
        
        	pNum.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) 
            {
                updateLong();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateLong();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateLong();
            }

            private long updateLong() {
                String text = pNum.getText();
                try {
                    // Extract the first 11 digits from the input
                    String first11Digits = text.substring(0, Math.min(text.length(), 11));

                    Long number = Long.parseLong(first11Digits);

                    // Store the parsed integer in studentPhoneNum
                    studentPhoneNum = number;

                    // Do something with the integer
                    System.out.println("Integer: " + studentPhoneNum);
                    realNum = true;
                    System.out.println(realNum);

                    return number; // Return the parsed integer
                } catch (NumberFormatException ex) {
                    // Handle the exception if the input is not a valid integer
                    System.out.println("Invalid integer input: " + text);
                    realNum = false;
                    System.out.println(realNum);
                    return 0; // Return a default value or handle the error appropriately
                }
            }
        });
        	
        bday.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateLabel();
            }

            private void updateLabel()  
            {
            	birthday = bday.getText();
                // Do something with the text here
                System.out.println("Bday: " + birthday);
            }
        });
        
        pass.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateLabel();
            }

            private void updateLabel()  
            {
                char[] passwordChar = pass.getPassword();
                password = String.valueOf(passwordChar);

                // Do something with the password here
                System.out.println("Password: " + password);
            }
        });
        
		registB1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if (realNum == true)
				{
					System.out.println("Hello");
					register.setVisible(false);
					loginFrame.setVisible(true);
					
					lName.clear();
					lName.addElement(studentName);
					mName.setModel(lName);
					
					studentName1 = studentName;
					
					lEmail.clear();
					lEmail.addElement(studentGmail);
					mEmail.setModel(lEmail);
					
					studentGmail1 = studentGmail;
					
					lNum.clear();
					lNum.addElement(studentPhoneNum);
					mNum.setModel(lNum);
					
					studentPhoneNum1 = studentPhoneNum;
					
					lBday.clear();
					lBday.addElement(birthday);
					mBday.setModel(lBday);
					
					birthday1 = birthday;
					
					password1 = password;
					
					studentName = "";
					studentGmail = "";
					studentPhoneNum = 0;
					birthday = "";
					password = "";
					
					System.out.println("Name:" + studentName1);
					System.out.println("Gmail: " + studentGmail1);
					System.out.println("Number: " + studentPhoneNum1);
					System.out.println("Birthday: " + birthday1);
					System.out.println("Password: " + password1);
					
					errorNum.setVisible(false);
				}
				else
				{
					errorNum.setVisible(true);
				}
			}
		});
		// End of registration page events
		
		
		
		registB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				register.setVisible(true);
				loginFrame.setVisible(false);
			}
		});
		registB2.setBounds(215, 311, 89, 23);
		loginFrame.add(registB2);
		
        	gmailL.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateLabel();
            }

            private void updateLabel()  
            {
            	studentGmail = gmailL.getText();
                // Do something with the text here
                System.out.println("Gmail: " + studentGmail);
            }
            
            
        });
		
            passL.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    updateLabel();
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    updateLabel();
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    updateLabel();
                }

                private void updateLabel()  
                {
                    char[] passwordChar1 = passL.getPassword();
                    password = String.valueOf(passwordChar1);

                    // Do something with the password here
                    System.out.println("Pass: " + password);
                }
            });
            
    		loginFrameB.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) 
    			{
    				if(studentGmail1.equals(studentGmail) && password1.equals(password))
    				{
        				loginFrame.setVisible(false);
        				menu.setVisible(true);
        				detailsIncor.setVisible(false);
    				}
    				else
    				{
    					detailsIncor.setVisible(true);
    				}
    			}
    		});
		// Login EVENTS end ***************************
    		
    	// MENU EVENTS START ***********************
    		
    		studentC.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) 
    			{
    				menu.setVisible(false);
    				SC.setVisible(true);
    			}
    		});
    		
    		
    		logout.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) 
    			{
    				menu.setVisible(false);
    				loginFrame.setVisible(true);
    			}
    		});
    		
    	// MENU EVENTSS END ******************
    		
    		
    	// STUDENT CENTER EVENTS START *********************
    		iGPA.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) 
                {
                    updateInt();
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    updateInt();
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    updateInt();
                }

                private int updateInt() {
                    String text = iGPA.getText();
                    try {
                        // Extract the first 2 digits from the input
                        String first2Digits = text.substring(0, Math.min(text.length(), 11));

                        int number = Integer.parseInt(first2Digits);

                        // Store the parsed integer in studentPhoneNum
                        GPA = number;

                        // Do something with the integer
                        System.out.println("GPA: " + GPA);
                        realNum1 = true;
                        System.out.println(realNum);

                        return number; // Return the parsed integer
                    } catch (NumberFormatException ex) {
                        // Handle the exception if the input is not a valid integer
                        System.out.println("Invalid GPA input: " + text);
                        realNum1 = false;
                        System.out.println(realNum);
                        return 0; // Return a default value or handle the error appropriately
                    }
                }
            });
    		
    		
    		back.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) 
    			{
    				menu.setVisible(true);
    				SC.setVisible(false);
    			}
    		});
    		
    		// Subjects event listeners
    		
    		subjCS.addListSelectionListener(e -> {
                int[] selectedIndices = subjCS.getSelectedIndices();
                for (int index : selectedIndices) {
                    String item = CSsubj.getElementAt(index);
                    if (!subjStore.contains(item)) {
                        // Item was added to the set, so it's unique
                        System.out.println("Clicked item: " + item);
                        subjStore.addElement(item);
                    } 
                    else 
                    {
                        // Item was already in the set, so it's a duplicate
                        System.out.println("Duplicate item clicked: " + item);
                    }
                }
            });
    		
    		subjIT.addListSelectionListener(e -> {
                int[] selectedIndices = subjIT.getSelectedIndices();
                for (int index : selectedIndices) {
                    String item2 = ITsubj.getElementAt(index);
                    if (!subjStore.contains(item2)) {
                        // Item was added to the set, so it's unique
                        System.out.println("Clicked item: " + item2);
                        subjStore.addElement(item2);
                    } 
                    else 
                    {
                        // Item was already in the set, so it's a duplicate
                        System.out.println("Duplicate item clicked: " + item2);
                    }
                }
            });;
            
    		subjIS.addListSelectionListener(e -> {
                int[] selectedIndices = subjIS.getSelectedIndices();
                for (int index : selectedIndices) {
                    String item3 = ISsubj.getElementAt(index);
                    if (!subjStore.contains(item3)) {
                        // Item was added to the set, so it's unique
                        System.out.println("Clicked item: " + item3);
                        subjStore.addElement(item3);
                    } 
                    else 
                    {
                        // Item was already in the set, so it's a duplicate
                        System.out.println("Duplicate item clicked: " + item3);
                    }
                }
            });;
    		
    		subjEMC.addListSelectionListener(e -> {
                int[] selectedIndices = subjEMC.getSelectedIndices();
                for (int index : selectedIndices) {
                    String item4 = EMCsubj.getElementAt(index);
                    if (!subjStore.contains(item4)) {
                        // Item was added to the set, so it's unique
                        System.out.println("Clicked item: " + item4);
                        subjStore.addElement(item4);
                    } 
                    else 
                    {
                        // Item was already in the set, so it's a duplicate
                        System.out.println("Duplicate item clicked: " + item4);
                    }
                }
            });;
    		
    		// Subject end events listeners *********************
            
            // SELECTOR START **********************************
            
    		course.addItemListener(new ItemListener() {
    			public void itemStateChanged(ItemEvent e) 
    			{
    				if (e.getStateChange() == ItemEvent.SELECTED) 
    				{
    			        int selectedIndex = course.getSelectedIndex();
    			        if (selectedIndex == 0)
    			        {
    			        	selectedCourse = "Computer Science";
    			        	System.out.println("CS");
    			        	System.out.println(selectedCourse);
    			        	subjCS.setVisible(true);
    			        	subjIT.setVisible(false);
    			        	subjIS.setVisible(false);
    			        	subjEMC.setVisible(false);
    			        	blank.setVisible(false);
    			        	
    			        	itemCS.clear();
    			        	itemIT.clear();
    			        	itemIS.clear();
    			        	itemEMC.clear();
    			        	
    			        	subjCS.clearSelection();
    			        	subjIT.clearSelection();
    			        	subjIS.clearSelection();
    			        	subjEMC.clearSelection();
    			        	
    			        	subjStore.clear();
    			        }
    			        else if (selectedIndex == 1)
    			        {
    			        	selectedCourse = "Information Technology";
    			        	System.out.println("IT");
    			        	System.out.println(selectedCourse);
    			        	subjCS.setVisible(false);
    			        	subjIT.setVisible(true);
    			        	subjIS.setVisible(false);
    			        	subjEMC.setVisible(false);
    			        	blank.setVisible(false);
    			        	
    			        	itemCS.clear();
    			        	itemIT.clear();
    			        	itemIS.clear();
    			        	itemEMC.clear();
    			        	
    			        	subjCS.clearSelection();
    			        	subjIT.clearSelection();
    			        	subjIS.clearSelection();
    			        	subjEMC.clearSelection();
    			        	
    			        	subjStore.clear();
    			        }
    			        else if (selectedIndex == 2)
    			        {
    			        	selectedCourse = "Information System";
    			        	System.out.println("IS");
    			        	System.out.println(selectedCourse);
    			        	subjCS.setVisible(false);
    			        	subjIT.setVisible(false);
    			        	subjIS.setVisible(true);
    			        	subjEMC.setVisible(false);
    			        	blank.setVisible(false);
    			        	
    			        	itemCS.clear();
    			        	itemIT.clear();
    			        	itemIS.clear();
    			        	itemEMC.clear();
    			        	
    			        	subjCS.clearSelection();
    			        	subjIT.clearSelection();
    			        	subjIS.clearSelection();
    			        	subjEMC.clearSelection();
    			        	
    			        	subjStore.clear();
    			        }
    			        else if (selectedIndex == 3)
    			        {
    			        	selectedCourse = "Entertainment and Multimedia Computing";
    			        	System.out.println("EMC");
    			        	System.out.println(selectedCourse);
    			        	subjCS.setVisible(false);
    			        	subjIT.setVisible(false);
    			        	subjIS.setVisible(false);
    			        	subjEMC.setVisible(true);
    			        	blank.setVisible(false);
    			        	
    			        	itemCS.clear();
    			        	itemIT.clear();
    			        	itemIS.clear();
    			        	itemEMC.clear();
    			        	
    			        	subjCS.clearSelection();
    			        	subjIT.clearSelection();
    			        	subjIS.clearSelection();
    			        	subjEMC.clearSelection();
    			        	
    			        	subjStore.clear();
    			        }
    			    }
    			}
    		});
    		
    	// COURSE SSELECTOR END ***************
    		
    	// ENROLL BUTTON WORK ***********************
    		
    		enroll.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) 
    			{
    				if(!subjStore.isEmpty())
    				{
    					if(GPA < 2)
    					{
    						sorry.setVisible(true);
    					}
    					else
    					{
	    					congrats.setVisible(true);
	    					enrolled.setVisible(true);
	    					blank.setVisible(true);
	    					
	    		        	subjCS.setEnabled(false);
	    		        	subjIT.setEnabled(false);
	    		        	subjIS.setEnabled(false);
	    		        	subjEMC.setEnabled(false);
	    		        	
	    		        	course.setEnabled(false);
	    		        	
	    		        	subjCS.clearSelection();
	    		        	subjIT.clearSelection();
	    		        	subjIS.clearSelection();
	    		        	subjEMC.clearSelection();
	    		        	
	    		        	pick.setVisible(false);
	    		        	
	    		        	courseChosen.clear();
	    		        	courseChosen.addElement(selectedCourse);
	    		        	mCourse.setModel(courseChosen);
    					}
    				}
    				else
    				{
    					pick.setVisible(true);
    				}
    			}
    		});
    	// ENROLL BUTTON END ***************
    		
    	// RESET BUTTON ***************************
    		
    		reset.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) 
    			{
    				course.setSelectedIndex(-1);
    				
    	        	subjCS.clearSelection();
    	        	subjIT.clearSelection();
    	        	subjIS.clearSelection();
    	        	subjEMC.clearSelection();
    	        	subjStore.clear();
    	        	courseChosen.clear();
    				
    	        	subjCS.setEnabled(true);
    	        	subjIT.setEnabled(true);
    	        	subjIS.setEnabled(true);
    	        	subjEMC.setEnabled(true);
    	        	
    	        	course.setEnabled(true);
    	        	
    	        	blank.setVisible(true);
    	        	pick.setVisible(false);
    	        	congrats.setVisible(false);
    	        	enrolled.setVisible(false);
    	        	sorry.setVisible(false);
    	        	
    	        	mCourse.setModel(courseChosen);
    			}
    		});
    		
    	// RESET BUTTON END *************************
	}
}
