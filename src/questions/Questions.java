package questions;

import utility.Messages;

import java.util.HashMap;

public class Questions {

    private static HashMap<String, Integer> questions = new HashMap<>();

    public Questions() {

        questions.put("THEME: PROGRAMMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " What is the use of final keyword in Java?\n\n1-" + Messages.ANSI_RESET +
                        " When a class is made final, a subclass of it can not be created.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " When a method is final, it can not be overridden.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " When a variable is final, it can be assigned value only once.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " All of the above.\n"
                , 4);

        questions.put("THEME: PROGRAMMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Which of the following is FALSE about abstract classes in Java\n\n1-" + Messages.ANSI_RESET +
                        " If we derive an abstract class and do not implement all the abstract methods, then the derived class should also be marked as abstract using 'abstract' keyword.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Abstract classes can have constructors.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " A class can inherit from multiple abstract classes.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " A class can be made abstract without any abstract method.\n"
                , 3);

        questions.put("THEME: PROGRAMMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Which of the following statement(s) is/are TRUE? \n" + Messages.ANSI_RESET + Messages.ANSI_PURPLE + "I. An abstract class is one that is not used to create objects. \nII. An abstract class is designed only to act as a base class to be inherited by other classes.\n\n" + Messages.ANSI_RESET + Messages.ANSI_CYAN + "1-" + Messages.ANSI_RESET +
                        " Only I.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Only II.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Both.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Neither.\n"
                , 3);

        questions.put("THEME: PROGRAMMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Which of these is a super class of all errors and exceptions in the Java language?\n\n1-" + Messages.ANSI_RESET +
                        " RunTimeExceptions.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Throwable.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Catchable.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " None of the above.\n"
                , 2);

        questions.put("THEME: PROGRAMMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Which of the following is/are advantages of packages?\n\n1-" + Messages.ANSI_RESET +
                        " Packages avoid name clashes.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Classes, even though they are visible outside their package, can have fields visible to packages only.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " We can have hidden classes that are used by the packages, but not visible outside.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " All of the above.\n"
                , 4);

        questions.put("THEME: SUPER MARIO\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " What video game did Mario first appear in?\n\n1-" + Messages.ANSI_RESET +
                        " Donkey Kong.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Mario Bros.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Super Mario Bros.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Mario's Bombs Away.\n"
                , 1);

        questions.put("THEME: SONY\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " In what year did Sony announce they were developing a Playstation Portable?\n\n1-" + Messages.ANSI_RESET +
                        " 2003.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " 2004.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " 2005.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " 2007.\n"
                , 1);

        questions.put("THEME: GTA\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " In Grand Theft Auto, the video game, you are able to play as up to 8 different characters. What do all the characters have in common?\n\n1-" + Messages.ANSI_RESET +
                        " They all have the same name.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " They all have the same colour sweater.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " They all have the same voice.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " They all wear glasses.\n"
                , 2);

        questions.put("THEME: POKÉMON\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Which of the following is a genuine Pokémon type?\n\n1-" + Messages.ANSI_RESET +
                        " Earth.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Air.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Dark.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Light.\n"
                , 3);

        questions.put("THEME: SUPER MARIO\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " What was Mario's name in his first game?\n\n1-" + Messages.ANSI_RESET +
                        " Plumbman.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Mario.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Luigi.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Jumpman.\n"
                , 4);

        questions.put("THEME: CONSOLES\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Which of the following consoles was released by Sega?\n\n1-" + Messages.ANSI_RESET +
                        " Zodiac.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Dreamcast.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Jaguar.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Gamecube.\n"
                , 2);

        questions.put("THEME: PAC MAN\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Which of the following is NOT a ghost from the original Pac-Man?\n\n1-" + Messages.ANSI_RESET +
                        " Inky.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Blinky.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Winky.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Clyde.\n"
                , 2);

        questions.put("THEME: GAMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " What is the largest ever prize pool for a gaming tournament?\n\n1-" + Messages.ANSI_RESET +
                        " $18.93 million.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " $24.54 million.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " $9.3 million.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " $40.01 million.\n"
                , 4);

        questions.put("THEME: GAMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " In what year was the first video game invented?\n\n1-" + Messages.ANSI_RESET +
                        " 1958.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " 1969.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " 1943.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " 1962.\n"
                , 1);

        questions.put("THEME: GAMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Which gaming console has the record for most units sold?\n\n1-" + Messages.ANSI_RESET +
                        " Nintendo Gamecube.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " PS2.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " XBOX 360.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Wii.\n"
                , 2);

        //GON QUESTIONS
        questions.put("THEME: STAR WARS\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Who is the young Jedi knight who becomes Dark Vader?\n\n1-" + Messages.ANSI_RESET +
                        " Anakin Skywalker.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Luke Skywalker.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Obi-wan Kenobi.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Qui-Gon Jinn.\n"
                , 1);

        questions.put("THEME: STAR WARS\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " What is the name of Han Solo's spaceship?\n\n1-" + Messages.ANSI_RESET +
                        " Normandy SR-2.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Tantive IV.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " USS Enterprise.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Millenium Falcon.\n"
                , 4);

        questions.put("THEME: FINAL FANTASY\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Which Final Fantasy VII character is known for a giant sword and spiky hair?\n\n1-" + Messages.ANSI_RESET +
                        " Sephiroth.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Guts.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Cloud Strife.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Geralt of Rivia.\n"
                , 3);

        questions.put("THEME: GAMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " What's the name of The \"Legend of Zelda\" protagonist?\n\n1-" + Messages.ANSI_RESET +
                        " Princess Zelda.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Samus Aran.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Link.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " John Wick.\n"
                , 3);

        questions.put("THEME: THE WITCHER\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Where is the School of the Wolf located?\n\n1-" + Messages.ANSI_RESET +
                        " Kaer Morhen.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Ard Carraigh.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Gwenllech.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Novigrad.\n"
                , 1);

        questions.put("THEME: GAMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " What's the name of \"Resident Evil 3\" main antagonist?\n\n1-" + Messages.ANSI_RESET +
                        " Mister X.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Ada Wong.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Nemesis.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Jill Valentine.\n"
                , 3);

        questions.put("THEME: GAMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " In which game series does Solid Snake belongs to?\n\n1-" + Messages.ANSI_RESET +
                        " Metroid.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Call of Duty.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Borderlands.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Metal Gear.\n"
                , 4);

        questions.put("THEME: GAMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Who said the following quote \"Did I ever tell you the definition of insanity?\".\n\n1-" + Messages.ANSI_RESET +
                        " Vaas.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Ezio Auditore.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Master Chief.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Doomguy.\n"
                , 1);

        questions.put("THEME: THE WITCHER\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " What was the first surname Geralt of Rivia chose?\n\n1-" + Messages.ANSI_RESET +
                        " Ravix of Fourhorn.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Geralt Roger Eric du Haute-Bellegarde.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Geralt of Vengerberg.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Geraldo da Ribeira.\n"
                , 2);

        questions.put("THEME: PROGRAMMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " What does HTML stand for?\n\n1-" + Messages.ANSI_RESET +
                        " Hyper Trainer Marking Language.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Hyper Text Marketing Language.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Hyper Text Markup Language.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Hyper Text Markup Leveler.\n"
                , 3);

        questions.put("THEME: PROGRAMMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Class B inherits from Class A, what cannot be said:\n\n1-" + Messages.ANSI_RESET +
                        " B is a sub-class of A.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " A is a super-class of B.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " B has access to private members of A.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " B has access to protected members of A.\n"
                , 3);

        questions.put("THEME: PROGRAMMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " What is the Java keyword that creates inheritance?\n\n1-" + Messages.ANSI_RESET +
                        " Enlarge.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Extends.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Inherits.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Inheritance.\n"
                , 2);

        questions.put("THEME: PROGRAMMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " How do you create a method in Java?\n\n1-" + Messages.ANSI_RESET +
                        " (methodName)\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " methodName[]\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " methodName()\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " methodName.\n"
                , 3);


        questions.put("THEME: COUNTRIES\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " In which country are the world’s 10 coldest cities located?\n\n1-" + Messages.ANSI_RESET +
                        " USA.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " RUSSIA.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " SWEDEN.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " CANADA.\n"
                , 2);


        questions.put("THEME: COUNTRIES\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Which country has three capital cities?\n\n1-" + Messages.ANSI_RESET +
                        " NIGERIA.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " SOUTH AFRICA.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " AUSTRALIA.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " CHILE.\n"
                , 2);

        questions.put("THEME: COUNTRIES\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Which is the smallest country in the world?\n\n1-" + Messages.ANSI_RESET +
                        " BARBADOS.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " CYPRUS.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " MALTA.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " VATICAN CITY.\n"
                , 4);


        questions.put("THEME: COUNTRIES\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Which continent is home to the most countries?\n\n1-" + Messages.ANSI_RESET +
                        " ASIA.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " AFRICA.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " EUROPE.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " SOUTH AMERICA.\n"
                , 2);


        questions.put("THEME: COUNTRIES\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        "  Which of these is NOT one of the 13 countries crossed by the Equator?\n\n1-" + Messages.ANSI_RESET +
                        " ECUADOR.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " INDONESIA.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " KENYA.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " EGYPT.\n"
                , 4);


        questions.put("THEME: COUNTRIES\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Which is the most linguistically diverse country in the world?\n\n1-" + Messages.ANSI_RESET +
                        " PAPUA NEW GUINEA.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " NIGERIA.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " INDIA.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " BRAZIL.\n"
                , 1);


        questions.put("THEME: COUNTRIES\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Which country is home to — by far — the most pyramids in the world?\n\n1-" + Messages.ANSI_RESET +
                        " EGYPT.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " COLOMBIA.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " SUDAN.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " CAMBODIA.\n"
                , 3);


        questions.put("THEME: COUNTRIES\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Which of these countries was NOT a part of the Soviet Union?\n\n1-" + Messages.ANSI_RESET +
                        " GEORGIA.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " UKRAINE.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " POLAND.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " BELARUS.\n"
                , 3);


        questions.put("THEME: COUNTRIES\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Which of these cities is NOT a national capital?\n\n1-" + Messages.ANSI_RESET +
                        " CAIRO.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " PRAGUE.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " BANGKOK.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " SYDNEY.\n"
                , 4);


        questions.put("THEME: COUNTRIES\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Which of these countries is NOT recognized by the United Nations?\n\n1-" + Messages.ANSI_RESET +
                        " ISRAEL.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " IRAN.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " TAIWAN.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " CYPRUS.\n"
                , 3);


        questions.put("THEME: PROGRAMMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " What does a compiler do?\n\n1-" + Messages.ANSI_RESET +
                        " Translates computer code from machine level to byte code.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Translates computer code from higher-level programming language to machine code.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Translates computer code from lower-level programming language to higher-level programming language.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " A compiler does nothing.\n"
                , 2);


        questions.put("THEME: PROGRAMMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Which company was behind the creation of Java?\n\n1-" + Messages.ANSI_RESET +
                        " Microsoft.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Sun Microsystems.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Apple.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Borland.\n"
                , 2);


        questions.put("THEME: PROGRAMMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " What was the original name for Java?\n\n1-" + Messages.ANSI_RESET +
                        " Ada.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " C++.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Oak.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Lisp.\n"
                , 3);


        questions.put("THEME: PROGRAMMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " What is the name of the inventor (or father) of Java?\n\n1-" + Messages.ANSI_RESET +
                        " Dennis Ritchie.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Bill Gates.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " James Gosling.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Bjarne Stroustrup.\n"
                , 3);


        questions.put("THEME: PROGRAMMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " What is the name of the class that all Java classes inherit (directly or indirectly) from?\n\n1-" + Messages.ANSI_RESET +
                        " ClassLoader.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Class.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Object.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " None of the above.\n"
                , 3);

        questions.put("THEME: SPIDER MAN\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Which Spider-Man villain is a disgruntled visual effects artist?\n\n1-" + Messages.ANSI_RESET +
                        " Batman.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Dr. Octopus.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Mysterio.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Sandman.\n"
                , 3);

        questions.put("THEME: SCOOBY-DOO\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " What type of dog is Scooby?\n\n1-" + Messages.ANSI_RESET +
                        " Bulldog.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Great Dane.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Chi-hua-hua.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Yorkshire Terrier.\n"
                , 2);

        questions.put("THEME: RICK & MORTY\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " What is Rick's last name?\n\n1-" + Messages.ANSI_RESET +
                        " Obama.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Lima.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Fernandez.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Sanchez.\n"
                , 4);

        questions.put("THEME: PEAKY BLINDERS\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " What is the official name of the Peaky Blinders’ family business?\n\n1-" + Messages.ANSI_RESET +
                        " Shelby Industries Limited.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Shelby Company Limited.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Shelby's Factory.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Grace's Secret.\n"
                , 2);

        questions.put("THEME: HOW I MET YOUR MOTHER\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Barney Stinson became friends with Ted, Marshall and Lily after meeting Ted in 2001 where?\n\n1-" + Messages.ANSI_RESET +
                        " MacLaren's urinal.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " At a concert.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " MacLaren's entry.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Empire State Building.\n"
                , 1);

        questions.put("THEME: COUNTER-STRIKE\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " What is the most popular map is Counter-Strike ?\n\n1-" + Messages.ANSI_RESET +
                        " Office.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Lake.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Dust II.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Inferno.\n"
                , 3);

        questions.put("THEME: STRANGER THINGS\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " During season two, the boys dress up for Halloween as characters from which 80s movie?\n\n1-" + Messages.ANSI_RESET +
                        " Power Rangers.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Ghostbusters.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Charlie Chaplin.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Rambo.\n"
                , 2);

        questions.put("THEME: COMICS\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " The Punisher is a fictional character appearing in comic books published by which company?\n\n1-" + Messages.ANSI_RESET +
                        " Fox Atomic Comics.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " DC Comics.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Marvel Comics.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " AC Comics.\n"
                , 3);

        questions.put("THEME: VIDEOGAMES\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Mario Kart is a video game series publish by which company?\n\n1-" + Messages.ANSI_RESET +
                        " Sony.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Nintendo.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Microsoft.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Sega.\n"
                , 2);

        questions.put("THEME: VIDEOGAMES\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " What are the names of the two teams in Among Us?\n\n1-" + Messages.ANSI_RESET +
                        " Imposters and Crewmates.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " Aliens and Humans.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Team Alpha and Team Beta.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " Cats and Dogs.\n"
                , 1);

        questions.put("THEME: PROGRAMMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " What is a class in java?\n\n1-" + Messages.ANSI_RESET +
                        " A class is a special data type..\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " A class is used to allocate memory to a data type..\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " A class is a blue print from which individual objects are created. A class can contain fields and methods to describe the behavior of an object..\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " None of the above..\n"
                , 3);

        questions.put("THEME: PROGRAMMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " What is the default value of byte variable?\n\n1-" + Messages.ANSI_RESET +
                        " 0\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " 0.0\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " null.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " undefined.\n"
                , 1);

        questions.put("THEME: PROGRAMMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Which method must be implemented by all threads?\n\n1-" + Messages.ANSI_RESET +
                        " wait().\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " start().\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " stop().\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " run().\n"
                , 4);

        questions.put("THEME: PROGRAMMING\n\n" + Messages.ANSI_RED + "Q-" + Messages.ANSI_RESET + Messages.ANSI_CYAN +
                        " Which of these is the most popularly used class as a key in a HashMap?\n\n1-" + Messages.ANSI_RESET +
                        " Integer.\n" + Messages.ANSI_CYAN + "2-" + Messages.ANSI_RESET +
                        " String.\n" + Messages.ANSI_CYAN + "3-" + Messages.ANSI_RESET +
                        " Double.\n" + Messages.ANSI_CYAN + "4-" + Messages.ANSI_RESET +
                        " All of the above.\n"
                , 1);

    }

    public static HashMap<String, Integer> getQuestions() {
        return questions;
    }
}


