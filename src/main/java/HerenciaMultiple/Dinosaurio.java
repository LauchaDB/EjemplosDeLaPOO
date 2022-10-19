package HerenciaMultiple;

public abstract class Dinosaurio {
    float altura;
    float longitud;
    float peso;
    String especie;
    float velocidadMovimiento;

    public Dinosaurio() {
    }

    abstract void comer();

    public void avanzar(){
        System.out.println("ir hacia adelante");
    }

    public void retroceder(){
        System.out.println("ir hacia atras");
    }
}
