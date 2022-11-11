package de.flamestro.algorithm;

public class AlgorithmConnascenceImproved {

    private static final int OFFSET = 2;

    public static String encrypt(String message) {
        StringBuilder result = new StringBuilder();
        applyCeaserCypher(message, result, OFFSET);
        return result.toString();
    }

    public static String decrypt(String message) {
        StringBuilder result = new StringBuilder();
        applyCeaserCypher(message, result, -OFFSET);
        return result.toString();
    }

    private static void applyCeaserCypher(String message, StringBuilder result, int offset) {
        for (char character : message.toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
    }
}




