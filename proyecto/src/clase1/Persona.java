package clase1;
public class Persona {

    public String dni;
    public String email;
    public String password;

    public Persona(String dnii, String emai, String pass)
    {
        establecerDni(dnii);
        establecerEmail(emai);
        establecerPassword(pass);
    }

    public String obtenerDni()
    {
        return dni;
    }

    public void establecerDni(String nom)
    {
        dni = nom;
    }
    public String obtenerEmail()
    {
        return email;
    }
    public void establecerEmail(String emai)
    {
        email=emai;
    }
    public String obtenerPassword()
    {
        return password;
    }
    public void establecerPassword(String pass)
    {
        password=pass;
    }

    void enseniar()
    {
        System.out.println("Programar");
    }
    public static void main(String[] args) {
        Persona persona =new Persona("7293845", "wer@hotmail.com","sdasd123" );
        System.out.println("Dni de la persona:" +persona.obtenerDni());
        System.out.println("Su email:" +persona.obtenerEmail());
        System.out.println("Esta en la password:" +persona.obtenerPassword());
    }
}
