package system;

/**
 * Created by ruth on 2016/11/18.
 */
 class Mom extends Thread{

    private Fridge fridge = null;
    private Food food = null;

    public Mom(Food food,Fridge fridge){
        this.fridge = fridge;
        this.food = food;

    }

    public void cook(Food food){

        System.out.println("お母さんが"+food+"を作りました");
    }
    public void run(){

        this.fridge.putFood(food);
    }

}



