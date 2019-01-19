package collectionpractice.threadconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadDemo {


    static class MyRunnable implements Runnable{

        List<Integer> list;
        int[] elementsToAdd;

        public MyRunnable(List<Integer> list, int[] elementsToAdd){
            this.list = list;
            this.elementsToAdd = elementsToAdd;
        }

        @Override
        public void run() {

            for (int element : elementsToAdd){
                list.add(element);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    static abstract class Person{
        abstract void walk();
    }

    public static void main(String[] args) {

        /*
        1. BY EXTENDING THREAD CLASS
        2. BY IMPLEMENTING RUNNABLE
        diff ?

         */

        List<Integer> list = new ArrayList<>();
        // 1, 2, 3, 4, 5
        // 6, 7, 8, 9, 10

        //1, 2, 3, ... 10
        int [] arr1 = {1, 2, 3, 4, 5};

        MyRunnable r1 = new MyRunnable(list, arr1);
        Thread t1 = new Thread(r1);


        int[]arr2 = {6, 7, 8, 9, 10};
        MyRunnable r2 = new MyRunnable(list, arr2);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(list);







        /*
        // object of anonymous class that extends abstract class Person.
        Person person = new Person(){
            @Override
            void walk() {

            }
        };

        MyRunnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable); // needs an object of class that implements runnable.
        myThread.start();


        // an object of anonymous class that implements runnable interface/
        new Runnable(){
            @Override
            public void run() {

            }
        };
        */




        /*
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable: " + Thread.currentThread().getName());
            }
        });
        t.start();
        */


        //System.out.println("inside main: " + Thread.currentThread().getName());
    }
}
