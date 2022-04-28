package clase1;
public class Computadora {

    public String componentes;
    public String color;
    public String peso;

    public Computadora(String compo, String colo, String pes)
    {
        establecerComponentes(compo);
        establecerColor(colo);
        establecerPeso(pes);
    }

    public String obtenerComponentes()
    {
        return componentes;
    }

    public void establecerComponentes(String compo)
    {
        componentes = compo;
    }
    public String obtenerColor()
    {
        return color;
    }
    public void establecerColor(String colo)
    {
        color=colo;
    }
    public String obtenerPeso()
    {
        return peso;
    }
    public void establecerPeso(String pes)
    {
        peso=pes;
    }

    void enseniar()
    {
        System.out.println("Comer");
    }
    public static void main(String[] args) {
        Computadora computadora =new Computadora("Tarjeta grafica", "Blanca","20 kg" );
        System.out.println("El componente:" +computadora.obtenerComponentes());
        System.out.println("El color es:" +computadora.obtenerColor());
        System.out.println("Peso:" +computadora.obtenerPeso());
    }
}
