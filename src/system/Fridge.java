package system;

import java.util.ArrayList;

/**
 * Created by ruth on 2016/11/18.
 */

public class Fridge  {
    static ArrayList<Food> list = new ArrayList<>();
    //private int totalFood = Integer.parseInt( null );

    Food food = new Food();
    public Fridge() {

    }
    //入れる処理
    public synchronized void putFood (Food food){
        list.add( this.food );
        System.out.println( "お母さんが" + food + "を冷蔵庫に入れました" );
    }
            //取り出す処理
    public synchronized void getFood ( int n){
            if (0 != list.size()) {
                list.get( n );
            } else {
                System.out.println( "冷蔵庫は空っぽです" );
            }
    }
}





