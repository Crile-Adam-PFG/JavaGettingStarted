
public class FizzBuzz {
    public String execute(Integer number) {
        String result = number.toString();
        if(number % 3 == 0){
            result = "Fizz";
        }
        return result;
    }
}
