class Main {
  public static void main(String[] args) {
    float totalBruto = 1000;
    String estado = new String("CE");
  
    Imposto imposto = null;

    if (estado.equals("CE")) {
      imposto = new ImpostoCE();
    }

    if (estado.equals("RJ")) {
      imposto = new ImpostoRJ();
    }

    if (estado.equals("SP")) {
      imposto = new ImpostoSP();
    }

    System.out.println(imposto.calcularValorDoImposto(totalBruto));
  }
}