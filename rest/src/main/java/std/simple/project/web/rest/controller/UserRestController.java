package std.simple.project.web.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(value = "/users")
    public ResponseEntity<Object> getUsers() {
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
