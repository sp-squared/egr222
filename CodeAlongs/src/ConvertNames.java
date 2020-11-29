// Colin Morris-Moncada
// Using Built in String methods to convert to a different format
// Takes a combined full name and splits it into a first name and last name
// The COMMA in the initial format makes it easy to do a general case

public class ConvertNames {
    public static void main(String[] args) {
        // Calling the convert method three times
        System.out.println(convert("Morris, Colin"));
        System.out.println(convert("Morris, Mason"));
        System.out.println(convert("Morris, Delia"));
    }

    public static String convert(String name){
        // Finds where the comma is
        int commaIndex = name.indexOf(",");
        // Uses commaIndex to create a new String with the last name only
        String lastName = name.substring(0, commaIndex);
        // Uses commaIndex + 2 to create a new String with the first name only
        String firstName = name.substring(commaIndex + 2, name.length());

        // Returns name in different format
        return firstName + " " + lastName.toUpperCase();
    }
}
