package model;

public class AnimalListItem {
    Animal animal;
    AnimalListItem next;

    public AnimalListItem(Animal value){
        this.animal = value;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public void setNext(AnimalListItem next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "AnimalListItem{" +
                "value=" + animal +
                ", next=" + next +
                '}';
    }
}
