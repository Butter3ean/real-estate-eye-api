package com.example.realestateeyeapi.models.embeddables;

import jakarta.persistence.Embeddable;

import java.net.URI;
import java.util.Objects;

@Embeddable
public class URLs {

    private URI imageUrl;
    private URI listingUrl;

    public URLs() {}

    public URLs(URI imageUrl, URI listingUrl) {
        this.imageUrl = imageUrl;
        this.listingUrl = listingUrl;
    }

    public URI getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(URI imageUrl) {
        this.imageUrl = imageUrl;
    }

    public URI getListingUrl() {
        return listingUrl;
    }

    public void setListingUrl(URI listingUrl) {
        this.listingUrl = listingUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        URLs urLs = (URLs) o;
        return imageUrl.equals(urLs.imageUrl) && listingUrl.equals(urLs.listingUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageUrl, listingUrl);
    }

    @Override
    public String toString() {
        return "URLs{" +
                "imageUrl=" + imageUrl +
                ", listingUrl=" + listingUrl +
                '}';
    }
}
