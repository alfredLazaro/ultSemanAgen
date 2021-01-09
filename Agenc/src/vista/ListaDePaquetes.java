package vista;

import metodosAgen.*;
import modelo.XMLPaquetes;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import modelo.XMLDepartamentos;

public class ListaDePaquetes extends JFrame {
    public static void main(String[] args) {
        ListaDePaquetes v1 = new ListaDePaquetes("Cristo de la Concordia");
        v1.setVisible(true);
        v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    private JPanel panelList;
    private String lugar;
    JScrollPane vertical;

    public ListaDePaquetes(String lugar) {
        setTitle("Lista de Paquetes Turisticos");
        setBounds(500, 200, 1080, 800);
        setLocationRelativeTo(null);
        this.lugar = lugar;
        this.getContentPane().setBackground(new Color(32, 112, 193));
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarEtiqueta();
        //colocarListaDesplegable();
        colocarCajaDeTexto();
        colocarBotones();
    }

    private void colocarPaneles() {
        getContentPane().setLayout(null);
        //panel 1
        panel.setBackground(new Color(32, 112, 193));
        panel.setLayout(null);
        panel.setBounds(540,80,540,730); //
        //panel.setBorder(BorderFactory.createLineBorder(Color.white,3));
        getContentPane().add(panel);
        //panel 2 //elementos de paquete
        vertical = new JScrollPane();
        vertical.setBounds(10,80,550,630);
        vertical.setViewportView(panel2);
        panel2.setBackground(new Color(32, 112, 193));
        panel2.setLayout(new BoxLayout(panel2,BoxLayout.Y_AXIS));
        getContentPane().add(vertical);
        panel2.setBounds(10,80,540,700);
        //panel2.setBorder(BorderFactory.createLineBorder(Color.white,3));
        panel2.setPreferredSize(new Dimension(540,730));
        
        //panel 3
        panel3.setBackground(new Color(32, 112, 193));
        panel3.setLayout(null);
        getContentPane().add(panel3);
        panel3.setBounds(0,0,1080,80);
        //panel3.setBorder(BorderFactory.createLineBorder(Color.white,3));

    }

    private void colocarEtiqueta() {
        HashMap<String,ArrayList<PaqueteTuristico>> paquetes = XMLDepartamentos.HashPaquetes1Lug(lugar);
        ArrayList<PaqueteTuristico> paqueteLugar = paquetes.get(lugar);
        JLabel etiqueta0=null;
        JLabel etiqueta2=null;
        if(paqueteLugar!=null){
            int nroPxS=30;
            int separacion=50;
        for (int i = 0; i < paqueteLugar.size(); i++) {
            separacion=120*i+50;
            PaqueteTuristico actual = paqueteLugar.get(i);
            //paqueteLugar.add(actual);
            etiqueta0 = new JLabel("Cod. de paquete..................."+actual.getNroIde());
            System.out.println("nroIde "+actual.getNroIde());
            etiqueta0.setBounds(50, 0+separacion*i, 300, 100);
            panel2.add(etiqueta0);
            //tipo de transporte
            etiqueta2 = new JLabel("Tipo de transporte................"+actual.getTransporte().getTipoTransporte());
            etiqueta2.setBounds(50, 30+separacion*i, 300, 100);
            panel2.add(etiqueta2);
            
            //Hotel
            JLabel etiqueta3 = new JLabel("Hotel................"+actual.getHotel().getNombre());
            etiqueta3.setBounds(50, 60+separacion*i, 2300, 100);
            panel2.add(etiqueta3);
            //restaurante
            JLabel etiqueta4 = new JLabel("Restaurante................"+actual.getRestaurant().getNombreRest());
            etiqueta4.setBounds(50, 90+separacion*i, 2300, 100);
            panel2.add(etiqueta4);
            //menu
            panelList=new JPanel();
            panelList.setBackground(new Color(32, 112, 193));
            JLabel etiqueta5 = new JLabel("Menú................");
            etiqueta5.setBounds(50, 120+separacion*i, 2300, 100);
            panelList.add(etiqueta5);
            colocarListaDesplegable(actual.getRestaurant().getMenu());
            panel2.add(panelList);
            
            //precio
            JLabel etiqueta6 = new JLabel("Precio............. Bs "+actual.getPrecio());
            etiqueta6.setBounds(50, 150+separacion*i, 2300, 100);
            panel2.add(etiqueta6);
            
            panel2.add(Box.createGlue());
            
        }
        }
       /*
        Paquete que se recorre 
        */
        
        
        JLabel etiqueta1 = new JLabel("Recuerde que necesita el codigo ID para realizar la reserva");
        etiqueta1.setBounds(400, 400, 200, 500);
        etiqueta1.setBackground(new Color(104, 205, 253));
        panel.add(etiqueta1);
        JLabel etiqueta = new JLabel("AGENCIA DE VIAJES", SwingConstants.LEFT);//crea la etiqueta
        panel3.add(etiqueta);
        etiqueta.setBounds(10, 0, 500, 50);
        etiqueta.setForeground(Color.white);
        etiqueta.setFont(new Font("arial", Font.BOLD, 30));
        
        //cod paquete
        
        /*
        JLabel etq = new JLabel("Cod. de paquete..........3245678");
        etq.setBounds(50,200,300,100);
        panel2.add(etq);
        JLabel etq1 = new JLabel("Cod. de paquete........5647093");
        etq1.setBounds(50,370,300,100);
        panel2.add(etq1);
        //tipo de transporte
        
        JLabel etq2 = new JLabel("Tipo de transporte.........Avion");
        etq2.setBounds(50,230,300,100);
        panel2.add(etq2);
        JLabel etq6 = new JLabel("Tipo de Transporte.........Canoa");
        etq6.setBounds(50,400,300,100);
        panel2.add(etq6);
        
        //hotel 
        
        JLabel etq3 = new JLabel("Hotel...............Hotel La Colonia");
        etq3.setBounds(50,260,300,100);
        panel2.add(etq3);
        JLabel etq7 = new JLabel("Hotel............Hotel Portales");
        etq7.setBounds(50,430,300,100);
        panel2.add(etq7);
        //menu
        
        JLabel etq4 = new JLabel("Menú.................");
        etq4.setBounds(50,290,200,100);
        panel2.add(etq4);
        JLabel etq8 = new JLabel("Menú.................");
        etq8.setBounds(50,460,300,100);
        panel2.add(etq8);
        //precio
        
        
        JLabel etq5 = new JLabel("Precio..........280");
        etq5.setBounds(50,320,300,100);
        panel2.add(etq5);
        JLabel etq9 = new JLabel("Precio........300");
        etq9.setBounds(50,490,300,100);
        panel2.add(etq9);
        */
        
        //PERSONALIZACION
        JLabel etiqueta6 = new JLabel("Personalizacion de Paquetes", SwingConstants.LEFT);//crea la etiqueta
        panel.add(etiqueta6);
        etiqueta6.setBounds(50, 100, 500, 50);
        etiqueta6.setForeground(Color.white);
        etiqueta6.setFont(new Font("arial", Font.BOLD, 20));
        //Tipo de transporte
        JLabel etiqueta7 = new JLabel("Tipo de transporte");
        etiqueta7.setBounds(50, 160, 200, 100);
        etiqueta7.setBackground(new Color(104, 205, 253));
        panel.add(etiqueta7);
        //Nombre de hotel
        JLabel etiqueta8 = new JLabel("Nombre del hotel");
        etiqueta8.setBounds(250, 160, 200, 100);
        etiqueta8.setBackground(new Color(104, 205, 253));
        panel.add(etiqueta8);
        //nombre del restaurante
        JLabel etiqueta9 = new JLabel("Nombre del restaurante");
        etiqueta9.setBounds(50, 220, 200, 100);
        etiqueta9.setBackground(new Color(104, 205, 253));
        panel.add(etiqueta9);
        
    }

    private void colocarListaDesplegable(ArrayList<Comida> menu) {
        String[] opciones = new String[menu.size()];
        for(int i=0;i<menu.size();i++){
            opciones[i]=menu.get(i).getPlato()+".."+menu.get(i).getPrecio()+" Bs.";
        }
        
        JComboBox lista = new JComboBox(opciones);
        //lista.setBounds(150, 155, 200, 30);
        panelList.add(lista);
        //lista 3
        /*
        String[] opciones3 = {"Silpanchos","Desayunos"};
        JComboBox lista3 = new JComboBox(opciones3);
        lista3.setBounds(150,485,200,30);
        panel2.add(lista3);
        //lista4
        String[] opciones4 = {"Lapping","Salteña"};
        JComboBox lista4 = new JComboBox(opciones4);
        lista4.setBounds(150,325,200,30);
        panel2.add(lista4);
        */
    }

    private void colocarCajaDeTexto() {
        //caja para tipo de transporte
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(50, 220, 180, 30);
        panel.add(cajaTexto);
        //caja para el hotel
        JTextField cajaTexto1 = new JTextField();
        cajaTexto1.setBounds(250, 220, 180, 30);
        panel.add(cajaTexto1);
        //caja para el restaurante
        JTextField cajaTexto2 = new JTextField();
        cajaTexto2.setBounds(50, 280, 180, 30);
        panel.add(cajaTexto2);

    }

    private void colocarBotones() {
        JButton boton1 = new JButton("Crear paquete personalizado");
        boton1.setBounds(150, 450, 250, 50);
        boton1.setEnabled(true);
        panel.add(boton1);
        boton1.setBackground(new Color(104, 205, 253));
        boton1.setForeground(Color.black);
        boton1.setFont(new Font("cooper black", Font.PLAIN, 15));

    }

}
