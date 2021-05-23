package oops;


public class Encapsulation {

    public static void main(String[] args) {
        
        CricketInfo match = new CricketInfo();
        match.setFormat("T20");
        match.setOvers(20);
        System.out.println("This match is a "+match.getFormat()+" and it contains "+match.getOvers()+" overs");

        match.setFormat("ODI");
        match.setOvers(50);
        System.out.println("This match is a "+match.getFormat()+" and it contains "+match.getOvers()+" overs");
    }
}