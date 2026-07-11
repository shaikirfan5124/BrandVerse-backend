package com.brandverse.repository;

import com.brandverse.entity.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {

    // ❤️ Get all favorites of a user
    List<Favorite> findByUserId(Long userId);

    // ❤️ Remove favorite by userId and brand name
    void deleteByUserIdAndBrandName(Long userId, String brandName);

    // ❤️ Remove all favorites of a user
    void deleteAllByUserId(Long userId);


}