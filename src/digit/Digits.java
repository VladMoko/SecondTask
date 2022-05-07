package digit;

public class Digits {

    int dig = 12345;
    int digOne = 12345;
    int sum;
    int sumOne;

    public int getSum() {
        while (dig != 0) {
            sum += dig % 10;
            dig /= 10;
        }
        return sum;
    }
    public int getDig(){
        sumOne = String.valueOf(digOne)
                .chars()
                .map(Character::getNumericValue)
                .sum();
        return sumOne;
    }
}
