package ui;

import model.Controller;
import model.Genero;

public class Executable {
    private Controller control;

    public static void main(String[] args) {
        Executable exe = new Executable();
        exe.runDemo();
    }

    public Executable(){
        control = new Controller();
    }

    public void runDemo(){
        System.out.println("--- INICIANDO DEMOSTRACIÓN DEL SISTEMA ---");
        
        // 1. Registramos un espacio (Teatro)
        control.registrarTeatro("Teatro Jorge Isaacs", 1000, 5000000, 15);
        
        // 2. Registramos artistas
        control.registrarArtistaIndividual("Carlos Vives", Genero.MUSICA_COLOMBIANA, 1000000, "El Patrón");
        control.registrarArtistaIndividual("Andres Lopez", Genero.COMEDIA, 800000, "Pelota de Letras");

        // 3. Imprimimos los detalles demostrando el polimorfismo
        System.out.println("\n--- LISTA DE ARTISTAS ---");
        System.out.println(control.obtenerDetallesArtistas());
    }
}