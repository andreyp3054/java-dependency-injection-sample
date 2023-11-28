package com.example.javadi2;

import dagger.Component;

@Component(modules = WheelsModule.class)// gets rims, tires and wheels for the component
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
