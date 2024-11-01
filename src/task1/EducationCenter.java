package task1;

import java.time.LocalDate;

public abstract class EducationCenter {
    private String name;
    private String country;
    private LocalDate foundationDate;

    public EducationCenter(String name, String country, LocalDate foundationDate) {
        this.name = name;
        this.country = country;
        this.foundationDate = foundationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(LocalDate foundationDate) {
        this.foundationDate = foundationDate;
    }
}
