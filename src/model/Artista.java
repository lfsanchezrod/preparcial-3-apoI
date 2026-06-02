package model;

public abstract class Artista {
    private String nombre;
    private Genero genero;
    private double tarifaBase;
    private EspacioEscenico espacioEscenico;

    public Artista(String nombre, Genero genero, double tarifaBase, EspacioEscenico espacioEscenico){
        this.nombre = nombre;
        this.genero = genero;
        this.tarifaBase = tarifaBase;
        this.espacioEscenico = espacioEscenico;
    }

    public double getTarifaBase(){
        return this.tarifaBase;
    }
    
    public abstract double calcularTarifaFinal();

    public String mostrarDetalles(){
        return "Nombre artista: " + this.nombre + "\nGenero: " + this.genero;
    }
}