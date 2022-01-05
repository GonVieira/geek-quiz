package questions;

import java.util.HashMap;

public class Questions {

    private static HashMap<String, Integer> questions = new HashMap<>();

    public Questions() {

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

        //GON QUESTIONS
        questions.put("THEME: STAR WARS\n\n" +
                        "Q- Who is the young Jedi knight who becomes Dark Vader?\n\n" +
                        "1- Anakin Skywalker.\n" +
                        "2- Luke Skywalker.\n" +
                        "3- Obi-wan Kenobi.\n" +
                        "4- Qui-Gon Jinn.\n"
                , 1);

        questions.put("THEME: STAR WARS\n\n" +
                        "Q- What is the name of Han Solo's spaceship?\n\n" +
                        "1- Normandy SR-2.\n" +
                        "2- Tantive IV.\n" +
                        "3- USS Enterprise.\n" +
                        "4- Millenium Falcon.\n"
                , 4);

        questions.put("THEME: FINAL FANTASY\n\n" +
                        "Q- Which Final Fantasy VII character is known for a giant sword and spiky hair?\n\n" +
                        "1- Sephiroth.\n" +
                        "2- Guts.\n" +
                        "3- Cloud Strife.\n" +
                        "4- Geralt of Rivia.\n"
                , 3);

        questions.put("THEME: GAMING\n\n" +
                        "Q- What's the name of The \"Legend of Zelda\" protagonist?\n\n" +
                        "1- Princess Zelda.\n" +
                        "2- Samus Aran.\n" +
                        "3- Link.\n" +
                        "4- John Wick.\n"
                , 3);

        questions.put("THEME: THE WITCHER\n\n" +
                        "Q- Where is the School of the Wolf located?\n\n" +
                        "1- Kaer Morhen.\n" +
                        "2- Ard Carraigh.\n" +
                        "3- Gwenllech.\n" +
                        "4- Novigrad.\n"
                , 1);

        questions.put("THEME: GAMING\n\n" +
                        "Q- What's the name of \"Resident Evil 3\" main antagonist?\n\n" +
                        "1- Mister X.\n" +
                        "2- Ada Wong.\n" +
                        "3- Nemesis.\n" +
                        "4- Jill Valentine.\n"
                , 3);

        questions.put("THEME: GAMING\n\n" +
                        "Q- In which game series does Solid Snake belongs to?\n\n" +
                        "1- Metroid.\n" +
                        "2- Call of Duty.\n" +
                        "3- Borderlands.\n" +
                        "4- Metal Gear.\n"
                , 4);

        questions.put("THEME: GAMING\n\n" +
                        "Q- Who said the following quote \"Did I ever tell you the definition of insanity?\".\n\n" +
                        "1- Vaas.\n" +
                        "2- Ezio Auditore.\n" +
                        "3- Master Chief.\n" +
                        "4- Doomguy.\n"
                , 1);

        questions.put("THEME: THE WITCHER\n\n" +
                        "Q- What was the first surname Geralt of Rivia chose?\n\n" +
                        "1- Ravix of Fourhorn.\n" +
                        "2- Geralt Roger Eric du Haute-Bellegarde.\n" +
                        "3- Geralt of Vengerberg.\n" +
                        "4- Geraldo da Ribeira.\n"
                , 2);

        questions.put("THEME: PROGRAMMING\n\n" +
                        "Q- What does HTML stand for?\n\n" +
                        "1- Hyper Trainer Marking Language.\n" +
                        "2- Hyper Text Marketing Language.\n" +
                        "3- Hyper Text Markup Language.\n" +
                        "4- Hyper Text Markup Leveler.\n"
                , 3);

        questions.put("THEME: PROGRAMMING\n\n" +
                        "Q- Class B inherits from Class A, what cannot be said:\n\n" +
                        "1- B is a sub-class of A.\n" +
                        "2- A is a super-class of B.\n" +
                        "3- B has access to private members of A.\n" +
                        "4- B has access to protected members of A.\n"
                , 3);

        questions.put("THEME: PROGRAMMING\n\n" +
                        "Q- What is the Java keyword that creates inheritance?\n\n" +
                        "1- Enlarge.\n" +
                        "2- Extends.\n" +
                        "3- Inherits.\n" +
                        "4- Inheritance.\n"
                , 2);

        questions.put("THEME: PROGRAMMING\n\n" +
                        "Q- How do you create a method in Java?\n\n" +
                        "1- (methodName)\n" +
                        "2- methodName[]\n" +
                        "3- methodName()\n" +
                        "4- methodName.\n"
                , 3);


        questions.put("THEME: COUNTRIES\n\n" +
                        "Q- In which country are the world’s 10 coldest cities located?\n\n" +
                        "1- USA.\n" +
                        "2- RUSSIA.\n" +
                        "3- SWEDEN.\n" +
                        "4- CANADA.\n"
                , 2);


        questions.put("THEME: COUNTRIES\n\n" +
                        "Q- Which country has three capital cities?\n\n" +
                        "1- NIGERIA.\n" +
                        "2- SOUTH AFRICA.\n" +
                        "3- AUSTRALIA.\n" +
                        "4- CHILE.\n"
                , 2);

        questions.put("THEME: COUNTRIES\n\n" +
                        "Q- Which is the smallest country in the world?\n\n" +
                        "1- BARBADOS.\n" +
                        "2- CYPRUS.\n" +
                        "3- MALTA.\n" +
                        "4- VATICAN CITY.\n"
                , 4);


        questions.put("THEME: COUNTRIES\n\n" +
                        "Q- Which continent is home to the most countries?\n\n" +
                        "1- ASIA.\n" +
                        "2- AFRICA.\n" +
                        "3- EUROPE.\n" +
                        "4- SOUTH AMERICA.\n"
                , 2);


        questions.put("THEME: COUNTRIES\n\n" +
                        "Q-  Which of these is NOT one of the 13 countries crossed by the Equator?\n\n" +
                        "1- ECUADOR.\n" +
                        "2- INDONESIA.\n" +
                        "3- KENYA.\n" +
                        "4- EGYPT.\n"
                , 4);


        questions.put("THEME: COUNTRIES\n\n" +
                        "Q- Which is the most linguistically diverse country in the world?\n\n" +
                        "1- PAPUA NEW GUINEA.\n" +
                        "2- NIGERIA.\n" +
                        "3- INDIA.\n" +
                        "4- BRAZIL.\n"
                , 1);


        questions.put("THEME: COUNTRIES\n\n" +
                        "Q- Which country is home to — by far — the most pyramids in the world?\n\n" +
                        "1- EGYPT.\n" +
                        "2- COLOMBIA.\n" +
                        "3- SUDAN.\n" +
                        "4- CAMBODIA.\n"
                , 3);


        questions.put("THEME: COUNTRIES\n\n" +
                        "Q- Which of these countries was NOT a part of the Soviet Union?\n\n" +
                        "1- GEORGIA.\n" +
                        "2- UKRAINE.\n" +
                        "3- POLAND.\n" +
                        "4- BELARUS.\n"
                , 3);


        questions.put("THEME: COUNTRIES\n\n" +
                        "Q- Which of these cities is NOT a national capital?\n\n" +
                        "1- CAIRO.\n" +
                        "2- PRAGUE.\n" +
                        "3- BANGKOK.\n" +
                        "4- SYDNEY.\n"
                , 4);


        questions.put("THEME: COUNTRIES\n\n" +
                        "Q- Which of these countries is NOT recognized by the United Nations?\n\n" +
                        "1- ISRAEL.\n" +
                        "2- IRAN.\n" +
                        "3- TAIWAN.\n" +
                        "4- CYPRUS.\n"
                , 3);


        questions.put("THEME: PROGRAMMING\n\n" +
                        "Q- What does a compiler do?\n\n" +
                        "1- Translates computer code from machine level to byte code.\n" +
                        "2- Translates computer code from higher-level programming language to machine code.\n" +
                        "3- Translates computer code from lower-level programming language to higher-level programming language.\n" +
                        "4- A compiler does nothing.\n"
                , 2);


        questions.put("THEME: PROGRAMMING\n\n" +
                        "Q- Which company was behind the creation of Java?\n\n" +
                        "1- Microsoft.\n" +
                        "2- Sun Microsystems.\n" +
                        "3- Apple.\n" +
                        "4- Borland.\n"
                , 2);


        questions.put("THEME: PROGRAMMING\n\n" +
                        "Q- What was the original name for Java?\n\n" +
                        "1- Ada.\n" +
                        "2- C++.\n" +
                        "3- Oak.\n" +
                        "4- Lisp.\n"
                , 3);


        questions.put("THEME: PROGRAMMING\n\n" +
                        "Q- What is the name of the inventor (or father) of Java?\n\n" +
                        "1- Dennis Ritchie.\n" +
                        "2- Bill Gates.\n" +
                        "3- James Gosling.\n" +
                        "4- Bjarne Stroustrup.\n"
                , 3);


        questions.put("THEME: PROGRAMMING\n\n" +
                        "Q- What is the name of the class that all Java classes inherit (directly or indirectly) from?\n\n" +
                        "1- ClassLoader.\n" +
                        "2- Class.\n" +
                        "3- Object.\n" +
                        "4- None of the above.\n"
                , 3);

        questions.put("THEME: SPIDER MAN\n\n" +
                        "Q- Which Spider-Man villain is a disgruntled visual effects artist?\n\n" +
                        "1- Batman.\n" +
                        "2- Dr. Octopus.\n" +
                        "3- Mysterio.\n" +
                        "4- Sandman.\n"
                , 3);

        questions.put("THEME: SCOOBY-DOO\n\n" +
                        "Q- What type of dog is Scooby?\n\n" +
                        "1- Bulldog.\n" +
                        "2- Great Dane.\n" +
                        "3- Chi-hua-hua.\n" +
                        "4- Yorkshire Terrier.\n"
                , 2);

        questions.put("THEME: RICK & MORTY\n\n" +
                        "Q- What is Rick's last name?\n\n" +
                        "1- Obama.\n" +
                        "2- Lima.\n" +
                        "3- Fernandez.\n" +
                        "4- Sanchez.\n"
                , 4);

        questions.put("THEME: PEAKY BLINDERS\n\n" +
                        "Q- What is the official name of the Peaky Blinders’ family business?\n\n" +
                        "1- Shelby Industries Limited.\n" +
                        "2- Shelby Company Limited.\n" +
                        "3- Shelby's Factory.\n" +
                        "4- Grace's Secret.\n"
                , 2);

        questions.put("THEME: HOW I MET YOUR MOTHER\n\n" +
                        "Q- Barney Stinson became friends with Ted, Marshall and Lily after meeting Ted in 2001 where?\n\n" +
                        "1- MacLaren's urinal.\n" +
                        "2- At a concert.\n" +
                        "3- MacLaren's entry.\n" +
                        "4- Empire State Building.\n"
                , 1);

        questions.put("THEME: COUNTER-STRIKE\n\n" +
                        "Q- What is the most popular map is Counter-Strike ?\n\n" +
                        "1- Office.\n" +
                        "2- Lake.\n" +
                        "3- Dust II.\n" +
                        "4- Inferno.\n"
                , 3);

        questions.put("THEME: STRANGER THINGS\n\n" +
                        "Q- During season two, the boys dress up for Halloween as characters from which 80s movie?\n\n" +
                        "1- Power Rangers.\n" +
                        "2- Ghostbusters.\n" +
                        "3- Charlie Chaplin.\n" +
                        "4- Rambo.\n"
                , 2);

        questions.put("THEME: COMICS\n\n" +
                        "Q- The Punisher is a fictional character appearing in comic books published by which company?\n\n" +
                        "1- Fox Atomic Comics.\n" +
                        "2- DC Comics.\n" +
                        "3- Marvel Comics.\n" +
                        "4- AC Comics.\n"
                , 3);

        questions.put("THEME: VIDEOGAMES\n\n" +
                        "Q- Mario Kart is a video game series publish by which company?\n\n" +
                        "1- Sony.\n" +
                        "2- Nintendo.\n" +
                        "3- Microsoft.\n" +
                        "4- Sega.\n"
                , 2);

        questions.put("THEME: VIDEOGAMES\n\n" +
                        "Q- What are the names of the two teams in Among Us?\n\n" +
                        "1- Imposters and Crewmates.\n" +
                        "2- Aliens and Humans.\n" +
                        "3- Team Alpha and Team Beta.\n" +
                        "4- Cats and Dogs.\n"
                , 1);

        questions.put("THEME: PROGRAMMING\n\n" +
                        "Q- What is a class in java?\n\n" +
                        "1- A class is a special data type..\n" +
                        "2- A class is used to allocate memory to a data type..\n" +
                        "3- A class is a blue print from which individual objects are created. A class can contain fields and methods to describe the behavior of an object..\n" +
                        "4-None of the above..\n"
                , 3);

        questions.put("THEME: PROGRAMMING\n\n" +
                        "Q- What is the default value of byte variable?\n\n" +
                        "1- 0\n" +
                        "2- 0.0\n" +
                        "3- null.\n" +
                        "4- undefined.\n"
                , 1);

        questions.put("THEME: PROGRAMMING\n\n" +
                        "Q- Which method must be implemented by all threads?\n\n" +
                        "1- wait().\n" +
                        "2- start().\n" +
                        "3- stop().\n" +
                        "4- run().\n"
                , 4);

        questions.put("THEME: PROGRAMMING\n\n" +
                        "Q- Which of these is the most popularly used class as a key in a HashMap?\n\n" +
                        "1- Integer.\n" +
                        "2- String.\n" +
                        "3- Double.\n" +
                        "4- All of the above.\n"
                , 1);

    }

    public static HashMap<String, Integer> getQuestions() {
        return questions;
    }
}


