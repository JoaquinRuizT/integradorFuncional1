package implement;

import entity.Persona;
import interfaces.DatosService;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatosServiceImplement implements DatosService{
    
 

    @Override
    public void menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public ArrayList<String> obtenerDatos() {
        String csvPath = "C:\\Users\\Cecilia Ruiz\\Desktop\\Integrador Funcional 1\\datos.csv";
        ArrayList<String> data = new ArrayList<>();
        try (BufferedReader csvReader = new BufferedReader(new FileReader(csvPath))) {
            String row;
            data = new ArrayList<>();
            while ((row = csvReader.readLine()) != null) {
                String dataArray = row;
                data.add(dataArray);
            }
            return data;
        }catch(FileNotFoundException FNFE){
            System.out.println("No se encontró el archivo");
        } catch (IOException ex) {
            Logger.getLogger(DatosServiceImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public String mostrarDatos(ArrayList<String> dato) {
        String datosString = "";
        for (String datos : dato) {
            datosString = datosString + datos + "\n";
        }
        return datosString;
    }

    @Override
    public String mostrarDatosDetallados(ArrayList<String> dato) {
        String datosDetalladosString = "";
        for (String datos : dato) {
            
            String[] detalles = datos.split(",");
            for (int i = 0; i<detalles.length; i++){
                if(i==0){
                    datosDetalladosString = datosDetalladosString.concat("-------------------------------") + "\n";
                }
                switch(i){
                    case 0:
                         datosDetalladosString = datosDetalladosString.concat("Nombre completo: " + detalles[i]) + "\n";
                        break;
                    case 1:
                         datosDetalladosString = datosDetalladosString.concat("email: " + detalles[i]) + "\n";
                        break;
                    case 2:
                         datosDetalladosString = datosDetalladosString.concat("Ciudad de origen: " + detalles[i]) + "\n";
                        break;
                    case 3:
                         datosDetalladosString = datosDetalladosString.concat("Cantidad de dinero: $" + detalles[i]) + "\n";
                        break;
                               
                }
                
            }
            
        }
        return datosDetalladosString;
        
    }

    @Override
    public ArrayList<Persona> obtenerPersonas(ArrayList<String> datos) {
        ArrayList<Persona> personas = new ArrayList<>();
        for (String dato : datos) {
            Persona persona = new Persona();
            String[] detalles = dato.split(",");
            for (int i = 0; i < detalles.length; i++) {
                switch (i) {
                    case 0:
                        persona.setName(detalles[i]);
                        break;
                    case 1:
                        persona.setEmail(detalles[i]);
                        break;
                    case 2:
                        persona.setBirthplace(detalles[i]);
                        break;
                    case 3:
                        persona.setAmount(Integer.parseInt(detalles[i]));
                        break;

                }
            }
            personas.add(persona);
        }
        return personas;
    }

    @Override
    public String mostrarPersonas(ArrayList<Persona> personas) {
        String personasString = "";
        for (Persona persona : personas) {
            personasString = personasString.concat(persona.toString()) + "\n";
            
        }
        return personasString;
    }
    
    

    
}