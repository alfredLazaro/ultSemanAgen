package vista;

import metodosAgen.Administrador;
import modelo.XMLAdministradores;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Admin extends JFrame implements ActionListener {

    JPanel panel = new JPanel();
    public static String user = "";
    String pass = "";
    JTextField cajaTxtUsuar;
    JTextField cajaTxtContra;

    public Admin() {
        setTitle("Ingreso de Administrador");
        setBounds(500, 200, 1080, 800);
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(32, 112, 193));
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarCajasDeTexto();
        colocarBotones();
        colocarEtiqueta();
        colocarAreaDeTexto();
    }

    private void colocarEtiqueta() {
        JLabel etiqueta = new JLabel("AGENCIA DE VIAJES", SwingConstants.LEFT);//crea la etiqueta
        panel.add(etiqueta);
        etiqueta.setBounds(10, 0, 500, 50);
        etiqueta.setForeground(Color.white);
        etiqueta.setFont(new Font("arial", Font.BOLD, 30));
    }

    private void colocarPanel() {
        panel.setBackground(new Color(32, 112, 193));
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void colocarCajasDeTexto() {
        //usuario
        cajaTxtUsuar = new JTextField();
        cajaTxtUsuar.setBounds(450, 240, 200, 50);
        cajaTxtUsuar.setText("Usuario");
        panel.add(cajaTxtUsuar);
        //contrasenia
        cajaTxtContra = new JTextField();
        cajaTxtContra.setBounds(450, 290, 200, 50);
        cajaTxtContra.setText("Contrasenia");
        panel.add(cajaTxtContra);
    }

    private void colocarBotones() {
        //boton 1
        JButton boton1 = new JButton("Ingresar");
        boton1.setBounds(500, 500, 100, 50);
        boton1.setEnabled(true);
        boton1.addActionListener(this);
        panel.add(boton1);
        boton1.setForeground(new Color(102, 166, 252));
        boton1.setFont(new Font("cooper black", 2, 15));
    }

    private void colocarAreaDeTexto() {
        JTextArea contactanos = new JTextArea();
        contactanos.setBounds(20, 610, 300, 300);
        contactanos.setBackground(null);
        contactanos.setForeground(Color.white);
        contactanos.setText("Contáctanos: \nAv. Ayacucho entre Colombia y Ecuador \n+591 62615493 \n4 4446666 \n Cochabamba-Bolivia");
        panel.add(contactanos);
    }

    public void actionPerformed(ActionEvent e) {
        FuncionesAdministrador v1 = new FuncionesAdministrador();
        v1.setVisible(true);
        user = cajaTxtUsuar.getText().trim();
        pass = cajaTxtContra.getText().trim();

        if (!user.equals("") || !pass.equals("")) {
            try {
                ArrayList<Administrador> admis = XMLAdministradores.listaAdmins();
                boolean encontrado = false;
                for (int i = 0; i < admis.size() && !encontrado; i++) {
                    if (admis.get(i).getNombreCuenta().equals(user) && admis.get(i).getContrasenia().equals(pass)) {
                        encontrado = true;
                    }
                }
                if (encontrado==true) {
                    FuncionesAdministrador ventana = new FuncionesAdministrador();
                    ventana.setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Administrador no registrado.");
                    cajaTxtUsuar.setText("");
                    cajaTxtContra.setText("");
                }
            } catch (Exception evt) {
                System.err.print("Error en el boton Ingresar" + evt);
                JOptionPane.showMessageDialog(null, "Error al iniciar cesion, contacte con el servicio tecnico");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
    }

    public String getUsuario() {
        String usu = "";
        usu = cajaTxtUsuar.getText();
        return usu;
    }

    public String getContrasena() {
        String contra = "";
        contra = cajaTxtContra.getText();
        return contra;
    }
}
