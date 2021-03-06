package com.jayfella.jme.vehicle.examples.tires;

import com.jayfella.jme.vehicle.tire.PacejkaTireModel;
import com.jayfella.jme.vehicle.tire.TireSettings;

public class Tire_02 extends PacejkaTireModel {

    public Tire_02() {
        super("Tire 02",
                new TireSettings(
                        2.49f,
                        11.93f,
                        0.88f,
                        2.00f,
                        0.000055f
                ),
                new TireSettings(
                        1.41f,
                        30.0f,
                        -1.6f,
                        2.0f,
                        0.000055f
                ),
                new TireSettings(
                        2.13f,
                        9.96f,
                        -2.0f,
                        2.65f,
                        0.000110f
                ),
                10000
        );
    }
}
