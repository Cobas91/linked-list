package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListTest {

    @Test
    public void testAdd(){
        //GIVE
        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");
        Animal cow = new Animal("cow");
        AnimalList list = new AnimalList();
        //WHEN
        list.add(dog);
        list.add(cat);
        list.add(cow);

        String actual = list.toString();
        //THEN
        Assertions.assertEquals("AnimalListItem{value=Animal{name='dog'}, next=AnimalListItem{value=Animal{name='cat'}, next=AnimalListItem{value=Animal{name='cow'}, next=null}}}",actual);
    }

}