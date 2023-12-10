package lesson18.lessoncode.abstraction.abstractAnimal;

public class Parrot extends Animal {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void voice(){
        System.out.println("My parrot: " + getName());
    }

}
