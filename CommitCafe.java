public class CommitCafe {

    private static String barista = "Nadine"; // STUDENT_TODO_1A: Change name
    // STUDENT_TODO_1B: Add a nickname or title for the barista

    private static int cups = 0;

<<<<<<< HEAD
    public static void brew(String drink) {
        // STUDENT_TODO_2A: Implement - add 1 to cups & print a message
	cups++;
	System.out.println("Brewing this many cups: "+cups);
        // STUDENT_TODO_2B: Add a second brew-related improvement
	System.out.println("Coffee is done!");
=======
    public static void brew(String drink) {
        cups++;
        System.out.println("CoffeeBot brewed " + drink + ". It's not a bug, it's a feature - until the coffee wears off.");
        System.out.println("[BOT CHECK] drink length = " + drink.length()); // STUDENT_TODO_2B: Add a second brew-related improvement
>>>>>>> origin
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}
