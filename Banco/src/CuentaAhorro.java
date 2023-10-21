/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class CuentaAhorro extends CuentaBancaria{
    private double tasaInteresAnual=0.03;
    private String beneficios[];
    
    //Constructor

    public CuentaAhorro(double tasaInteresAnual, String[] beneficios) {
        this.tasaInteresAnual = tasaInteresAnual;
        this.beneficios = beneficios;
    }
    
    public double getCuentaAhorro(){
        return cuentaahorro;
    }

    public void setCuentaAhorro(double cuentaahorro){
        this.cuentaahorro=cuentaahorro;
    }
    
    public String[] getBeneficios(){
        return beneficios;
    }

    public void setBeneficios(String[] beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "tasaInteresAnual=" + tasaInteresAnual + ", beneficios=" + beneficios + '}';
    }
    
    
    
    
}
