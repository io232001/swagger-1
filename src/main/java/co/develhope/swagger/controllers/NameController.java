package co.develhope.swagger.controllers;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/")
public class NameController {
    @GetMapping("/name/{name}")
    public String getName(@PathVariable String name){
        return "name is: " + name;
    }
}