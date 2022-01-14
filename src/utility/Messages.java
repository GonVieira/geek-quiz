package utility;

public class Messages {
    //Colors
    public static final String CLEAR = "\033[H\033[2J";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\033[0;94m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_WHITE = "\u001B[37m";

    //Backgrounds
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\033[0;101m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\033[0;104m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    //Server side prints
    public static final String SERVER_ON = "\nServer started.";
    public static final String CLIENT_CONNECTED = "\nA new client has connected: ";
    public static final String MUSIC_FILE_ERROR = "\n" + ANSI_RED + "Can't find  music file" + ANSI_RESET + "\n";

    //Chatroom prints
    public static final String USERNAME_REQUEST = "\n" + ANSI_BLUE + "Enter your username for the group chat: " + ANSI_RESET + "\n";
    public static final String INVALID_USERNAME = "\n" + ANSI_RED_BACKGROUND + ANSI_BLACK + "That name is already taken!" + ANSI_RESET + "\n";
    public static final String WELCOME_TO_CHATROOM = "\n\n" + ANSI_YELLOW + "WELCOME TO THE CHATROOM!" + ANSI_RESET;
    public static final String NEW_CLIENT_JOINED = ANSI_BLUE + "SERVER: " + ANSI_GREEN + "%s" + ANSI_RESET + " has entered the chatroom!\n";
    public static final String NOT_IN_LEADERBOARD = ANSI_BLUE + "You are not in the Leaderboards yet!" + ANSI_RESET;
    public static final String GAME_CODE_USED = "\n\n" + ANSI_BLUE + "Gotcha! Let's get this game started!" + ANSI_RESET + "\n";
    public static final String INCORRECT_NUMBER_OF_PLAYERS = "\n" + ANSI_YELLOW + "Number of participants must be even." + ANSI_RESET + "\n";
    public static final String GAME_CODE_USED_NOTIFICATION = "\n" + ANSI_YELLOW + "Someone typed a secret code! Press enter!" + ANSI_RESET + "\n";
    public static final String GAME_STARTING = "\n\n" + ANSI_BLACK_BACKGROUND + ANSI_WHITE + "GAME IS ABOUT TO START\nDividing players in 2 teams..." + ANSI_RESET + "\n\n";
    public static final String CLIENT_LEFT_CHAT = ANSI_BLUE + "SERVER: " + ANSI_GREEN + "%s" + ANSI_RESET + " has left the chat!\n";

    //Logo
    public static final String GEEK_QUIZ_LOGO = ANSI_BLUE + "\n" +
            "   _____ ______ ______ _  __      ____  _    _ _____ ______\n" +
            "  / ____|  ____|  ____| |/ /     / __ \\| |  | |_   _|___  /\n" +
            " | |  __| |__  | |__  | ' /_____| |  | | |  | | | |    / / \n" +
            " | | |_ |  __| |  __| |  <______| |  | | |  | | | |   / /  \n" +
            " | |__| | |____| |____| . \\     | |__| | |__| |_| |_ / /__ \n" +
            "  \\_____|______|______|_|\\_\\     \\___\\_\\\\____/|_____/_____|\n" +
            "                                                           \n" +
            "                                                           \n" + ANSI_RESET;

    //General Game prints
    public static final String TEAM_1 = "\n\n" + ANSI_RED_BACKGROUND + ANSI_WHITE + "       TEAM 1:       " + ANSI_RESET + "\n\n" + ANSI_RED_BACKGROUND + ANSI_WHITE + "----------------------------------------------------------------------------------------\n" + "%s\n" + "----------------------------------------------------------------------------------------" + ANSI_RESET + "\n";
    public static final String TEAM_2 = "\n\n" + ANSI_BLUE_BACKGROUND + ANSI_WHITE + "       TEAM 2:       " + ANSI_RESET + "\n\n" + ANSI_BLUE_BACKGROUND + ANSI_WHITE + "----------------------------------------------------------------------------------------\n" + "%s\n" + "----------------------------------------------------------------------------------------" + ANSI_RESET + "\n";
    public static final String PRESS_ENTER_TO_CONTINUE = "\n" + ANSI_BLUE + "Press Enter to continue:" + ANSI_RESET + "\n\n";
    public static final String PLAYERS_READY = ANSI_YELLOW + "All Players are ready! Press Enter:" + ANSI_RESET;
    public static final String INVALID_INPUT = "\n" + ANSI_RED_BACKGROUND + ANSI_BLACK + "Invalid Input. Try again:" + ANSI_RESET + "\n";
    public static final String GAME_INTERRUPTED = "\n\n" + ANSI_RED + "%s" + " left the server! Game will be interrupted after your next input." + ANSI_RESET + "\n";

    //Question Phase prints
    public static final String QUESTIONS_BANNER = "\n\n" + ANSI_WHITE_BACKGROUND + ANSI_BLACK + "GET THE QUESTIONS RIGHT FOR 1 POINT EACH!" + ANSI_RESET + "\n\n";
    public static final String CORRECT_ANSWER = ANSI_GREEN + "\nCorrect answer!\n" + ANSI_RESET;
    public static final String WRONG_ANSWER = ANSI_RED + "\nIncorrect answer!\n" + ANSI_RESET;
    public static final String PLAYERS_HAVENT_ANSWERED = "\n\n" + ANSI_BLUE + "Not all players have answered! Please wait a sec!" + ANSI_RESET + "\n\n";

    //Spend Phase prints
    public static final String SPEND_PHASE_BANNER = "\n\n" + ANSI_WHITE_BACKGROUND + ANSI_BLACK + "BET THE POINTS YOU HAVE EARNED!" + ANSI_RESET + "\n\n";
    public static final String POINTS = ANSI_YELLOW + "\nYour points are : " + ANSI_RESET + "%s" + "\n";
    public static final String SPEND_POINTS_OR_PASS = ANSI_YELLOW + "\nChoose one of the following options:\n1)SPEND POINTS              2)PASS" + ANSI_RESET + "\n";
    public static final String CHOOSE_ATTACK_OR_DEFENSE = ANSI_YELLOW + "\nChoose one of the following options:\n1)VIRUS(ATK)            2)ANTI-VIRUS(DEF)" + ANSI_RESET + "\n";
    public static final String CHOOSE_NUMBER_OF_POINTS = ANSI_YELLOW + "How many points do you want to spend?" + ANSI_RESET + "\n";
    public static final String PHASE_PASSED = "\n" + ANSI_YELLOW_BACKGROUND + ANSI_BLACK + "PHASE PASSED" + ANSI_RESET + "\n";
    public static final String NO_POINTS = "\n\n" + ANSI_CYAN_BACKGROUND + ANSI_BLACK + "YOU DON'T HAVE ANY POINTS TO SPEND" + ANSI_RESET + "\n";
    public static final String PLAYERS_HAVENT_SPENT_POINTS = "\n\n" + ANSI_BLUE + "Not all players have used their points! Please wait a sec!" + ANSI_RESET + "\n\n";

    //Resolution Phase prints
    public static final String RESOLUTION_PHASE_BANNER = "\n\n" + ANSI_WHITE_BACKGROUND + ANSI_BLACK + "RESOLUTION PHASE!" + ANSI_RESET + "\n\n";
    public static final String TEAM1_WINS = "\n\n" + ANSI_BLUE_BACKGROUND + ANSI_WHITE + "TEAM 1 WINS! CONGRATS!" + ANSI_RESET + "\n" + ANSI_BLACK_BACKGROUND + ANSI_WHITE + "RETURNING TO CHAT..." + ANSI_RESET + "\n";
    public static final String TEAM2_WINS = "\n\n" + ANSI_RED_BACKGROUND + ANSI_WHITE + "TEAM 2 WINS! CONGRATS!" + ANSI_RESET + "\n" + ANSI_BLACK_BACKGROUND + ANSI_WHITE + "RETURNING TO CHAT..." + ANSI_RESET + "\n";
    public static final String PLAYERS_NOT_READY = "\n\n" + ANSI_BLUE + "Not all players are ready! Please wait a sec!" + ANSI_RESET + "\n\n";
    public static final String PLAYERS_HAVENT_CHECKED_RESOLUTION = "\n\n" + ANSI_BLUE + "Not all players have seen the resolution! Please wait a sec!" + ANSI_RESET + "\n\n";

    //Goodbye Messages
    public static final String GOODBYE_MESSAGE = "GOODBYE! HOPE TO SEE YOU SOON!";
    public static final String SERVER_CRASH_MESSAGE = "WHAT A SALTY LOSER! OK, LET'S RUIN THE GAME FOR EVERYONE!";

}
