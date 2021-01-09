package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import metodosAgen.Administrador;
import modelo.XMLAdministradores;
import vista.lugaresDespripcion.ChuquisacaCasaLibertad;
import vista.lugaresDespripcion.ChuquisacaVirgerGuadalupe;
import vista.lugaresDespripcion.LugaresCochabamba;

public class Inicio extends JFrame implements ActionListener {
    public static void main(String[] args) {
        Inicio v1 = new Inicio();
        v1.setVisible(true);
    }

    JPanel panel = new JPanel();
    public static String user = "";
    JButton boton1,boton2;

    public Inicio() {
        setTitle("Inicio");
        setBounds(500, 200, 1080, 800);
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(32, 112, 193));
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarBotones();
        colocarEtiqueta();
        colocarAreaDeTexto();
    }

    private void colocarEtiqueta() {
        JLabel etiqueta = new JLabel("Bienvenido!", SwingConstants.LEFT);//crea la etiqueta
        panel.add(etiqueta);
        etiqueta.setBounds(450, 0, 500, 50);
        etiqueta.setForeground(Color.white);
        etiqueta.setFont(new Font("arial", Font.BOLD, 30));
    }

    private void colocarPanel() {
        panel.setBackground(new Color(32, 112, 193));
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void colocarBotones() {
        //boton 1
        boton1 = new JButton("Ingreso Administrador");
        boton1.setBounds(340, 450, 200, 50);
        boton1.setEnabled(true);
        boton1.addActionListener(this);
        panel.add(boton1);
        boton1.setForeground(new Color(102, 166, 252));
        boton1.setFont(new Font("cooper black", 2, 15));
        //boton2
        boton2 = new JButton("Ingreso a Clientes");
        boton2.setBounds(560, 450, 200, 50);
        boton2.setEnabled(true);
        boton2.addActionListener(this);
        panel.add(boton2);
        boton2.setForeground(new Color(102, 166, 252));
        boton2.setFont(new Font("cooper black", 2, 15));
    }

    private void colocarAreaDeTexto() {
        JTextArea info = new JTextArea();
        info.setBounds(390, 210, 350, 300);
        info.setBackground(null);
        info.setForeground(Color.white);
        info.setFont(new Font("Arial",0,20));
        info.setText("En Nombre del grupo BlackCode le " +
                "\ndamos la bienvenida nuestro proyecto! " +
                "\nsi tiene error por favor contactenos" +
                "\nEsperemos que sea de su agrado");
        panel.add(info);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== boton1 ){
            Admin nuevo = new Admin();
            nuevo.setVisible(true);
            nuevo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        if (e.getSource()== boton2 ){
            LugaresCochabamba nuevo = new LugaresCochabamba();
            nuevo.setVisible(true);
            nuevo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}
