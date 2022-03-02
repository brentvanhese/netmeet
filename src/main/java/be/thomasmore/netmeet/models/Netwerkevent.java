package be.thomasmore.netmeet.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Netwerkevent {
    @Id
    private Integer id;

    public Netwerkevent() {
    }
}
