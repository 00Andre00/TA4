package clase1;
public class Carro {

    public String tipo;
    public String motor;
    public String marca;

    public Carro(String compo, String moto, String marc)
    {
        establecerTipo(compo);
        establecerMotor(moto);
        establecerMarca(marc);
    }

    public String obtenerTipo()
    {
        return tipo;
    }

    public void establecerTipo(String compo)
    {
        tipo = compo;
    }
    public String obtenerMotor()
    {
        return motor;
    }
    public void establecerMotor(String moto)
    {
        motor=moto;
    }
    public String obtenerMarca()
    {
        return marca;
    }
    public void establecerMarca(String marc)
    {
        marca=marc;
    }

    void enseniar()
    {
        System.out.println("Comer");
    }
    public static void main(String[] args) {
        Carro carro =new Carro("Sedan", "1600","Toyota" );
        System.out.println("Tipo de carro:" +carro.obtenerTipo());
        System.out.println("El motor es:" +carro.obtenerMotor());
        System.out.println("Marca del carro:" +carro.obtenerMarca());
    }
}
