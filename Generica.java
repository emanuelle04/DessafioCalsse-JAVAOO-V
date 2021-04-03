public class Generica{
  public double base;
  public double altura; 

  Generica(double b, double a){
    base = b;
    altura = a;
  }

  public double calcularArea(){
    return altura * base;
  }
}