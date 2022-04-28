package clase1;

public class Main {
    
    public static void main(String[] args) 
    {
        System.out.println("Clase universidad");
        Universidad universidad =  new Universidad("Udh", "Esperanza", "Huánuco");
        System.out.println(universidad.obtenerNombre());
    }

}
