package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals("Russia"))
                hen = new RussianHen();
            if (country.equals("Ukraine"))
                hen = new UkrainianHen();
            if (country.equals("Moldova"))
                hen = new MoldovanHen();
            if (country.equals("Belarus"))
                hen = new BelarusianHen();
            return hen;
        }
    }
}
