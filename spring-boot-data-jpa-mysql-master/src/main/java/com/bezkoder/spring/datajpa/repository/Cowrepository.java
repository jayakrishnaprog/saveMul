package com.bezkoder.spring.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.datajpa.controller.CowData;

public interface Cowrepository extends JpaRepository<CowData, Long> {
	//List<CowEntity> findByPublished(boolean published);
	//List<CowEntity> findByTitleContaining(String title);
}
