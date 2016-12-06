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
        Food food1 = new Food();
        Food food2 = new Food();
        Food food3 = new Food();

        Fridge fridge = new Fridge();
        Mom mom = new Mom(food);


        food.name="カレー";
        mom.cook(food);
        fridge.PutFood(food);

        food1.name="スープ";
        mom.cook(food1);
        fridge.PutFood(food1);

        food2.name ="シチュー";
        mom.cook(food2);
        fridge.PutFood(food2);

        food3.name="寿司";
        mom.cook(food3);
        fridge.PutFood(food3);



        Child child1 = new Child("トキ",food,fridge);
        Child child2 = new Child("拳王",food,fridge);
        Child child3 = new Child("ケンシロウ",food,fridge);


        child1.start();
        child2.start();
        child3.start();
        child1.over();
        child2.over();

        child3.over();
    }


}
