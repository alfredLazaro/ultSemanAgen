/*
 *
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Alan
 */
public class FuncionesAdministrador extends JFrame implements ActionListener{
    private JPanel panel = new JPanel();
    private JButton boton1,boton2,boton3,boton4;
    RegistrarCliente registrar;
    ReservarPaquete reservar;
    SoloPasajes pasajes;
    CancelarReserva cancelar;
    JTabbedPane pestañas;

    
    public FuncionesAdministrador(){
        setTitle("Ingreso de Administrador");
        setBounds(500,200,1080,800);
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(32,112,193));
        iniciarComponentes();
        this.setVisible(true);
    }
    private void iniciarComponentes(){
        colocarPanel();
        colocarBotones();
        colocarEtiqueta();
        colocarAreaDeTexto();
        pestañas = new JTabbedPane();
        registrar = new RegistrarCliente();
        reservar = new ReservarPaquete();
        pasajes = new SoloPasajes();
        cancelar = new CancelarReserva();

        pestañas.add("Registrar Cliente",registrar);
        pestañas.add("Reservar Paquete",reservar);
        pestañas.add("Solo Pasajes",pasajes);
        pestañas.add("Cancelar Reserva",cancelar);
        add(pestañas);
    }
    private void colocarEtiqueta(){
        JLabel etiqueta = new JLabel("AGENCIA DE VIAJES", SwingConstants.LEFT);//crea la etiqueta
        panel.add(etiqueta);
        etiqueta.setBounds(10,0,500,50);
        etiqueta.setForeground(Color.white);
        etiqueta.setFont(new Font("arial",Font.BOLD,30));
    }
    private void colocarPanel(){
        panel.setBackground(new Color(32,112,193));
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    private void colocarBotones(){
        //boton 1
        boton1 = new JButton("Ingresar cliente nuevo");
        boton1.setBounds(330,200,200,50);
        boton1.setEnabled(true);
        boton1.addActionListener(this);
        panel.add(boton1);
        boton1.setForeground(new Color(102,166,252));
        boton1.setFont(new Font("cooper black",2, 15));
        //boton 2
        boton2 = new JButton("Registrar Reserva");
        boton2.setBounds(580,200,200,50);
        boton2.setEnabled(true);
        boton2.addActionListener(this);
        panel.add(boton2);
        boton2.setForeground(new Color(102,166,252));
        boton2.setFont(new Font("cooper black",2, 15));
        
        boton3 = new JButton("Cancelar Reserva");
        boton3.setBounds(330,400,200,50);
        boton3.setEnabled(true);
        boton3.addActionListener(this);
        panel.add(boton3);
        boton3.setForeground(new Color(102,166,252));
        boton3.setFont(new Font("cooper black",2, 15)); 
        
        boton4 = new JButton("Reservar Pasaje");
        boton4.setBounds(580,400,200,50);
        boton4.setEnabled(true);
        boton4.addActionListener(this);
        panel.add(boton4);
        boton4.setForeground(new Color(102,166,252));
        boton4.setFont(new Font("cooper black",2, 15));
    }
    private void colocarAreaDeTexto(){
        JTextArea contactanos = new JTextArea();
        contactanos.setBounds(20,610,300,300);
        contactanos.setBackground(null);
        contactanos.setForeground(Color.white);
        contactanos.setText("Contáctanos: \nAv. Ayacucho entre Colombia y Ecuador \n+591 62615493 \n4 4446666 \n Cochabamba-Bolivia");
        panel.add(contactanos);
    }
    
    public void actionPerformed (ActionEvent e){
        if (e.getSource() == boton1){
            RegistrarCliente nuevo = new RegistrarCliente();
            nuevo.setVisible(true);
            //nuevo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        if (e.getSource() == boton2){
            ReservarPaquete nuevo = new ReservarPaquete();
            nuevo.setVisible(true);
            //nuevo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        if (e.getSource() == boton3){
            CancelarReserva nuevo = new CancelarReserva();
            nuevo.setVisible(true);
            //nuevo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        if (e.getSource() == boton4){
            SoloPasajes nuevo = new SoloPasajes();
            nuevo.setVisible(true);
            //nuevo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}
