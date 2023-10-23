/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class CuentaFree extends CuentaAhorro{
    private boolean numIlimitadoRetiro;

    public boolean getNumilimitadoRetiro() {
        return numIlimitadoRetiro;
    }

    public void setNumilimitadoRetiro(boolean numilimitadoRetiro) {
        this.numIlimitadoRetiro = numIlimitadoRetiro;
    }

    @Override
    public String toString() {
        return "CuentaFree{" + "numilimitadoRetiro=" + numIlimitadoRetiro + '}';
    }
    
    
    
}
    
