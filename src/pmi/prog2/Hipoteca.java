package pmi.prog2;



public class Hipoteca {
    float Capital;
    int InteresMensual;
    fecha fechaDesde;
    fecha fechaHasta;
    float cuotaMensual;
    Persona Propietario;
    
    Persona Garante;
    Boolean esCasa;
    BienesInmuebles Propiedad;
    
    Hipoteca() {
        Capital = -1;
        InteresMensual = -1;
        fechaDesde = new fecha();
        fechaHasta = new fecha();
        cuotaMensual = -1;
        Propietario.DNI = -1;
        Garante.DNI = -1;
        Propiedad.m2Totales = Propiedad.m2Cubiertos = -1;
    } // Constructor base
    
    Hipoteca(float Capital, int InteresMensual, fecha fechaDesde, fecha fechaHasta, float cuotaMensual, Persona Propietario, Persona Garante, Boolean esCasa, BienesInmuebles Propiedad) {
        this.Capital = Capital;
        this.InteresMensual = InteresMensual;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.cuotaMensual = cuotaMensual;
        this.Propietario = Propietario;
        this.Garante = Garante;
        this.esCasa = esCasa;
        this.Propiedad = Propiedad;
    } // Constructor completo
    
    Hipoteca(float Capital, int InteresMensual, fecha fechaDesde, fecha fechaHasta, float cuotaMensual, Persona Propietario, Boolean esCasa, BienesInmuebles Propiedad) {
        this.Capital = Capital;
        this.InteresMensual = InteresMensual;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.cuotaMensual = cuotaMensual;
        this.Propietario = Propietario;
        this.Garante.DNI = -1;
        this.esCasa = esCasa;
        this.Propiedad = Propiedad;
    } // Constructor completo sin garante
    
    
    
    public Persona  getPropietario() {return Propietario;}
    public float    getCapital() {return Capital;}
    public int      getInteresMensual() {return InteresMensual;}
    public fecha    getFechaDesde() {return fechaDesde;}
    public fecha    getFechaHasta() {return fechaHasta;}
    public float    getCuotaMensual() {return cuotaMensual;}
    public void     setCapital(float Capital) {this.Capital = Capital;}
    public void     setInteresMensual(int InteresMensual) {this.InteresMensual = InteresMensual;}
    public void     setFechaDesde(fecha fechaDesde) {this.fechaDesde = fechaDesde;}
    public void     setFechaHasta(fecha fechaHasta) {this.fechaHasta = fechaHasta;}
    public void     setCuotaMensual(float cuotaMensual) {this.cuotaMensual = cuotaMensual;}
    public void     setPropietario(Persona Propietario) {this.Propietario = Propietario;}
    
    
    public Boolean  tieneGarante() {return (Garante.DNI != -1);}
    public void     setGarante(Persona Garante) {this.Garante = Garante;}
    public Persona  getGarante() {return Garante;}
    
    public Boolean  esCasa() {return esCasa;}
    public void     setTipoPropiedad(Boolean esCasa) {this.esCasa = esCasa;}
    public BienesInmuebles getPropiedad() {return Propiedad;}
    public void     setPropiedadCasa(Casa casa) {Propiedad = casa;} // en el programa principal: si es casa (esCasa()) usa este, sino el setPropiedadDpto
    public void     setPropiedadDepto(Departamento depto) {Propiedad = depto;} // Polimorfismo de BienesInmuebles a Departamentos/Casas
    
}

