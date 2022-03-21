package be.thomasmore.netmeet.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Provincie {
    @Id
    private Integer id;
    private String provincieNaam;

    public Provincie() {
    }

    public Integer getId() {
        return id;
    }

    public String getProvincieNaam() {
        return provincieNaam;
    }

    public void setProvincieNaam(String provincieNaam) {
        this.provincieNaam = provincieNaam;
    }
}
