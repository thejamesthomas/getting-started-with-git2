public class FizzBuzz {
    public String parse(Integer i) {
        StringBuffer sb = new StringBuffer();
        if(i % 3 == 0 || numberContainsThree(i)) {
            sb.append("Fizz");
        }
        if(i % 5 == 0) {
            sb.append("Buzz");
        }

        return sb.length() == 0 ? i.toString() : sb.toString();
    }

    private boolean numberContainsThree(Integer i) {
        String number = i.toString();
        return number.contains("3");
    }

    public static void main(String[] args){
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i=1; i < 101; i++){
            System.out.println(fizzBuzz.parse(i));
        }
    }
}
