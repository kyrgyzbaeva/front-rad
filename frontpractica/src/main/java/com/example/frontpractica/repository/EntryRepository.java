package com.example.frontpractica.repository;

import com.example.frontpractica.model.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryRepository extends JpaRepository<Entry, Long> {
}