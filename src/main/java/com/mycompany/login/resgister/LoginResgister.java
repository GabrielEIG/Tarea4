package com.mycompany.login.resgister;

import modelo.vista.LoginForm;
import modelo.CRUD.Crud; // Importa la clase MyConnection

import javax.swing.*;

public class LoginResgister {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                
                
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Llamar a getConnection() para obtener la conexión a la base de datos
                
        JFrame frame = new JFrame("Inicio de Sesión");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear una instancia del formulario de inicio de sesión
        LoginForm loginForm = new LoginForm();

        // Establecer el formulario de inicio de sesión como el contenido principal de la ventana
        frame.getContentPane().add(loginForm);

        // Ajustar el tamaño de la ventana para que se adapte al contenido
        frame.pack();

        // Centrar la ventana en la pantalla
        frame.setLocationRelativeTo(null);

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
