public class ImpostoRJ implements Imposto {
  @Override
  public double calcularValorDoImposto(double totalBruto) {
    return totalBruto * 0.08;
  }
}