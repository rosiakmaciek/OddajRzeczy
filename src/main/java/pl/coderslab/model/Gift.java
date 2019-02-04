package pl.coderslab.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "gifts")
public class Gift {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 1, columnDefinition = "boolean default false")
    private boolean clothesToUse;

    @Column(length = 1, columnDefinition = "boolean default false")
    private boolean clothesWornOut;

    @Column(length = 1, columnDefinition = "boolean default false")
    private boolean toys;

    @Column(length = 1, columnDefinition = "boolean default false")
    private boolean books;

    @Column(length = 1, columnDefinition = "boolean default false")
    private boolean others;

    @Column
    @NotNull
    private Integer numberOfBags;

    @NotEmpty
    @Column(length = 50)
    private String localization;

    @NotEmpty
    @Column(length = 50)
    private String whoToHelp;

    @NotEmpty
    @Column
    private String descrption;

    @NotEmpty
    @Column
    private String pickUpStreet;

    @NotEmpty
    @Column
    private String pickUpCity;

    @NotEmpty
    @Column
    private String pickUpCode;

    @NotEmpty
    @Column
    private String pickUpPhone;

    @NotEmpty
    @Column
    private Date pickUpDate;

    @NotEmpty
    @Column
    private Time pickUpTime;

    private String courierNotes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isClothesToUse() {
        return clothesToUse;
    }

    public void setClothesToUse(boolean clothesToUse) {
        this.clothesToUse = clothesToUse;
    }

    public boolean isClothesWornOut() {
        return clothesWornOut;
    }

    public void setClothesWornOut(boolean clothesWornOut) {
        this.clothesWornOut = clothesWornOut;
    }

    public boolean isToys() {
        return toys;
    }

    public void setToys(boolean toys) {
        this.toys = toys;
    }

    public boolean isBooks() {
        return books;
    }

    public void setBooks(boolean books) {
        this.books = books;
    }

    public boolean isOthers() {
        return others;
    }

    public void setOthers(boolean others) {
        this.others = others;
    }

    public Integer getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(Integer numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public String getWhoToHelp() {
        return whoToHelp;
    }

    public void setWhoToHelp(String whoToHelp) {
        this.whoToHelp = whoToHelp;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public String getPickUpStreet() {
        return pickUpStreet;
    }

    public void setPickUpStreet(String pickUpStreet) {
        this.pickUpStreet = pickUpStreet;
    }

    public String getPickUpCity() {
        return pickUpCity;
    }

    public void setPickUpCity(String pickUpCity) {
        this.pickUpCity = pickUpCity;
    }

    public String getPickUpCode() {
        return pickUpCode;
    }

    public void setPickUpCode(String pickUpCode) {
        this.pickUpCode = pickUpCode;
    }

    public String getPickUpPhone() {
        return pickUpPhone;
    }

    public void setPickUpPhone(String pickUpPhone) {
        this.pickUpPhone = pickUpPhone;
    }

    public Date getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(Date pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public Time getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(Time pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public String getCourierNotes() {
        return courierNotes;
    }

    public void setCourierNotes(String courierNotes) {
        this.courierNotes = courierNotes;
    }
}
