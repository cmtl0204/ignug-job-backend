package com.bolsaempleo.backend.app.controller;

import com.bolsaempleo.backend.app.entities.job_board.CategoryOffer;
import com.bolsaempleo.backend.app.services.CategoryOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category-offers")
public class CategoryOfferController {

    private final CategoryOfferService categoryOfferService;

    @Autowired
    public CategoryOfferController(CategoryOfferService categoryOfferService) {
        this.categoryOfferService = categoryOfferService;
    }

    @GetMapping
    public ResponseEntity<List<CategoryOffer>> getAllCategoryOffers() {
        List<CategoryOffer> categoryOffers = categoryOfferService.findAll();
        return ResponseEntity.ok(categoryOffers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryOffer> getCategoryOfferById(@PathVariable Long id) {
        CategoryOffer categoryOffer = categoryOfferService.findById(id);
        if (categoryOffer != null) {
            return ResponseEntity.ok(categoryOffer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<CategoryOffer> createCategoryOffer(@RequestBody CategoryOffer categoryOffer) {
        CategoryOffer createdCategoryOffer = categoryOfferService.save(categoryOffer);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCategoryOffer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoryOffer> updateCategoryOffer(@PathVariable Long id, @RequestBody CategoryOffer categoryOffer) {
        CategoryOffer updatedCategoryOffer = categoryOfferService.update(id, categoryOffer);
        if (updatedCategoryOffer != null) {
            return ResponseEntity.ok(updatedCategoryOffer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategoryOffer(@PathVariable Long id) {
        boolean deleted = categoryOfferService.delete(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
