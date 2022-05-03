package Practicas.practicaHarry;

public class Character {
    Character(int i){

    }
    public String name;
    public String gender;
    public String blood;
    public String house;
    public int movies;
    public int ageLast;

    public Character(String name, String gender, String blood, String house, int movies, int ageLast) {
        this.name = name;
        this.gender = gender;
        this.blood = blood;
        this.house = house;
        this.movies = movies;
        this.ageLast = ageLast;

    }
    public String printMsg(){
        return name+" is a "+gender+" character of "+blood+" blood "+"from "+house+" House "+"who appears in "+
                movies+" movies and is "+ageLast+" years old.\n";
    }
}

