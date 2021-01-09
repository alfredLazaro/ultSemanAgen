package vista.lugaresDespripcion;

import vista.ListaDePaquetes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LugaresSantaCruz extends JFrame implements ActionListener{
    JPanel panel = new JPanel();
    JComboBox lista;
    public LugaresSantaCruz() {
        setTitle("Lugares Turisticos");
        setBounds(500, 200, 1080, 800);
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(32, 112, 193));
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiqueta();
        colocarListaDesplegable();
        colocarAreaDeTexto();
        colocarBotones();
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
    }
    private void colocarListaDesplegable() {
        String[] opciones = {"La Paz", "Cochabamba", "Santa Cruz", "Oruro", "Potosí", "Chuquisaca", "Tarija", "Beni", "Pando"};
        lista = new JComboBox(opciones);
        lista.setBounds(430, 100, 200, 30);
        lista.setSelectedItem("Santa Cruz");
        panel.add(lista);
        lista.addActionListener(this);
        }
            public void actionPerformed(ActionEvent e) {
                String elemento = (String) lista.getSelectedItem();
                if (elemento.equals("Oruro") == true) {
                    LugaresOruro ventana = new LugaresOruro();
                    this.setVisible(false);
                    ventana.setVisible(true);
                    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                if (elemento.equals("Potosí") == true) {
                    LugaresPotosi ventana = new LugaresPotosi();
                    this.setVisible(false);
                    ventana.setVisible(true);
                    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                if (elemento.equals("Chuquisaca") == true) {
                    LugaresChuquisaca ventana = new LugaresChuquisaca();
                    this.setVisible(false);
                    ventana.setVisible(true);
                    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                if (elemento.equals("Tarija") == true) {
                    LugaresTarija ventana = new LugaresTarija();
                    this.setVisible(false);
                    ventana.setVisible(true);
                    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                if (elemento.equals("Beni") == true) {
                    LugaresBeni ventana = new LugaresBeni();
                    this.setVisible(false);
                    ventana.setVisible(true);
                    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                if (elemento.equals("Cochabamba") == true) {
                    LugaresCochabamba ventana = new LugaresCochabamba();
                    this.setVisible(false);
                    ventana.setVisible(true);
                    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                if (elemento.equals("La Paz") == true) {
                    LugaresLaPaz ventana = new LugaresLaPaz();
                    this.setVisible(false);
                    ventana.setVisible(true);
                    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                if (elemento.equals("Santa Cruz") == true) {
                    LugaresSantaCruz ventana = new LugaresSantaCruz();
                    this.setVisible(false);
                    ventana.setVisible(true);
                    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                if (elemento.equals("Pando") == true) {
                    LugaresPando ventana = new LugaresPando();
                    this.setVisible(false);
                    ventana.setVisible(true);
                    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }

    private void colocarAreaDeTexto() {
        JTextArea contactanos = new JTextArea();
        contactanos.setBounds(20, 610, 300, 300);
        contactanos.setBackground(null);
        contactanos.setForeground(Color.white);
        contactanos.setText("Contáctanos: \nAv. Ayacucho entre Colombia y Ecuador \n+591 62615493 \n4 4446666 \n Cochabamba-Bolivia");
        panel.add(contactanos);
        //descricion cristo
        JTextArea descripcion = new JTextArea();
        descripcion.setBounds(320, 180, 180, 90);
        descripcion.setBackground(new Color(11, 93, 157));
        descripcion.setForeground(Color.white);
        descripcion.setText("Conocida como la pequeña \nSuiza, samaipata esta a \nsolo 2 horas de la ciudad de \nSanta Cruz");
        panel.add(descripcion);
        //descripcion parque
        JTextArea descripcion2 = new JTextArea();
        descripcion2.setBounds(800, 180, 180, 90);
        descripcion2.setBackground(new Color(11, 93, 157));
        descripcion2.setForeground(Color.white);
        descripcion2.setText("El Biocentro Güembe alberga \nmiles de especies de flora \ny fauna, junto con su resort es \nideal contra el estres");
        panel.add(descripcion2);
        //descripcion catedral
        JTextArea descripcion3 = new JTextArea();
        descripcion3.setBounds(320, 390, 180, 90);
        descripcion3.setBackground(new Color(11, 93, 157));
        descripcion3.setForeground(Color.white);
        descripcion3.setText("Las Misiones de Chiquitos son \nuna de las pocas en el mundo que \nsiguen en pie a mas de \n300 años de su fundacion");
        panel.add(descripcion3);
        //descripcion
        JTextArea descripcion4 = new JTextArea();
        descripcion4.setBounds(800, 390, 180, 90);
        descripcion4.setBackground(new Color(11, 93, 157));
        descripcion4.setForeground(Color.white);
        descripcion4.setText("La ciudad de Santa Cruz de \n la Sierra es la capital \neconomica del pais, ofreciendo \n variedad en cuanto a lo \nurbano");
        panel.add(descripcion4);
    }
    private void colocarBotones(){
        //boton de samaipata
        JButton boton1 = new JButton("Paquetes ");
        boton1.setBounds(320, 280, 180, 50);
        boton1.setEnabled(true);
        boton1.setBackground(new Color(104,205,253));
        boton1.setForeground(Color.black);
        boton1.setFont(new Font("cooper black", 2, 15));
        panel.add(boton1);
        ActionListener ac2 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ListaDePaquetes v2 = new ListaDePaquetes("Santa Cruz");
                v2.setVisible(true);
            }
        };
        boton1.addActionListener(ac2);
        //imagen de samaipata
        JButton boton5 = new JButton();
        boton5.setBounds(540,180,250,150);
        boton5.setEnabled(true);
        ImageIcon icono = new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Santa Cruz/samaipata.jpg"));
        boton5.setIcon(new ImageIcon(icono.getImage().getScaledInstance(300,200,4)));
        panel.add(boton5);
        //evento de la imagen
        ActionListener accion = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                SantaCruzSamaipata v2 = new SantaCruzSamaipata();
                v2.setVisible(true);
            }
        };
        boton5.addActionListener(accion);
        //boton del güembe
        JButton boton2 = new JButton("Paquetes ");
        boton2.setBounds(800, 280, 180, 50);
        boton2.setEnabled(true);
        boton2.setBackground(new Color(104,205,253));
        boton2.setForeground(Color.black);
        boton2.setFont(new Font("cooper black", 2, 15));
        panel.add(boton2);
        ActionListener ac1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ListaDePaquetes v2 = new ListaDePaquetes("Santa Cruz");
                v2.setVisible(true);
            }
        };
        boton2.addActionListener(ac1);
        //imagen del güembe
        JButton boton6 = new JButton();
        boton6.setBounds(60,180,250,150);
        boton6.setEnabled(true);
        ImageIcon icono2 = new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Santa Cruz/guembe.jpg"));
        boton6.setIcon(new ImageIcon(icono2.getImage().getScaledInstance(300,200,4)));
        panel.add(boton6);
        //evento de la imagen
        ActionListener accion1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                SantaCruzGuembe v3 = new SantaCruzGuembe();
                v3.setVisible(true);
            }
        };
        boton6.addActionListener(accion1);
        //boton de chiquitos
        JButton boton3 = new JButton("Paquetes ");
        boton3.setBounds(320, 490, 180, 50);
        boton3.setEnabled(true);
        boton3.setBackground(new Color(104,205,253));
        boton3.setForeground(Color.black);
        boton3.setFont(new Font("cooper black", 2, 15));
        panel.add(boton3);
        ActionListener ac3 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ListaDePaquetes v2 = new ListaDePaquetes("Santa Cruz");
                v2.setVisible(true);
            }
        };
        boton3.addActionListener(ac3);
        //imagen de chiquitos
        JButton boton7 = new JButton();
        boton7.setBounds(60,390,250,150);
        boton7.setEnabled(true);
        ImageIcon icono3 = new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Santa Cruz/chiquitos.jpg"));
        boton7.setIcon(new ImageIcon(icono3.getImage().getScaledInstance(300,200,4)));
        panel.add(boton7);
        //evento de la imagen
        ActionListener accion2 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                SantaCruzChiquitos v4 = new SantaCruzChiquitos();
                v4.setVisible(true);
            }
        };
        boton7.addActionListener(accion2);
        //boton de scz
        JButton boton4 = new JButton("Paquetes ");
        boton4.setBounds(800, 490, 180, 50);
        boton4.setEnabled(true);
        boton4.setBackground(new Color(104,205,253));
        boton4.setForeground(Color.black);
        boton4.setFont(new Font("cooper black", 2, 15));
        panel.add(boton4);
        ActionListener ac4 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ListaDePaquetes v2 = new ListaDePaquetes("Santa Cruz");
                v2.setVisible(true);
            }
        };
        boton4.addActionListener(ac4);
        //imagen de scz
        JButton boton8 = new JButton();
        boton8.setBounds(540,390,250,150);
        boton8.setEnabled(true);
        ImageIcon icono4 = new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Santa Cruz/scz.jpg"));
        boton8.setIcon(new ImageIcon(icono4.getImage().getScaledInstance(300,200,4)));
        panel.add(boton8);
        //evento de la imagen
        ActionListener accion3 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                SantaCruzCiudad v5 = new SantaCruzCiudad();
                v5.setVisible(true);
            }
        };
        boton8.addActionListener(accion3);

    }
}

