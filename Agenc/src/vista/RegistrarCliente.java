package vista;
import javax.swing.*;
import java.awt.*;
public class RegistrarCliente extends JPanel{
    JPanel panel = new JPanel();

    public RegistrarCliente() {
        setBounds(500, 200, 1080, 800);
        setBackground(new Color(32, 112, 193));
        iniciarComponentes();
        setLayout(null);
    }
    private void iniciarComponentes(){
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
        etiqueta2.setBounds(100,100,200,100);
        etiqueta2.setBackground(new Color(104,205,253));
        add(etiqueta2);
        //nro pasajeros
        JLabel etiqueta3 = new JLabel("Nro. de Pasajeros");
        etiqueta3.setBounds(100,200,200,100);
        etiqueta3.setBackground(new Color(104,205,253));
        add(etiqueta3);
        //temp de Pref.
        JLabel etiqueta4 = new JLabel("Temporada de Preferencia");
        etiqueta4.setBounds(100,300,200,100);
        etiqueta4.setBackground(new Color(104,205,253));
        add(etiqueta4);
        //nro de ID
        JLabel etiqueta5 = new JLabel("Nro. de Identificacion");
        etiqueta5.setBounds(100,400,200,100);
        etiqueta5.setBackground(new Color(104,205,253));
        add(etiqueta5);
    }
    private void colocarCajasDeTexto() {
        //caja para el nombre
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(100, 160, 200, 30);
        add(cajaTexto);
        //caja para nro de pasajeros
        JTextField cajaTexto2 = new JTextField();
        cajaTexto2.setBounds(100, 260, 200, 30);
        add(cajaTexto2);
        //caja para temporada de preferencia
        JTextField cajaTexto3 = new JTextField();
        cajaTexto3.setBounds(100, 360, 200, 30);
        add(cajaTexto3);
        //caja para nro de identificacion
        JTextField cajaTexto4 = new JTextField();
        cajaTexto4.setBounds(100, 460, 200, 30);
        add(cajaTexto4);
    }
    private void colocarBotones() {
        //boton 1 - boton de texto
        JButton boton1 = new JButton("Registrar");
        boton1.setBounds(300, 600, 100, 50);
        boton1.setEnabled(true);
        add(boton1);
        boton1.setBackground(new Color(104,205,253));
        boton1.setForeground(Color.black);
        boton1.setFont(new Font("cooper black", 2, 15));
    }
}
