package com.bolsaempleo.backend.app.controller;


import com.bolsaempleo.backend.app.dto.ProfessionalDto;
import com.bolsaempleo.backend.app.entities.Professional;
import com.bolsaempleo.backend.app.services.ProfessionalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/professional")
public class ProfessionalController {

    @Autowired
    private ProfessionalService professionalService;

    @GetMapping
    public List<Professional> list(){
        return professionalService.findAll();
    }
     

    @GetMapping("/{id}")
    public ProfessionalDto showById (@PathVariable(name = "id") Long id){
        return professionalService.findByIdDto(id);
    }
    

    @PostMapping    
    public ResponseEntity<?> create (@RequestBody Professional professionals){
        return ResponseEntity.status(HttpStatus.CREATED).body(professionalService.save(professionals));   
    } 

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Professional professionals,@PathVariable Long id) {
        Optional<Professional> obj = professionalService.update(professionals, id);
        if (obj.isPresent()){
            return ResponseEntity.status(HttpStatus.CREATED).body(obj); 
        }
        return ResponseEntity.notFound().build();
    }
}