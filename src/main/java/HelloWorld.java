public class HelloWorld {
    public static String hello(){

        return "Hello World";
    }

    public static String hello(String name){
        if (name == null){
            throw new IllegalArgumentException("People cant not have a namne...");
        }
        return "Hello, " + name;
    }
}
