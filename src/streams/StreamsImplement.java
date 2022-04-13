package streams;

import entity.Persona;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamsImplement {

    private ArrayList<Persona> personas;
    List<String> ciudades;

    public void filtrarPorNombre(ArrayList<Persona> personas, String nombre) {
        personas.stream().filter(persona -> persona.getName().startsWith(nombre)).forEach(System.out::println);
    }

    public void filtrarPorEmail(ArrayList<Persona> personas, String email) {
        personas.stream().filter(persona -> persona.getEmail().startsWith(email)).forEach(System.out::println);
    }

    public List<String> filtrarCiudades(ArrayList<Persona> personas) {

        ciudades = personas.stream().map(p -> p.getBirthplace()).distinct().collect(Collectors.toList());
        return ciudades;

    }

    public void contarCiudades() {
        long cantidadCiudades = ciudades.stream().count();
        System.out.println("Hay " + cantidadCiudades + " ciudades");
    }

    public void filtrarMails(ArrayList<Persona> personas) {
        personas.stream().filter(p -> p.getEmail().contains("elite")).forEach(System.out::println);
    }

    public void triplicadosMayoresA29k(ArrayList<Persona> personas) {
        personas.stream().filter(p -> p.getAmount() * 3 > 29000).forEach(System.out::println);
    }
    
    public void promedio(ArrayList<Persona> personas){
        Integer a = personas.stream().map(p -> p.getAmount()).reduce(0, Integer::sum);
        Long l = personas.stream().count();
        a = a/l.intValue();
        System.out.println("El promedio es: $" + a);
    }
    
    public void montoMenor(ArrayList<Persona> personas){
        Persona persona = personas.stream().sorted((x,y) -> x.getAmount().compareTo(y.getAmount())).collect(Collectors.toList()).get(0);
        System.out.println("Persona con menor monto: " + persona);
                
    }
    public void montoMayor(ArrayList<Persona> personas){
        Persona persona = personas.stream().sorted((x,y) -> x.getAmount().compareTo(y.getAmount())).collect(Collectors.toList()).get(personas.size()-1);
        System.out.println("Persona con mayor monto: " + persona);
                
    }
}
