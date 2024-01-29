public class MyException extends IllegalArgumentException{

    public void message(String message) throws IllegalArgumentException{
        System.out.println(message);
    }
}
