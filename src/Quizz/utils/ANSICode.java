package Quizz.utils;

public class ANSICode {
    public static void CleanTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void ASCIIart() {
        String ascii = "     _                   ____            _           \n" + //
                        "    | | __ ___   ____ _ / ___| ___ _ __ (_)_   _ ___ \n" + //
                        " _  | |/ _` \\ \\ / / _` | |  _ / _ \\ '_ \\| | | | / __|\n" + //
                        "| |_| | (_| |\\ V / (_| | |_| |  __/ | | | | |_| \\__ \\\n" + //
                        " \\___/ \\__,_| \\_/ \\__,_|\\____|\\___|_| |_|_|\\__,_|___/\n";

        System.out.println(ascii 
        + "\nJavaGenius - Desafie seu Conhecimento em Java!\n");
    }
}
