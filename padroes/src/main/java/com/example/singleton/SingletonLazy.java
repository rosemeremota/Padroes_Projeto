package com.example.singleton;

/**
 * Singleton "preguisoço"
 * 
 * @author Rosemere Mota
 */
public class SingletonLazy {
 
    private static SingletonLazy instance;
    
    // deixar o contrutor como privado
    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instance == null ){

            instance = new SingletonLazy();
        }
        return instance;
    }
    
}