package com.murdos.pms.device;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "api/v1/device")
public class DeviceController {

    @Autowired
    DeviceService deviceService;

    @Async
    @GetMapping
    public List<Device> getAllDevices(){
        return deviceService.getAllDevices();
    }

}
