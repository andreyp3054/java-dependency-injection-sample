package com.example.javadi2.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;
    @Inject
    public Car(Engine engine, Wheels wheels){
        this.engine = engine;
        this.wheels = wheels;
    }

    //This method is called after the Car is constructed, and it's used to "inject" a Remote dependency into the Car.
    @Inject
    public void enableRemote(Remote remote){            // method injection, is not a about providing dependency but a way to provide a dependency which is Remote
        remote.setListener(this);       // Remote instance is not inside the constructor because we are passing the instance of Car which should not be passed while creating the constructor
    }
    public void drive(){
        engine.start();
        Log.d(TAG, "driving... ");
    }

//calling order constructor-field-method
}
