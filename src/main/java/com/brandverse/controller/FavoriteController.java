package com.brandverse.controller;

import com.brandverse.entity.Favorite;
import com.brandverse.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/favorites")
@CrossOrigin(origins = "*")
public class FavoriteController {

    @Autowired
    private FavoriteService service;

    // ❤️ Add Favorite
    @PostMapping
    public Favorite addFavorite(@RequestBody Favorite favorite) {
        return service.saveFavorite(favorite);
    }

    // ❤️ Get Favorites by User ID
    @GetMapping("/{userId}")
    public List<Favorite> getFavorites(@PathVariable Long userId) {
        return service.getFavorites(userId);
    }

    // ❤️ Delete Favorite by ID
    @DeleteMapping("/{id}")
    public void deleteFavorite(@PathVariable Long id) {
        service.deleteById(id);
    }

    // ❤️ Remove Favorite by UserId + Brand Name
    @DeleteMapping("/remove")
    public void removeFavorite(@RequestBody Favorite favorite) {
        service.removeFavorite(
                favorite.getUserId(),
                favorite.getBrandName()
        );

    }

    // ❤️ Clear All Favorites
    @DeleteMapping("/clear/{userId}")
    public void clearFavorites(@PathVariable Long userId) {

        service.clearFavorites(userId);

    }
}