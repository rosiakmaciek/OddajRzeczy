package pl.coderslab.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "institutions")
public class Institution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    @Column(length = 50)
    private String name;

    @NotEmpty
    @Column(length = 50)
    private String type;                    // fundacja (fund), organizacja (org), zbiórki lokalne (local)

    @NotEmpty
    @Column(length = 50)
    private String institutionDesc;

    @NotEmpty
    @Column(length = 50)
    private String thingsToGive;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInstitutionDesc() {
        return institutionDesc;
    }

    public void setInstitutionDesc(String institutionDesc) {
        this.institutionDesc = institutionDesc;
    }

    public String getThingsToGive() {
        return thingsToGive;
    }

    public void setThingsToGive(String thingsToGive) {
        this.thingsToGive = thingsToGive;
    }
}
