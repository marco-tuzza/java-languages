public class SinoTibetan extends Language {
    // Constructor that sets default values for the regionsSpoken and wordOrder fields
    public SinoTibetan(String name, int numSpeakers) {
        super(name, numSpeakers, "Asia", "subject-object-verb");

        // If the language name contains "Chinese", set the wordOrder to "subject-verb-object"
        if (this.name.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }
    }
}