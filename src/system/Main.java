package system;

import system.*;

/**
 * Created by ruth on 2016/11/18.
 */
public class Main {
    public static void main (String[]args){

        Food food = new Food("カレー");



        Mom mom = new Mom();
        mom.cook(food);


        Fridge fridge = new Fridge();
        fridge.input(food);



        fridge.output(food);

        Child child = new Child();
        child.eat(food);



    }
}
