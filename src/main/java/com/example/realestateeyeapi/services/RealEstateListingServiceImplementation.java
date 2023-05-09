package com.example.realestateeyeapi.services;

import com.example.realestateeyeapi.models.RealEstateListing;
import com.example.realestateeyeapi.repositiories.RealEstateListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class RealEstateListingServiceImplementation implements RealEstateListingService{

    @Autowired
    private RealEstateListingRepository realEstateListingRepository;

    @Override
    public RealEstateListing addListing(RealEstateListing newListing) {
        return realEstateListingRepository.save(newListing);
    }

    @Override
    public List<RealEstateListing> getAllListings() {
        return realEstateListingRepository.findAll();
    }

    @Override
    public RealEstateListing getListingById(Long id) {
        return realEstateListingRepository.findById(id).orElseThrow();
    }

    @Override
    public void deleteListingById(Long id) {
        realEstateListingRepository.deleteById(id);
    }

    @Override
    public RealEstateListing updateListingById(RealEstateListing newListing, Long id) {
        return realEstateListingRepository.findById(id)
                .map(listing -> {
                    listing.setMlsNum(newListing.getMlsNum());
                    listing.setCoordinates(newListing.getCoordinates());
                    listing.setAddress(newListing.getAddress());
                    listing.setUrls(newListing.getUrls());
                    listing.setDetails(newListing.getDetails());
                    return realEstateListingRepository.save(listing);
                })
                .orElseGet(() -> {
                    newListing.setId(id);
                    return realEstateListingRepository.save(newListing);
                });
    }

    @Override
    public List<RealEstateListing> getListingsByCity(String city) {
        return realEstateListingRepository.findByAddressCity(StringUtils.capitalize(city.toLowerCase()));
    }

    @Override
    public RealEstateListing getListingByMlsNum(Integer mlsNum) {
        return realEstateListingRepository.findByMlsNum(mlsNum);
    }

    @Override
    public List<RealEstateListing> getByZipCode(String zipCode) {
        return realEstateListingRepository.findByAddressZipCode(zipCode);
    }
}
