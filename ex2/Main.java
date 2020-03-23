class Main {
  public static void main(String[] args) {
    // 0 -> Padrão; 1 -> Expresso.
    int tipo = 1;
    double peso = 1000;

    // 0 -> Sul; 1 -> Norte; 2 => Nordeste; 3 -> Suldeste; 4 -> Centro-Oeste 
    int regiao = 2;

    TaxaRegiao taxaRegiao = null;

    if (regiao == 0) {
      taxaRegiao = new TaxaRegiaoSul();
    }

    if (regiao == 1) {
      taxaRegiao = new TaxaRegiaoNorte();
    }

    if (regiao == 2) {
      taxaRegiao = new TaxaRegiaoNordeste();
    }

    if (regiao == 3) {
      taxaRegiao = new TaxaRegiaoSudeste();
    }

    if (regiao == 4) {
      taxaRegiao = new TaxaRegiaoCentroOeste();
    }
    
    double result = taxaRegiao.calcularTaxaPorRegiao(tipo, peso);

    System.out.println(result);
  }
}