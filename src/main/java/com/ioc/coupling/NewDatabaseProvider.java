package com.ioc.coupling;

public class NewDatabaseProvider implements UserDataProvider {
    public String getUserDetails() {
        return "New DB is in action";
    }

}
