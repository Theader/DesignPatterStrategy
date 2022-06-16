package br.com.Strategy;

import java.io.Console;

public class Program {
    public static void main(String[] args) {
         ContextStrategy voContext = new ContextStrategy(new DHL());
         System.out.println(voContext.Calcular(10));

        voContext = new ContextStrategy(new FedEx());
        System.out.println(voContext.Calcular(10));

        voContext = new ContextStrategy(new Sedex());
        System.out.println(voContext.Calcular(10));
    }
}
