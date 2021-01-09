package vista;
import com.toedter.calendar.JCalendar;

import javax.swing.*;
import java.awt.*;
public class SoloPasajes extends JPanel{
    JPanel panel = new JPanel();


    public SoloPasajes() {
        setBounds(500, 200, 1080, 800);
        setBackground(new Color(32, 112, 193));
        setLayout(null);
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        colocarEtiquetas();
        colocarCajasDeTexto();
        colocarBotones();
        colocarCalendario();
        colocarListaDesplegable();
    }
    private void colocarEtiquetas() {
        JLabel etiqueta = new JLabel("AGENCIA DE VIAJES", SwingConstants.LEFT);//crea la etiqueta
        add(etiqueta);
        etiqueta.setBounds(10, 0, 500, 50);
        etiqueta.setForeground(Color.white);
        etiqueta.setFont(new Font("arial", Font.BOLD, 30));
        //nombre
        JLabel etiqueta2 = new JLabel("Nombre Completo");
        etiqueta2.setBounds(300,100,200,100);
        etiqueta2.setBackground(new Color(104,205,253));
        add(etiqueta2);
        //nro pasajeros
        JLabel etiqueta3 = new JLabel("Ciudad de Origen");
        etiqueta3.setBounds(300,170,200,100);
        etiqueta3.setBackground(new Color(104,205,253));
        add(etiqueta3);
        //temp de Pref.
        JLabel etiqueta4 = new JLabel("Ciudad de Destino");
        etiqueta4.setBounds(550,170,200,100);
        etiqueta4.setBackground(new Color(104,205,253));
        add(etiqueta4);
        //nro de ID
        JLabel etiqueta5 = new JLabel("Tipo de Transporte");
        etiqueta5.setBounds(550,100,200,100);
        etiqueta5.setBackground(new Color(104,205,253));
        add(etiqueta5);
        //empresa
        JLabel etiqueta6 = new JLabel("Empresa");
        etiqueta6.setBounds(500,240,200,100);
        etiqueta6.setBackground(new Color(104,205,253));
        add(etiqueta6);
    }
    private void colocarCajasDeTexto() {
        //caja para el nombre
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(300, 160, 200, 30);
        add(cajaTexto);
        //caja para nro de pasajeros
        JTextField cajaTexto2 = new JTextField();
        cajaTexto2.setBounds(300, 230, 200, 30);
        add(cajaTexto2);
        //caja para temporada de preferencia
        JTextField cajaTexto3 = new JTextField();
        cajaTexto3.setBounds(550, 230, 200, 30);
        add(cajaTexto3);
        //caja para la empresa
        JTextField cajaTexto4 = new JTextField();
        cajaTexto4.setBounds(430, 300, 200, 30);
        add(cajaTexto4);
    }
    private void colocarBotones() {
        //boton 1 - boton de texto
        JButton boton1 = new JButton("Comprar");
        boton1.setBounds(540, 600, 100, 50);
        boton1.setEnabled(true);
        add(boton1);
        boton1.setBackground(new Color(104,205,253));
        boton1.setForeground(Color.black);
        boton1.setFont(new Font("cooper black", 2, 15));
        //boton2
        JButton boton2 = new JButton("Crear Reserva");
        boton2.setBounds(320,600,200,50);
        boton2.setEnabled(true);
        add(boton2);
        boton2.setBackground(new Color(104,205,253));
        boton2.setForeground(Color.black);
        boton2.setFont(new Font("cooper black",2,15));
    }
    private void colocarListaDesplegable(){
        JComboBox lista = new JComboBox();
        String[] opciones = {"Terrestre","Aereo"};
        lista = new JComboBox(opciones);
        lista.setBounds(550, 160, 200, 30);
        add(lista);
    }
    private void colocarCalendario(){
        //calendario de ida
        JCalendar deIda = new JCalendar();
        deIda.setBounds(290,350,250,150);
        add(deIda);
        //calendario de vuelta
        JCalendar deVuelta = new JCalendar();
        deVuelta.setBounds(570,350,250,150);
        add(deVuelta);
    }
}
