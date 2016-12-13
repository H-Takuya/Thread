package system;

/**
 * Created by ruth on 2016/12/06.
 */
class MomManager extends Thread{
    private Food food;
    private Fridge fridge;
    private int Dish;
    Mom mom =new Mom(food);

    public MomManager(Food food,Fridge fridge){
        this.food = food;
        this.fridge = fridge;
    }

    public void run(){
        /*
        Food food1 = new Food();
        Food food2 = new Food();
        Food food3 = new Food();
        Food food4 = new Food();
        Food food5 = new Food();
        Food food6 = new Food();


        food1.name="カレー";
        mom.cook(food1);
        fridge.PutFood(food1);

        food2.name= "シチュー";
        mom.cook(food2);
        fridge.PutFood(food2);

        food3.name = "寿司";
        mom.cook(food3);
        fridge.PutFood(food3);

        food4.name = "シシカバブ";
        mom.cook(food4);
        fridge.PutFood(food4);

        food5.name = "スープ";
        mom.cook(food5);
        fridge.PutFood(food5);

        food6.name = "ドリア";
        mom.cook(food6);
        fridge.PutFood(food6);
        */


        Food food = new Food();
        for (Dish = 1; Dish<=30;Dish++){
            mom.cook(food);
            System.out.println("お母さんが"+Dish+++"皿目を冷蔵庫に入れました" );
            fridge.PutFood(food);

            try{
                Thread.sleep((long)(Math.random() * 10));
            }catch (InterruptedException e){
                e.printStackTrace();
            }


        }

    }


}
