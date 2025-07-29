/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aop.programming.myform;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
    private JTextField nameTextField = new JTextField();
    private JTextField surnameTextField = new JTextField();
    private JTextField IdNumTextField = new JTextField();
    private JTextField ageTextField = new JTextField();
    
    //panels
    private JPanel namePanel = new JPanel();
    private JPanel surnamePanel = new JPanel();
    private JPanel IdNumPanel = new JPanel();
    private JPanel agePanel = new JPanel();
    private JPanel registerPanel = new JPanel();
    private JPanel buttonPanel = new JPanel();
    
    //My Buttons
    private JButton clearButton = new JButton();
    private JButton submitButton = new JButton();
    private JButton exitButton = new JButton();

    public frame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setResizable(false);
        setVisible(true);
        setTitle("REGISTRATION FORM");
        setLayout(null);
        
        //User name panel 
        namePanel.setBackground(Color.red);
        namePanel.setBounds(0, 0, 300, 30);
        namePanel.setLayout(new FlowLayout());
        //Name Label
        nameLabel.setText("Name: ");
        namePanel.add(nameLabel);
        //Text field
        nameTextField.setColumns(12);
        namePanel.add(nameTextField);
        
        
        //Surname PaNEL
        surnamePanel.setBackground(Color.green);
        surnamePanel.setBounds(0, 0, 300, 30);
        //surnamePanel.setLayout(new FlowLayout());
        //Surname Label
        surnameLabel.setText("Surname: ");
        surnamePanel.add(surnameLabel);
        //surname Text field
        surnameTextField.setColumns(12);
        surnamePanel.add(surnameTextField);
        
        
        //ID number  panel
        IdNumPanel.setBackground(Color.black);
        IdNumPanel.setBounds(0, 0, 300, 30);
        IdNumPanel.setSize(300, 30);
        IdNumPanel.setLayout(new FlowLayout());
        //ID Number Label
        IdNumLabel.setText("ID NUMBER : ");
        IdNumPanel.add(IdNumLabel);
        //Text field
        IdNumTextField.setColumns(12);
        IdNumPanel.add(IdNumTextField);
        
        //age number panel
        agePanel.setBackground(Color.MAGENTA);
        agePanel.setBounds(0, 0, 300, 30);
        agePanel.setSize(300, 30);
        agePanel.setLayout(new FlowLayout());
        // AGE Label
        ageLabel.setText("Age: ");
        agePanel.add(ageLabel);
        //AGE text area
        ageTextField.setColumns(5);
        agePanel.add(ageTextField);
        
        
        registerPanel.add(namePanel);
        registerPanel.add(surnamePanel);
        registerPanel.add(IdNumPanel);
        registerPanel.add(agePanel);
        registerPanel.setBackground(Color.gray);
        registerPanel.setBounds(100, 15, 300, 300);
        
        add(registerPanel);
        
        //Button panel
        buttonPanel.setBackground(Color.cyan);
        buttonPanel.setBounds(100, 315, 300, 50);
        buttonPanel.setLayout(new FlowLayout());
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
        
        add(buttonPanel);
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == clearButton){
            JOptionPane.showMessageDialog(this, clearButton);
        }else if(e.getSource() == submitButton){
        }
    }
    public static void main(String[] args) {
        frame f = new frame();
        
    }
    
}
