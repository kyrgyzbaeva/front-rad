package com.example.frontpractica.repository;

import com.example.frontpractica.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}