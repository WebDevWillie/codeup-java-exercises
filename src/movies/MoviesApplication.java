package movies;
import util.Input;
import java.util.Scanner;


public class MoviesApplication {

    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - view movies in the musical category");
        System.out.println("7 - view movies in the comedy category");
        System.out.println("8 - view movies in the romance category");
        System.out.println("9 - view movies in the documentary category");
        System.out.println("10 - view movies in the western category");
        System.out.println("11 - view movies in the action category");
        System.out.println("12 - view movies in the thriller category");
        System.out.println("13 - view movies in the crime category");
        System.out.println("14 - view movies in the fantasy category");
        System.out.println("15 - view movies in the adventure category");
        System.out.println("16 - view movies in the family category");
        System.out.println("17 - view movies in the animation category");
        System.out.println("18 - view movies in the biography category");
        System.out.println("19 - view movies in the history category");
        System.out.println("20 - view movies in the sport category");
        System.out.println("21 - view movies in the war category");
        System.out.println("22 - view movies in the mystery category");
        System.out.println("23 - view movies in the music category");
        System.out.println("24 - view movies in the film-noir category");
        System.out.println("25 - view movies in the short category");
        System.out.println("26 - view movies in the adult category");
        System.out.println("27 - view movies in the game-show category");
        System.out.println("28 - view movies in the talk-show category");
        System.out.println("29 - view movies in the news category");
        System.out.println("30 - view movies in the reality-tv category");
        System.out.println("31 - view movies in the sci-fi category");
        System.out.println("32 - view movies in the horror category");
        System.out.println("33 - view movies in the musical category");



for (Movie movie : movies) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }


    }

}
