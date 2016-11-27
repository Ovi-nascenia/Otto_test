package com.example.user.ottosample;

import com.squareup.otto.Bus;

/**
 * Created by user on 11/27/2016.
 */

public class BusStation {
    private static Bus bus=new Bus();

    public static  Bus getBus()
    {
        return bus;
    }
}
