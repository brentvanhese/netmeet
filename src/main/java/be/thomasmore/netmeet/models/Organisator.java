package be.thomasmore.netmeet.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Organisator {
    @Id
    private Integer id;
    private String naam;
    private String info;
    @ManyToMany (fetch = FetchType.LAZY)
    private Collection<Netwerkevent> netwerkevents;

    public Organisator() {
    }

    public Integer getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Collection<Netwerkevent> getNetwerkevents() {
        return netwerkevents;
    }

    public void setNetwerkevents(Collection<Netwerkevent> netwerkevents) {
        this.netwerkevents = netwerkevents;
    }
}
