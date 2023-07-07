package com.mycompany.pruebafinal;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame implements ActionListener {

    private final JMenuBar menuBarra1;
    private final JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
    private final JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
    private final JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelAPaterno, labelAMaterno,
            labelDepartamento, labelAntiguedad, labelResultado, labelfooter;
    private final JTextField campoNombreTrabajador, campoAPaternoTrabajador, campoAMaternoTrabajador;
    private final JComboBox comboDepartamento, comboAntiguedad;
    private final JScrollPane panelDeslizador1;
    private final JTextArea cuadroTexto1;

    public Principal() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pantalla Principal");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        getContentPane().setBackground(new java.awt.Color(255, 0, 0));

        //----------------------------------------------------------------------
        menuBarra1 = new JMenuBar(); //Barra del Menu
        setJMenuBar(menuBarra1);
        menuBarra1.setBackground(new java.awt.Color(255, 0, 0));

        menuOpciones = new JMenu("Opciones"); //Menu desplegable
        menuOpciones.setForeground(new java.awt.Color(255, 255, 255));
        menuOpciones.setFont(new java.awt.Font("Andale Mono", 1, 14));
        menuBarra1.add(menuOpciones);

        menuColorFondo = new JMenu("Color de fondo"); //Menu desplegable
        menuColorFondo.setForeground(new java.awt.Color(255, 0, 0));
        menuColorFondo.setFont(new java.awt.Font("Andale Mono", 1, 14));
        menuOpciones.add(menuColorFondo);

        miRojo = new JMenuItem("Rojo"); //Item de Menu - Color de Fondo
        miRojo.setForeground(new java.awt.Color(255, 0, 0));
        miRojo.setFont(new java.awt.Font("Andale Mono", 1, 14));
        menuColorFondo.add(miRojo);
        miRojo.addActionListener(this);

        miNegro = new JMenuItem("Negro"); //Item de Menu - Color de Fondo
        miNegro.setForeground(new java.awt.Color(255, 0, 0));
        miNegro.setFont(new java.awt.Font("Andale Mono", 1, 14));
        menuColorFondo.add(miNegro);
        miNegro.addActionListener(this);

        miMorado = new JMenuItem("Morado"); //Item de Menu - Color de Fondo
        miMorado.setForeground(new java.awt.Color(255, 0, 0));
        miMorado.setFont(new java.awt.Font("Andale Mono", 1, 14));
        menuColorFondo.add(miMorado);
        miMorado.addActionListener(this);

        miNuevo = new JMenuItem("Nuevo"); //Item de Menu - Opciones
        miNuevo.setForeground(new java.awt.Color(255, 0, 0));
        miNuevo.setFont(new java.awt.Font("Andale Mono", 1, 14));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);

        miSalir = new JMenuItem("Salir"); //Item de Menu - Opciones
        miSalir.setForeground(new java.awt.Color(255, 0, 0));
        miSalir.setFont(new java.awt.Font("Andale Mono", 1, 14));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);

        //----------------------------------------------------------------------
        menuCalcular = new JMenu("Calcular"); //Menu desplegable
        menuCalcular.setForeground(new java.awt.Color(255, 255, 255));
        menuCalcular.setFont(new java.awt.Font("Andale Mono", 1, 14));
        menuBarra1.add(menuCalcular);

        miCalculo = new JMenuItem("Vacaciones"); // Item de Menu - Calcular
        miCalculo.setForeground(new java.awt.Color(255, 0, 0));
        miCalculo.setFont(new java.awt.Font("Andale Mono", 1, 14));
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);

        //----------------------------------------------------------------------
        menuAcercaDe = new JMenu("Acerca de"); //Menu desplegable
        menuAcercaDe.setForeground(new java.awt.Color(255, 255, 255));
        menuAcercaDe.setFont(new java.awt.Font("Andale Mono", 1, 14));
        menuBarra1.add(menuAcercaDe);

        miElCreador = new JMenuItem("El creador"); //Item de Menu - Acerca de
        miElCreador.setForeground(new java.awt.Color(255, 0, 0));
        miElCreador.setFont(new java.awt.Font("Andale Mono", 1, 14));
        menuAcercaDe.add(miElCreador);
        miElCreador.addActionListener(this);

        //----------------------------------------------------------------------
        labelLogo = new JLabel(new ImageIcon(getClass().getResource("images/logo-coca.png")));
        labelLogo.setBounds(5, 5, 250, 100);
        add(labelLogo);

        labelBienvenido = new JLabel("Bienvenido");
        labelBienvenido.setBounds(280, 30, 300, 50);
        labelBienvenido.setFont(new java.awt.Font("Andale Mono", 1, 32));
        labelBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        add(labelBienvenido);

        labelTitle = new JLabel("Datos del trabajador para el cálculo de vacaciones");
        labelTitle.setBounds(45, 140, 900, 25);
        labelTitle.setFont(new java.awt.Font("Andale Mono", 0, 24));
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        add(labelTitle);

        labelNombre = new JLabel("Nombre Completo: ");
        labelNombre.setBounds(25, 188, 180, 25);
        labelNombre.setFont(new java.awt.Font("Andale Mono", 1, 12));
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        add(labelNombre);

        labelAPaterno = new JLabel("Apellido Paterno: ");
        labelAPaterno.setBounds(25, 248, 180, 25);
        labelAPaterno.setFont(new java.awt.Font("Andale Mono", 1, 12));
        labelAPaterno.setForeground(new java.awt.Color(255, 255, 255));
        add(labelAPaterno);

        labelAMaterno = new JLabel("Apellido Materno: ");
        labelAMaterno.setBounds(25, 308, 180, 25);
        labelAMaterno.setFont(new java.awt.Font("Andale Mono", 1, 12));
        labelAMaterno.setForeground(new java.awt.Color(255, 255, 255));
        add(labelAMaterno);

        labelDepartamento = new JLabel("Selecciona el Departamento: ");
        labelDepartamento.setBounds(220, 188, 180, 25);
        labelDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 12));
        labelDepartamento.setForeground(new java.awt.Color(255, 255, 255));
        add(labelDepartamento);

        labelAntiguedad = new JLabel("Seleccion la Antigüedad: ");
        labelAntiguedad.setBounds(220, 248, 180, 25);
        labelAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 12));
        labelAntiguedad.setForeground(new java.awt.Color(255, 255, 255));
        add(labelAntiguedad);

        labelResultado = new JLabel("Resultado del Cálculo: ");
        labelResultado.setBounds(220, 307, 180, 25);
        labelResultado.setFont(new java.awt.Font("Andale Mono", 1, 12));
        labelResultado.setForeground(new java.awt.Color(255, 255, 255));
        add(labelResultado);

        labelfooter = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados.");
        labelfooter.setBounds(135, 445, 500, 30);
        labelfooter.setFont(new java.awt.Font("Andale Mono", 1, 12));
        labelfooter.setForeground(new java.awt.Color(255, 255, 255));
        add(labelfooter);

        //----------------------------------------------------------------------
        campoNombreTrabajador = new JTextField();
        campoNombreTrabajador.setBounds(25, 213, 150, 25);
        campoNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 12));
        campoNombreTrabajador.setForeground(new java.awt.Color(255, 0, 0));
        campoNombreTrabajador.setBackground(new java.awt.Color(224, 224, 224));
        add(campoNombreTrabajador);

        campoAPaternoTrabajador = new JTextField();
        campoAPaternoTrabajador.setBounds(25, 273, 150, 25);
        campoAPaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 12));
        campoAPaternoTrabajador.setForeground(new java.awt.Color(255, 0, 0));
        campoAPaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
        add(campoAPaternoTrabajador);

        campoAMaternoTrabajador = new JTextField();
        campoAMaternoTrabajador.setBounds(25, 334, 150, 25);
        campoAMaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 12));
        campoAMaternoTrabajador.setForeground(new java.awt.Color(255, 0, 0));
        campoAMaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
        add(campoAMaternoTrabajador);

        //----------------------------------------------------------------------
        comboDepartamento = new JComboBox();
        comboDepartamento.setBounds(220, 213, 220, 25);
        comboDepartamento.setBackground(new java.awt.Color(224, 224, 224));
        comboDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
        comboDepartamento.setForeground(new java.awt.Color(255, 0, 0));
        add(comboDepartamento);
        comboDepartamento.addItem("");
        comboDepartamento.addItem("Atención al Cliente");
        comboDepartamento.addItem("Departamento de Logística");
        comboDepartamento.addItem("Departamento de Gerencia");

        comboAntiguedad = new JComboBox();
        comboAntiguedad.setBounds(220, 273, 220, 25);
        comboAntiguedad.setBackground(new java.awt.Color(224, 224, 224));
        comboAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
        comboAntiguedad.setForeground(new java.awt.Color(255, 0, 0));
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("1 año de servicio");
        comboAntiguedad.addItem("2 a 6 años de servicio");
        comboAntiguedad.addItem("7 años o más de servicio");

        //----------------------------------------------------------------------
        cuadroTexto1 = new JTextArea();
        cuadroTexto1.setEditable(false);
        cuadroTexto1.setFont(new java.awt.Font("Andale Mono", 1, 11));
        cuadroTexto1.setForeground(new java.awt.Color(255, 0, 0));
        cuadroTexto1.setBackground(new java.awt.Color(224, 224, 224));
        cuadroTexto1.setText("\n    Aquí aparece el resultado del cálculo de las vacaciones.");
        panelDeslizador1 = new JScrollPane(cuadroTexto1);
        panelDeslizador1.setBounds(220, 333, 385, 90);
        add(panelDeslizador1);

        //----------------------------------------------------------------------
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miRojo) {
            getContentPane().setBackground(new java.awt.Color(255, 0, 0));
        }

        if (e.getSource() == miNegro) {
            getContentPane().setBackground(new java.awt.Color(0, 0, 0));
        }

        if (e.getSource() == miMorado) {
            getContentPane().setBackground(new java.awt.Color(51, 0, 51));
        }

        if (e.getSource() == miCalculo) {
            String nombreTrabajador = campoNombreTrabajador.getText();
            String AP = campoAPaternoTrabajador.getText();
            String AM = campoAMaternoTrabajador.getText();
            String Departamento = comboDepartamento.getSelectedItem().toString();
            String Antiguedad = comboAntiguedad.getSelectedItem().toString();

            if (nombreTrabajador.equals("") || AP.equals("") || AM.equals("")
                    || Departamento.equals("") || Antiguedad.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.", "Error: ", ERROR_MESSAGE);
            } else {
                switch (Departamento) {
                    case "Atención al Cliente" -> {
                        switch (Antiguedad) {
                            case "1 año de servicio" -> cuadroTexto1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM
                                    + "\n   quien labora en " + Departamento + " con " + Antiguedad
                                    + "\n   recibe 6 días de vacaciones.");
                            case "2 a 6 años de servicio" -> cuadroTexto1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM
                                    + "\n   quien labora en " + Departamento + " con " + Antiguedad
                                    + "\n   recibe 14 días de vacaciones.");
                            case "7 años o más de servicio" -> cuadroTexto1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM
                                    + "\n   quien labora en " + Departamento + " con " + Antiguedad
                                    + "\n   recibe 20 días de vacaciones.");
                            default -> {
                            }
                        }
                    }
                    case "Departamento de Logística" -> {
                        switch (Antiguedad) {
                            case "1 año de servicio" -> cuadroTexto1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM
                                    + "\n   quien labora en " + Departamento + " con " + Antiguedad
                                    + "\n   recibe 7 días de vacaciones.");
                            case "2 a 6 años de servicio" -> cuadroTexto1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM
                                    + "\n   quien labora en " + Departamento + " con " + Antiguedad
                                    + "\n   recibe 15 días de vacaciones.");
                            case "7 años o más de servicio" -> cuadroTexto1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM
                                    + "\n   quien labora en " + Departamento + " con " + Antiguedad
                                    + "\n   recibe 22 días de vacaciones.");
                            default -> {
                            }
                        }
                    }
                    case "Departamento de Gerencia" -> {
                        switch (Antiguedad) {
                            case "1 año de servicio" -> cuadroTexto1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM
                                    + "\n   quien labora en " + Departamento + " con " + Antiguedad
                                    + "\n   recibe 10 días de vacaciones.");
                            case "2 a 6 años de servicio" -> cuadroTexto1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM
                                    + "\n   quien labora en " + Departamento + " con " + Antiguedad
                                    + "\n   recibe 20 días de vacaciones.");
                            case "7 años o más de servicio" -> cuadroTexto1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM
                                    + "\n   quien labora en " + Departamento + " con " + Antiguedad
                                    + "\n   recibe 30 días de vacaciones.");
                            default -> {
                            }
                        }
                    }
                    default -> {
                    }
                }
            }
        }

        if (e.getSource() == miNuevo) {
            campoNombreTrabajador.setText("");
            campoAPaternoTrabajador.setText("");
            campoAMaternoTrabajador.setText("");
            comboDepartamento.setSelectedIndex(0);
            comboAntiguedad.setSelectedIndex(0);
            cuadroTexto1.setText("\n    Aquí aparece el resultado del cálculo de las vacaciones.");
        }

        if (e.getSource() == miSalir) {
            interfazBienvenida llamada = new interfazBienvenida();

            this.setVisible(false);
            llamada.setBounds(0, 0, 350, 450);
            llamada.setLocationRelativeTo(null);
            llamada.setResizable(false);
            llamada.setVisible(true);
        }

        if (e.getSource() == miElCreador) {
            JOptionPane.showMessageDialog(null,"Desarrollado por Geekipedia de Ernesto" + "\nUsado como practica por Melvin Allende", "Informacion sobre el creador: ", INFORMATION_MESSAGE);
        }
    }
}
