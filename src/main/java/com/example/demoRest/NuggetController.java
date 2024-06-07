package com.example.demoRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NuggetController
{
    @Autowired
    private INuggets nuggetService;

    @GetMapping(value = "/nuggets")
    public ResponseEntity<List<Nugget>> getNugget()
    {
        List<Nugget> nuggets = nuggetService.findAll();
        return ResponseEntity.ok().body(nuggets);
    }

    @PostMapping("/nuggets")
    public ResponseEntity<String > addNugget(@RequestBody Nugget p) {
        boolean added = nuggetService.addNugget(p);
        if(added)
            return ResponseEntity.ok().body("added");
        else
            return ResponseEntity.internalServerError().body("not added");

    }

    @GetMapping("/nuggets/{taste}")
    public ResponseEntity<Nugget> getNuggetBytaste(@PathVariable int taste) {
        Nugget p = nuggetService.getNuggetByTaste(taste);
        return ResponseEntity.ok().body(p);
    }

//    @PutMapping("/nuggets/{taste}")
//    public ResponseEntity<String> updateNugget(@PathVariable int taste, @RequestBody Nugget p) {
//        boolean added = nuggetService.updateNugget(taste, p);
//        return ResponseEntity.ok().body("updated");
//    }
//
//    @DeleteMapping("/nuggets/{taste}")
//    public ResponseEntity<String> deleteUser(@PathVariable int taste) {
//        boolean deleted = nuggetService.deleteNuggetByTaste(taste);
//        return ResponseEntity.ok().body("deleted");
//    }

}