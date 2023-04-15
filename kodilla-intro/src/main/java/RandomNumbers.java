import java.util.Random;
public class RandomNumbers {
    public int[] collectNumbers() {
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
        int [] numbers = collectNumbers();

    }
    public void maxValue() {
        int [] numbers = collectNumbers();
    }
}
