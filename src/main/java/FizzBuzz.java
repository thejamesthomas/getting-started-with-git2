import java.util.HashMap;

public class FizzBuzz {
    public String parse(Integer i) {
        HashMap<Integer, String> maps = new HashMap<Integer, String>();
        maps.put(3, "Fizz");
        maps.put(5, "Buzz");

        StringBuffer sb = new StringBuffer();
        for (Integer key : maps.keySet()) {
            if(i % key == 0) {
                sb.append(maps.get(key));
            }
        }
        return sb.length() == 0 ? i.toString() : sb.toString();
    }
    public static void main(String[] args){
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i=1; i < 101; i++){
            System.out.println(fizzBuzz.parse(i));
        }
    }
}
