package br.com.Strategy;

public class DHL implements IFrete{
    @Override
    public float CalcularFrete(float pPeso) {
        return pPeso * 10.6f;
    }
}
