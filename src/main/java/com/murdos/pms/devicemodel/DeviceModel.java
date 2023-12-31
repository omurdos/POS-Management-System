package com.murdos.pms.devicemodel;

import com.murdos.pms.device.Device;
import com.murdos.pms.manufacturer.Manufacturer;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class DeviceModel {
    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private String id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;
    @OneToMany(mappedBy = "deviceModel", cascade = CascadeType.ALL)
    private List<Device> devices;
    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime modifiedAt;

    public DeviceModel() {
    }

    public DeviceModel(String id, String name, Manufacturer manufacturer, List<Device> devices, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.devices = devices;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public DeviceModel(String name, Manufacturer manufacturer, List<Device> devices, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.name = name;
        this.manufacturer = manufacturer;
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

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
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
