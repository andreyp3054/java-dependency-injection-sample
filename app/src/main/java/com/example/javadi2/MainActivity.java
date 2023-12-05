package com.example.javadi2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javadi2.car.Car;
import com.example.javadi2.dagger.CarComponent;
import com.example.javadi2.dagger.DaggerCarComponent;
import com.example.javadi2.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder().dieselEngineModule(new DieselEngineModule(100)).build();     // create component
        component.inject(this);     //ask the car component to inject the dependencies to this activity
//        component.getCar();



        car.drive();
    }
}