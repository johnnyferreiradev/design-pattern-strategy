public class ImpostoCE implements Imposto {
  @Override
  public double calcularValorDoImposto(double totalBruto) {
    double result = totalBruto * 0.1;
    return result;
  }
}