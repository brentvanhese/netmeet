package be.thomasmore.netmeet.models;

import javax.persistence.*;

@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
    @SequenceGenerator(name = "user_generator", sequenceName = "user_seq", allocationSize = 1)
    @Id
    private Integer id;
    private String username;
    private String voornaam;
    private String achternaam;
    private String password;
    private String role;
    @OneToOne(fetch = FetchType.LAZY)
    private Organisator organisator;

    public User() {
    }

    public User(String username, String voornaam, String achternaam, String password, String role) {
        this.username = username;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.password = password;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Organisator getOrganisator() {
        return organisator;
    }

    public void setOrganisator(Organisator organisator) {
        this.organisator = organisator;
    }
}
