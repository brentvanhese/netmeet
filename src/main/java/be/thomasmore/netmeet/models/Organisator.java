package be.thomasmore.netmeet.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Organisator {
    @Id
    private Integer id;

    public Organisator() {
    }
}
