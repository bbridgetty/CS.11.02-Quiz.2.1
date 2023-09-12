public class Main {
    public static void main(String[] args) {
        //method 1
        int result = add(2, 4);
        System.out.println(result);
        String greeting = frenchGreeting("Mr Ewing!");
        System.out.println(greeting);
        result = add(2, 4, 6, 8);
        System.out.println(result);
        String toBePrinted = toBePrinted("The End!");
        System.out.println(toBePrinted);
    }
    public static int add(int numOne, int numTwo) {
        return numOne + numTwo;
    }
    public static String frenchGreeting(String name) {return "Bonjour, " + name + "!";}
    public static int add(int numOne, int numTwo, int numThree, int numFour) {return numOne + numTwo + numThree + numFour;}
    public static String toBePrinted(String printMe) {return printMe;}
}
