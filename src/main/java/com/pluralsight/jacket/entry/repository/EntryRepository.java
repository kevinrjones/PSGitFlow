package com.pluralsight.jacket.entry.repository;

import javax.inject.Named;

import org.springframework.data.repository.CrudRepository;

import com.pluralsight.jacket.entry.data.models.Entry;

@Named
public interface EntryRepository extends CrudRepository<Entry, Long> {
	
}
