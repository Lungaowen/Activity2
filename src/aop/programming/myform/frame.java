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
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
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
    private JLabel jl = new JLabel();
    
    //Text field
    private JTextField nameTextField = new JTextField(20);
    private JTextField surnameTextField = new JTextField(20);
    private JTextField IdNumTextField = new JTextField(20);
    private JTextField ageTextField = new JTextField(20);
    
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
    private JPanel gradePanel = new JPanel();
    private JPanel nameRegPanel = new JPanel();
    
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
    //JCOMBO BOX GARDE DETAILS
    
    private JComboBox comboBox;
    

    public frame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setTitle("REGISTRATION FORM");
        setResizable(false);
        setLayout(new BorderLayout());
        
        titlePanel();
        makeMainPanel();
        makeRegisterPanel();
        makeGradePanel();
        textAreaPanel();
        
        makeButtonPanel();
        
        setJMenuBar(menuBar);
        
        add(nameRegPanel,BorderLayout.NORTH);
        add(mainPanel,BorderLayout.CENTER);
        add(buttonPanel,BorderLayout.SOUTH);
        pack();
        setVisible(true);
    }
    private void titlePanel(){
        //nameRegPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        nameRegPanel.setLayout(new GridLayout(1, 1, 1, 1));
        nameRegPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        //Name Label
         jl.setText("REGISTRATION FORM");
        jl.setFont(new Font("fOMN", Font.BOLD, 20));
        jl.setBorder(new BevelBorder(BevelBorder.RAISED, Color.WHITE, Color.gray));
        nameRegPanel.add(jl);
       
    }
    private void makeMainPanel(){
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(new TitledBorder(new LineBorder(Color.gray, 5), "Main Panel"));
        
        mainPanel.add(registerPanel,BorderLayout.NORTH);
        mainPanel.add(gradePanel,BorderLayout.CENTER);
        mainPanel.add(textPanel,BorderLayout.SOUTH);
    
    }
    private void makeRegisterPanel(){
        
        //nameLabel.setText("Name : ");
        namePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        namePanel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.CYAN, Color.blue, Color.MAGENTA), "Name", 4,  TEXT_CURSOR, new Font("Bold", Font.BOLD, 10)));
        //namePanel.add(nameLabel);
        
        //nameTextField.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.CYAN, Color.blue, Color.MAGENTA), "Name", 4,  TEXT_CURSOR, new Font("Bold", Font.ITALIC, 10)));
        namePanel.add(nameTextField);
        
        //surnameLabel.setText("Surname : ");
        surnamePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        surnamePanel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.CYAN, Color.blue, Color.MAGENTA), "Surname", 1,  TEXT_CURSOR, new Font("Bold", Font.BOLD, 10)));
        //surnamePanel.add(surnameLabel);
        surnamePanel.add(surnameTextField);
        
        //ageLabel.setText("Age : ");
        agePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        agePanel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.CYAN, Color.blue, Color.MAGENTA), "AGE", 1,  TEXT_CURSOR, new Font("Bold", Font.BOLD, 10)));
        //agePanel.add(ageLabel);
        agePanel.add(ageTextField);
        
        //IdNumLabel.setText("ID number : ");
        IdNumPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
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
        genderPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        genderPanel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.CYAN, Color.blue, Color.MAGENTA), "Gender", 1,  TEXT_CURSOR, new Font("Bold", Font.ITALIC, 10)));
        //genderPanel.setBorder(new TitledBorder("Gender"));
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        JRadioButton otherButton = new JRadioButton("Other");
        ButtonGroup group = new ButtonGroup();
        group.add(maleRadio);
        group.add(femaleRadio);
        group.add(otherButton);
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        genderPanel.add(otherButton);
        registerPanel.add(genderPanel);

    }
    private void makeGradePanel(){
        gradePanel.setLayout(new FlowLayout());
        gradePanel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.CYAN, Color.blue, Color.MAGENTA),"Class Details"));
        
        
        comboBox = new JComboBox();
        comboBox.addItem("R");
        comboBox.addItem("1");
        comboBox.addItem("2");
        comboBox.addItem("3");
        comboBox.addItem("4");
        comboBox.addItem("5");
        comboBox.addItem("6");
        comboBox.addItem("7");
        comboBox.addItem("8");
        comboBox.addItem("9");
        comboBox.addItem("10");
        comboBox.addItem("11");
        comboBox.addItem("12");
        comboBox.setBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.CYAN, Color.blue, Color.MAGENTA));
       
        gradePanel.add(comboBox);
    
    }
    private void textAreaPanel(){
        textPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        textPanel.setBorder(new TitledBorder(new LineBorder(Color.gray, 2), "About yourself:"));
        textArea = new JTextArea(10, 40);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textPanel.add(scrollPane);
    
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
    public static void main(String[] args) {
        try {
            frame f = new frame();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
    }
    
}
