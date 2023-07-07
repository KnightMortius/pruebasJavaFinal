package com.mycompany.pruebafinal;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfazBienvenida extends JFrame implements ActionListener {

    private final JLabel texto1, texto2, texto3, texto4;
    public JTextField campoTexto1;
    private final JButton ingreso;

    public static String texto = "";

    public interfazBienvenida() {
        setLayout(null);
        setTitle("Bienvenida");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(255, 0, 0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        ImageIcon imagen = new ImageIcon(getClass().getResource("images/logo-coca.png"));

        texto1 = new JLabel(imagen);
        texto1.setBounds(25, 15, 300, 150);
        add(texto1);

        texto2 = new JLabel("Sistema de Control Vacacional");
        texto2.setBounds(35, 135, 300, 30);
        texto2.setForeground(new Color(255, 255, 255));
        texto2.setFont(new Font("Andale Mono", 3, 18));
        add(texto2);

        texto3 = new JLabel("Ingrese su nombre: ");
        texto3.setBounds(45, 212, 200, 30);
        texto3.setForeground(new Color(255, 255, 255));
        texto3.setFont(new Font("Andale Mono", 1, 12));
        add(texto3);

        texto4 = new JLabel("©2017 The Coca-Cola Company");
        texto4.setBounds(85, 375, 300, 30);
        texto4.setForeground(new Color(255, 255, 255));
        texto4.setFont(new Font("Andale Mono", 1, 12));
        add(texto4);

        campoTexto1 = new JTextField();
        campoTexto1.setBounds(45, 240, 255, 25);
        campoTexto1.setBackground(new Color(224, 224, 224));
        campoTexto1.setForeground(new Color(255, 0, 0));
        campoTexto1.setFont(new Font("Andale Mono", 1, 14));
        add(campoTexto1);

        ingreso = new JButton("Ingresar");
        ingreso.setBounds(125, 280, 100, 30);
        ingreso.setBackground(new Color(255, 255, 255));
        ingreso.setForeground(new Color(255, 0, 0));
        ingreso.setFont(new Font("Andale Mono", 1, 14));
        ingreso.addActionListener(this);
        add(ingreso);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ingreso) {
            texto = campoTexto1.getText().trim();

            if (texto.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.", "Error: ", ERROR_MESSAGE);
            } else {
                terminosYCondiciones mensajero = new terminosYCondiciones();

                this.setVisible(false);
                mensajero.setBounds(0, 0, 605, 370);
                mensajero.setLocationRelativeTo(null);
                mensajero.setResizable(false);
                mensajero.setVisible(true);
            }
        }
    }
}
