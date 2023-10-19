package com.example.tnb.repository;

import com.example.tnb.entity.Categrie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<Categrie, Integer> {
    Categrie findById(int id);
}
