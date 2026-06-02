package model;

public class GrupoArtistico extends Artista{

    private int numeroIntegrantes;

    public GrupoArtistico(String nombre, Genero genero, double tarifaBase, int numeroIntegrantes, EspacioEscenico espacioEscenico){
        super(nombre, genero, tarifaBase, espacioEscenico);
        this.numeroIntegrantes = numeroIntegrantes;
    }

    @Override
    public double calcularTarifaFinal(){
        return super.getTarifaBase()*1.15;
    }

    @Override
    public String mostrarDetalles(){
        return super.mostrarDetalles() +"\nTipo de artista: " + this.getClass().getSimpleName();
    }
}
