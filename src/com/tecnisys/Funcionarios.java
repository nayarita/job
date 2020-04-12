package com.tecnisys;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Funcionarios{
    public JPanel funcPainel;
    private JButton adicionar;

    public Funcionarios() {
        funcPainel.setBackground(Color.LIGHT_GRAY);
        funcPainel.setSize(500,200);
         adicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Adicionar Funcionário");
                frame.setContentPane(new FuncForm().funcForm);
                //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setSize(500, 400);
            }
        });
    }

}
