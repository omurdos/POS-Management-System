package com.murdos.pms.device;

import com.murdos.pms.devicemodel.DeviceModel;
import com.murdos.pms.emirate.Emirate;
import com.murdos.pms.provider.Provider;
import com.murdos.pms.salesman.Salesman;
import com.murdos.pms.shop.Shop;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
public class Device {
    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private String id;
    private String serialNumber;
    private String imei;
    @ManyToOne
    @JoinColumn(name = "device_model_id")
    private DeviceModel deviceModel;
    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;
    @ManyToOne
    @JoinColumn(name = "salesman_id")
    private Salesman salesman;

    @ManyToOne
    @JoinColumn(name = "emirate_id")
    private Emirate emirate;

    @ManyToOne
    private Shop shop;
    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime modifiedAt;


    public Device() {
    }

    public Device(String id, String serialNumber, String imei, DeviceModel deviceModel, Provider provider, Salesman salesman, Shop shop, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.imei = imei;
        this.deviceModel = deviceModel;
        this.provider = provider;
        this.salesman = salesman;
        this.shop = shop;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Device(String serialNumber, String imei, DeviceModel deviceModel, Provider provider, Salesman salesman, Shop shop, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.serialNumber = serialNumber;
        this.imei = imei;
        this.deviceModel = deviceModel;
        this.provider = provider;
        this.salesman = salesman;
        this.shop = shop;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public DeviceModel getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(DeviceModel deviceModel) {
        this.deviceModel = deviceModel;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Salesman getSalesman() {
        return salesman;
    }

    public void setSalesman(Salesman salesman) {
        this.salesman = salesman;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
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
