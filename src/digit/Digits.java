package digit;

public class Digits {
    //first point
    public static int getSum(int dig) {
        //counter
        int sum = 0;
        // Checking a value for !zero
        while (dig != 0) {
            sum += dig % 10; //5
            dig /= 10;//1234

        }
        return sum; // must be fifteen
    }
    //second point
    public static int getDig(int digOne){
        //pass number to string
        int sumOne = String.valueOf(digOne)
                .chars() //make a chars from string
                .map(Character::getNumericValue)//Search digit in chars
                .sum();//sum of digits
        return sumOne; // result
    }
}
