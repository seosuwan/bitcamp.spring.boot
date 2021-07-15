package com.example.demo.bicycle.service;

import com.example.demo.bicycle.domain.BicycleDTO;

import java.util.ArrayList;
import java.util.List;

public class BicycleServiceImpl implements BicycleService{
    private final BicycleDTO bicycle;
    private final List<BicycleDTO>bikes;

    public BicycleServiceImpl(){
        bicycle = new BicycleDTO();
        bikes = new ArrayList<>();
    }
    @Override
    public void add(BicycleDTO bicycle) {
        bikes.add(bicycle);
    }

    @Override
    public int count() {
        return bikes.size();
    }

    @Override
    public List<BicycleDTO> show() {
        return bikes;
    }

    @Override
    public String changingGear(String gear) {
        return null;
    }

    @Override
    public String changingPedalCadence(String pedalcadence) {
        return null;
    }

    @Override
    public String applyingBrakes(String brakes) {
        return null;
    }
}
