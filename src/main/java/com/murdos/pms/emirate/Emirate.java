package com.murdos.pms.emirate;

import com.murdos.pms.device.Device;
import com.murdos.pms.salesman.Salesman;
import com.murdos.pms.shop.Shop;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Emirate {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;
    private String name;
    @OneToMany(mappedBy = "emirate")
    private List<Device> devices;
    @OneToMany(mappedBy = "emirate")
    private List<Salesman> salesmen;
    @OneToMany(mappedBy = "emirate")
    private List<Shop> shops;
    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime modifiedAt;

    public Emirate() {
    }

    public Emirate(Long id, String name, List<Device> devices, List<Salesman> salesmen, List<Shop> shops, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.name = name;
        this.devices = devices;
        this.salesmen = salesmen;
        this.shops = shops;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Emirate(String name, List<Device> devices, List<Salesman> salesmen, List<Shop> shops, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.name = name;
        this.devices = devices;
        this.salesmen = salesmen;
        this.shops = shops;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public List<Salesman> getSalesmen() {
        return salesmen;
    }

    public void setSalesmen(List<Salesman> salesmen) {
        this.salesmen = salesmen;
    }

    public List<Shop> getShops() {
        return shops;
    }

    public void setShops(List<Shop> shops) {
        this.shops = shops;
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
