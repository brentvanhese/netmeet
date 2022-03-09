package be.thomasmore.netmeet.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Netwerkevent {
    @Id
    private Integer id;
    private String naamNetwerkEvent;
    private String vakGebied;
    private String provincie;
    private String adres;
    @ManyToOne(fetch = FetchType.LAZY)
    private Organisator organisator;
    //private String organisator;
    private String info;
    private int maxAanwezigen;
    @Temporal(TemporalType.DATE)
    private Date datum;
    @Temporal(TemporalType.TIME)
    private Date duur;
    @Temporal(TemporalType.TIME)
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

    public String getProvincie() {
        return provincie;
    }

    public void setProvincie(String provincie) {
        this.provincie = provincie;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
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
}
