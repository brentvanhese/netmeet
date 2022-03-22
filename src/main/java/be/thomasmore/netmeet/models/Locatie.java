package be.thomasmore.netmeet.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Locatie {
    @Id
    private Integer id;
    private String naam;
    private String straat;
    private int huisNr;
    private Integer postcode;
    private String stad;
    @ManyToOne(fetch = FetchType.LAZY)
    private Provincie provincie;
    private Integer maxAanwezigen;

    public Locatie() {
    }

    public Integer getId() {
        return id;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public int getHuisNr() {
        return huisNr;
    }

    public void setHuisNr(int huisNr) {
        this.huisNr = huisNr;
    }

    public Integer getPostcode() {
        return postcode;
    }

    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }

    public String getStad() {
        return stad;
    }

    public void setStad(String stad) {
        this.stad = stad;
    }

    public Provincie getProvincie() {
        return provincie;
    }

    public void setProvincie(Provincie provincie) {
        this.provincie = provincie;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Integer getMaxAanwezigen() {
        return maxAanwezigen;
    }

    public void setMaxAanwezigen(Integer maxAanwezigen) {
        this.maxAanwezigen = maxAanwezigen;
    }

    public String getAdres(){
        return straat + " " + huisNr + ", " + postcode + " " + stad;
    }
}
