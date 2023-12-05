package com.example.javadi2.dagger;

import com.example.javadi2.car.DieselEngine;
import com.example.javadi2.car.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower() {
        return this.horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine) {
        return engine;
    }

}
