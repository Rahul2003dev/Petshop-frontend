package org.example.frontend.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @GetMapping("/getdata")
    public String showCustomerPage() {
        return "ApiallData";
    }
}
