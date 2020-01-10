package MFM.LCFP.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
public class Post {
    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message = "Please enter a name")
    private String name;

    @NotBlank(message = "Please enter a title")
    private String title;

    @NotBlank(message = "Please enter a description")
    @Lob
    private String description;

    private int age;

    private Genre genre;
    
    public Post() {
    }

    public Post(int id, String name, String title, String description, String genre, int age) {

        this.id = id;
        this.name = name;
        this.title = title;
        this.description = description;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

}
