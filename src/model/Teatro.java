package model;

public class Teatro extends EspacioEscenico implements Preparable{

    private int numeroPalcos;

    public Teatro(String nombre, int capacidad, double precioBase, int numeroPalcos){
        super(nombre, capacidad, precioBase);
        this.numeroPalcos = numeroPalcos;
    }

    @Override
    public double calcularCostoAlquiler(){        
        return super.getPrecioBase()*1.20;
    }

    @Override
    public void preparacionTecnicaEspecial(){

    }
}