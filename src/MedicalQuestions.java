import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MedicalQuestions {
    public static void main(String[] args) {
        // Create a map to store the medical questions and their sub-questions with answers
        Map<String, Map<String, String[]>> medicalQuestions = new HashMap<>();

        // Add questions, sub-questions, and answers to the map
        Map<String, String[]> question1 = new HashMap<>();
        question1.put("High B.P", new String[]{"yes", "no"});
        question1.put("Diabetis 2", new String[]{"yes", "no"});
        medicalQuestions.put("Any Disease", question1);

        Map<String, String[]> question2 = new HashMap<>();
        question2.put("Sub-Question 1", new String[]{"Option X", "Option Y", "Option Z"});
        question2.put("Sub-Question 2", new String[]{"Option P", "Option Q", "Option R"});
        medicalQuestions.put("Question 2", question2);
        // Add more questions, sub-questions, and answers as needed

        // Display the questions, sub-questions, and get user input
        Scanner scanner = new Scanner(System.in);
        for (Map.Entry<String, Map<String, String[]>> entry : medicalQuestions.entrySet()) {
            String question = entry.getKey();
            Map<String, String[]> subQuestions = entry.getValue();

            System.out.println(question);
            for (Map.Entry<String, String[]> subEntry : subQuestions.entrySet()) {
                String subQuestion = subEntry.getKey();
                String[] options = subEntry.getValue();

                System.out.println(subQuestion);
                for (int i = 0; i < options.length; i++) {
                    System.out.println((i + 1) + ". " + options[i]);
                }

                // Get user input for the selected option
                System.out.print("Enter your choice (1-" + options.length + "): ");
                int choice = scanner.nextInt();

                // Validate user input
                if (choice >= 1 && choice <= options.length) {
                    String selectedOption = options[choice - 1];
                    System.out.println("You selected: " + selectedOption);
                    // Perform any necessary logic based on the selected option
                } else {
                    System.out.println("Invalid choice!");
                }
            }

            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
