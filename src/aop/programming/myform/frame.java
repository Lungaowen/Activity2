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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author lunga
 */
public class frame extends JFrame implements ActionListener{
    
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

    public frame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        
        setTitle("REGISTRATION FORM");
        setLayout(new BorderLayout());
        
        
        //User name panel 
        //Name Label
        JLabel jl = new JLabel("                 REGISTRATION FORM");
        jl.setFont(new Font("fOMN", Font.BOLD, 20));
        
        
        nameLabel.setText("Name : ");
        namePanel.setLayout(new GridLayout(1,2,10,10));
        namePanel.add(nameLabel);
        namePanel.add(nameTextField);
        
        surnameLabel.setText("Surname : ");
        surnamePanel.setLayout(new GridLayout(1,2,10,10));
        surnamePanel.add(surnameLabel);
        surnamePanel.add(surnameTextField);
        
        ageLabel.setText("Age : ");
        agePanel.setLayout(new GridLayout(1,2,10,10));
        agePanel.add(ageLabel);
        agePanel.add(ageTextField);
        
        IdNumLabel.setText("ID number : ");
        IdNumPanel.setLayout(new GridLayout(1,2,10,10));
        IdNumPanel.add(IdNumLabel);
        IdNumPanel.add(IdNumTextField);
        
        registerPanel.setLayout(new GridLayout(4,2,10,10));
        registerPanel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.red), "Registration Form"));
        registerPanel.add(namePanel);
        registerPanel.add(surnamePanel);
        registerPanel.add(agePanel);
        registerPanel.add(IdNumPanel);
        
        textPanel.setLayout(new FlowLayout());
        textArea = new JTextArea(10, 40);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textPanel.add(scrollPane);
        
        mainPanel.setLayout(new GridLayout(2,1));
        mainPanel.add(registerPanel);
        mainPanel.add(textPanel);
        
        buttonPanel.setLayout(new GridLayout(1, 3));
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
        
        add(jl,BorderLayout.NORTH);
        add(mainPanel,BorderLayout.CENTER);
        add(buttonPanel,BorderLayout.SOUTH);
        pack();
       
        setVisible(true);
    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == clearButton){
            
        }else if(e.getSource() == submitButton){
            
        }else if(e.getSource() == exitButton){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        frame f = new frame();
        
    }
    
}
