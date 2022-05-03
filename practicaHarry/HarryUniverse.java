package Practicas.practicaHarry;

public class HarryUniverse {
    public static void main(String[] args) {
    voldemor();
    hagrid();
    fleur();
    dumbledor();
    hermione();
    }

    public static void voldemor(){
        Character voldemor = new Character(
                "Tom Marvolo Riddle",
                "male",
                "half-blood",
                "Slytherin",
                5,
                71);
        System.out.println(voldemor.printMsg());
    }
    public static void hagrid(){
        Character hagrid = new Character(
                "Rubeus Hagrid",
                "male",
                "semi-giant",
                "Griffindor",
                7,
                89);
        System.out.println(hagrid.printMsg());
    }
    public static void fleur(){
        Character fleur = new Character(

                "Fleur Delacour",
                "female",
                "veela",
                "Beauxbatons",
                2,
                21);

        System.out.println(fleur.printMsg());
    }
    public static void dumbledor(){
        Character dumbledor = new Character(
                "Albus Dumbledor",
                "male",
                "half-Blood",
                "Griffindor",
                6,
                116);

        System.out.println(dumbledor.printMsg());
    }

    public static void hermione(){
        Character hermione = new Character(
                "Hermione Granger",
                "female",
                "muggle",
                "Griffindor",
                8,
                22);

        System.out.println(hermione.printMsg());
    }
}
