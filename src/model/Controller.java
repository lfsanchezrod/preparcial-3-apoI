package model;
import java.util.ArrayList;

public class Controller {
    private ArrayList<EspacioEscenico> espacios;
    private ArrayList<Artista> artistas;

    public Controller() {
        espacios = new ArrayList<>();
        artistas = new ArrayList<>();
    }
    
    public boolean requierePreparacion(Object obj){
        return obj instanceof Preparable;
    }

    public void registrarTeatro(String nombre, int cap, double precio, int palcos) {
        espacios.add(new Teatro(nombre, cap, precio, palcos));
    }

    public void registrarArtistaIndividual(String nombre, Genero genero, double tarifa, String apodo) {
        // Para simplificar, le asignamos el primer espacio escénico disponible
        EspacioEscenico espacio = espacios.isEmpty() ? null : espacios.get(0);
        artistas.add(new ArtistaIndividual(nombre, genero, tarifa, apodo, espacio));
    }

    public String obtenerDetallesArtistas() {
        StringBuilder sb = new StringBuilder();
        for (Artista artista : artistas) {
            sb.append(artista.mostrarDetalles()).append("\n");
            sb.append("Tarifa con descuento/recargo: $").append(artista.calcularTarifaFinal()).append("\n");
            sb.append("¿Requiere prep. especial?: ").append(requierePreparacion(artista)).append("\n");
            sb.append("----------------------------------\n");
        }
        return sb.toString();
    }
}