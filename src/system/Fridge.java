package system;

import java.util.ArrayList;

/**
 * Created by ruth on 2016/11/18.
 */
public class Fridge {
    static ArrayList<Food> list = new ArrayList<>();

    //入れる処理
    static void input(Food food){
        list.add(food);
    }

    //取り出す処理
    static void output(Food food){
        if (0 != list.size()){
            list.get(1);
            }else {
            System.out.println("冷蔵庫は空っぽです");
        }


    }
}
