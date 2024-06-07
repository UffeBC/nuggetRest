package com.example.demoRest.Phase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PhaseController
{
    @Autowired
    private IPhase phaseService;

//    @GetMapping(value = "/phase")
//    public ResponseEntity<Phase> getPhase()
//    {
//        Phase phase = phaseService.findAll();
//        return ResponseEntity.ok().body(products);
//    }

//    @PostMapping("/phase")
//    public ResponseEntity<String > addProduct(@RequestBody Product p) {
//        boolean added = phaseService.addProduct(p);
//        if(added)
//            return ResponseEntity.ok().body("added");
//        else
//            return ResponseEntity.internalServerError().body("not added");
//
//    }

    @GetMapping("/phase")
    public ResponseEntity<Phase> getCurrentPhase() { // @PathVariable
        Phase p = phaseService.getCurrentPhase();
        return ResponseEntity.ok().body(p);
    }

    @PutMapping("/phase")
    public ResponseEntity<String> updateProduct(@RequestBody Phase p) {
        boolean added = phaseService.nextPhase(p);
        return ResponseEntity.ok().body("updated");
    }

//    @DeleteMapping("/phase/{id}")
//    public ResponseEntity<String> deleteUser(@PathVariable int id) {
//        boolean deleted = phaseService.deleteProductById(id);
//        return ResponseEntity.ok().body("deleted");
//    }

}