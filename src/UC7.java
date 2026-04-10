public class UC7 {
    public static void main(String[] args) {

        // If no arguments → default greeting
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join all names with ", "
            String names = String.join(", ", args);

            System.out.println("Hello, " + names + "!");
        }
    }
}
