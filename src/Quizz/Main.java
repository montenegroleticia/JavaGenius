package Quizz;

import Quizz.controllers.GameControler;
import Quizz.utils.ANSICode;

public class Main {
    public static void main(String[] args) {
        ANSICode.CleanTerminal();

        ANSICode.ASCIIart();
        
        GameControler.startGame();
    }
}
