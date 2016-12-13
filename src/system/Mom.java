package system;

/**
 * Created by ruth on 2016/12/05.
 /
 package jp.system;
 /**
 *
 * 母親クラス
 * 食べ物を作る
 *
 */
class Mom {
    Food food = new Food();

    public Mom(Food food) {
        this.food = food;
    }

    // TODO 料理を作る
    public void cook(Food food){
        this.food = food;
        System.out.println("お母さんが"+food+"を作りました");
    }
}