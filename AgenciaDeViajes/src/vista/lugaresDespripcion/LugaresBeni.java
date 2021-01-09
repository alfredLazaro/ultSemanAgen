/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.lugaresDespripcion;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

/**
 *
 * @author Alan
 */
public class LugaresBeni extends JFrame implements ActionListener{
    private JPanel panel = new JPanel();
    private JButton foto1,foto2,foto3,foto4;
    private JComboBox lista;
    public LugaresBeni() {
        setTitle("Lugares Turisticos");
        setBounds(500, 200, 1080, 800);
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(32, 112, 193));
        iniciarComponentes();
    }
    private void iniciarComponentes() {
        colocarPaneles();
        colocarEtiqueta();
        colocarListaDesplegable();
        colocarAreaDeTexto();
        colocarBotones();
    }
    
    private void colocarBotones(){
        Button boton1 = new Button("paquetes");
        boton1.setBounds(380,290,100,40);
        panel.add(boton1);
        
        Button boton2 = new Button("paquetes");
        boton2.setBounds(380,490,100,40);
        panel.add(boton2);
        
        Button boton3 = new Button("paquetes");
        boton3.setBounds(875,290,100,40);
        panel.add(boton3);
        
        Button boton4 = new Button("paquetes");
        boton4.setBounds(875,490,100,40);
        panel.add(boton4);
    }
    
    private void colocarPaneles() {
        panel.setBackground(new Color(32, 112, 193));
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
    }
    private void colocarEtiqueta() {
        JLabel etiqueta = new JLabel("AGENCIA DE VIAJES", SwingConstants.LEFT);//crea la etiqueta
        panel.add(etiqueta);
        etiqueta.setBounds(10, 0, 500, 50);
        etiqueta.setForeground(Color.white);
        etiqueta.setFont(new Font("arial", Font.BOLD, 30));
        
        //imagen1
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Beni/laguna Suares/laguna-suarez.jpg"));
        foto1 = new JButton();
        foto1.setBounds(50,180,250,150);
        foto1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(300,200,4)));
        foto1.addActionListener(this);
        panel.add(foto1);
        //imagen2
        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Beni/En los alrededores loma suares/20988956_340391276420779_537883119035747641_o.jpg"));
        foto2 = new JButton();
        foto2.setBounds(550,180,250,150);
        foto2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(300,200,4)));
        foto2.addActionListener(this);
        panel.add(foto2);
       
        //imagen3
        ImageIcon imagen3 = new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Beni/Riberalta/36641482_10156001175918705_7239783761049550848_n.jpg"));
        foto3 = new JButton();
        foto3.setBounds(50,380,250,150);
        foto3.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(300,200,4)));
        foto3.addActionListener(this);
        panel.add(foto3);
        
        //imagen4
        ImageIcon imagen4 = new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Beni/Rurrenabaque/rurrenabaque-01.jpg"));
        foto4 = new JButton();
        foto4.setBounds(550,380,250,150);
        foto4.setIcon(new ImageIcon(imagen4.getImage().getScaledInstance(300,200,4)));
        foto4.addActionListener(this);
        panel.add(foto4);
    }
    private void colocarListaDesplegable(){
        String[] opciones = {"La Paz","Cochabamba","Santa Cruz","Oruro","Potosí","Chuquisaca","Tarija","Beni","Pando"};
        lista = new JComboBox(opciones);
        lista.setBounds(430,100,200,30);
        lista.addActionListener(this);
        panel.add(lista);
       
    }
    private void colocarAreaDeTexto() {
        JTextArea contactanos = new JTextArea();
        contactanos.setBounds(20, 610, 300, 300);
        contactanos.setBackground(null);
        contactanos.setForeground(Color.white);
        contactanos.setText("Contáctanos: \nAv. Ayacucho entre Colombia y Ecuador \n+591 62615493 \n4 4446666 \n Cochabamba-Bolivia");
        panel.add(contactanos);
        //Descripcion
        JTextArea descripcion1 = new JTextArea("Laguna Suares"
                + "\nLa laguna Suárez es una laguna artificial "
                + "\namazónica de agua dulce, ubicada a 5 km de "
                + "\nla ciudad de Trinidad, en la provincia"
                + "\n de Cercado del departamento del Beni");
        descripcion1.setBounds(320, 180, 220, 100);
        descripcion1.setBackground(null);
        descripcion1.setForeground(Color.white);
        panel.add(descripcion1);
        
        JTextArea descripcion2 = new JTextArea("Loma Suares"
                + "\nLoma Suárez es una localidad de Bolivia,"
                + "\n perteneciente al municipio de Trinidad "
                + "\nen la provincia de Cercado en el Departamento"
                + "\n del Beni.");
        descripcion2.setBounds(320, 385, 220, 100);
        descripcion2.setBackground(null);
        descripcion2.setForeground(Color.white);
        panel.add(descripcion2);
        
        JTextArea descripcion3 = new JTextArea("Riberalta"
                + "\nRiberalta es una ciudad en la Amazonia boliviana."
                + "\nEstá ubicada en la orilla sureste,"
                + "\n donde convergen los ríos de Madre de"
                + "\n Dios y Beni.");
        descripcion3.setBounds(815, 180, 220, 100);
        descripcion3.setBackground(null);
        descripcion3.setForeground(Color.white);
        panel.add(descripcion3);
        
        JTextArea descripcion4 = new JTextArea("Rurrenabaque"
                + "\nEl pequeño pueblo de Rurrenabaque es"
                + "\n la puerta de entrada a una parte "
                + "\nexuberante y emocionantemente hermosa"
                + "\n del noroeste de Bolivia");
        descripcion4.setBounds(815, 385, 220, 100);
        descripcion4.setBackground(null);
        descripcion4.setForeground(Color.white);
        panel.add(descripcion4);
    }
    
    public void actionPerformed (ActionEvent e){
            String elemento = (String)lista.getSelectedItem();
            if (elemento.equals("Oruro") == true){
                LugaresOruro ventana = new LugaresOruro();
                this.setVisible(false);
                ventana.setVisible(true);
            }
            if (elemento.equals("Potosí") == true){
                LugaresPotosi ventana = new LugaresPotosi();
                this.setVisible(false);
                ventana.setVisible(true);
            }
            if (elemento.equals("Chuquisaca") == true){
                LugaresChuquisaca ventana = new LugaresChuquisaca();
                this.setVisible(false);
                ventana.setVisible(true);
            }
            if (elemento.equals("Tarija") == true){
                LugaresTarija ventana = new LugaresTarija();
                this.setVisible(false);
                ventana.setVisible(true);
            }
            if (elemento.equals("Beni") == true){
                LugaresBeni ventana = new LugaresBeni();
                this.setVisible(false);
                ventana.setVisible(true);
            }
            
            if (e.getSource()== foto1 ){
                BeniLagunaSuares nuevo = new BeniLagunaSuares();
                nuevo.setVisible(true);
            }
            if (e.getSource()== foto2 ){
                BeniRiberalta nuevo = new BeniRiberalta();
                nuevo.setVisible(true);
            }
            if (e.getSource()== foto3 ){
                BeniLomaSuares nuevo = new BeniLomaSuares();
                nuevo.setVisible(true);
            }
            if (e.getSource()== foto4 ){
                BeniRurrenabaque nuevo = new BeniRurrenabaque();
                nuevo.setVisible(true);
            }
       }
    
}
