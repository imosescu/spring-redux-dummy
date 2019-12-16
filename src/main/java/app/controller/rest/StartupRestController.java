package app.controller.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartupRestController {
    @RequestMapping("/dummy")
    public ResponseEntity<String> dummyRequest(@RequestParam String arg) {
        return new ResponseEntity<>(arg, HttpStatus.OK);
    }
}
