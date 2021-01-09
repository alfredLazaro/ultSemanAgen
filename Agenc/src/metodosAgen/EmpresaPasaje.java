/*
 * 
 */
package metodosAgen;

import java.util.ArrayList;

/**
 * @author USUARIO
 */
public class EmpresaPasaje {
    private String nombreEmpresa;
    private String tipoTransporte;
    //private int nroIdeEmpres;//nose si sea del todo necesaria
    private int precioEmprPasa; //es un extra al pasaje normal de cada Departamento
    private ArrayList<DepartamentoDestino> departamentosHabiles;

    public EmpresaPasaje(String nombreEmpresa, String tipoTransporte, ArrayList<DepartamentoDestino> departamentosHabiles,int pasajEmpr) {
        this.nombreEmpresa = nombreEmpresa;
        this.tipoTransporte = tipoTransporte;
        this.departamentosHabiles = departamentosHabiles;
        precioEmprPasa=pasajEmpr;
        calcularPrecios(pasajEmpr);
    }
    
    public void calcularPrecios(int precEmp){
        for (DepartamentoDestino departamentosHabile : departamentosHabiles) {
            int precioAc=departamentosHabile.getPrecioPasaj()+precioEmprPasa;
            departamentosHabile.setPrecioPasaj(precioAc);//se actualiza el precio con el extra de la empresa
            
        }
    }
    //zona de geters
    
    public ArrayList<DepartamentoDestino> getDepartamentosHabiles() {
        return departamentosHabiles;
    }
    
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public int getPrecioEmprPasa() {
        return precioEmprPasa;
    }
    
    //zona de seters

    public void setDepartamentosHabiles(ArrayList<DepartamentoDestino> departamentosHabiles) {
        this.departamentosHabiles = departamentosHabiles;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public void setPrecioEmprPasa(int precioEmprPasa) {
        this.precioEmprPasa = precioEmprPasa;
    }
    
    
}
