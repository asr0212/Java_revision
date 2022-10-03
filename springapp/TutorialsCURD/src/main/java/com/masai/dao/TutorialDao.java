package com.masai.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.entity.Tutorial;

@Repository
public interface TutorialDao extends JpaRepository<Tutorial ,Integer>{
    @Query("select t from Tutorial t where t.published = TRUE")
	public List<Tutorial> findByPublished();
    
    @Query("select t from Tutorial t where t.title like :keyword")
    public List<Tutorial> findByTitle(String keyword);
}
