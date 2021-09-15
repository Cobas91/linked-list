import model.Animal;
import model.AnimalList;
import model.AnimalListItem;

public class AppMain {
    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");
        Animal cow = new Animal("cow");
        Animal horse = new Animal("horse");
        Animal chicken = new Animal("chicken");
        Animal bird = new Animal("bird");

        AnimalList list = new AnimalList();

        list.add(dog);
        list.add(cat);
        list.add(horse);
        list.add(horse);
        list.add(cow);
        list.add(chicken);
        list.add(bird);


        list.remove(horse);

        System.out.println(list);
    }
}