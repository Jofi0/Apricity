package net.jofi.apricity.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class ApricityConfig extends MidnightConfig {

    @Entry
    public static boolean sunRotationEnabled = true;

    @Entry(precision = 360)
    public static int sunRotationAmount = 45;

    @Entry
    public static boolean moonRotationEnabled = true;

    @Entry(precision = 360)
    public static int moonRotationAmount = 45;
}
