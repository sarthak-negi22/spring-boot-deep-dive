package com.loose.coupling;

public class UserManager {

//    UserManager has a dependency on UserDataProvider
    private UserDataProvider userDataProvider;

//    here UserManager depends upon UserDatabaseProvider dependency, the process of providing the dependency  is called Dependency Injection (and for now we are providing the dependency)
    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo() {
        return userDataProvider.getUserDetails();
    }
}
