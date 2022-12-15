# Java Languages
This is a Java project created for a Codecademy course. It includes three classes: `Language`, `Mayan`, and `SinoTibetan`.
## Language
The Language class is a general class that represents a language and has four fields: `name`, `numSpeakers`, `regionsSpoken`, and `wordOrder`. It also has a constructor that initializes these fields, as well as a `getInfo()` method that displays information about the language.
## Mayan
The Mayan class is a subclass of the Language class. It has a constructor that initializes the `name` and `numSpeakers` fields and sets default values for the `regionsSpoken` and `wordOrder` fields. The Mayan class also has an overridden `getInfo()` method that displays information about ergativity in Mayan languages.
## SinoTibetan
The SinoTibetan class is a subclass of the Language class. It has a constructor that initializes the `name` and `numSpeakers` fields and sets default values for the `regionsSpoken` and `wordOrder` fields. The constructor also has an additional condition that sets the `wordOrder` field to "subject-verb-object" if the `name` field contains the word "Chinese".
## Usage
To use the Language class, you can create an object of the Language class and call its `getInfo()` method to display information about the language. You can also create objects of the Mayan and SinoTibetan classes and call their `getInfo()` methods to display information about Mayan and Sino-Tibetan languages, respectively.