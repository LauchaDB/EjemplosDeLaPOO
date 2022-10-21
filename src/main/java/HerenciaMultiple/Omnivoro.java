package HerenciaMultiple;

public interface Omnivoro extends Herbivoro, Carnivoro {

    default void comerDeTodo(){
        comerFruto();
        comerPlanta();
        comerPresa();
    }
}
