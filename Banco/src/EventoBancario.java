/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Date;
/**
 *
 * @author sebas
 */
public class EventoBancario {
    private Date fecha;
    private String tituloEvento;
    private String descripcionEvento;

    public EventoBancario(Date fecha, String tituloEvento, String descripcionEvento) {
        this.fecha = fecha;
        this.tituloEvento = tituloEvento;
        this.descripcionEvento = descripcionEvento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTituloEvento() {
        return tituloEvento;
    }

    public void setTituloEvento(String tituloEvento) {
        this.tituloEvento = tituloEvento;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }

    @Override
    public String toString() {
        return "EventoBancario{" + "fecha=" + fecha + ", tituloEvento=" + tituloEvento + ", descripcionEvento=" + descripcionEvento + '}';
    }
    
    
    
}
