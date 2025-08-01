/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aop.programming.myform;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Locale;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.AbstractBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.BorderUIResource;

/**
 *
 * @author lunga
 */
public class frame extends JFrame implements ActionListener {
    
    //Labels
    private JLabel nameLabel = new JLabel();
    private JLabel surnameLabel = new JLabel();
    private JLabel IdNumLabel = new JLabel();
    private JLabel ageLabel = new JLabel();
    
    //Text field
    private JTextField nameTextField = new JTextField(10);
    private JTextField surnameTextField = new JTextField(10);
    private JTextField IdNumTextField = new JTextField(10);
    private JTextField ageTextField = new JTextField(10);
    
    //panels
    private JPanel mainPanel = new JPanel();
    private JPanel menuPanel = new JPanel();
    private JPanel namePanel = new JPanel();
    private JPanel surnamePanel = new JPanel();
    private JPanel agePanel = new JPanel();
    private JPanel IdNumPanel = new JPanel();
    private JPanel registerPanel = new JPanel();
    private JPanel buttonPanel = new JPanel();
    private JPanel textPanel = new JPanel();
    
    //My Buttons
    private JButton clearButton = new JButton();
    private JButton submitButton = new JButton();
    private JButton exitButton = new JButton();
    
    //My CheckBox
    private JCheckBox maleCheckBox = new JCheckBox();
    private JCheckBox femaleCheckBox = new JCheckBox();
    
    //Text Area
    private JTextArea textArea;
    //Radio button
    private JMenuBar menuBar;
    private JMenu AboutMenu;
    private JMenuItem about;
    
    //Concrete class
    private Student student = new Student();
    

    public frame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setTitle("REGISTRATION FORM");
        setLayout(new BorderLayout());
        
        
        //User name panel 
        //Name Label
        JLabel jl = new JLabel("REGISTRATION FORM");
        //jl.setBorder(new TitledBorder(null, null, 2, 2));
        jl.setFont(new Font("fOMN", Font.BOLD, 20));
        //jl.addMouseListener((MouseListener) this);
        makeMenuBar();
        makeRegisterPanel();
      
        makeButtonPanel();
        textPanel.setLayout(new FlowLayout());
        textArea = new JTextArea(10, 40);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textPanel.add(scrollPane);
        
        mainPanel.setLayout(new GridLayout(2,1));
        mainPanel.add(registerPanel);
        mainPanel.add(textPanel);
        setJMenuBar(menuBar);
        
        add(jl,BorderLayout.NORTH);
        add(mainPanel,BorderLayout.CENTER);
        add(buttonPanel,BorderLayout.SOUTH);
        pack();
       
        setVisible(true);
    }
    private void makeRegisterPanel(){
        
        //nameLabel.setText("Name : ");
        namePanel.setLayout(new GridLayout(1,2,10,10));
        namePanel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.CYAN, Color.blue, Color.MAGENTA), "Name", 4,  TEXT_CURSOR, new Font("Bold", Font.BOLD, 10)));
        //namePanel.add(nameLabel);
        //nameTextField.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.CYAN, Color.blue, Color.MAGENTA), "Name", 4,  TEXT_CURSOR, new Font("Bold", Font.ITALIC, 10)));
        namePanel.add(nameTextField);
        
        //surnameLabel.setText("Surname : ");
        surnamePanel.setLayout(new GridLayout(1,2,10,10));
        surnamePanel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.CYAN, Color.blue, Color.MAGENTA), "Surname", 1,  TEXT_CURSOR, new Font("Bold", Font.BOLD, 10)));
        //surnamePanel.add(surnameLabel);
        surnamePanel.add(surnameTextField);
        
        //ageLabel.setText("Age : ");
        agePanel.setLayout(new GridLayout(1,2,10,10));
        agePanel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.CYAN, Color.blue, Color.MAGENTA), "AGE", 1,  TEXT_CURSOR, new Font("Bold", Font.BOLD, 10)));
        //agePanel.add(ageLabel);
        agePanel.add(ageTextField);
        
        //IdNumLabel.setText("ID number : ");
        IdNumPanel.setLayout(new GridLayout(1,2,10,10));
        //IdNumPanel.add(IdNumLabel);
        IdNumPanel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.CYAN, Color.blue, Color.MAGENTA), "ID number", 1,  TEXT_CURSOR, new Font("Bold", Font.BOLD, 10)));
        IdNumPanel.add(IdNumTextField);
        
        registerPanel.setLayout(new GridLayout(5,1,10,10));
        registerPanel.setBorder(new TitledBorder(new LineBorder(Color.red, 2), "Registration Form"));
        registerPanel.add(namePanel);
        registerPanel.add(surnamePanel);
        registerPanel.add(agePanel);
        registerPanel.add(IdNumPanel);
        //registerPanel.add(new Panel());
        makeGenderChooser();
    
    }
    private void makeButtonPanel(){
        buttonPanel.setLayout(new GridLayout(1, 3));
        buttonPanel.setBorder(new TitledBorder(new BorderUIResource.BevelBorderUIResource(BevelBorder.LOWERED, Color.BLACK, Color.red), "Buttons"));
        //Clear button
        clearButton.setText("Clear");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);
        
        //Submit button
        submitButton.setText("Submit");
        submitButton.addActionListener(this);
        buttonPanel.add(submitButton);
        
        //Exit Button
        exitButton.setText("Exit");
        exitButton.addActionListener(this);
        buttonPanel.add(exitButton);
    }
    private void makeMenuBar(){
        menuBar = new JMenuBar();
        AboutMenu = new JMenu("About");
       
        menuBar.add(AboutMenu);
        about = new JMenuItem("About");
        AboutMenu.add(about);
        
    }
    private void makeGenderChooser(){
        JPanel genderPanel = new JPanel();
        genderPanel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.CYAN, Color.blue, Color.MAGENTA), "Gender", 1,  TEXT_CURSOR, new Font("Bold", Font.ITALIC, 10)));
        //genderPanel.setBorder(new TitledBorder("Gender"));
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        ButtonGroup group = new ButtonGroup();
        group.add(maleRadio);
        group.add(femaleRadio);
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        registerPanel.add(genderPanel);

    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == clearButton){
            nameTextField.setText(" ");
            surnameTextField.setText(" ");
            IdNumTextField.setText(" ");
            ageTextField.setText(" ");
            
            
        }else if(e.getSource() == submitButton){
            String name = nameTextField.getText();
            String surname = surnameTextField.getText();
            int age = Integer.parseInt(ageTextField.getText());
            String idNum = IdNumTextField.getText();
            student.setName(name);
            student.setSurname(surname);
            student.setIdNumber(idNum);
            student.setAge(age);
            
            
            textArea.append(student.toString());
            
            
            
            
        }else if(e.getSource() == exitButton){
            JOptionPane.showMessageDialog(this, "GOOD BYE !!!");
            System.exit(0);
        }
    }
    
    
}
