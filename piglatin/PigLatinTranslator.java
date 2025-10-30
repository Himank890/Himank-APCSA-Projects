package piglatin;

public class PigLatinTranslator {
    public static Book translate(Book input) {
        Book translatedBook = new Book();

        // TODO: Add code here to populate translatedBook with a translation of the
        // input book.
        // Curent do-nothing code will return an empty book.
        // Your code will need to call translate(String input) many times.

        return translatedBook;
    }


    public static String translate(String input) {
        if (input == null || input.isEmpty())
        {
            return input;
        }
        System.out.println("  -> translate('" + input + "')");

        String punctuation = "";
        if (!Character.isLetter(input.charAt(input.length()-1)))
        {
            punctuation = String.valueOf(input.charAt(input.length()-1));
            input = input.substring(0, input.length()-1);
        }

        input = Character.toLowerCase(input.charAt(0)) + input.substring(1);

        String vowels = "aeiouyAEIOUY";
        int firstVowelIndex = -1;
        
        for(int i = 0; i < input.length(); i++)
        {
            if (vowels.indexOf(input.charAt(i)) != -1)
            {
                firstVowelIndex = i;
                break;
            }
        }

        if (firstVowelIndex == -1)
        {
            input = input + "ay";
        }
        
        if (firstVowelIndex == 0)
        {
            input = input + "ay";
        }
        else
        {
            String start = input.substring(firstVowelIndex);
            String end = input.substring(0, firstVowelIndex);
            input = start + end + "ay";
        }
        input = Character.toUpperCase(input.charAt(0)) + input.substring(1);
        input += punctuation;

        return input;

        // TODO: translate a string input, store in result.
        // The input to this function could be any English string.
        // It may be made up of many words.
        // This method must call translateWord once for each word in the string.
        //String result = "";
        //result = translateWord(input);

       // return result;
    }

        // TODO: Replace this code to correctly translate a single word.
        // Start here first!
        
        // This is the first place to work.

        //return result;
    //}

    // Add additonal private methods here.
    // For example, I had one like this:
    // private static String capitalizeFirstLetter(String input)

}
