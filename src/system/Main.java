package system;

/**
 * Created by ruth on 2016/11/18.
 */
public class Main {
    public static void main (String[]args) throws InterruptedException {
        Food food = new Food();
        Fridge fridge =new Fridge();  //Fridgeは１回しかインスタンス化できない

        Curry curry = new Curry();
        //Soup soup =new Soup();
        //Sushi sushi = new Sushi();

        food.name="カレー";
        Mom mom = new Mom(food,fridge);

        //mom.cook( curry );

        mom.start();
        //mom.cook( soup );
        //mom.cook( sushi );

        try {
            mom.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        fridge.putFood(food);
        //fridge.putFood(soup);
        //fridge.putFood(sushi);

        Child child1 = new Child(fridge);
        child1.start();

        //Child child2 = new Child("アキラ",fridge);
        //Child child3 = new Child("タカシ",fridge);


        try {
            child1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }



}

