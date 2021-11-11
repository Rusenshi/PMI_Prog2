package pmi.prog2;

import java.util.ArrayList;
import java.util.List;



public class Persona {
    long DNI;
    String Nombre;
    String Apellido;
    long Telefono;
    String EMail;
    long CUILoCUIT;
    float IngresosMensuales;
    List<Hipoteca> propiedades = new ArrayList<Hipoteca>();
    List<Hipoteca> garantias  = new ArrayList<Hipoteca>(); 
    
    public Persona(String nombre, String apellido, long DNI,
            long telefono, String EMail, long cuit, float ingresos){
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.DNI = DNI;
        this.Telefono = telefono;
        this.EMail = EMail;
        this.CUILoCUIT = cuit;
        this.IngresosMensuales = ingresos;
    }
    public Persona(){
        Nombre = "AAAA";
        DNI = 0;
        Apellido = "AAAA";
        Telefono = 56;
        EMail = "AAAA";
        CUILoCUIT = 0;
        IngresosMensuales =0;
            
    }

    public long     getDNI() {return DNI;}
    public String   getNombre() {return Nombre;}
    public String   getApellido() {return Apellido;}
    public long     getTelefono() {return Telefono;}
    public String   getEMail() {return EMail;}
    public long     getCUILoCUIT() {return CUILoCUIT;}
    public float    getIngresosMensuales() {return IngresosMensuales;}
    public void     setDNI(long DNI) {this.DNI = DNI;}
    public void     setNombre(String Nombre) {this.Nombre = Nombre;}
    public void     setApellido(String Apellido) {this.Apellido = Apellido;}
    public void     setTelefono(long Telefono) {this.Telefono = Telefono;}
    public void     setEMail(String EMail) {this.EMail = EMail;}
    public void     setCUILoCUIT(long CUILoCUIT) {this.CUILoCUIT = CUILoCUIT;}
    public void     setIngresosMensuales(float IngresosMensuales) {this.IngresosMensuales = IngresosMensuales;}
}
