package com.murdos.pms.device;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;
    @Async
    public List<Device> getAllDevices(){
        return deviceRepository.findAll();
    }
}
