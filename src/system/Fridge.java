/**
 * Created by ruth on 2016/12/05.
 */
package system;


import java.util.ArrayList;

/**
 *
 * 冷蔵庫クラス
 * 食べ物を出し入れする
 *
 */
class Fridge {
    ArrayList<Food> list = new ArrayList<Food>();
    Food food = new Food();

    // TODO 食べ物を入れる実装
    public synchronized void PutFood(Food food){
        list.add(food);
        System.out.println("お母さんが"+food +"を冷蔵庫に入れました");
    }

    // TODO 食べ物を取り出す実装
    synchronized void GetFood(String name) {
        if (list.size() != 0) {
            /*
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            */
            list.get(0);
            System.out.println(name+"が冷蔵庫を開けて"+list.get(0)+"を食べました");
            list.remove(0);
        } else {
           System.out.println(name+"が冷蔵庫を開けましたが冷蔵庫はからです");
        }

        notifyAll();
    }



}
