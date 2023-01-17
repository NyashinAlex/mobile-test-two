package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})

public interface BrowserstackConfig extends Config{

    @Key("browserstackUser")
    @DefaultValue("alexnyashin_HtT0sC")
    String browserstackUser();

    @Key("browserstackKey")
    @DefaultValue("Z67VAZCpR9pZCGvQJ3qX")
    String browserstackKey();

    @Key("app")
    @DefaultValue("bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c")
    String app();

    @Key("device")
    @DefaultValue("Google Pixel 3")
    String device();

    @Key("osVersion")
    @DefaultValue("9.0")
    String osVersion();
}
