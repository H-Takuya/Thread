package system;
import system.*;




/**
 * Created by ruth on 2016/11/18.
 */
class Child extends Thread {
    private int Dish;
    private String name = null;
    private Fridge fridge = null;



    public  Child(Fridge fridge) {
        this.fridge = fridge;
    }

    public void run(){
        Food food;
        this.fridge.getFood();
     //   System.out.println( this.name + "が" + list.get( 0 ) + "を出して食べました" );
    }


}



