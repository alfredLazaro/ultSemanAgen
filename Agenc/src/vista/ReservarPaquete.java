package vista;
import javax.swing.*;
import java.awt.*;
public class ReservarPaquete extends JPanel {
    JPanel panel = new JPanel();
    public ReservarPaquete() {
        setBounds(500, 200, 1080, 800);
        setLayout(null);
        setBackground(new Color(32, 112, 193));
        iniciarComponentes();
    }
    private void iniciarComponentes() {
        colocarEtiquetas();
        colocarCajasDeTexto();
        colocarBotones();
    }

    private void colocarEtiquetas() {
        JLabel etiqueta = new JLabel("AGENCIA DE VIAJES", SwingConstants.LEFT);//crea la etiqueta
        add(etiqueta);
        etiqueta.setBounds(10, 0, 500, 50);
        etiqueta.setForeground(Color.white);
        etiqueta.setFont(new Font("arial", Font.BOLD, 30));
        //nombre
        JLabel etiqueta2 = new JLabel("Nombre Completo");
        etiqueta2.setBounds(100, 100, 200, 100);
        etiqueta2.setBackground(new Color(104, 205, 253));
        add(etiqueta2);
        //nro pasajeros
        JLabel etiqueta3 = new JLabel("Nro. de Pasajeros");
        etiqueta3.setBounds(100, 160, 200, 100);
        etiqueta3.setBackground(new Color(104, 205, 253));
        add(etiqueta3);
        //temp de Pref.
        JLabel etiqueta4 = new JLabel("Codigo");
        etiqueta4.setBounds(100, 220, 200, 100);
        etiqueta4.setBackground(new Color(104, 205, 253));
        add(etiqueta4);
        //nro de ID
        JLabel etiqueta5 = new JLabel("Motivo de Viaje");
        etiqueta5.setBounds(100, 280, 200, 100);
        etiqueta5.setBackground(new Color(104, 205, 253));
        add(etiqueta5);
        //lugar de viaje
        JLabel etiqueta6 = new JLabel("Lugar de Viaje");
        etiqueta6.setBounds(100, 340, 200, 100);
        etiqueta6.setBackground(new Color(104, 205, 253));
        add(etiqueta6);
        //nro de paquete
        JLabel etiqueta7 = new JLabel("Nro de Paquete");
        etiqueta7.setBounds(100, 400, 200, 100);
        etiqueta7.setBackground(new Color(104, 205, 253));
        add(etiqueta7);
        //fecha de reserva
        JLabel etiqueta8 = new JLabel("Fecha de Reserva");
        etiqueta8.setBounds(100, 460, 200, 100);
        etiqueta8.setBackground(new Color(104, 205, 253));
        add(etiqueta8);
        //hora de reserva
        JLabel etiqueta9 = new JLabel("Hora de Reserva");
        etiqueta9.setBounds(300, 100, 200, 100);
        etiqueta9.setBackground(new Color(104, 205, 253));
        add(etiqueta9);
        //fecha de vuelta
        JLabel etiqueta10 = new JLabel("Fecha de vuelta");
        etiqueta10.setBounds(300, 160, 200, 100);
        etiqueta10.setBackground(new Color(104, 205, 253));
        add(etiqueta10);
        //hora de vuelta
        JLabel etiqueta11 = new JLabel("Hora de Vuelta");
        etiqueta11.setBounds(300, 220, 200, 100);
        etiqueta11.setBackground(new Color(104, 205, 253));
        add(etiqueta11);
    }
    private void colocarCajasDeTexto() {
        //caja para el nombre
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(100, 160, 180, 30);
        add(cajaTexto);
        //caja para nro de pasajeros
        JTextField cajaTexto2 = new JTextField();
        cajaTexto2.setBounds(100, 220, 180, 30);
        add(cajaTexto2);
        //caja para codigo
        JTextField cajaTexto3 = new JTextField();
        cajaTexto3.setBounds(100, 280, 180, 30);
        add(cajaTexto3);
        //caja para nro de identificacion
        JTextField cajaTexto4 = new JTextField();
        cajaTexto4.setBounds(100, 340, 180, 30);
        add(cajaTexto4);
        //lugar de viaje
        JTextField cajaTexto5 = new JTextField();
        cajaTexto5.setBounds(100, 400, 180, 30);
        add(cajaTexto5);
        //nro de paquete
        JTextField cajaTexto6 = new JTextField();
        cajaTexto6.setBounds(100, 460, 180, 30);
        add(cajaTexto6);
        //fecha de reserva
        JTextField cajaTexto7 = new JTextField();
        cajaTexto7.setBounds(100, 520, 180, 30);
        add(cajaTexto7);
        //hora de reserva
        JTextField cajaTexto8 = new JTextField();
        cajaTexto8.setBounds(300, 160, 180, 30);
        add(cajaTexto8);
        //fecha de vuelta
        JTextField cajaTexto9 = new JTextField();
        cajaTexto9.setBounds(300, 220, 180, 30);
        add(cajaTexto9);
        //hora de vuelta
        JTextField cajaTexto10 = new JTextField();
        cajaTexto10.setBounds(300, 280, 180, 30);
        add(cajaTexto10);
    }
    private void colocarBotones(){
        JButton boton1 = new JButton("Reservar");
        boton1.setBounds(350, 600, 100, 50);
        boton1.setEnabled(true);
        add(boton1);
        boton1.setBackground(new Color(104,205,253));
        boton1.setForeground(Color.black);
        boton1.setFont(new Font("cooper black", 2, 15));
        //boton de crear reserva
        JButton boton2 = new JButton("Crear Reserva");
        boton2.setBounds(310,550,200,50);
        boton2.setEnabled(true);
        add(boton2);
        boton2.setBackground(new Color(104,205,253));
        boton2.setForeground(Color.black);
        boton2.setFont(new Font("cooper black",2,15));
    }
}
