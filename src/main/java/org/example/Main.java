package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

   /*// => true dönmeli(Gece 1'de köpeğimiz havlıyor)
      System.out.println(shouldWakeUp (true, 1));

      // => false dönmeli.(köpek havlamıyor.)
        System.out.println(shouldWakeUp (false, 2));

       // => false dönmeli.(8'den sonra ise tepki vermeliyiz.)
        System.out.println(shouldWakeUp (true, 8));

        // => false dönmeli(-1 geçersiz değer)
        System.out.println( shouldWakeUp (true, -1));*/




    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if(clock<0 || clock>23|| !isBarking) {
            return false;
        }

        return clock<8 || clock>=20;
    }

public static boolean hasTeen(int firstAge, int secondAge, int thirdAge){

        return (firstAge>13 && firstAge<=19) ||
                (secondAge>13 && secondAge<=19) ||
                (thirdAge>13 && thirdAge<=19) ;
}

public static  boolean isCatPlaying(boolean isSummer, int temp) {
        int highestTemp = isSummer ? 45: 35;
        int lowestTemp = 25;
        return  temp>25  temp<=highestTemp;

}

public static double area(double width, double height){
        if (width<0 || height<0)
            return  -1;

        return width*height;
}

public static double area(double radius){
        if(radius<0){
            return -1;
        }

        return Math.PI*Math.pow(radius, 2);
}



}