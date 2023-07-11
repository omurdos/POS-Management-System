package com.murdos.pms.shop;

import com.murdos.pms.device.Device;
import com.murdos.pms.emirate.Emirate;
import com.murdos.pms.salesman.Salesman;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Shop {
    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private String id;
    private String name;
    private double lat;
    private double lng;
    @ManyToOne
    @JoinColumn(name = "emirate_id")
    private Emirate emirate;

    @OneToMany
    @JoinColumn(name = "device_id")
    private List<Device> devices;
    @ManyToOne
    @JoinColumn(name ="salesman_id")
    private Salesman salesman;
    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime modifiedAt;
    public Shop() {
    }

    public Shop(String id, String name, Emirate emirate,  double lat, double lng, List<Device> devices, Salesman salesman, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.name = name;
        this.emirate = emirate;
        this.salesman = salesman;
        this.lat = lat;
        this.lng = lng;
        this.devices = devices;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Shop(String name, Emirate emirate,  double lat, double lng, List<Device> devices, Salesman salesman, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.name = name;
        this.emirate = emirate;
        this.salesman = salesman;
        this.lat = lat;
        this.lng = lng;
        this.devices = devices;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Emirate getEmirate() {
        return emirate;
    }

    public void setEmirate(Emirate emirate) {
        this.emirate = emirate;
    }

    public Salesman getSalesMan() {
        return salesman;
    }

    public void setSalesMan(Salesman salesman) {
        this.salesman = salesman;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public Salesman getSalesman() {
        return salesman;
    }

    public void setSalesman(Salesman salesman) {
        this.salesman = salesman;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
