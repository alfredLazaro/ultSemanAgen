/*
 * 
 */
package controlador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import metodosAgen.*;
import modelo.*;
/**
 * @author Fred
 */
public class Main {
    private Agencia agen;
    private HashMap<Integer,Cliente> clientes;
    private HashMap<String,ArrayList<PaqueteTuristico>> lugaresPaquet;
    private Administrador admin;
    private String nombreEmp;
    //e
    public static void main(String[] args) {
       Main m=new Main();
       String nombrClien,tempPrefer,tipoViaj,nombreAdmin,contraAd,lugarTurist,nombTransp,nomResta,nombHot,fechIda,fechVuelt,tipoTransp,nombrEmprTransp,estadoReservN,origen,destino;
       
       int cantPasaj,nroIdCli,cantDias,nroPaquet,nroOpcion,precioPas;
       boolean existeAdmin,enFlujo;
       Scanner sn=new Scanner(System.in);
       System.out.println("la empresa fue creada");
        
        enFlujo=true;
        while(enFlujo){
            
        System.out.println("1)ingreso adminitrador\n"
                + "2)agregar Paquete personalizado\n"
                + "3)anular Reserva\n"
                + "4)crear Reserva\n"
                + "5)registrar Cliente\n"
                + "6)registrar Paquete\n"
                + "7)registrar Pasaje\n"
                + "8)terminar toda operacion\n"
                + "Eliga una opcion\n");
            nroOpcion=Integer.parseInt(sn.nextLine());
        switch(nroOpcion){
            case 1:
                System.out.println("ingrese el nombre del administrador");
                nombreAdmin=sn.nextLine();
                System.out.println("ingrese la contraseña");
                contraAd=sn.nextLine();
                existeAdmin=m.existAdm(nombreAdmin, contraAd);
                System.out.println("¿el administrador existe?" + existeAdmin);
                break;
            case 2:
                System.out.println("inserte el lugarTuristico");
                lugarTurist=sn.nextLine();
                System.out.println("inserte el transporte");
                nombTransp=sn.nextLine();
                System.out.println("inserte el nombre de restaurante");
                nomResta=sn.nextLine();
                System.out.println("inserte el nombre de hotel");
                nombHot=sn.nextLine();
                System.out.println("inserte el nro de dias");
                cantDias=Integer.parseInt(sn.nextLine());
                
                m.agregPac(lugarTurist, nombTransp, nomResta, nombHot, cantDias);
                break;
            case 3:
                System.out.println("inserte codigo de cliente");
                nroIdCli=Integer.parseInt(sn.nextLine());
                estadoReservN="cancelado";
                m.anularReserva(nroIdCli, estadoReservN);
                break;
            case 4:
                System.out.println("ingrese el codigo del cliente");
                nroIdCli=Integer.parseInt(sn.nextLine());
                m.crearNuevReserv(nroIdCli);
                break;
            case 5:
                System.out.println("ingrese el nombre del cliente");
                nombrClien=sn.nextLine();
                System.out.println("ingrese la cantidad de pasajeros");
                cantPasaj=Integer.parseInt(sn.nextLine());
                System.out.println("ingrese temporada preferida");
                tempPrefer=sn.nextLine();
                System.out.println("ingrese el motivo de viaje");
                tipoViaj=sn.nextLine();
                m.registrarClient(nombrClien, cantPasaj, tempPrefer, tipoViaj);
                break;
            case 6:
                System.out.println("ingrese el codigo del cliente");
                nroIdCli=Integer.parseInt(sn.nextLine());
                System.out.println("ingrese el nombre del cliente");
                nombrClien=sn.nextLine();
                System.out.println("ingrese la cantidad de pasajeros");
                cantPasaj=Integer.parseInt(sn.nextLine());
                System.out.println("ingrese el codigo del paquete");
                nroPaquet=Integer.parseInt(sn.nextLine());
                System.out.println("ingrese el nombre del lugar Turistico");
                lugarTurist=sn.nextLine();
                m.registrarPaquet(nroIdCli, nombrClien, cantPasaj, nroPaquet, lugarTurist);
                break;
            case 7:
                System.out.println("ingrese el codigo del cliente");
                nroIdCli=Integer.parseInt(sn.nextLine());
                System.out.println("ingrese el nombre del cliente");
                nombrClien=sn.nextLine();
                System.out.println("ingrese el origen del cual partira");
                origen=sn.nextLine();
                System.out.println("ingrese el destino");
                destino=sn.nextLine();
                System.out.println("ingrese la fecha de ida en formato dd/mm/aaaa");
                fechIda=sn.nextLine();
                System.out.println("ingrese la fecha de vuelta en formato dd/mm/aaaa");
                fechVuelt=sn.nextLine();
                System.out.println("ingrese el tipo de trasporte");
                tipoTransp=sn.nextLine();
                System.out.println("ingrese el nombre de la empresa de transporte");
                nombrEmprTransp=sn.nextLine();
                System.out.println("ingrese el presio del pasaje");
                precioPas=Integer.parseInt(sn.nextLine());
                
                m.registrarPasaje(nroIdCli, nombrClien,origen, destino, fechIda, fechVuelt, tipoTransp, nombrEmprTransp, precioPas);
                break;
            case 8:
                enFlujo=false;
                System.out.println("hasta la proxima");
                break;
        }
        }
        
    }

