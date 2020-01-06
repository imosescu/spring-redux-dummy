package app.controller.rest;

import app.db.entity.Dummy;
import app.db.service.StartupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class StartupRestController {
    private AtomicInteger id = new AtomicInteger();

    private StartupService startupService;

    @Autowired
    public StartupRestController(StartupService startupService) {
        this.startupService = startupService;
    }

    @RequestMapping("/dummy")
    public ResponseEntity<String> dummyRequest(@RequestParam String arg) {
        Dummy dummy = new Dummy();
        dummy.setDummyId(id.getAndIncrement());
        dummy.setDummyTitle(arg);
        dummy.setDummyAuthor("SESSION TEST");

        startupService.addNewLine(dummy);

        return new ResponseEntity<>(arg, HttpStatus.OK);
    }
}
