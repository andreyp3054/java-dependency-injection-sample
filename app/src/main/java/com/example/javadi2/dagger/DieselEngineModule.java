package com.example.javadi2.dagger;

import com.example.javadi2.car.DieselEngine;
import com.example.javadi2.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module

public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine); // why use Binds?
    // dagger never really creates an instantiation of this class and never calls this method but instantiates only PetrolEngine
    // binds only take a single argument
    //before
    /*
    @Provides
    Engine provideEngine(DieselEngine engine){
    return engine;
    }
     */

}
