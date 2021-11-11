package pmi.prog2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import pmi.prog2.BienesInmuebles;
import pmi.prog2.Casa;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PMIProg2 {
    
    public static void main(String[] args) {
        List test = new ArrayList();
        Casa test2 = new Casa();
        //Persona p1 = new Persona("Juan","Perez",42163092,26050505,"@gmail.com",266240240,10);

        //System.out.println(Listapersonas.get(0).getNombre());
        System.out.println("Alasda");
        List<String[]> dataLines = new ArrayList<>();
        funciones func = new funciones();
        //dataLines.add(func.perstoString(p1));
        /*try{
        func.GuardarPersonas(dataLines);
        }catch(IOException e){}
        }*/
    }
}
class funciones {
    
    public funciones(){
    }
    
    public String[] perstoString(Persona p1){
        return new String[] 
            { p1.getNombre(), p1.getApellido(), 
            String.valueOf(p1.getDNI()), String.valueOf(p1.getTelefono()),
            p1.getEMail(),String.valueOf(p1.getCUILoCUIT()),String.valueOf(p1.getIngresosMensuales())
        };
        
    }
    public String[] ptoString(BienesInmuebles p){
        if(p instanceof Departamento){
            Departamento p1 = (Departamento)p;
        return new String[] 
            { p1.getDireccion(), String.valueOf(p1.getTasacion()), 
            String.valueOf(p1.getCantAmbientes()), String.valueOf(p1.getM2Totales()),
            String.valueOf(p1.getM2Cubiertos()),String.valueOf(p1.getPiso()),p1.getIdentificacion()
        };
        }else if(p instanceof Casa){
            Casa p1 = (Casa)p;
        return new String[] 
            { p1.getDireccion(), String.valueOf(p1.getTasacion()), 
            String.valueOf(p1.getCantAmbientes()), String.valueOf(p1.getM2Totales()),
            String.valueOf(p1.getM2Cubiertos()),String.valueOf(p1.getAntiguedad().getDia()),
            String.valueOf(p1.getAntiguedad().getMes()),String.valueOf(p1.getAntiguedad().getAño())
        };
        }else return null;
        
    }
    
    public List<BienesInmuebles> CargarPropiedades(String fileName) {
        List<BienesInmuebles> lista = new ArrayList<BienesInmuebles>();
        Path pathToFile = Paths.get(fileName);

        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {

            // read the first line from the text file
            String line = br.readLine();

            // loop until all lines are read
            while (line != null) {

                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");

                BienesInmuebles prop = formatear(attributes);

                // adding propiedad into ArrayList
                lista.add(prop);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return lista;
    }
    
    private static BienesInmuebles formatear(String[] metadata) {
        // Crear y retornar la persona con los metadatos dados.
        if(metadata.length==7){
         //for(int i = 0;i<metadata.length;i++){
           // System.out.println(metadata[i]);
        //}
         //System.out.println("Fin");
         BienesInmuebles temp = new Departamento(metadata[0],Float.parseFloat(metadata[1]),Short.parseShort(metadata[2]),
                Integer.parseInt(metadata[3]),Integer.parseInt(metadata[4]),
                Integer.parseInt(metadata[5]),metadata[6]);
        return temp;
        
        }else if(metadata.length==8){
            
            BienesInmuebles temp = new Casa(metadata[0],Float.parseFloat(metadata[1]),Short.parseShort(metadata[2]),
                Integer.parseInt(metadata[3]),Integer.parseInt(metadata[4]),
                Short.parseShort(metadata[5]),Short.parseShort(metadata[6]),
                Short.parseShort(metadata[7]));
            System.out.println(temp.getDireccion());
        return temp;
        
        }else return null;
    }
    
    //Metodos para guardar personas al archivo:
    public String escapeSpecialCharacters(String data) {
            String escapedData = data.replaceAll("\\R", " ");
            if (data.contains(",") || data.contains("\"") || data.contains("'")) {
                data = data.replace("\"", "\"\"");
                 escapedData = "\"" + data + "\"";
            }
            return escapedData;
             }
    public String convertToCSV(String[] data) {
        return Stream.of(data)
        .map(this::escapeSpecialCharacters)
        .collect(Collectors.joining(","));
    }
    
    public void GuardarPropiedades(List<String[]> dataLines,Boolean bool)throws IOException {
        //true cuando realiza un append
    FileWriter csvOutputFile = new FileWriter("ListadePropiedades.csv",bool);
    try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
        //Que hace esto? stream es una secuencia de elementos convierte 
        //cada arreglo de strings en una linea separadas por coma y luego el collector los coloca en el arhcivo csv
        dataLines.stream()
          .map(this::convertToCSV)
          .forEach(pw::println);
        }
    }
    public void AgregandoHipoteca() {}
        
    public void ConsultandoHipoteca() {}
    
    public void ModificandoHipoteca() {} 

    public void EliminandoHipoteca() {} 

    public void SolicitandoGarante() {}
    
    /*------------------------------------------------*/
    
    
    
    public void AgregandoPropiedad(BienesInmuebles test) {} 
    
    
    public void ConsultandoPropiedad() {}
    
    public void ModificandoPropiedad() {}
    
    public void EliminandoPropiedad() {}
    
    /*------------------------------------------------*/
    
    public void ListaPropietarios() {} 

    public void PropiedadMasHipotecada() {}
    
    public void ListaPlazosPagoMasLargo() {}
    
    public void ListaPlazosPagoMasCortos() {}
    
    public void PrestamoMayorMonto() {}
    
    public void PrestamoMenorMonto() {}
    
    public void ListaHipotecasActivas() {}
    
    public void PromM2Cubiertos() {}
}