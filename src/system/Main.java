package system;

/**
 * Created by ruth on 2016/11/18.
 */
public class Main {
    public static void main (String[]args) throws InterruptedException {
        Food food = new Food();
        Fridge fridge =new Fridge();   //Fridgeは１回しかインスタンス化できない

        Mom mom = new Mom(food,fridge);
        food.name="カレー";
        mom.cook( food );
        food.name= "スープ";
        mom.cook( food );
        food.name= "寿司";

        mom.start();


        try {
            mom.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        fridge.putFood(food);


        Child child1 = new Child(food,fridge);
        Child child2 = new Child( food,fridge );
        Child child3 = new Child( food,fridge );
        child1.start();
        child2.start();
        child3.start();

        try {
            child1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }



}

