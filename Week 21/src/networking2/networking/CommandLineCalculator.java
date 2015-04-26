package networking2.networking;

public class CommandLineCalculator {
    public static Double Calculate (String s) {
        int stringposition = 0;
        double value1 = 0;
        double value2 = 0;
        String operator = "";

        for (stringposition = 0; stringposition < (s.length() - 1); stringposition++) {
            if ((s.charAt(stringposition)) == '+' || (s.charAt(stringposition)) == '-' || (s.charAt(stringposition)) == '/'  || (s.charAt(stringposition)) == '*') {
                operator = s.substring(stringposition,stringposition+1);
                value1 = Double.parseDouble(s.substring(0,stringposition));
                value2 = Double.parseDouble(s.substring(stringposition + 1, s.length()));
            }

        }

        //calculate using switch
        switch (operator) {
            case "+":
                return (value1 + value2);
            case "-":
                return(value1 - value2);
            case "/":
                return (value1 / value2);
            case "*":
                return (value1 * value2);
        }
        return null;
    }
}