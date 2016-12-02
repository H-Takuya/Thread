package system;

import java.util.ArrayList;

/**
 * Created by ruth on 2016/11/18.
 */

public class Fridge  {
    static ArrayList<Food> list = new ArrayList<>();
    //private int totalFood = Integer.parseInt( null );

    Food food = new Food();

    //入れる処理
    synchronized void putFood (Food food){
        list.add( food );
        System.out.println( "お母さんが" + food + "を冷蔵庫に入れました" );
    }

    //取り出す処理
    synchronized void getFood (int n){
            if (0 != list.size()) {
                try {
                    Thread.sleep((long) (Math.random() * 400)); //平均2秒(4秒以下のランダムな時間)
                } catch (InterruptedException e) {
                }
                list.get(n);

                list.remove(n);
            } else {
                System.out.println( "冷蔵庫は空っぽです" );
            }
    }
}





