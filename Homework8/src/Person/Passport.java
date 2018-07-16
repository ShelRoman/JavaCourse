package Person;

import java.util.Objects;

class Passport {
    private String series;
    private int id;
    private String name;
    private String surname;

    Passport() {
        this.series = "AA";
        this.id = 1111;
        this.name = "John";
        this.surname = "Doe";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passport)) return false;
        Passport passport = (Passport) o;
        return id == passport.id &&
                Objects.equals(series, passport.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(series, id);
    }


    Passport(String series, int id, String name, String surname) {
        this.series = series;
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return ("Series & id - " + this.series + this.id + '\n') +
                ("Name - " + this.name + '\n') +
                ("Surname - " + this.surname + '\n');
    }


}
