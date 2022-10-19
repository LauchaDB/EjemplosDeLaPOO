package Interfaz;

public abstract class Animal implements AccionesBasicas{

    String especie;

    @Override
    public void dormir() {
        System.out.println("durmiendo donde pueda");
    }
}
