package com.example.realestateeyeapi.repositiories;

import com.example.realestateeyeapi.models.RealEstateListing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RealEstateListingRepository extends JpaRepository<RealEstateListing, Long> {
    public RealEstateListing findByMlsNum(Integer mlsNum);
    public List<RealEstateListing> findByAddressCity(String city);
}
