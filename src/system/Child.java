/**
 * Created by ruth on 2016/12/05.
 */

    package system;

import java.io.FileReader;

/**
     *
     * 子供クラス
     * 食べ物を食べる
     *
     * @author higa_takuya
     *
     */

    class Child extends Thread{
        private String name;
        Food food = new Food();
        private Fridge fridge;
        private boolean hungry = true;

        public Child(String name, Food food, Fridge fridge){
            this.name = name;
            this.food = food;
            this.fridge = fridge;

        }

        public void run(){
            while (hungry) {
            fridge.GetFood(name);
        try{
            Thread.sleep((long)(Math.random() * 20));
        }catch (InterruptedException e){
            e.printStackTrace();
        }


            }
        }

        public void over(){

                hungry = false;


        }

    }



