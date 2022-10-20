package HerenciaMultiple;

public interface Omnivoro extends Herbivoro, Carnivoro, Animal {

    default void comerDeTodo(){
        comerFruto();
        comerPlanta();
        comerPresa();
    }
}
