package com.loose.coupling;

//  Loose coupling aims to reduce the dependencies between components of a system.
public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        //  UserManager gets the appropriate object type, in the code itself
        //  If spring framework somehow provides us the correct object in the runtime, that is called IOC, i.e. the control goes to the spring
        // This is actually the hard work without spring that we have to do, which spring facilitates using IOC


        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWithWS = new UserManager(webServiceProvider);
        System.out.println(userManagerWithWS.getUserInfo());

        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();

//        here we are injecting the dependency to UserManager
        UserManager userMangerWithND = new UserManager(newDatabaseProvider);
        System.out.println(userMangerWithND.getUserInfo());
    }
}

//  inversion of control (IOC) : control of object creation and lifecycle management is transferred from the application code to an external framework

//  Dependency Injection (DI) : dependencies of a class are provided externally rather than being created within the class itself.

//  Beans : Objects that are managed by frameworks