package com.example.realestateeyeapi.controllers;

import com.example.realestateeyeapi.models.RealEstateListing;
import com.example.realestateeyeapi.services.RealEstateListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/realestatelistings")
public class RealEstateListingController {

    @Autowired
    private RealEstateListingService realEstateListingService;

    @GetMapping
    public List<RealEstateListing> getAllListings() {
        return realEstateListingService.getAllListings();
    }

    @GetMapping("/{id}")
    public RealEstateListing getById(@PathVariable Long id) {
        return realEstateListingService.getListingById(id);
    }

    @GetMapping(params = {"city"})
    public List<RealEstateListing> getListingsByCity(String city) {
        return realEstateListingService.getListingsByCity(city);
    }

    @GetMapping(params = {"mlsNum"})
    public RealEstateListing getListingByMlsNum(Integer mlsNum) {
        return realEstateListingService.getListingByMlsNum(mlsNum);
    }

    @PostMapping
    public RealEstateListing addListing(@RequestBody RealEstateListing listing) {
        return realEstateListingService.addListing(listing);
    }

    @PutMapping("/{id}")
    public RealEstateListing updateListing(@RequestBody RealEstateListing newListing, Long id) {
        return realEstateListingService.updateListingById(newListing, id);
    }

    @DeleteMapping("/{id}")
    public void deleteListing(@PathVariable Long id) {
        realEstateListingService.deleteListingById(id);
    }


}
