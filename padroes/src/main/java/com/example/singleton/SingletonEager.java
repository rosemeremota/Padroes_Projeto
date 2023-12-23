package com.example.singleton;

/**
 * Singleton "apressado"
 * @author Rosemere Mota
 */
public class SingletonEager {
  
    private static SingletonEager instance =  new SingletonEager();
    
    // deixar o contrutor como privado
    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        
        return instance;
    }
    
}