    public Main() {
        nombreEmp="Travel Pandemic";
        iniciarClientes();
        iniciarLugares();
        
        boolean e=existAdm("agente67", "67531896");
        
        agen=new Agencia(null, null, nombreEmp, lugaresPaquet, clientes);
        //prueba de registro cliente
        //desde aqui generar vista
        
        //vista=vista.setLabelTitulo;
        //vista.setPaquetes();
    }
    //lugar clientes
    private void iniciarClientes(){
        clientes=XMLClientes.hashClientes();
    }
    public void registrarClient(String nombrClien,int cantPasaj,String tempPrefer,String tipoViaj){
        
        agen.registrarCliente(nombrClien,cantPasaj, tempPrefer,tipoViaj);
        
        Cliente cient=new Cliente(nombrClien, cantPasaj, tempPrefer, tipoViaj, agen.getCodUltimoClient());
        XMLClientes.insertCliente(cient);
    }
    private void iniciarLugares(){
        lugaresPaquet=XMLDepartamentos.HashPaquetesLugrs();
    }
    //se busca el administrador en la base
    private boolean existAdm(String nombre,String contra){
        boolean existe=false;
        Administrador adm=XMLAdministradores.buscarAdmin(nombre, contra);
        if(adm!=null){
            System.out.println("se encontro el admin");
            existe=true;
        }else{
            System.out.println("metio mal algo no existe el admin");
        }
        return existe;
    }
    
    //el estado puede ser activo, cancelado, usado(se cambia cuando se agrega nueva reserva)
    public void anularReserva(int nroId,String estadoNuevo){
        Cliente cliente=agen.getClientes().get(nroId);
        Cliente clinXML=XMLClientes.buscarClient(nroId);
        if(cliente!=null && clinXML!=null){
            agen.anularReserva(cliente);
            XMLClientes.cambiEstadoReserv(nroId, estadoNuevo);
        }else{}
    }
    
    //se agrega el paquete a modelo y a agencia
    public void agregPac(String lugarDest,String nombTransport,String nombRest,String nombHotel,int cantDias){
        Hotel hot=agen.escogerHotel(nombHotel, lugaresPaquet.get(lugarDest));
        Transporte t=agen.escogerTransporte(nombTransport,lugaresPaquet.get(lugarDest));
        Restaurante restau=agen.escogeRestaurant(nombRest, lugaresPaquet.get(lugarDest));
        PaqueteTuristico paq=new PaqueteTuristico(t, hot, restau, cantDias);
        int nroIde=paq.getNroIde();
        //se agraga a agencia
        agen.agregarPaquete(lugarDest, nombTransport, nombRest, nombHotel,cantDias);
        //se agrega a XML paquete
        XMLDepartamentos.insertPaqLugar(lugarDest, paq);
        //aqui faltaria agragarlo a VISTA
    }
    //antes de reservar Pasaje o Paquete
    public void crearNuevReserv(int nroIdClient){
        Reserva reserv=new Reserva(null, null, agen.getClientes().get(nroIdClient), new Date());
        //tambien hay que crearla para la agen
        Cliente cl=agen.getClientes().get(nroIdClient);
        cl.getHistorial().actualizarHistorial(reserv);
        XMLHistoriales.aniadirReserv(reserv, nroIdClient);
    }
    
    public void registrarPaquet(int nroIdClient,String nombCl,int catPasaj,int nroPaquete,String lugarT){
        //en aqui se añadira el paquete
        
        Cliente c1=agen.verificarExistencia(nombCl, nroIdClient);
        
        if(c1!=null){
            Reserva reserv=c1.getHistorial().getUltReserv();//new Reserva(null, null, agen.getClientes().get(nroIdClient), new Date());
            agen.reservarPaquetes(nombCl, nroIdClient, catPasaj, nroPaquete, lugarT);
            PaqueteTuristico paquete=agen.buscarPaquete(lugarT, nroPaquete);
            //se extrae el paquete (suponemos que existe)
            if(paquete!=null){
                //si la ultima reserva tiene estado!= "activo" se crea reserva nueva(deberia)
                reserv.setPaquete(paquete);
                //esto es como dato de info en realidad no lo usamos
                reserv.setCliente(c1);
                XMLClientes.insertPaquete(reserv, nroIdClient);
            }else{
                System.out.println("el paquete no existe");
            }
        }else{
            System.out.println("algo no se ingreso de la manera correcta");
        }
        
    }
    // en lo de tipo transporte nose como lo pensamos 
    public void registrarPasaje(int nroIdClient,String nombCl,String origen,String destino,String fechaIda,String fechaVuelta,String tipoTransporte,String nombrEmpresa, int precio) {
        //en aqui se añadira el pasaje
        Date fechaId,fechaVuelt;
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/yyyy");
        fechaId=null;
        fechaVuelt=null;
        try{
        //si la fecha no es bien introducida fallara en el xml al parecer
        fechaId=formatoFecha.parse(fechaIda);
        fechaVuelt=formatoFecha.parse(fechaVuelta);
        }catch(ParseException ep){
            System.out.println("fecha mal introducida o no introducida");
        }
        Pasaje p;
        Cliente c1=agen.verificarExistencia(nombCl, nroIdClient);
        if(c1!=null){
            Reserva reserv=c1.getHistorial().getUltReserv();
            p=new Pasaje(origen, destino, fechaId, fechaVuelt, nombrEmpresa, tipoTransporte, nombrEmpresa, precio);
            agen.reservaPasaje(origen, destino, nroIdClient, nombCl, fechaId, fechaVuelt, tipoTransporte, nombrEmpresa, precio);
            //si la ultima reserva tiene estado!= "activo" se crea reserva nueva(deberia)
            reserv.setPasaje(p);
            reserv.setCliente(c1);
            XMLClientes.insertPasaje(reserv, nroIdClient);
        }else{}
    }
    
    
}
