package be.thomasmore.netmeet.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Netwerkevent {
    @Id
    private Integer id;
    private String naamNetwerkEvent;
    private String provincie;
    private String adres;
    private String organisator;
    private String info;
    private int maxAanwezigen;

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
}
