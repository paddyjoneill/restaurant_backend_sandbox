package com.bezkoder.springjwt.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date")
    private String date;

    @Column(name= "start_time")
    private String startTime;

    @Column(name = "duration")
    private int duration;

//    @ManyToOne
//    @JoinColumn(name = "table_id", nullable = false)
//    private EatingPlatform eatingPlatform;

    @Column(name = "number_of_guests")
    private int numberOfGuests;

    @JsonIgnoreProperties("bookings")
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Booking(String date, String startTime, int numberOfGuests, User user) {
        this.date = date;
        this.startTime = startTime;
        this.duration = 1;
//        this.eatingPlatform = eatingPlatform;
        this.numberOfGuests = numberOfGuests;
        this.user = user;
    }

    public Booking() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

//    public EatingPlatform getEatingPlatform() {
//        return eatingPlatform;
//    }
//
//    public void setEatingPlatform(EatingPlatform eatingPlatform) {
//        this.eatingPlatform = eatingPlatform;
//    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public User getUser() {
        return user;
    }

    public void setCustomer(User user) {
        this.user = user;
    }

//    public Long getEatingPlatformId() {
//        return getEatingPlatform().getId();
//    }
//
//    public Long getCustomerId(){
//        return getCustomer().getId();
//    }
}
