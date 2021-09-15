package model;

public class AnimalList {

    private AnimalListItem head;

    public void add(Animal animal) {
        if(head == null) {
            head = new AnimalListItem(animal);
        }
        else {
            getTail().setNext(new AnimalListItem(animal));
        }
    }

    private AnimalListItem getTail() {
        AnimalListItem tail = head;
        while(tail.getNext() != null) {
            tail = tail.getNext();
        }

        return tail;
    }

    public void remove(Animal animal) {
        while(head != null && head.getAnimal().equals(animal)) {
            head = head.getNext();
        }

        if (head == null) {
            return;
        }

        AnimalListItem item = head;

        while(item.getNext() != null) {
            if (item.getNext().getAnimal().equals(animal)) {
                item.setNext(item.getNext().getNext());
            }
            else {
                item = item.getNext();
            }
        }
    }

    @Override
    public String toString() {
        if (head == null) {
            return "";
        }

        StringBuilder builder = new StringBuilder(head.getAnimal().toString());
        AnimalListItem item = head.getNext();

        while (item != null) {
            builder.append(" -> ").append(item.getAnimal());
            item = item.getNext();
        }

        return builder.toString();
    }
}