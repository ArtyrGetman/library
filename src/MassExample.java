public class MassExample {

    public static void main(String[] args) {
        int[] numbers = {23,34,223,42,15};
        String[] namesMass = {"Ivan","Bob"};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(" index ->"+i);
//            System.out.println("value of this index "+numbers[i]);
//        }

        for (String n : namesMass) {
            System.out.println(n);
        }


    }
}
