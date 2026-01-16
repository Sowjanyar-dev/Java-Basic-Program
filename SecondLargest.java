public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 35, 50, 50, 40};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second Largest Number: " + secondLargest);
    }
}
