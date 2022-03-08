public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10100; i++){
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print("fizzBuzz");
            } else if (i % 3 == 0) {
                System.out.print("fizz");
            } else if (i % 5 == 0) {
                System.out.print("buzz");
            } else{
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}

