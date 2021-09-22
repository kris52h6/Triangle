import java.util.Arrays;

public class Triangle {
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public String getType() {
        String result = "";
        int[] arr = createArray();

        if (firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide) {
            result = "Isosceles";
        } else if (firstSide == secondSide && firstSide == thirdSide) {
            result = "Equilateral";
        } else if (arr[0] + arr[1] <= arr[2]) { // uses the sorted array to check if invalid
            result = "Invalid triangle";
        } else  {
            result = "Scalene";
        }
        return result;
    }

    public int[] createArray() {
        int[] arr = {firstSide, secondSide, thirdSide}; // creates array with the three triangle values
        Arrays.sort(arr); // sorts the array by lowest > highest value
        return arr;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", thirdSide=" + thirdSide +
                '}';
    }
}
