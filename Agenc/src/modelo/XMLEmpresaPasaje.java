/*
 *
 */
package modelo;

import Prinpal.*;
import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import metodosAgen.*;
import static modelo.XMLAdministradores.crearXML;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

/**
 *
 * @author USUARIO
 */
public class XMLEmpresaPasaje {
    //se debe tener cuidado con poner el nombre unico para empresasPasaje
    private static final String nomArchivo="empresasPasajes";
    private static final String pathAch="."+File.separator+"src"+File.separator+"modelo"+File.separator+"xmls"+File.separator;
    private static final File archivo=new File(pathAch+nomArchivo+".xml");
    
    public static void main(String[] args) {
        IniciadorEmpresas empr=new IniciadorEmpresas();
        ArrayList<EmpresaPasaje> empresasPasaj=empr.getEmpresasPasaje();
        try{
            modificarXML(empresasPasaj);
        }catch(Exception e){
            System.out.println("algo anda mal al modificarXMLEmpres");
        }
    }
    
    public static void crearXML() throws Throwable{
        DocumentBuilderFactory factoria=DocumentBuilderFactory.newInstance();
        DocumentBuilder        builder= factoria.newDocumentBuilder();
        DOMImplementation implementa=builder.getDOMImplementation();
        Document               documento=implementa.createDocument(null,nomArchivo,null);
        documento.setXmlVersion("1.0");
        //se procede a generar el xml
        Source source=new DOMSource(documento);
        //como y donde se guardara
        Result result=new StreamResult(archivo);
        Transformer transforme=TransformerFactory.newInstance().newTransformer();
        transforme.transform(source, result);
    }
    
    public static void modificarXML(ArrayList<EmpresaPasaje> empresasPasaj){
        if(!archivo.exists()){
            try{
                crearXML();
            }catch(Throwable e){
            }
        }else{}
        try{
            DocumentBuilderFactory facto=DocumentBuilderFactory.newInstance();
                DocumentBuilder        documentoBulider=facto.newDocumentBuilder();
                Document               document=documentoBulider.parse(archivo);
                document.getDocumentElement().normalize();
                Element raiz=document.getDocumentElement();
                
                for(EmpresaPasaje emp:empresasPasaj){
                    Element nodoEmpresP=document.createElement("EmpresaPasaje");
                    nodoEmpresP.setAttribute("precioEmp", emp.getPrecioEmprPasa()+"");
                    
                    Element nombreEmpNodo=document.createElement("NombreEmpresa");
                    Text nodoValorNombre=document.createTextNode(emp.getNombreEmpresa());
                    nombreEmpNodo.appendChild(nodoValorNombre);
                    
                    Element transpNodo=document.createElement("NombreTransporte");
                    Text nodoValorTransp=document.createTextNode(emp.getTipoTransporte());
                    transpNodo.appendChild(nodoValorTransp);
                    
                    nodoEmpresP.appendChild(nombreEmpNodo);
                    nodoEmpresP.appendChild(transpNodo);
                    ArrayList<DepartamentoDestino> depDestins=emp.getDepartamentosHabiles();
                    
                    Element departamenNodo=document.createElement("Departamentos");
                    for(DepartamentoDestino d: depDestins){
                        
                        Element nodoDepDest=document.createElement("DepartamentoDestino");
                        nodoDepDest.setAttribute("precioP", d.getPrecioPasaj()+"");
                        
                        Element nombrDepartNodo=document.createElement("NombreDepartamento");
                        Text    nodoValorNomD=document.createTextNode(d.getNombreDepartament());
                        nombrDepartNodo.appendChild(nodoValorNomD);
                        
                        nodoDepDest.appendChild(nombrDepartNodo);
                        
                        ArrayList<String> horarios=d.getHorarios();
                        for(String hora:horarios){
                            
                            Element nodoHora=document.createElement("Hora");
                            Text nodoValorHora=document.createTextNode(hora);
                            nodoHora.appendChild(nodoValorHora);
                            
                            nodoDepDest.appendChild(nodoHora);
                        }
                        departamenNodo.appendChild(nodoDepDest);
                       
                    }
                    
                    nodoEmpresP.appendChild(departamenNodo);
                     
                    raiz.appendChild(nodoEmpresP);
                }
                
                //se genera el xml
                Source source=new DOMSource(document);
                //donde se guardara
                Result result=new StreamResult(archivo);
                Transformer transformer=TransformerFactory.newInstance().newTransformer();
                //habia un error '' por que habia un elemento sin inicializar entonces todo null
                transformer.transform(source,result);
        }catch(Throwable e){
            System.out.println("algo salio mal al modificar el xml");
        }
    }
    public static ArrayList<EmpresaPasaje> listaEmpresas(){
        ArrayList<EmpresaPasaje> emps=new ArrayList<>();
        String nombreEm="";
        //String depart="";
        if(!archivo.exists()){
            try{
                crearXML();
            }catch(Throwable e){
            }
        }else{}
        try{
            DocumentBuilderFactory facto=DocumentBuilderFactory.newInstance();
                DocumentBuilder        documentoBulider=facto.newDocumentBuilder();
                Document               document=documentoBulider.parse(archivo);
                document.getDocumentElement().normalize();
                Element raiz=document.getDocumentElement();
                NodeList   empresas=document.getElementsByTagName("EmpresaPasaje");
                for(int i=0;i<empresas.getLength();i++){
                    Node nodo=empresas.item(i);
                    String tipoTransp="";
                    int precEmpr=0;
                    if(nodo.getNodeType()==Node.ELEMENT_NODE){
                        Element empresa=(Element) nodo;
                        precEmpr=Integer.parseInt(empresa.getAttribute("precioEmp"));
                        nombreEm=empresa.getElementsByTagName("NombreEmpresa").item(0).getTextContent();
                        tipoTransp=empresa.getElementsByTagName("NombreTransporte").item(0).getTextContent();
                        Element departaments=(Element)empresa.getElementsByTagName("Departamentos").item(0);
                        NodeList departamentos=departaments.getElementsByTagName("DepartamentoDestino");
                        
                        ArrayList<DepartamentoDestino> dest=new ArrayList<>();
                        for(int j=0;j<departamentos.getLength();j++){
                            Node nodo1=departamentos.item(j);
                            String nombreDep="";
                            int precioPasDep=0;
                            if(nodo1.getNodeType()==Node.ELEMENT_NODE){
                                Element depDest=(Element) nodo1;
                                precioPasDep=Integer.parseInt(depDest.getAttribute("precioP"));
                                nombreDep=depDest.getElementsByTagName("NombreDepartamento").item(0).getTextContent();
                                NodeList horario=depDest.getElementsByTagName("Hora");
                                ArrayList<String> horas=new ArrayList<>();
                                for(int k=0;k<horario.getLength();k++){
                                    Node nodoHora=horario.item(k);
                                    if(nodoHora.getNodeType()==Node.ELEMENT_NODE){
                                        Element hora=(Element) nodoHora;
                                        String horaAc=hora.getTextContent();
                                        horas.add(horaAc);
                                    }else{}
                                }
                                DepartamentoDestino depDesti=new DepartamentoDestino(nombreDep, horas,precioPasDep);
                                dest.add(depDesti);
                            }else{}
                        }
                        EmpresaPasaje empres=new EmpresaPasaje(nombreEm, tipoTransp, dest,precEmpr);
                        emps.add(empres);
                    }else{}
                }
        }catch(Throwable e){
            System.out.println("algo anduvo mal XMlEmpresa recuperarDats");
        }
            
              
        return emps;
    }
}

    
