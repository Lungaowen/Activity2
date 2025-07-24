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
        
        registerPanel.add(namePanel);
        registerPanel.add(surnamePanel);
        registerPanel.add(IdNumPanel);
        registerPanel.setBackground(Color.gray);
        registerPanel.setBounds(100, 15, 300, 300);
        
        add(registerPanel);
        
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void main(String[] args) {
        frame f = new frame();
        
    }
    
}
