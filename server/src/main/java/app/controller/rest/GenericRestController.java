package app.controller.rest;

import app.db.entity.Dummy;
import app.db.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class GenericRestController {
    private AtomicInteger id = new AtomicInteger();

    private DummyService dummyService;

    @Autowired
    public GenericRestController(DummyService dummyService) {
        this.dummyService = dummyService;
    }

    @RequestMapping("/dummy")
    public ResponseEntity<String> dummyRequest(@RequestParam String arg) {
        Dummy dummy = new Dummy();
        dummy.setDummyId(id.getAndIncrement());
        dummy.setDummyTitle(arg);
        dummy.setDummyAuthor("SESSION TEST");

        dummyService.addNewLine(dummy);

        return new ResponseEntity<>(arg, HttpStatus.OK);
    }

    @RequestMapping("/mainPageItems")
    public ResponseEntity<Dummy> getMainPageItems(@RequestParam int id) {
        Dummy item = dummyService.getLine(id);

        return new ResponseEntity<>(item, HttpStatus.OK);
    }
}
