/*
 * este deberia ser un Jpanel para ser integrado
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

public class BeniRiberalta extends JFrame{
    //se podria sacar el codigo y ponerlo en una clase panel, para juntarlo
    private JPanel pnlImgIzq,pnlImgDer,pnlDescrp,pnlNombL;
    private JLabel lblNombreLug,lblDescrp,lblUbic;
    private JLabel lblImgn1,lblImgn2,lblImgn3,lblImgn4,lblImgn5;
    private BorderLayout layPrinc;
    private BoxLayout    layCentro;
    private GridLayout   layIzq,layDer;
    private FlowLayout   layNomb;
    //este main debe ser borrado esta de pruba 
    public static void main(String[] args) {
        BeniRiberalta pRiber=new BeniRiberalta();
    }
    
    public BeniRiberalta() throws HeadlessException {
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
        lblImgn1=new JLabel(new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Beni/Riberalta/36641482_10156001175918705_7239783761049550848_n.jpg")));
        lblImgn2=new JLabel(new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Beni/Riberalta/38022292_10212640786560881_1745391365254021120_n.jpg")));
        lblImgn3=new JLabel(new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Beni/Riberalta/Aquicuana-Lake-Bolivia-3.jpg")));
        lblImgn4=new JLabel(new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Beni/Riberalta/IMG_20180722_180939.jpg")));
        lblImgn5=new JLabel(new ImageIcon(getClass().getResource("/vista/LugaresTuristicos/Beni/Riberalta/on-the-road-1.jpg")));

        pnlImgIzq.add(lblImgn1);
        pnlImgIzq.add(lblImgn2);
        pnlImgDer.add(lblImgn3);
        pnlImgDer.add(lblImgn4);
        pnlImgDer.add(lblImgn5);
        
    }
    private void integrInfo(){
        lblNombreLug=new JLabel("Riberalta");
        lblUbic=new JLabel("<html>Contáctanos:<p> Av. Ayacucho entre Colombia y Ecuador <p>+591 62615493 <p>4 4446666 <p> Cochabamba-Bolivia<html>");
        //el <html> es salto de linea automatico el <p> es salto de linea controlado
        lblDescrp=new JLabel("<html><p>Riberalta es una ciudad en la Amazonia boliviana. Está ubicada en la orilla sureste, donde convergen los ríos de Madre de Dios y Beni. Su población se estima en alrededor de 99,000 habitantes, y por lo tanto es la segunda ciudad más grande en el departamento detrás de la capital, Trinidad.<p><html>"
                            +"<html><p>Historia<html>"
                            +"<html><p>La ciudad ha tenido diferentes nombres: Barranca Colorada, La Cruz, Ribera-Alta y finalmente Riberalta. Desde mediados del siglo XIX, exploradores y navegantes solitarios se han aventurado allí. Se encontraron con un banco elevado en la confluencia de dos ríos colosales, el Río Beni y el Río Madre de Dios, que pronto fue ocupado por empresarios y aventureros nacionales e internacionales atraídos por el potencial económico de los abundantes árboles de la goma en la región. Después de 12 años de prosperidad, "
                            + "la ciudad fue nombrada oficialmente el 3 de febrero de 1894, por Manuel Vicente Ballivián.<p><html>"
                            +"<html><p>Debido a la ubicación específica de la ciudad y la expansión del mercado de la goma, Riberalta se convirtió en un centro internacional de actividad. Varias empresas europeas abrieron oficinas, y el dinero de las exportaciones de la goma generó un boom económico real que atrajó a personas de Bolivia. Además de empresarios europeos, Riberalta recibió inmigrantes japoneses. La llegada de una variedad de inmigrantes dió lugar a una mezcla cosmopolita de culturas y adquirió nuevas técnicas en la agricultura, la carpintería, etc.<p><html>");
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
        lblUbic.setFont(new Font("arial", Font.PLAIN, 18));
        lblNombreLug.setFont(new Font("arial", Font.BOLD, 20));
    }
}
