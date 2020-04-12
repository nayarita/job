package com.tecnisys;


import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        //Calculadora calculadora = new Calculadora();
        JFrame frame = new JFrame("Calculadora de Horas");
        frame.setContentPane(new Calculadora().calculadoraTela);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(930, 680);
        frame.setLocationRelativeTo(null);

//        addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent we) {
//                System.exit(0);
//            }
//        });
        //frame.dispose();

    }

    public static class Calculadora extends JPanel {
        private JPanel calculadoraTela;
        private JComboBox comboMeses;
        private JButton gerarCalc;
        private JButton mostrarFunc;
        private JTextField salValor;
        private JLabel salario;
        private JComboBox comboAno;
        private JPanel fundo;

        public Calculadora(){

            calculadoraTela = new JPanel(){
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.drawImage(imagemFundo(),0, 0, 890, 480, null);
                }
            };
            mostrarFunc.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFrame frame = new JFrame("Funcionários");
                    frame.setContentPane(new Funcionarios().funcPainel);
                    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame.setSize(680, 200);
                }
            });

            gerarCalc.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFrame frame = new JFrame("Cálculo_Resultado");
                    frame.setContentPane(new Calculo().calcPainel);
                    //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame.setSize(720, 250);
                }
            });

            salValor.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    super.keyTyped(e);
                    long valor;
                    if (salValor.getText().length() != 0){
                        try {
                            valor = Long.parseLong(salValor.getText());
                        }catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(null,"Coloque somente números!!");
                           salValor.grabFocus();
                        }
                    }
                }

            });

            comboMeses.setModel(new DefaultComboBoxModel(new String[]{"Janeiro", "Fevereiro", "Março", "Abril",
                    "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));

            comboAno.setModel(new DefaultComboBoxModel(new Integer[]{Integer.valueOf("2020"),Integer.valueOf("2021"),
                    Integer.valueOf("2022"), Integer.valueOf("2023"), Integer.valueOf("2024")}));

            calculadoraTela.add(mostrarFunc);
            calculadoraTela.add(gerarCalc);
            calculadoraTela.add(salValor);
            calculadoraTela.add(comboMeses);
            calculadoraTela.add(comboAno);
        }


        private Image imagemFundo(){
            Image imagem = null;
            try{
                imagem = ImageIO.read(new File("unnamed.gif"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return imagem;
        }

    }
}

/*
    - colocar o jtxtfld para aceitar somente números;
    - preparar a tela de cálculo para retornar dados somente (calendário, dados do func, valor do cálculo);
    - preparar a tela de insert (jframe separado), edit, remove usuários;
    - colocar a imagem no fundo da tela principal
    - colocar o texto "transparente" no jtxtfld
    - colocar no calendário os feriados em vermelho
 */