package model;

public abstract class EspacioEscenico {
    private String nombre;
    private int capacidad;
    private double precioBase;

    public EspacioEscenico(String nombre, int capacidad, double precioBase){
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precioBase = precioBase;
    }

    public double getPrecioBase(){
        return this.precioBase;
    }

    public abstract double calcularCostoAlquiler();
}
