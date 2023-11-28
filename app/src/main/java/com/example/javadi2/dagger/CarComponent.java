package com.example.javadi2.dagger;

import com.example.javadi2.MainActivity;
import com.example.javadi2.car.Car;

import dagger.Component;

// two types of engine is not allowed
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
// gets rims, tires and wheels for the component
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
