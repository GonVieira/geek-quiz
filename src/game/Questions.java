package game;

import java.util.HashMap;

public class Questions {

    private static HashMap<String, Integer> questions;

    static {
        questions.put("THEME: PROGRAMMING\n\n" +
                        "Q- What is the use of final keyword in Java?\n\n" +
                        "1- When a class is made final, a sublcass of it can not be created.\n" +
                        "2- When a method is final, it can not be overridden.\n" +
                        "3- When a variable is final, it can be assigned value only once.\n" +
                        "4- All of the above.\n"
                , 4);

        questions.put("THEME: PROGRAMMING\n\n" +
                        "Q- Which of the following is FALSE about abstract classes in Java\n\n" +
                        "1- If we derive an abstract class and do not implement all the abstract methods, then the derived class should also be marked as abstract using 'abstract' keyword.\n" +
                        "2- Abstract classes can have constructors.\n" +
                        "3- A class can inherit from multiple abstract classes.\n" +
                        "4- A class can be made abstract without any abstract method.\n"
                , 3);

        questions.put("THEME: PROGRAMMING\n\n" +
                        "Q- Which of the following statement(s) is/are TRUE? \nI. An abstract class is one that is not used to create objects. \nII. An abstract class is designed only to act as a base class to be inherited by other classes.\n\n" +
                        "1- Only I.\n" +
                        "2- Only II.\n" +
                        "3- Both.\n" +
                        "4- Neither.\n"
                , 3);

        questions.put("THEME: PROGRAMMING\n\n" +
                        "Q- Which of these is a super class of all errors and exceptions in the Java language?\n\n" +
                        "1- RunTimeExceptions.\n" +
                        "2- Throwable.\n" +
                        "3- Catchable.\n" +
                        "4- None of the above.\n"
                , 2);

        questions.put("THEME: PROGRAMMING\n\n" +
                        "Q- Which of the following is/are advantages of packages?\n\n" +
                        "1- Packages avoid name clashes.\n" +
                        "2- Classes, even though they are visible outside their package, can have fields visible to packages only.\n" +
                        "3- We can have hidden classes that are used by the packages, but not visible outside.\n" +
                        "4- All of the above.\n"
                , 4);

        questions.put("THEME: SUPER MARIO\n\n" +
                        "Q- What video game did Mario first appear in?\n\n" +
                        "1- Donkey Kong.\n" +
                        "2- Mario Bros.\n" +
                        "3- Super Mario Bros.\n" +
                        "4- Mario's Bombs Away.\n"
                , 1);

        questions.put("THEME: SONY\n\n" +
                        "Q- In what year did Sony announce they were developing a Playstation Portable?\n\n" +
                        "1- 2003.\n" +
                        "2- 2004.\n" +
                        "3- 2005.\n" +
                        "4- 2007.\n"
                , 1);

        questions.put("THEME: GTA\n\n" +
                        "Q- In Grand Theft Auto, the video game, you are able to play as up to 8 different characters. What do all the characters have in common?\n\n" +
                        "1- They all have the same name.\n" +
                        "2- They all have the same colour sweater.\n" +
                        "3- They all have the same voice.\n" +
                        "4- They all wear glasses.\n"
                , 2);

        questions.put("THEME: POKÉMON\n\n" +
                        "Q- Which of the following is a genuine Pokémon type?\n\n" +
                        "1- Earth.\n" +
                        "2- Air.\n" +
                        "3- Dark.\n" +
                        "4- Light.\n"
                , 3);

        questions.put("THEME: SUPER MARIO\n\n" +
                        "Q- What was Mario's name in his first game?\n\n" +
                        "1- Plumbman.\n" +
                        "2- Mario.\n" +
                        "3- Luigi.\n" +
                        "4- Jumpman.\n"
                , 4);

        questions.put("THEME: CONSOLES\n\n" +
                        "Q- Which of the following consoles was released by Sega?\n\n" +
                        "1- Zodiac.\n" +
                        "2- Dreamcast.\n" +
                        "3- Jaguar.\n" +
                        "4- Gamecube.\n"
                , 2);

        questions.put("THEME: PAC MAN\n\n" +
                        "Q- Which of the following is NOT a ghost from the original Pac-Man?\n\n" +
                        "1- Inky.\n" +
                        "2- Blinky.\n" +
                        "3- Winky.\n" +
                        "4- Clyde.\n"
                , 2);

        questions.put("THEME: GAMING\n\n" +
                        "Q- What is the largest ever prize pool for a gaming tournament?\n\n" +
                        "1- $18.93 million.\n" +
                        "2- $24.54 million.\n" +
                        "3- $9.3 million.\n" +
                        "4- $40.01 million.\n"
                , 4);

        questions.put("THEME: GAMING\n\n" +
                        "Q- In what year was the first video game invented?\n\n" +
                        "1- 1958.\n" +
                        "2- 1969.\n" +
                        "3- 1943.\n" +
                        "4- 1962.\n"
                , 1);

        questions.put("THEME: GAMING\n\n" +
                        "Q- Which gaming console has the record for most units sold?\n\n" +
                        "1- Nintendo Gamecube.\n" +
                        "2- PS2.\n" +
                        "3- XBOX 360.\n" +
                        "4- Wii.\n"
                , 2);
    }
}
