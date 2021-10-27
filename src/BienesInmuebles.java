import java.util.Calendar;

public class BienesInmuebles {
    String Direccion;
    float Tasacion;
    short CantAmbientes;
    int m2Totales;
    short m2Cubiertos;
    
    
    BienesInmuebles(String Direccion, float Tasacion, short CantAmbientes, int m2Totales, short m2Cubiertos) {
        this.Direccion = Direccion;
        this.Tasacion = Tasacion;
        this.CantAmbientes = CantAmbientes;
        this.m2Totales = m2Totales;
        this.m2Cubiertos = m2Cubiertos;
    }
    BienesInmuebles() {
        m2Cubiertos = -1;
        m2Totales = -1;
    }
    
    

    public String   getDireccion() {return Direccion;}
    public float    getTasacion() {return Tasacion;}
    public short    getCantAmbientes() {return CantAmbientes;}
    public int      getM2Totales() {return m2Totales;}
    public short    getM2Cubiertos() {return m2Cubiertos;}
    public void     setDireccion(String Direccion) {this.Direccion = Direccion;}
    public void     setTasacion(float Tasacion) {this.Tasacion = Tasacion;}
    public void     setCantAmbientes(short CantAmbientes) {this.CantAmbientes = CantAmbientes;}
    public void     setM2Totales(int m2Totales) {this.m2Totales = m2Totales;}
    public void     setM2Cubiertos(short m2Cubiertos) {this.m2Cubiertos = m2Cubiertos;}
}

class Casas extends BienesInmuebles {
    fecha Antiguedad;
    
    Casas(String Direccion, float Tasacion, short CantAmbientes, int m2Totales, short m2Cubiertos, fecha Antiguedad) {
        super();
        this.Antiguedad = Antiguedad;
    }
    Casas() {
        super();
        Antiguedad = new fecha();
    }

    public fecha getAntiguedad() {return Antiguedad;}
    public void setAntiguedad(fecha Antiguedad) {this.Antiguedad = Antiguedad;}
}

class Departamentos extends BienesInmuebles {
    int Piso;
    String Identificacion;

    Departamentos(String Direccion, float Tasacion, short CantAmbientes, int m2Totales, short m2Cubiertos, int Piso, String Identificacion) {
        super();
        this.Piso = Piso;
        this.Identificacion = Identificacion;
    }
    Departamentos() {
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