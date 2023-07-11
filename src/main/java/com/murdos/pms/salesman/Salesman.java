package com.murdos.pms.salesman;

import com.murdos.pms.device.Device;
import com.murdos.pms.emirate.Emirate;
import com.murdos.pms.shop.Shop;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Salesman {
    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private String id;
    private String name;
    private String phoneNumber;
    @OneToMany(mappedBy = "salesman",cascade = CascadeType.ALL)
    private List<Shop> shops;
    @OneToMany(mappedBy = "salesman", cascade = CascadeType.ALL)
    private List<Device> devices;
    @ManyToOne
    @JoinColumn(name = "emirate_id")
    private Emirate emirate;

    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime modifiedAt;

    public Salesman() {
    }

    public Salesman(String id, String name, String phoneNumber, List<Shop> shops, List<Device> devices, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.shops = shops;
        this.devices = devices;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Salesman(String name, String phoneNumber, List<Shop> shops, List<Device> devices, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.shops = shops;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Shop> getShops() {
        return shops;
    }

    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
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

