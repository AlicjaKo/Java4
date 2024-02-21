package myapp;

public class App {
    public static void main(String[] args) {
        int[] numList = {1, 2, 3, 4, 5};
    

    Runnable print = new Runnable() {
        @Override
        public void run() {
            for (int number : numList) {
                System.out.println(number);
            }
        }
    };

    print.run();
}
}
