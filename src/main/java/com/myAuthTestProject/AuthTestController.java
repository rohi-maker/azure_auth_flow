package com.myAuthTestProject;

import org.springframework.web.bind.annotation.*;

//jobps.b2clogin.com/jobps.onmicrosoft.com
@RestController
public class AuthTestController {

    @GetMapping("/mytest")
    public String myTestGet() {
        return "Hello World";
    }

    @PostMapping("post")
    public String postEndpoint() {
        return "POST RESPONSE";
    }

    @PutMapping("put")
    public String putEndpoint() {
        return "PUT RESPONSE";
    }

    @DeleteMapping("/delete")
    public String deleteEndpoint(){
        return "DELETE RESPONSE";
    }
}
