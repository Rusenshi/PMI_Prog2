package pmi.prog2;



import java.util.Calendar;

public class BienesInmuebles {
    String Direccion;
    float Tasacion;
    short CantAmbientes;
    int m2Totales;
    int m2Cubiertos;
    
    
    public BienesInmuebles(String Direccion, float Tasacion, short CantAmbientes, int m2Totales, int m2Cubiertos) {
        this.Direccion = Direccion;
        this.Tasacion = Tasacion;
        this.CantAmbientes = CantAmbientes;
        this.m2Totales = m2Totales;
        this.m2Cubiertos = m2Cubiertos;
    }
    public BienesInmuebles() {
        m2Cubiertos = -1;
        m2Totales = -1;
    }
    
    

    public String   getDireccion() {return Direccion;}
    public float    getTasacion() {return Tasacion;}
    public short    getCantAmbientes() {return CantAmbientes;}
    public int      getM2Totales() {return m2Totales;}
    public int    getM2Cubiertos() {return m2Cubiertos;}
    public void     setDireccion(String Direccion) {this.Direccion = Direccion;}
    public void     setTasacion(float Tasacion) {this.Tasacion = Tasacion;}
    public void     setCantAmbientes(short CantAmbientes) {this.CantAmbientes = CantAmbientes;}
    public void     setM2Totales(int m2Totales) {this.m2Totales = m2Totales;}
    public void     setM2Cubiertos(int m2Cubiertos) {this.m2Cubiertos = m2Cubiertos;}
}

class Casa extends BienesInmuebles {
    fecha Antiguedad;
    
    Casa(String Direccion, float Tasacion, short CantAmbientes, int m2Totales, int m2Cubiertos, short d,short m,short a) {
        super(Direccion,Tasacion,CantAmbientes,m2Totales,m2Cubiertos);
        fecha f = new fecha(d,m,a);
        this.Antiguedad = f;
    }
    Casa() {
        super();
        Antiguedad = new fecha();
    }

    public fecha getAntiguedad() {return Antiguedad;}
    public void setAntiguedad(fecha Antiguedad) {this.Antiguedad = Antiguedad;}
}

class Departamento extends BienesInmuebles {
    int Piso;
    String Identificacion;

    Departamento(String Direccion, float Tasacion, short CantAmbientes, int m2Totales, int m2Cubiertos, int Piso, String Identificacion) {
        super(Direccion,Tasacion,CantAmbientes,m2Totales,m2Cubiertos);
        this.Piso = Piso;
        this.Identificacion = Identificacion;
    }
    Departamento() {
        super();
        Piso = -1;
        Identificacion = "NULL";
    }
    
    public int      getPiso() {return Piso;}
    public String   getIdentificacion() {return Identificacion;}
    public void     setPiso(int Piso) {this.Piso = Piso;}
    public void     setIdentificacion(String Identificacion) {this.Identificacion = Identificacion;}
}


class fecha {
    int dia, mes, año;
    Calendar fecha = Calendar.getInstance();
    
    fecha() {
        año = fecha.get(Calendar.YEAR);
        mes = fecha.get(Calendar.MONTH)+1;
        dia = fecha.get(Calendar.DAY_OF_MONTH);
    }
    
    
    fecha(short dia, short mes, short año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int  getDia() {return dia;}
    public int  getMes() {return mes;}
    public int  getAño() {return año;}
    public void setDia(int dia) {this.dia = dia;}
    public void setMes(int mes) {this.mes = mes;}
    public void setAño(int año) {this.año = año;}
    
    @Override
    public String toString() {
        return mes+"/"+dia+"/"+año;
    }
    
}