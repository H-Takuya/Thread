package system;

/**
 * Created by ruth on 2016/11/18.
 */
 class Mom {

    Food food = new Food();
    private Fridge fridge;

    public Mom(Food food,Fridge fridge){
        this.fridge = fridge;
        this.food = food;
    }


    public void cook(Food food) {
        System.out.println(food+"を作りました");
        this.fridge.putFood(this.food);
    }
}





