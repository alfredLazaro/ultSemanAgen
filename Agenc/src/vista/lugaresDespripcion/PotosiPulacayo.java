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
public class PotosiPulacayo extends JFrame{
     private JPanel pnlImgIzq,pnlImgDer,pnlDescrp,pnlNombL;
    private JLabel lblNombreLug,lblDescrp,lblUbic;
    private JLabel lblImgn1,lblImgn2,lblImgn3,lblImgn4,lblImgn5;
    private BorderLayout layPrinc;
    private BoxLayout    layCentro;
    private GridLayout   layIzq,layDer;
    private FlowLayout   layNomb;
    //este main debe ser borrado esta de pruba 
    
    public PotosiPulacayo() throws HeadlessException {
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
        lblImgn1=new JLabel(new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Potosi/Pulacayo/imagen1.jpg")));
        lblImgn2=new JLabel(new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Potosi/Pulacayo/imagen2.jpg")));
        lblImgn3=new JLabel(new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Potosi/Pulacayo/imagen3.jpg")));
        lblImgn4=new JLabel(new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Potosi/Pulacayo/imagen4.jpg")));
        lblImgn5=new JLabel(new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Potosi/Pulacayo/imagen5.jpg")));
        
        
        
        pnlImgIzq.add(lblImgn1);
        pnlImgIzq.add(lblImgn2);
        pnlImgDer.add(lblImgn3);
        pnlImgDer.add(lblImgn4);
        pnlImgDer.add(lblImgn5);
        
    }
    private void integrInfo(){
        lblNombreLug=new JLabel("Pulacayo");
        lblUbic=new JLabel("<html>Contáctanos:<p> Av. Ayacucho entre Colombia y Ecuador <p>+591 62615493 <p>4 4446666 <p> Cochabamba-Bolivia<html>");
        //el <html> es salto de linea automatico el <p> es salto de linea controlado
        lblDescrp=new JLabel("<html><p>Situada a 25 Km de Uyuni a 200 km de Potosi, Pulacayo tiene el aspecto de una ciudad de las peliculas del oeste donde su mayor atractivo turistico denominado el cementerio de trenes. Lugar que alberga reliquias mecanicas extraordinarias donde el oxido de los trenes utilizados para el transporte del mineral es lo mas relevante de este lugar.<p><html>"
                            +"<html><p>La antigua ciudad minera que se mantiene conservada, rodeada de locomotoras y vagones oxidados que servian en otro tiempo para transportar la plata extraida de las minas de Potosi hacias Chile para luego enviarla a la Corona de España. Hoy en dia los trenes se encuentran en un estado precario debido al efecto del tiempo, el sol, la sal y la lluvia, ademas de encontrarse en este lugar la antigua mansion del millonario Aniceto Arce situada en una ciudad fantasma. Los trenes tambien desempeñaron una papel importante durante la guerra del Pacifico<p><html>"
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
