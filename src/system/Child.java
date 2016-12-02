package system;
import system.*;




/**
 * Created by ruth on 2016/11/18.
 */
class Child extends Thread {

    private  Food food = null;
    private Fridge fridge = null;



    public  Child (Food food, Fridge fridge) {
        this.food = food;
        this.fridge = fridge;
    }

    public void run(){
        fridge.getFood(0);
        System.out.println( "子供が" +food+ "を出して食べました" );
    }



}



