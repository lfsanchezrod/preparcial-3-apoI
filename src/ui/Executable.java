package ui;

import java.util.Scanner;
import model.Controller;

public class Executable{
    private Scanner reader;
    private Controller control;
    public static void main(String[] args) {
        Executable exe = new Executable();
        exe.showMenu();
    }

    public Executable(){
        reader = new Scanner(System.in);
        control = new Controller();
    }

    public void showMenu(){

    }
}