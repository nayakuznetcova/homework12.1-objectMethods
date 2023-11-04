import java.util.Objects;

public class Autor {
    private String name;
    private String surName;

    public Autor (String name, String surName){
        this.name = name;
        this.surName = surName;
    }

    public String getName () {
        return name;
    }

    public String getSurName () {
        return  surName;
    }

    public String toString () {
        return name + " " + surName;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return name.equals(autor.name) && surName.equals(autor.surName);
    }

    public int hashCode() {
        return Objects.hash(name, surName);
    }
}
