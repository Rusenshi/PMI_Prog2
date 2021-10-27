public class Persona {
    long DNI;
    String Nombre;
    String Apellido;
    long Telefono;
    String EMail;
    long CUILoCUIT;
    float IngresosMensuales;
    

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
