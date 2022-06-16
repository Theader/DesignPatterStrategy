package br.com.Strategy;

public class ContextStrategy {
    private IFrete _context;

    public float Calcular(float pPeso){
        return _context.CalcularFrete(pPeso);
    }
    public ContextStrategy(IFrete _frete){
        this._context = _frete;
    }

}
