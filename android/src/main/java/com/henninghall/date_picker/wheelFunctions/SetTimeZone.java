package com.henninghall.date_picker.wheelFunctions;

import com.henninghall.date_picker.wheels.Wheel;

import java.util.Date;
import java.util.TimeZone;

public class SetTimeZone implements WheelFunction {

    private TimeZone timeZone;

    public SetTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public void apply(Wheel wheel) {
        wheel.setTimeZone(timeZone);
    }
}