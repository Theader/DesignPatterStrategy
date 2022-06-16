package br.com.Strategy;

public class Sedex implements IFrete {
    @Override
    public float CalcularFrete(float pPeso) {
        return pPeso * 4.2f;
    }
}
