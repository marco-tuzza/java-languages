public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    // Constructor
    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    // Method that displays the information of a Language object
    public void getInfo() {
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language follows the word order: " + wordOrder + ".");
    }

    public static void main(String[] args) {
        // Create a Chinese Sino-Tibetan language object
        SinoTibetan language1 = new SinoTibetan("Mandarin Chinese", 1000000000);

        // Call the getInfo() method to display the information of the Chinese language object
        language1.getInfo();

        // Create a non-Chinese Sino-Tibetan language object
        SinoTibetan language2 = new SinoTibetan("Burmese", 500000000);

        // Call the getInfo() method to display the information of the non-Chinese language object
        language2.getInfo();
    }
}