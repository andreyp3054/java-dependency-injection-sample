package com.example.javadi2.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    private int horsepower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@Named("horse power") int horsepower,
                        @Named("engine capacity") int engineCapacity) {
        this.horsepower = horsepower;
        this.engineCapacity = engineCapacity;
    }


    @Override
    public void start() {
        Log.d(TAG, "Petrol engine started. \nHorsepower: " + horsepower +
                "\nEngine Capacity: " + engineCapacity);
    }
}
