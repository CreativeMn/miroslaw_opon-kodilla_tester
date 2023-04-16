import java.util.Random;
public class RandomNumbers {
    public int[] Numbers() {
        int[] randomNumbers = new int[0];

        Random rdm = new Random(31);
        int randomNumber = rdm.nextInt();

        int result = 0;
        while (result < 5000) {
            result++;
        }
        return randomNumbers;
    }
    public void minValue() {
        int [] numbers = Numbers();

    }
    public void maxValue() {
        int [] numbers = Numbers();
    }
}
