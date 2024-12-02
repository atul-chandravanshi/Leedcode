import java.math.BigInteger;

class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder num11 = new StringBuilder(num1);
        StringBuilder num22 = new StringBuilder(num2);

        BigInteger number1 = new BigInteger(num11.toString());
        BigInteger number2 = new BigInteger(num22.toString());

    
        BigInteger sum = number1.add(number2);


        return sum.toString();
    }
}
