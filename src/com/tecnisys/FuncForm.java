package com.tecnisys;

import javax.swing.*;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static java.awt.Color.lightGray;

public class FuncForm {
    private JTextField profField;
    public JPanel funcForm;
    private JLabel profissional;
    private JLabel matricula;
    private JLabel hadcnoturno;
    private JLabel abatimento;
    private JLabel acrescentar;
    private JLabel saldo;
    private JLabel hExtras;
    private JLabel data;
    private JButton enviar;
    private JTextField matricField;
    private JTextField hadcnField;
    private JTextField abatiField;
    private JTextField acresField;
    private JTextField saldoField;
    private JTextField hextraField;
    private JTextField dataField;

    public FuncForm() {
        funcForm.setBackground(lightGray);

        profField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                    matricField.setEnabled(true);
                    matricField.grabFocus();

            }
        });
    }
}
