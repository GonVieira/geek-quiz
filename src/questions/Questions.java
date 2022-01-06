package questions;

import java.util.HashMap;

import static utility.Messages.*;


public class Questions {

    private static final HashMap<String, Integer> questions = new HashMap<>();

    public Questions() {

        questions.put("THEME: PROGRAMMING\n\n" + ANSI_RED + "Q-" + ANSI_RESET + ANSI_BLUE +
                        " What is the use of final keyword in Java?\n\n1-" +
                        ANSI_RESET +
                        " When a class is made final, a subclass of it can not be created.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " When a method is final, it can not be overridden.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " When a variable is final, it can be assigned value only once.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " All of the above.\n"
                , 4);

        questions.put("THEME: PROGRAMMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Which of the following is FALSE about abstract classes in Java\n\n1-" +
                        ANSI_RESET +
                        " If we derive an abstract class and do not implement all the abstract methods, then the derived class should also be marked as abstract using 'abstract' keyword.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Abstract classes can have constructors.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " A class can inherit from multiple abstract classes.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " A class can be made abstract without any abstract method.\n"
                , 3);

        questions.put("THEME: PROGRAMMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Which of the following statement(s) is/are TRUE? \n" +
                        ANSI_RESET +
                        ANSI_PURPLE + "I. An abstract class is one that is not used to create objects. \nII. An abstract class is designed only to act as a base class to be inherited by other classes.\n\n" +
                        ANSI_RESET +
                        ANSI_BLUE + "1-" +
                        ANSI_RESET +
                        " Only I.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Only II.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Both.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Neither.\n"
                , 3);

        questions.put("THEME: PROGRAMMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Which of these is a super class of all errors and exceptions in the Java language?\n\n1-" +
                        ANSI_RESET +
                        " RunTimeExceptions.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Throwable.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Catchable.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " None of the above.\n"
                , 2);

        questions.put("THEME: PROGRAMMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Which of the following is/are advantages of packages?\n\n1-" +
                        ANSI_RESET +
                        " Packages avoid name clashes.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Classes, even though they are visible outside their package, can have fields visible to packages only.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " We can have hidden classes that are used by the packages, but not visible outside.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " All of the above.\n"
                , 4);

        questions.put("THEME: SUPER MARIO\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " What video game did Mario first appear in?\n\n1-" +
                        ANSI_RESET +
                        " Donkey Kong.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Mario Bros.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Super Mario Bros.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Mario's Bombs Away.\n"
                , 1);

        questions.put("THEME: SONY\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " In what year did Sony announce they were developing a Playstation Portable?\n\n1-" +
                        ANSI_RESET +
                        " 2003.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " 2004.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " 2005.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " 2007.\n"
                , 1);

        questions.put("THEME: GTA\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " In Grand Theft Auto, the video game, you are able to play as up to 8 different characters. What do all the characters have in common?\n\n1-" +
                        ANSI_RESET +
                        " They all have the same name.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " They all have the same colour sweater.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " They all have the same voice.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " They all wear glasses.\n"
                , 2);

        questions.put("THEME: POKÉMON\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Which of the following is a genuine Pokémon type?\n\n1-" +
                        ANSI_RESET +
                        " Earth.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Air.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Dark.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Light.\n"
                , 3);

        questions.put("THEME: SUPER MARIO\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " What was Mario's name in his first game?\n\n1-" +
                        ANSI_RESET +
                        " Plumbman.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Mario.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Luigi.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Jumpman.\n"
                , 4);

        questions.put("THEME: CONSOLES\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Which of the following consoles was released by Sega?\n\n1-" +
                        ANSI_RESET +
                        " Zodiac.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Dreamcast.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Jaguar.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Gamecube.\n"
                , 2);

        questions.put("THEME: PAC MAN\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Which of the following is NOT a ghost from the original Pac-Man?\n\n1-" +
                        ANSI_RESET +
                        " Inky.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Blinky.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Winky.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Clyde.\n"
                , 2);

        questions.put("THEME: GAMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " What is the largest ever prize pool for a gaming tournament?\n\n1-" +
                        ANSI_RESET +
                        " $18.93 million.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " $24.54 million.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " $9.3 million.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " $40.01 million.\n"
                , 4);

        questions.put("THEME: GAMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " In what year was the first video game invented?\n\n1-" +
                        ANSI_RESET +
                        " 1958.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " 1969.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " 1943.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " 1962.\n"
                , 1);

        questions.put("THEME: GAMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Which gaming console has the record for most units sold?\n\n1-" +
                        ANSI_RESET +
                        " Nintendo Gamecube.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " PS2.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " XBOX 360.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Wii.\n"
                , 2);

        //GON QUESTIONS
        questions.put("THEME: STAR WARS\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Who is the young Jedi knight who becomes Dark Vader?\n\n1-" +
                        ANSI_RESET +
                        " Anakin Skywalker.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Luke Skywalker.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Obi-wan Kenobi.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Qui-Gon Jinn.\n"
                , 1);

        questions.put("THEME: STAR WARS\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " What is the name of Han Solo's spaceship?\n\n1-" +
                        ANSI_RESET +
                        " Normandy SR-2.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Tantive IV.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " USS Enterprise.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Millenium Falcon.\n"
                , 4);

        questions.put("THEME: FINAL FANTASY\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Which Final Fantasy VII character is known for a giant sword and spiky hair?\n\n1-" +
                        ANSI_RESET +
                        " Sephiroth.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Guts.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Cloud Strife.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Geralt of Rivia.\n"
                , 3);

        questions.put("THEME: GAMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " What's the name of The \"Legend of Zelda\" protagonist?\n\n1-" +
                        ANSI_RESET +
                        " Princess Zelda.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Samus Aran.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Link.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " John Wick.\n"
                , 3);

        questions.put("THEME: THE WITCHER\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Where is the School of the Wolf located?\n\n1-" +
                        ANSI_RESET +
                        " Kaer Morhen.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Ard Carraigh.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Gwenllech.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Novigrad.\n"
                , 1);

        questions.put("THEME: GAMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " What's the name of \"Resident Evil 3\" main antagonist?\n\n1-" +
                        ANSI_RESET +
                        " Mister X.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Ada Wong.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Nemesis.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Jill Valentine.\n"
                , 3);

        questions.put("THEME: GAMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " In which game series does Solid Snake belongs to?\n\n1-" +
                        ANSI_RESET +
                        " Metroid.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Call of Duty.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Borderlands.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Metal Gear.\n"
                , 4);

        questions.put("THEME: GAMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Who said the following quote \"Did I ever tell you the definition of insanity?\".\n\n1-" +
                        ANSI_RESET +
                        " Vaas.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Ezio Auditore.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Master Chief.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Doomguy.\n"
                , 1);

        questions.put("THEME: THE WITCHER\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " What was the first surname Geralt of Rivia chose?\n\n1-" +
                        ANSI_RESET +
                        " Ravix of Fourhorn.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Geralt Roger Eric du Haute-Bellegarde.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Geralt of Vengerberg.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Geraldo da Ribeira.\n"
                , 2);

        questions.put("THEME: PROGRAMMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " What does HTML stand for?\n\n1-" +
                        ANSI_RESET +
                        " Hyper Trainer Marking Language.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Hyper Text Marketing Language.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Hyper Text Markup Language.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Hyper Text Markup Leveler.\n"
                , 3);

        questions.put("THEME: PROGRAMMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Class B inherits from Class A, what cannot be said:\n\n1-" +
                        ANSI_RESET +
                        " B is a sub-class of A.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " A is a super-class of B.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " B has access to private members of A.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " B has access to protected members of A.\n"
                , 3);

        questions.put("THEME: PROGRAMMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " What is the Java keyword that creates inheritance?\n\n1-" +
                        ANSI_RESET +
                        " Enlarge.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Extends.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Inherits.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Inheritance.\n"
                , 2);

        questions.put("THEME: PROGRAMMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " How do you create a method in Java?\n\n1-" +
                        ANSI_RESET +
                        " (methodName)\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " methodName[]\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " methodName()\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " methodName.\n"
                , 3);


        questions.put("THEME: COUNTRIES\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " In which country are the world’s 10 coldest cities located?\n\n1-" +
                        ANSI_RESET +
                        " USA.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " RUSSIA.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " SWEDEN.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " CANADA.\n"
                , 2);


        questions.put("THEME: COUNTRIES\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Which country has three capital cities?\n\n1-" +
                        ANSI_RESET +
                        " NIGERIA.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " SOUTH AFRICA.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " AUSTRALIA.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " CHILE.\n"
                , 2);

        questions.put("THEME: COUNTRIES\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Which is the smallest country in the world?\n\n1-" +
                        ANSI_RESET +
                        " BARBADOS.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " CYPRUS.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " MALTA.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " VATICAN CITY.\n"
                , 4);


        questions.put("THEME: COUNTRIES\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Which continent is home to the most countries?\n\n1-" +
                        ANSI_RESET +
                        " ASIA.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " AFRICA.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " EUROPE.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " SOUTH AMERICA.\n"
                , 2);


        questions.put("THEME: COUNTRIES\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        "  Which of these is NOT one of the 13 countries crossed by the Equator?\n\n1-" +
                        ANSI_RESET +
                        " ECUADOR.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " INDONESIA.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " KENYA.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " EGYPT.\n"
                , 4);


        questions.put("THEME: COUNTRIES\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Which is the most linguistically diverse country in the world?\n\n1-" +
                        ANSI_RESET +
                        " PAPUA NEW GUINEA.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " NIGERIA.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " INDIA.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " BRAZIL.\n"
                , 1);


        questions.put("THEME: COUNTRIES\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Which country is home to — by far — the most pyramids in the world?\n\n1-" +
                        ANSI_RESET +
                        " EGYPT.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " COLOMBIA.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " SUDAN.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " CAMBODIA.\n"
                , 3);


        questions.put("THEME: COUNTRIES\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Which of these countries was NOT a part of the Soviet Union?\n\n1-" +
                        ANSI_RESET +
                        " GEORGIA.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " UKRAINE.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " POLAND.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " BELARUS.\n"
                , 3);


        questions.put("THEME: COUNTRIES\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Which of these cities is NOT a national capital?\n\n1-" +
                        ANSI_RESET +
                        " CAIRO.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " PRAGUE.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " BANGKOK.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " SYDNEY.\n"
                , 4);


        questions.put("THEME: COUNTRIES\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Which of these countries is NOT recognized by the United Nations?\n\n1-" +
                        ANSI_RESET +
                        " ISRAEL.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " IRAN.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " TAIWAN.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " CYPRUS.\n"
                , 3);


        questions.put("THEME: PROGRAMMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " What does a compiler do?\n\n1-" +
                        ANSI_RESET +
                        " Translates computer code from machine level to byte code.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Translates computer code from higher-level programming language to machine code.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Translates computer code from lower-level programming language to higher-level programming language.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " A compiler does nothing.\n"
                , 2);


        questions.put("THEME: PROGRAMMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Which company was behind the creation of Java?\n\n1-" +
                        ANSI_RESET +
                        " Microsoft.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Sun Microsystems.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Apple.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Borland.\n"
                , 2);


        questions.put("THEME: PROGRAMMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " What was the original name for Java?\n\n1-" +
                        ANSI_RESET +
                        " Ada.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " C++.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Oak.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Lisp.\n"
                , 3);


        questions.put("THEME: PROGRAMMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " What is the name of the inventor (or father) of Java?\n\n1-" +
                        ANSI_RESET +
                        " Dennis Ritchie.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Bill Gates.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " James Gosling.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Bjarne Stroustrup.\n"
                , 3);


        questions.put("THEME: PROGRAMMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " What is the name of the class that all Java classes inherit (directly or indirectly) from?\n\n1-" +
                        ANSI_RESET +
                        " ClassLoader.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Class.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Object.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " None of the above.\n"
                , 3);

        questions.put("THEME: SPIDER MAN\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Which Spider-Man villain is a disgruntled visual effects artist?\n\n1-" +
                        ANSI_RESET +
                        " Batman.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Dr. Octopus.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Mysterio.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Sandman.\n"
                , 3);

        questions.put("THEME: SCOOBY-DOO\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " What type of dog is Scooby?\n\n1-" +
                        ANSI_RESET +
                        " Bulldog.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Great Dane.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Chi-hua-hua.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Yorkshire Terrier.\n"
                , 2);

        questions.put("THEME: RICK & MORTY\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " What is Rick's last name?\n\n1-" +
                        ANSI_RESET +
                        " Obama.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Lima.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Fernandez.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Sanchez.\n"
                , 4);

        questions.put("THEME: PEAKY BLINDERS\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " What is the official name of the Peaky Blinders’ family business?\n\n1-" +
                        ANSI_RESET +
                        " Shelby Industries Limited.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Shelby Company Limited.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Shelby's Factory.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Grace's Secret.\n"
                , 2);

        questions.put("THEME: HOW I MET YOUR MOTHER\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Barney Stinson became friends with Ted, Marshall and Lily after meeting Ted in 2001 where?\n\n1-" +
                        ANSI_RESET +
                        " MacLaren's urinal.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " At a concert.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " MacLaren's entry.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Empire State Building.\n"
                , 1);

        questions.put("THEME: COUNTER-STRIKE\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " What is the most popular map is Counter-Strike ?\n\n1-" +
                        ANSI_RESET +
                        " Office.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Lake.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Dust II.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Inferno.\n"
                , 3);

        questions.put("THEME: STRANGER THINGS\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " During season two, the boys dress up for Halloween as characters from which 80s movie?\n\n1-" +
                        ANSI_RESET +
                        " Power Rangers.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Ghostbusters.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Charlie Chaplin.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Rambo.\n"
                , 2);

        questions.put("THEME: COMICS\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " The Punisher is a fictional character appearing in comic books published by which company?\n\n1-" +
                        ANSI_RESET +
                        " Fox Atomic Comics.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " DC Comics.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Marvel Comics.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " AC Comics.\n"
                , 3);

        questions.put("THEME: VIDEOGAMES\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Mario Kart is a video game series publish by which company?\n\n1-" +
                        ANSI_RESET +
                        " Sony.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Nintendo.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Microsoft.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Sega.\n"
                , 2);

        questions.put("THEME: VIDEOGAMES\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " What are the names of the two teams in Among Us?\n\n1-" +
                        ANSI_RESET +
                        " Imposters and Crewmates.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " Aliens and Humans.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Team Alpha and Team Beta.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " Cats and Dogs.\n"
                , 1);

        questions.put("THEME: PROGRAMMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " What is a class in java?\n\n1-" +
                        ANSI_RESET +
                        " A class is a special data type..\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " A class is used to allocate memory to a data type..\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " A class is a blue print from which individual objects are created. A class can contain fields and methods to describe the behavior of an object..\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " None of the above..\n"
                , 3);

        questions.put("THEME: PROGRAMMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " What is the default value of byte variable?\n\n1-" +
                        ANSI_RESET +
                        " 0\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " 0.0\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " null.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " undefined.\n"
                , 1);

        questions.put("THEME: PROGRAMMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Which method must be implemented by all threads?\n\n1-" +
                        ANSI_RESET +
                        " wait().\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " start().\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " stop().\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " run().\n"
                , 4);

        questions.put("THEME: PROGRAMMING\n\n" + ANSI_RED + "Q-" +
                        ANSI_RESET +
                        ANSI_BLUE +
                        " Which of these is the most popularly used class as a key in a HashMap?\n\n1-" +
                        ANSI_RESET +
                        " Integer.\n" +
                        ANSI_BLUE + "2-" +
                        ANSI_RESET +
                        " String.\n" +
                        ANSI_BLUE + "3-" +
                        ANSI_RESET +
                        " Double.\n" +
                        ANSI_BLUE + "4-" +
                        ANSI_RESET +
                        " All of the above.\n"
                , 1);

    }

    public static HashMap<String, Integer> getQuestions() {
        return questions;
    }
}


