package com.ioc.coupling;

public class WebServiceDataProvider implements UserDataProvider {
    public String getUserDetails() {
        return "Fetching data from web service";
    }
}
