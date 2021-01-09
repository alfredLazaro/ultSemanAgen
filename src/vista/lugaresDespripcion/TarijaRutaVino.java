/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.lugaresDespripcion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Alan
 */
public class TarijaRutaVino extends JFrame{
     private JPanel pnlImgIzq,pnlImgDer,pnlDescrp,pnlNombL;
    private JLabel lblNombreLug,lblDescrp,lblUbic;
    private JLabel lblImgn1,lblImgn2,lblImgn3,lblImgn4,lblImgn5;
    private BorderLayout layPrinc;
    private BoxLayout    layCentro;
    private GridLayout   layIzq,layDer;
    private FlowLayout   layNomb;
    //este main debe ser borrado esta de pruba 
    
    public TarijaRutaVino() throws HeadlessException {
        setTitle("agencia De viajes (nombre agencia)");
        setSize(1080,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciar();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private void iniciar(){
        iniciarPanels();
        integrImgs();
        integrInfo();
        editColorEtiquets();
    }
    
    private void iniciarPanels(){
        pnlNombL=new JPanel();
        pnlImgIzq=new JPanel();
        pnlDescrp=new JPanel();
        pnlImgDer=new JPanel();
        iniciarLayouts();
        integLayouts();
        editColorPnls();
        //se creo un espacio para que no se vea la tan junto a las imagenes
        pnlDescrp.add(Box.createRigidArea (new Dimension(10, 0)));
        //se integran todos los paneles en el jFrame
        add(pnlNombL,BorderLayout.NORTH);
        add(pnlImgIzq,BorderLayout.WEST);
        add(pnlDescrp,BorderLayout.CENTER);
        add(pnlImgDer,BorderLayout.EAST);
    }
    
    private void iniciarLayouts(){
        layPrinc=new BorderLayout();
        layNomb=new FlowLayout();
        layIzq=new GridLayout(3, 1, 10, 5);
        layCentro=new BoxLayout(pnlDescrp,BoxLayout.Y_AXIS);
        layDer=new GridLayout(3, 1, 10,5);

    }
    private void integLayouts(){
        setLayout(layPrinc);
        pnlNombL.setLayout(layNomb);
        pnlImgIzq.setLayout(layIzq);
        pnlDescrp.setLayout(layCentro);
        pnlImgDer.setLayout(layDer);
    }
    private void editColorPnls(){
        pnlNombL.setBackground(new Color(32, 112, 193));
        pnlImgIzq.setBackground(new Color(32, 112, 193));
        pnlDescrp.setBackground(new Color(32, 112, 193));
        pnlImgDer.setBackground(new Color(32, 112, 193));
    }
    private void integrImgs(){
        //se especifica hasta la carpeta LugaresTuristicos/ hace falta añadir ubicacion exacta y nombre.jpg
        lblImgn1=new JLabel(new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Tarija/RutaVino/imagen1.jpg")));
        lblImgn2=new JLabel(new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Tarija/RutaVino/imagen2.jpg")));
        lblImgn3=new JLabel(new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Tarija/RutaVino/imagen3.jpg")));
        lblImgn4=new JLabel(new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Tarija/RutaVino/imagen4.jpg")));
        lblImgn5=new JLabel(new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Tarija/RutaVino/imagen5.jpg")));
        
        
        
        pnlImgIzq.add(lblImgn1);
        pnlImgIzq.add(lblImgn2);
        pnlImgDer.add(lblImgn3);
        pnlImgDer.add(lblImgn4);
        pnlImgDer.add(lblImgn5);
        
    }
    private void integrInfo(){
        lblNombreLug=new JLabel("La ruta del vino");
        lblUbic=new JLabel("<html>Contáctanos:<p> Av. Ayacucho entre Colombia y Ecuador <p>+591 62615493 <p>4 4446666 <p> Cochabamba-Bolivia<html>");
        //el <html> es salto de linea automatico el <p> es salto de linea controlado
        lblDescrp=new JLabel("<html><p>Consta de un paseo entretenido en el cual se hace la visita a las bodegas más grandes de Tarija en las cuales se puede conocer más acerca de la preparación del vino y las diferentes formas en las cuales la uva puede ser convertida en todo tipo de vinos, la mejor parte es que durante el paseo, los visitantes podrán degustar la variedad de vinos que se preparan en las bodegas. Todas las grandes bodegas de la zona, tiene en sus toneles de roble francés y americano, mucho del secreto para los sabores de sus vinos: frutados, con toques de vainilla, madera, cuero, etc. En estos toneles de madera el vino reposa desde algunos meses hasta varios años para tomar cuerpo y definición. Algunas de las bodegas y viñedos disponibles para la visita son Kohlberg, Casa Real, Campos de Solana o Aranjuez.<p><html>"
                            +"<html><p>.<p><html>"
                            );
        pnlNombL.add(lblNombreLug);
        pnlImgIzq.add(lblUbic);
        pnlDescrp.add(lblDescrp);
    }
    private void editColorEtiquets(){
        lblDescrp.setForeground(Color.WHITE);
        lblUbic.setForeground(Color.WHITE);
        lblNombreLug.setForeground(Color.WHITE);
        //se cambian tamaños
        lblDescrp.setFont(new Font("arial", Font.PLAIN, 18));
        lblUbic.setFont(new Font("arial", Font.PLAIN, 14));
        lblNombreLug.setFont(new Font("arial", Font.BOLD, 20));
    }
}
