package br.com.Strategy;

public class FedEx implements IFrete{
    @Override
    public float CalcularFrete(float pPeso) {
        return pPeso * 6.8f;
    }
}
