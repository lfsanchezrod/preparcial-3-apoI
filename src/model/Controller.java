package model;

public class Controller {
    
    public boolean requierePreparacion(Object obj){
        return obj instanceof Preparable;
    }
}
