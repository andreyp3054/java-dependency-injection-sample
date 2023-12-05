package com.example.javadi2.dagger;

import com.example.javadi2.car.Rims;
import com.example.javadi2.car.Tires;
import com.example.javadi2.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}
// why static? so that they dont depend on an WheelsModule instance