package com.example.javadi2.dagger;

import com.example.javadi2.car.Engine;
import com.example.javadi2.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
//before
    /*
    @Provides
    Engine provideEngine(DieselEngine engine){
    return engine;
    }
     */

