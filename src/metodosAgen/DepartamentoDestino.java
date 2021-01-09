/*

 */
package metodosAgen;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class DepartamentoDestino {
    private String nombreDepartament;
    private ArrayList<String> horarios; //se sigue el modelo HH:MM
    private int precioPasaj;

    public DepartamentoDestino(String nombreDepartament, ArrayList<String> horarios,int precioPasaj) {
        this.nombreDepartament = nombreDepartament;
        this.horarios = horarios;
        this.precioPasaj=precioPasaj;
    }
    //zona de geters

    public ArrayList<String> getHorarios() {
        return horarios;
    }

    public String getNombreDepartament() {
        return nombreDepartament;
    }

    public int getPrecioPasaj() {
        return precioPasaj;
    }
    
    //zona de seters

    public void setHorarios(ArrayList<String> horarios) {
        this.horarios = horarios;
    }

    public void setNombreDepartament(String nombreDepartament) {
        this.nombreDepartament = nombreDepartament;
    }

    public void setPrecioPasaj(int precioPasaj) {
        this.precioPasaj = precioPasaj;
    }
    
    
}
