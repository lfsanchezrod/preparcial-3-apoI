package model;

public class Auditorio extends EspacioEscenico{
    private TipoAuditorio tipo;

    public Auditorio(String nombre, int capacidad, double precioBase, TipoAuditorio tipo){
        super(nombre, capacidad, precioBase);
        this.tipo = tipo;
    }

    public TipoAuditorio getTipo(){
        return this.tipo;
    }

    @Override
    public double calcularCostoAlquiler(){      
        switch(this.getTipo())
            {
                case PUBLICO:
                    return super.getPrecioBase()*0.90;
                default:
                    return super.getPrecioBase();
            }  
    }
}
