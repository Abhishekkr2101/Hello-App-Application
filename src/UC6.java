public class UC6 {
    public static void main(String[] args) {

        // If no arguments → default greeting
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String names = "";

            // Build string with delimiter
            for (String name : args) {
                names += name + ", ";
            }

            // Remove last ", " using substring
            names = names.substring(0, names.length() - 2);

            System.out.println("Hello, " + names + "!");
        }
    }
}
