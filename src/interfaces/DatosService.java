package interfaces;

import entity.Persona;
import java.util.ArrayList;

public interface DatosService {

    public ArrayList<String> obtenerDatos();
    public void menu();
    public String mostrarDatos(ArrayList<String> datos);
    public String mostrarDatosDetallados(ArrayList<String> datos);
    public ArrayList<Persona> obtenerPersonas(ArrayList<String> datos);
    public String mostrarPersonas(ArrayList<Persona> personas);
}