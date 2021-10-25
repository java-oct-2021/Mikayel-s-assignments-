package com.dojo.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojo.languages.models.Languages;

@Repository
public interface LangRepository extends CrudRepository <Languages, Long>{
	List<Languages> findAll();
}
