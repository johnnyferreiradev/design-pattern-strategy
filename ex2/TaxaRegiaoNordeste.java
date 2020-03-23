public class TaxaRegiaoNordeste implements TaxaRegiao {
  public double calcularTaxaPorRegiao(int tipo, double peso) {
    Taxa taxa = null;
    double valor = 50;
    
    if (tipo == 0) {
      taxa = new TaxaDefault();
    } else if (tipo == 1) {
      taxa = new TaxaExpress();
    }

    return taxa.calcularTaxa(peso, valor);
  }
}