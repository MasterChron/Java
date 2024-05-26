package arrays;

import java.util.ArrayList;

public class IntroArrayList {
    public static void main(String[] args) {
        ArrayList<Punjabi> arr = new ArrayList<>();

        Punjabi p1 = new Punjabi("Alou de parthey", "Elevated", "Scorpio");

        arr.add(p1);

        for (Punjabi obj : arr) {
            System.out.println(arr);
        }
    }
}

    class Punjabi{
        String food;
        String song;
        String vehicle;

        public Punjabi(String food, String song, String vehicle) {
            this.food = food;
            this.song = song;
            this.vehicle = vehicle;
        }

        @Override
        public String toString() {
            return "Punjabi{" +
                    "food='" + food + '\'' +
                    ", song='" + song + '\'' +
                    ", vehicle='" + vehicle + '\'' +
                    '}';
        }
    }
