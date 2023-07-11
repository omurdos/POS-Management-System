package com.murdos.pms.manufacturer;

import com.murdos.pms.devicemodel.DeviceModel;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Manufacturers")
public class Manufacturer {
    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private String id;
    private String name;
    @OneToMany(mappedBy = "manufacturer", cascade = CascadeType.ALL)
    private List<DeviceModel> deviceModels;
    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime modifiedAt;

    public Manufacturer() {
    }

    public Manufacturer(String id, String name, List<DeviceModel> deviceModels, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.name = name;
        this.deviceModels = deviceModels;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Manufacturer(String name, List<DeviceModel> deviceModels, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.name = name;
        this.deviceModels = deviceModels;
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

    public List<DeviceModel> getDeviceModels() {
        return deviceModels;
    }

    public void setDeviceModels(List<DeviceModel> deviceModels) {
        this.deviceModels = deviceModels;
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
