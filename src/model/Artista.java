package model;

public abstract class Artista {
    private String nombre;
    private Genero genero;
    private double tarifaBase;

    public Artista(String nombre, Genero genero, double tarifaBase){
        this.nombre = nombre;
        this.genero = genero;
        this.tarifaBase = tarifaBase;
    }
    
    public abstract void calcularTarifaFinal();
}