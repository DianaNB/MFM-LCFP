package MFM.LCFP.models;

public enum Genre {
 HIP_HOP("Hip-Hop", "Hip-Hop"),
 JAZZ("Jazz", "Jazz"),
 INDIE("Indie","Indie"),
 ROCK("Rock", "Rock"),
 ALTERNATIVE("Alternative", "Alternative"),
 POP("Pop", "Pop");



    String name;
    String category;


    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    Genre(String name, String category){
        this.name = name;
        this.category = category;
    }
}
