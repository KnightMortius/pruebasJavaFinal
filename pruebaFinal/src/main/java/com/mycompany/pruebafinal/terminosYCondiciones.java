package com.mycompany.pruebafinal;

import java.awt.Color;
import java.awt.Font;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class terminosYCondiciones extends JFrame implements ActionListener, ChangeListener {

    private final JLabel texto1, texto2;
    private final JTextArea cuadroTexto1;
    private final JCheckBox checkbox1;
    private final JButton boton1, boton2;
    private final JScrollPane panelbarra1;

    public terminosYCondiciones() {
        setLayout(null);
        setTitle("Licencia de uso");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        texto1 = new JLabel("TÉRMINOS Y CONDICIONES");
        texto1.setBounds(215, 5, 200, 30);
        texto1.setForeground(new Color(0, 0, 0));
        texto1.setFont(new Font("Andale Mono", 1, 14));
        add(texto1);

        cuadroTexto1 = new JTextArea();
        cuadroTexto1.setFont(new Font("Andale Mono", 0, 9));
        cuadroTexto1.setText("\n\n          TÉRMINOS Y CONDICIONES"
                + "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ERNESTO."
                + "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS."
                + "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE."
                + "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE"
                + "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED"
                + "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)"
                + "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE."
                + "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE"
                + "\n          http://www.youtube.com/ernestoperezm");
        cuadroTexto1.setEditable(false);
        panelbarra1 = new JScrollPane(cuadroTexto1);
        panelbarra1.setBounds(10, 40, 575, 200);
        add(panelbarra1);
       
                
        checkbox1 = new JCheckBox("Yo " + interfazBienvenida.texto +" Acepto");
        checkbox1.setBounds(10, 250, 300, 30);
        checkbox1.addChangeListener(this);
        add(checkbox1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10, 290, 100, 30);
        boton1.setEnabled(false);
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("No Acepto");
        boton2.setBounds(120, 290, 100, 30);
        boton2.addActionListener(this);
        add(boton2);

        texto2 = new JLabel(new ImageIcon(getClass().getResource("images/coca-cola.png")));
        texto2.setBounds(315, 135, 300, 300);
        add(texto2);
    }

    public void stateChanged(ChangeEvent e) {
        if (checkbox1.isSelected() == true) {
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        } else {
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            Principal llamada2 = new Principal();

            this.setVisible(false);
            llamada2.setBounds(0, 0, 640, 535);
            llamada2.setLocationRelativeTo(null);
            llamada2.setResizable(false);
            llamada2.setVisible(true);
        }

        if (e.getSource() == boton2) {
            interfazBienvenida llamada = new interfazBienvenida();

            this.setVisible(false);
            llamada.setBounds(0, 0, 350, 450);
            llamada.setLocationRelativeTo(null);
            llamada.setResizable(false);
            llamada.setVisible(true);
        }
    }
}
