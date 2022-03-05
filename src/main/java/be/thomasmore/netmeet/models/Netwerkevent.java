package be.thomasmore.netmeet.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Netwerkevent {
    @Id
    private Integer id;
    private String naamNetwerkEvent;
    private String vakGebied;
    private String provincie;
    private String adres;
    private String organisator;
    private String info;
    private int maxAanwezigen;
    private String datum;
    private double duur;
    private String startUur;

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

    public String getOrganisator() {
        return organisator;
    }

    public void setOrganisator(String organisator) {
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

    public double getDuur() {
        return duur;
    }

    public void setDuur(double duur) {
        this.duur = duur;
    }

    public String getStartUur() {
        return startUur;
    }

    public void setStartUur(String startUur) {
        this.startUur = startUur;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }
}
