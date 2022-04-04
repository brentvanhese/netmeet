package be.thomasmore.netmeet.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vakgebied {
    @Id
    private Integer id;
    private String naamVakgebied;

    public Vakgebied() {
    }

    public Integer getId() {
        return id;
    }

    public String getNaamVakgebied() {
        return naamVakgebied;
    }

    public void setNaamVakgebied(String naamVakgebied) {
        this.naamVakgebied = naamVakgebied;
    }
}
