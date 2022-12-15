public class Mayan extends Language {
    // Constructor that sets default values for the regionsSpoken and wordOrder fields
    public Mayan(String name, int numSpeakers) {
        super(name, numSpeakers, "Central America", "verb-object-subject");
    }

    // Overridden method that displays information about ergativity
    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Mayan languages have an interesting grammatical feature: ergativity.");
    }
}