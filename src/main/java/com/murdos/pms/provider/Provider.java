package com.murdos.pms.provider;

import com.murdos.pms.device.Device;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Provider {
    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private String id;
    private String name;
    private String contactName;
    private String contactPhoneNumber;
    @OneToMany(mappedBy = "provider", cascade = CascadeType.ALL)
    private List<Device> devices;
    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime modifiedAt;

    public Provider() {
    }

    public Provider(String id, String name, String contactName, String contactPhoneNumber, List<Device> devices, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.name = name;
        this.contactName = contactName;
        this.contactPhoneNumber = contactPhoneNumber;
        this.devices = devices;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Provider(String name, String contactName, String contactPhoneNumber, List<Device> devices, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.name = name;
        this.contactName = contactName;
        this.contactPhoneNumber = contactPhoneNumber;
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

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
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

