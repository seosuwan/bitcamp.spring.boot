package com.example.demo.bicycle.service;

import com.example.demo.bicycle.domain.BicycleDTO;

import java.util.List;

//changing gear, changing pedal cadence, applying brakes
public interface BicycleService {
    void add(BicycleDTO bicycle);
    int count();
    List<BicycleDTO> show();


    //=================================================================================
    String changingGear(String gear);
    String changingPedalCadence(String pedalcadence);
    String applyingBrakes(String brakes);

}
