import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500};


        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        System.out.println(numbers[1]); // 200
        System.out.println(numbers[3]);

        numbers[1] = 1000;
        System.out.println(Arrays.toString(numbers));

        numbers[2] = 750;
        System.out.println(Arrays.toString(numbers));

        // -------------------
        // -------------------

        String[] culori = {"albastru", "verde", "galben"};

        System.out.println(Arrays.toString(culori)); // afisare array intreg

        System.out.println("Lungimea tabloului: " + culori.length);
        System.out.println("Index-ul ultimului element este " + (culori.length - 1));

        culori[2] = "negru";

        System.out.println(Arrays.toString(culori));





    }
}
