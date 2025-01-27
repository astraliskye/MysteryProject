package com.mystery.project.entities.hello;

import com.mystery.project.mainconfiguration.Routes;
import org.springframework.web.bind.annotation.*;

// Temporary hello endpoint as per request

@RestController
@RequestMapping(Routes.BASE_ROUTE)
@CrossOrigin(origins = "${spring.frontend-client}")
public class HelloController {
  @GetMapping
  public String sayHello() {
    return "Authenticated";
  }
}
