package com.mycompany.pruebafinal;

public class pruebaFinalMain {

    public static void main(String[] args) {
        interfazBienvenida llamada = new interfazBienvenida();
        
        llamada.setBounds(0,0,350,450);
        llamada.setLocationRelativeTo(null);
        llamada.setResizable(false);
        llamada.setVisible(true);
    }
}
