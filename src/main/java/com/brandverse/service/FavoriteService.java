package com.brandverse.service;

import com.brandverse.entity.Favorite;
import com.brandverse.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteService {

    @Autowired
    private FavoriteRepository repository;

    // ❤️ Save Favorite (No Duplicates)
    public Favorite saveFavorite(Favorite favorite) {

        List<Favorite> favorites =
                repository.findByUserId(favorite.getUserId());

        for(Favorite f : favorites){

            if(f.getBrandName().equalsIgnoreCase(favorite.getBrandName())){

                return f;

            }

        }

        return repository.save(favorite);

    }

    // ❤️ Get Favorites
    public List<Favorite> getFavorites(Long userId){

        return repository.findByUserId(userId);

    }

    // ❤️ Delete Favorite
    public void deleteById(Long id){

        repository.deleteById(id);

    }
    // ❤️ Remove Favorite by UserId + Brand Name
    public void removeFavorite(Long userId, String brandName){

        repository.deleteByUserIdAndBrandName(userId, brandName);

    }

}