package be.thomasmore.netmeet.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
public class Netwerkevent {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "netwerkevent_generator")
    @SequenceGenerator(name = "netwerkevent_generator", sequenceName = "netwerkevent_seq", allocationSize = 1)
    @Id
    private Integer id;
    private String naamNetwerkEvent;
    @ManyToOne(fetch = FetchType.LAZY)
    private Vakgebied vakGebied;
    @ManyToOne(fetch = FetchType.LAZY)
    private Locatie locatie;
    @ManyToOne(fetch = FetchType.LAZY)
    private Organisator organisator;
    private String info;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datum;
    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm")
    private Date duur;
    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm")
    private Date startUur;
    @ManyToMany (fetch = FetchType.LAZY)
    private Collection<User> users;

    public Netwerkevent() {
    }

    public Integer getId() {
        return id;
    }

    public String getNaamNetwerkEvent() {
        return naamNetwerkEvent;
    }

    public void setNaamNetwerkEvent(String naamNetwerkEvent) {
        this.naamNetwerkEvent = naamNetwerkEvent;
    }

    public Organisator getOrganisator() {
        return organisator;
    }

    public void setOrganisator(Organisator organisator) {
        this.organisator = organisator;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Vakgebied getVakGebied() {
        return vakGebied;
    }

    public void setVakGebied(Vakgebied vakGebied) {
        this.vakGebied = vakGebied;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Date getDuur() {
        return duur;
    }

    public void setDuur(Date duur) {
        this.duur = duur;
    }

    public Date getStartUur() {
        return startUur;
    }

    public void setStartUur(Date startUur) {
        this.startUur = startUur;
    }

    public Locatie getLocatie() {
        return locatie;
    }

    public void setLocatie(Locatie locatie) {
        this.locatie = locatie;
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }
}
