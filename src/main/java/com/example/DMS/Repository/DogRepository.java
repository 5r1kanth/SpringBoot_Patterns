package com.example.DMS.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.DMS.Models.Dog;

/**
 * @author S560174 - Srkanth Pamulapati
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {

}
