package com.example;

import com.example.facade.Facade;
import com.example.singleton.SingletonEager;
import com.example.singleton.SingletonLazy;
import com.example.singleton.SingletonLazyHolder;
import com.example.strategy.Comportamento;
import com.example.strategy.ComportamentoAgressivo;
import com.example.strategy.ComportamentoDefensivo;
import com.example.strategy.ComportamentoNormal;
import com.example.strategy.Robo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Validando o Padrão de projetos Singleton");
        System.out.println("Singleton lazy");

        SingletonLazy lazy =  SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        System.out.println("Singleton Eager");

        SingletonEager eager =  SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);


        System.out.println("Singleton LazyHolder");

        SingletonLazyHolder lazerHolder =  SingletonLazyHolder.getInstancia();
        System.out.println(lazerHolder);
        lazerHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazerHolder);

        System.out.println("*********************");
        System.out.println("Strategy");

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.mover();       
        
        
        robo.setStrategy(normal);
        robo.mover();

        robo.setStrategy(agressivo);
        robo.mover();

         System.out.println("*********************");
        System.out.println("Facede");

        Facade facade = new Facade();
        facade.migrarClienete("Rosemere", "53250-260");






    }
}