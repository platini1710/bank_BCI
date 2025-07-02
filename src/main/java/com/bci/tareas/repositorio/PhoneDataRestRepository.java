package com.bci.tareas.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bci.tareas.model.Phone;
@Repository 
public interface PhoneDataRestRepository extends CrudRepository<Phone, String>{
	@SuppressWarnings("unchecked")
	Phone save(Phone phone);
}
