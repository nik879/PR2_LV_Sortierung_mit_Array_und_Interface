package nik879.SortInterface;

public class Arrayhelper {
    public static void main(String[] args) {

        int[] numbers = {1, 6, 8, 4, 6, 8, 5, 4, 3};
        arrangeOrder(numbers);

    }

    public static void arrangeOrder(int[] numbers) {

        System.out.println("Unsortiert:");

        for (int number : numbers) {
            System.out.print(number +" ");
        }

        System.out.println("\n"+"---");

        int temp=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length-1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("sortiert:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }


}
