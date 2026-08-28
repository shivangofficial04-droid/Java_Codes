public class AverageOfSetOfNumbers{

    static float average(int[] numbers) {

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return (float) sum / numbers.length;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(average(numbers));
    }
}