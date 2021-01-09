/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prinpal;

import java.util.ArrayList;
import metodosAgen.*;
/**
 * @author USUARIO
 */
public class IniciadorEmpresas {
    private ArrayList<EmpresaPasaje> empresasPasaje;
    private ArrayList<DepartamentoDestino> depart7,depPocos,depTodos;
    private ArrayList<String>   horario1,horario2,horario3,horario4,horario5;
    private EmpresaPasaje empresa1,empresa2,empresa3,empresa4,empresa5;
    private DepartamentoDestino depCocha,depOruro,depLaP,depPot,
            depPando,depTarija,depChuq,depBeni,depSant;
    //private String nombre;
    private String hora1,hora2,hora3,hora4,hora5,hora6,hora7,hora8,hora9,hora10,
                   hora11,hora12,hora13,hora14,hora15,hora16,hora17,hora18,
            hora01,hora02,hora03,hora04,hora05,hora06,hora07,hora08,hora09,hora010,
            hora011,hora012,hora013,hora014,hora015,hora016;
    private String nombE1,nombE2,nombE3,nombE4,nombE5;
    public IniciadorEmpresas() {
        nombE1="Trans Copacabana";nombE2="El Dorado";nombE3="yoid";
        nombE4="Yo Mencargo";nombE5="Avianca Cargo";
        
        iniciarDepart();
        crearHorarios();
        integrarHorarios();
        //integDepart();
        ArrayList<DepartamentoDestino> clonPocos=(ArrayList<DepartamentoDestino>)depPocos.clone();
        empresa1=new EmpresaPasaje(nombE1, "Bus Cama",depart7,10);
        empresa2=new EmpresaPasaje(nombE2,"Bus Cama", clonPocos,25);
        empresa3=new EmpresaPasaje(nombE3,"Avion", depTodos,100);
        empresa4=new EmpresaPasaje(nombE4,"miniBus", depTodos,20);
        empresa5=new EmpresaPasaje(nombE5,"Avion", depart7,150);
        aniadirEmpresas();
    }
    
    public void iniciarDepart(){
        depCocha=new DepartamentoDestino("Cochabamba", null,30);
        depOruro=new DepartamentoDestino("Oruro", null,20);
        depLaP=new DepartamentoDestino("La Paz", null,25);
        depPot=new DepartamentoDestino("Potosí", null,30);
        depPando=new DepartamentoDestino("Pando", null,15);
        depTarija=new DepartamentoDestino("Tarija", null,20);
        depChuq=new DepartamentoDestino("Chuquisaca", null,35);
        depBeni=new DepartamentoDestino("Beni", null,30);
        depSant=new DepartamentoDestino("Santa Cruz", null,25);
        
        
    }
    
    public void crearHorarios(){
        hora1="6:00";hora2="7:00";hora3="8:00";hora4="9:00";hora5="10:00";
        hora6="11:00";hora7="12:00";hora8="13:00";hora9="14:00";hora10="15:00";
        hora11="16:00";hora12="17:00";hora13="18:00";hora14="19:00";hora15="20:00";
        hora16="21:00";hora17="22:00";hora18="23:00";
        hora01="6:30";hora02="7:30";hora03="8:30";hora04="9:30";hora05="10:30";
        hora06="11:30";hora07="12:30";hora08="13:30";hora09="14:30";hora010="15:30";
        hora011="16:30";hora012="17:30";hora013="18:30";hora014="19:30";hora015="20:30";hora016="21:30";
        //hubo un error en el momento de la inicializacion de hora 14 no estaba inicializad
        horario1=new ArrayList<>();horario2=new ArrayList<>();horario3=new ArrayList<>();
        horario4=new ArrayList<>();horario5=new ArrayList<>();
        //horas 6:00 8:00
        horario1.add(hora1);horario1.add(hora3);horario1.add(hora5);horario1.add(hora7);
        horario1.add(hora9);horario1.add(hora11);horario1.add(hora13);horario1.add(hora15);
        /**/
        //horas desde las 7:00 y 9:00
        horario2.add(hora2);horario2.add(hora4);horario2.add(hora6);horario2.add(hora8);
        horario2.add(hora10);horario2.add(hora12);horario2.add(hora14);horario2.add(hora16);
        //horas desde las 6:30, 8:30,
        horario3.add(hora01);horario3.add(hora03);horario3.add(hora05);horario3.add(hora07);
        horario3.add(hora09);horario3.add(hora011);horario3.add(hora013);horario3.add(hora015);
        horario3.add(hora016);
        //horas desde las 7:30 y 8:30
        horario4.add(hora02);horario4.add(hora04);horario4.add(hora06);horario4.add(hora08);
        horario4.add(hora010);horario4.add(hora012);horario4.add(hora014);horario4.add(hora016);
        //hora desde las 6:00 y 10:00 
        horario5.add(hora01);horario5.add(hora4);horario5.add(hora8);horario5.add(hora010);
        horario5.add(hora16);horario5.add(hora18);horario5.add(hora17);
    }   
    
    public void integrarHorarios(){
        depCocha.setHorarios(horario1);depLaP.setHorarios(horario2);depOruro.setHorarios(horario3);
        depPot.setHorarios(horario1);depPando.setHorarios(horario3);depTarija.setHorarios(horario4);
        depChuq.setHorarios(horario5);depBeni.setHorarios(horario3);depSant.setHorarios(horario4);
        
        depart7=new ArrayList<>();depPocos=new ArrayList<>();
        depTodos=new ArrayList<>();
        
        depart7.add(depCocha);depart7.add(depChuq);depart7.add(depLaP);depart7.add(depTarija);
        depart7.add(depBeni);depart7.add(depSant);depart7.add(depPot);
        
        depPocos.add(depLaP);depPocos.add(depBeni);depPocos.add(depChuq);
        depPocos.add(depSant);
        
        depTodos.add(depCocha);depTodos.add(depLaP);depTodos.add(depOruro);
        depTodos.add(depPot);depTodos.add(depPando);depTodos.add(depChuq);
        depTodos.add(depTarija);depTodos.add(depBeni);depTodos.add(depSant);
        
    }
    public void integDepart(){
        empresa1.setDepartamentosHabiles(depart7);
        empresa2.setDepartamentosHabiles(depPocos);
        ArrayList<DepartamentoDestino> clonPocos=(ArrayList<DepartamentoDestino>)depPocos.clone();
        empresa3.setDepartamentosHabiles(clonPocos);
        empresa4.setDepartamentosHabiles(depTodos);
        empresa5.setDepartamentosHabiles(depart7);
    }
    
    public void aniadirEmpresas(){
        empresasPasaje=new ArrayList<>();
        empresasPasaje.add(empresa1);empresasPasaje.add(empresa2);empresasPasaje.add(empresa3);
        empresasPasaje.add(empresa4);empresasPasaje.add(empresa5);
        
    }
    public ArrayList<EmpresaPasaje> getEmpresasPasaje() {
        return empresasPasaje;
    }
    
}
