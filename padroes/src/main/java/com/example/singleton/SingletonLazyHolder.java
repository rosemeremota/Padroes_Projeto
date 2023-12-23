package com.example.singleton;

/**
 * Singleton "Lazy Holder"
 * @see <a href= "https://stackoverflow.com/a/24018148">Referencia</a>
 * @author Rosemere Mota
 */
public class SingletonLazyHolder {


    // classe para encapsular a instancia
    // modelo mais rapido 
    private static class InstanceHolder{
     public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }
    
    // deixar o contrutor como privado
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        
        return InstanceHolder.instance;
    }
    
}