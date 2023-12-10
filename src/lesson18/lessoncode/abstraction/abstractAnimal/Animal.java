package lesson18.lessoncode.abstraction.abstractAnimal;

abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void voice();
}
