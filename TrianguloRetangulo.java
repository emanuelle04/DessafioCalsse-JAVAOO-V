class TrianguloRetangulo extends Generica{
  TrianguloRetangulo(double a, double b){
    super(a, b);
  }

  public double calcularArea(){
    return (altura*base)/2;
  }
}