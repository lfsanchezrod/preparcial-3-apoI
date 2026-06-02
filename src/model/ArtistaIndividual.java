package model;

public class ArtistaIndividual extends Artista implements Preparable{
    private String apodoArtistico;

    public ArtistaIndividual(String nombre, Genero genero, double tarifaBase, String apodoArtistico, EspacioEscenico espacioEscenico){
        super(nombre,genero,tarifaBase, espacioEscenico);
        this.apodoArtistico = apodoArtistico;
    }
    public double calcularTarifaFinal(){
        return super.getTarifaBase()*0.95;
    }

    @Override
    public void preparacionTecnicaEspecial(){

    }

    @Override
    public String mostrarDetalles(){
        return super.mostrarDetalles() + "\nTipo de artista: " +  this.getClass().getSimpleName();
    }
}
