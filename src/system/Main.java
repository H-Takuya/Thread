/**
 * Created by ruth on 2016/12/05.
 */
package system;

/**
 *
 * Momが冷蔵庫へ食べ物を入れ、子供3人が冷蔵庫から食べ物を取り出し食べるマルチスレッドの実装
 * ・冷蔵庫は1人ずつしか触ることができない
 * ・冷蔵庫に食べ物は無限にはいる
 *
 */
public class Main {


    public static void main(String[] args) {
        Food food =new Food();
        Fridge fridge = new Fridge();
        MomManager momManager =new MomManager(food,fridge);


       /*
        Mom mom = new Mom(food);


        mom.cook(food);
        mom.cook(food1);
        mom.cook(food2);
        mom.cook(food3);

        */



        Child child1 = new Child("トキ",food,fridge);
        Child child2 = new Child("拳王",food,fridge);
        Child child3 = new Child("ケンシロウ",food,fridge);




        momManager.start();
        child1.start();
        child2.start();
        child3.start();

        /*

        long limit = 30000; //終了までの時間(ミリ秒)
        long start = System.currentTimeMillis(); //開始時間(ミリ秒)
        long now = System.currentTimeMillis(); //現在時間(ミリ秒)
        while (now < start + limit) {
            //終了時間まで待つ
            now = System.currentTimeMillis();
        }
        */



        child1.over();
        child2.over();
        child3.over();

    }


    /*
    子供が食べ物を食べなくても処理が終了してしまう
    →childクラスのrun()内には一回参照したらやめるとかの処理がない

     */



}
