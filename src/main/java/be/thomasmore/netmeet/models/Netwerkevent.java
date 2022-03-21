package be.thomasmore.netmeet.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Netwerkevent {
    @Id
    private Integer id;
    private String naamNetwerkEvent;
    private String vakGebied;
    @ManyToOne(fetch = FetchType.LAZY)
    private Provincie provincie;
    @ManyToOne(fetch = FetchType.LAZY)
    private Locatie locatie;
    @ManyToOne(fetch = FetchType.LAZY)
    private Organisator organisator;
    private String info;
    private int maxAanwezigen;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private Date datum;
    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm")
    private Date duur;
    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm")
    private Date startUur;

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

    public int getMaxAanwezigen() {
        return maxAanwezigen;
    }

    public void setMaxAanwezigen(int maxAanwezigen) {
        this.maxAanwezigen = maxAanwezigen;
    }

    public String getVakGebied() {
        return vakGebied;
    }

    public void setVakGebied(String vakGebied) {
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

    public Provincie getProvincie() {
        return provincie;
    }

    public void setProvincie(Provincie provincie) {
        this.provincie = provincie;
    }

    public Locatie getLocatie() {
        return locatie;
    }

    public void setLocatie(Locatie locatie) {
        this.locatie = locatie;
    }
}
