package utility;

public class Messages {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\033[0;101m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\033[0;104m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static final String GEEK_QUIZ = ANSI_BLUE + "\n" +
            "   _____ ______ ______ _  __      ____  _    _ _____ ______\n" +
            "  / ____|  ____|  ____| |/ /     / __ \\| |  | |_   _|___  /\n" +
            " | |  __| |__  | |__  | ' /_____| |  | | |  | | | |    / / \n" +
            " | | |_ |  __| |  __| |  <______| |  | | |  | | | |   / /  \n" +
            " | |__| | |____| |____| . \\     | |__| | |__| |_| |_ / /__ \n" +
            "  \\_____|______|______|_|\\_\\     \\___\\_\\\\____/|_____/_____|\n" +
            "                                                           \n" +
            "                                                           \n" + ANSI_RESET;
    public static final String GAME_INTERRUPTED = ANSI_RED + " left the server! Game will be interrupted." + ANSI_RESET + "\n";
    public static final String INVALID_INPUT = "\n" + ANSI_RED_BACKGROUND + ANSI_BLACK + "Invalid Input. Try again:" + ANSI_RESET + "\n";
    public static final String USERNAME_REQUEST = "\n" + ANSI_CYAN + "Enter your username for the group chat: " + ANSI_RESET + "\n";
    public static final String NAME_IN_USED = "\n" + ANSI_BLACK_BACKGROUND + ANSI_RED + "That name is already taken!" + ANSI_RESET + "\n";
    public static final String KEY_USED = "\n\n" + ANSI_BLACK_BACKGROUND + ANSI_WHITE + "Gotcha! Let's get this game started!" + ANSI_RESET + "\n";
    public static final String KEY_USED_NOTIFICATION = "\n" + ANSI_YELLOW + "Someone typed a secret code! Press enter!" + ANSI_RESET + "\n";
    public static final String VALIDATE_NUMBER_PLAYERS = "\n" + ANSI_YELLOW + "Number of participants must be even." + ANSI_RESET + "\n";
    public static final String TEAM_CREATION = "\n\n" + ANSI_BLACK_BACKGROUND + ANSI_WHITE + "GAME IS ABOUT TO START\nDividing players in 2 teams..." + ANSI_RESET + "\n\n";
    public static final String ENTER = "\n" + ANSI_BLUE + "Press Enter to continue:" + ANSI_RESET + "\n\n";
    public static final String PLAYER_NOT_READY = "\n\n" + ANSI_CYAN + "Not all players are ready! Please wait a sec and press Enter:" + ANSI_RESET + "\n\n";
    public static final String PLAYER_NOT_ANSWER = "\n\n" + ANSI_CYAN + "Not all players have answered! Please wait a sec and press Enter:" + ANSI_RESET + "\n\n";
    public static final String PLAYER_NOT_SPEND_POINTS = "\n\n" + ANSI_CYAN + "Not all players have used their points! Please wait a sec and press Enter:" + ANSI_RESET + "\n\n";
    public static final String PLAYER_WAIT_RESOLUTION = "\n\n" + ANSI_CYAN + "Not all players have seen the resolution! Please wait a sec and press Enter:" + ANSI_RESET + "\n\n";
    public static final String TEAM2_WIN = "\n\n" + ANSI_RED_BACKGROUND + ANSI_WHITE + "TEAM 2 WINS! CONGRATS!" + ANSI_RESET + "\n" + ANSI_BLACK_BACKGROUND + ANSI_WHITE + "RETURNING TO CHAT..." + ANSI_RESET + "\n";
    public static final String TEAM1_WIN = "\n\n" + ANSI_BLUE_BACKGROUND + ANSI_WHITE + "TEAM 1 WINS! CONGRATS!" + ANSI_RESET + "\n" +  ANSI_BLACK_BACKGROUND + ANSI_WHITE + "RETURNING TO CHAT..." + ANSI_RESET + "\n";
    public static final String SERVER_ON = ANSI_BLACK_BACKGROUND + ANSI_WHITE + "Server started." + ANSI_RESET + "\n";
    public static final String CLIENT_CONNECT = "\n" + ANSI_BLACK_BACKGROUND + ANSI_WHITE + "A new client has connected: " + ANSI_RESET;
    public static final String MUSIC_FILE_ERROR = "\n" + ANSI_RED_BACKGROUND + ANSI_BLACK + "Can't find file" + ANSI_RESET + "\n";
    public static final String ADVERTISING = "\n\n" + ANSI_WHITE_BACKGROUND + ANSI_BLACK + "GET THE QUESTION RIGHT FOR 1 POINT!" + ANSI_RESET + "\n\n";
    public static final String CORRECT_ANSWER = ANSI_GREEN + "\nCorrect answer.\n" + ANSI_RESET;
    public static final String WRONG_ANSWER = ANSI_RED + "\nIncorrect answer." + ANSI_RESET;
    public static final String SCORE = ANSI_YELLOW + "\n\nYour score is : " + ANSI_RESET;
    public static final String SPEND_OR_PASS = ANSI_YELLOW + "\nChoose one of the following options:\n1)SPEND POINTS              2)PASS" + ANSI_RESET + "\n";
    public static final String ATTACK_OR_DEFENCE = ANSI_YELLOW + "\nChoose one of the following options:\n1)VIRUS(ATK)            2)ANTI-VIRUS(DEF)" + ANSI_RESET + "\n";
    public static final String SPENDING_POINTS = ANSI_CYAN + "How many points do you want to spend?" + ANSI_RESET + "\n";
    public static final String PHASE_PASSED = "\n" + ANSI_YELLOW_BACKGROUND + ANSI_BLACK + "PHASE PASSED" + ANSI_RESET + "\n";
    public static final String NO_POINTS = "\n\n" + ANSI_CYAN_BACKGROUND + ANSI_BLACK + "YOU DON'T HAVE ANY POINTS TO SPEND" + ANSI_RESET + "\n";
    public static final String TEAM_1 = "\n\n" + ANSI_RED_BACKGROUND + ANSI_WHITE + "       TEAM 1:       " + ANSI_RESET + "\n\n" + ANSI_RED_BACKGROUND + ANSI_WHITE + "-------------------\n" +  "%s" + "\n-------------------" + ANSI_RESET + "\n";
    public static final String TEAM_2 = "\n\n" + ANSI_BLUE_BACKGROUND + ANSI_WHITE + "       TEAM 2:       " + ANSI_RESET + "\n\n" + ANSI_BLUE_BACKGROUND + ANSI_WHITE +"-------------------\n %s \n-------------------" + ANSI_RESET + "\n";
    public static final String RESOLUTION = "\n\n" + ANSI_YELLOW_BACKGROUND + ANSI_BLACK + "RESOLUTION:" + ANSI_RESET + "\n\n" + ANSI_PURPLE +
            "Team 1: " + ANSI_RESET + "%s \n" + ANSI_RED + "Firewalls: " + ANSI_RESET + "%s \n" + ANSI_BLUE + "Virus: " + ANSI_RESET + "%s \n" + ANSI_GREEN + "Antivirus: " + ANSI_RESET + "%s \n" + ANSI_PURPLE + "----------------------------\n\n" +
            "Team 2: " + ANSI_RESET + "%s \n" + ANSI_RED + "Firewalls: " + ANSI_RESET + "%s \n" + ANSI_BLUE + "Virus: " + ANSI_RESET + "%s \n" + ANSI_GREEN + "Antivirus: " + ANSI_RESET + "%s \n" + ANSI_PURPLE + "----------------------------\n\n" + ANSI_RESET;
//TEAM AINDA NA MERDA , CORRIGIR
}
