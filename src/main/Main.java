package main;

import entity.Persona;
import implement.DatosServiceImplement;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import streams.StreamsImplement;

public class Main {
    
    
    
    public static void main(String[] args) {

        DatosServiceImplement DSI = new DatosServiceImplement();
        ArrayList<String> dato = DSI.obtenerDatos();

        ArrayList<Persona> personas = new ArrayList<>();
        personas = DSI.obtenerPersonas(dato);
        
        StreamsImplement streams = new StreamsImplement();
        //3)
        streams.filtrarPorNombre(personas, "Giselle Marshall");
        //4)
        streams.filtrarPorEmail(personas, "imperdiet.non@enim.org");
        //5)
        List<String> ciudades = streams.filtrarCiudades(personas);
        //6)
        streams.filtrarMails(personas);
        //7)  
        streams.triplicadosMayoresA29k(personas);
        //8)
        streams.promedio(personas);
        //9)
        streams.montoMenor(personas);
        //10
        streams.montoMayor(personas);
        
        
    }
    
    
}
