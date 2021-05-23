package oops;

public class Abstraction {

    public static void main(String[] args) {
        
        CricketFormat match = new Test();
        
        match.play();

        match = new Odi();

        match.play();
    }

}