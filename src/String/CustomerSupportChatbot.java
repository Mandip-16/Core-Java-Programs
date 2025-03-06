package String;

public class CustomerSupportChatbot {
    public static void main(String[] args) {
        // Simulate a user message
        String userMessage = "   HeLLo, I neEd HeLP with My ACCOUNT   ";

        System.out.println("User message: " + userMessage);

        // Clean and normalize the message
        String cleanedMessage = userMessage.trim().toLowerCase();
        System.out.println("\nCleaned message: " + cleanedMessage);

        // Check for keywords
        if (cleanedMessage.contains("help") || cleanedMessage.contains("account")) {
            System.out.println("\n🤖 Chatbot: It looks like you need help with your account!");
        }

        // String manipulation examples
        String response = "Sure! I can assist you.";
        System.out.println("\nOriginal Response: " + response);
        System.out.println("Uppercase: " + response.toUpperCase());
        System.out.println("Lowercase: " + response.toLowerCase());
        System.out.println("Length of response: " + response.length());

        // Extract part of the message
        String keyword = cleanedMessage.substring(cleanedMessage.indexOf("help"), cleanedMessage.indexOf("help") + 4);
        System.out.println("\nExtracted keyword: " + keyword);

        // Replace words
        String updatedResponse = response.replace("assist", "guide");
        System.out.println("Updated Response: " + updatedResponse);

        // Compare strings
        String botMessage = "thank you for reaching out!";
        System.out.println("\nBot message: " + botMessage);

        if (botMessage.equalsIgnoreCase("THANK YOU FOR REACHING OUT!")) {
            System.out.println("✅ Bot message matches (case-insensitive)");
        }

        // Split the message into words
        String[] words = cleanedMessage.split(" ");
        System.out.println("\nWords in the user message:");
        for (String word : words) {
            System.out.println("- " + word);
        }

        // Join words to form a sentence
        String joinedMessage = String.join(" ", words);
        System.out.println("\nJoined message: " + joinedMessage);

        // Character access and index
        char firstChar = response.charAt(0);
        int indexOfCan = response.indexOf("can");
        System.out.println("\nFirst character of response: " + firstChar);
        System.out.println("Index of 'can': " + indexOfCan);

        // Checking start and end of strings
        System.out.println("\nDoes the response start with 'Sure'? " + response.startsWith("Sure"));
        System.out.println("Does the response end with 'you.'? " + response.endsWith("you."));

        // Using valueOf to convert non-string values
        int errorCode = 404;
        String errorMessage = String.valueOf(errorCode);
        System.out.println("\nConverted error code to string: " + errorMessage);
    }
}

