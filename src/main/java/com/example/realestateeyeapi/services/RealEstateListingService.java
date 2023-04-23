package com.example.realestateeyeapi.services;

import com.example.realestateeyeapi.models.RealEstateListing;

import java.util.List;

public interface RealEstateListingService {


    RealEstateListing addListing(RealEstateListing newListing);
    List<RealEstateListing> getAllListings();
    RealEstateListing getListingById(Long id);
    void deleteListingById(Long id);
    RealEstateListing updateListingById(RealEstateListing newListing, Long id);
    List<RealEstateListing> getListingsByCity(String city);
    RealEstateListing getListingByMlsNum(Integer mlsNum);

}
