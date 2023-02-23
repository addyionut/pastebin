package com.clone.pastebin;

import org.springframework.data.repository.CrudRepository;

import com.clone.pastebin.Pastebin;
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PastebinRepository extends CrudRepository<Pastebin, Integer> {

}
