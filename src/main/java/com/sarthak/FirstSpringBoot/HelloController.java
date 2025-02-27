package com.sarthak.FirstSpringBoot;

import org.springframework.web.bind.annotation.*;

@RestController         //  Specialized version of @Controller annotation, that this is a RESTful service. It means that every method in the class will return data directly as a JSON or XML response instead of rendering a view. It specifies that we will be defining all of the endpoints in this class.
public class HelloController {

    @GetMapping("/hello/{name}")        // dynamic path variable. We can have path variables in between part of the URI too.

//    @PathVariable is used to extract values from the URI path and pass them as methods parameters in a controller.
    public HelloResponse helloParams(@PathVariable String name) {       //Parameters name and the path variable name must be same so that the can get mapped to each other
        return new HelloResponse("Hello "+name);
    }

    @GetMapping("/hello")           // if any request comes under domainName/helo, spring will execute this method
    public HelloResponse hello() {
//        return "Hello World";

        return new HelloResponse("Hello World");        // returning a class object response (for JSON format)
    }

    @PostMapping("/hello")
    public HelloResponse helloPost(@RequestBody String name) {     //RequestBody is used to map a HTTP request over a java object.
//        return "Hello "+name+" !";

        return new HelloResponse("Hello "+ name + " !");            //sending an object of the class response
    }
}

//  A controller is responsible for handling incoming HTTP responses , processing them with the help of a service layer, and returning responses. It acts as a intermediary between the client and application's business logic

// the conversion of the JSON happens automatically because spring does it automatically with the help of message convertors (jackson library is used for this purpose). Jackson serializes the java objects to JSON with the helo of getters of the objects. If we don't have the getter of that object, that property will be skipped in the JSON