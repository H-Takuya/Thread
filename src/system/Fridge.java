package system;

import java.util.ArrayList;

/**
 * Created by ruth on 2016/11/18.
 */

public class Fridge extends Thread {
    static ArrayList<Food> list = new ArrayList<>();

    //入れる処理
     public putFood(Food food) {
            while (list.size() != 0) {
                try{
                    wait();
                    list.add( food );
                    System.out.println( food + "を冷蔵庫に入れました" );
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }

    }



    //取り出す処理
    public synchronized void getFood(){

        if (0 != list.size()){
            list.get(0);
            }else {
            System.out.println("冷蔵庫は空っぽです");
        }


    }

    public void putFood() {
    }
}
