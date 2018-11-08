package com.spikes2212.robot;

import edu.wpi.first.wpilibj.AnalogInput;

public class SubsystemComponents {
    public static class Laser {
        public static final AnalogInput LASER_SENSOR = new AnalogInput(RobotMap.AnalogIn.LASER_SENSOR);
        public static double getLaserValue() {
            return LASER_SENSOR.getVoltage();
        }
    }
}
