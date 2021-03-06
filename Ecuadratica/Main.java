package Ecuadratica;

class Main
{
  public static void main(String[] args)
  {
    Ecuacion ecuacion = new Ecuacion();
    ecuacion.establecerVariableA(2);
    ecuacion.establecerVariableB(-14);
    ecuacion.establecerVariableC(24);
    if (ecuacion.discriminante()>0)
    {
      System.out.println("a = "+ecuacion.obtenerVariableA());
      System.out.println("b = "+ecuacion.obtenerVariableB());
      System.out.println("c = "+ecuacion.obtenerVariableC());
      System.out.println("Se tiene para x1 = "+ecuacion.ecuacion());
      System.out.println("Se tiene para x2 = "+ecuacion.ecuacion2());
    }
    else
    {
    System.out.println("La discriminante e igual a: "+ecuacion.discriminante());
    System.out.println("No tiene solucion real");
    }
  }
}