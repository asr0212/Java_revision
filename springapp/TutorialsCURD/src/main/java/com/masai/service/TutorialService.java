package com.masai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.entity.Tutorial;
import com.masai.exception.TutorialException;

@Service
public interface TutorialService {
   public Tutorial addTutorial(Tutorial tutorial);
   public List<Tutorial> getAllTutorial();
   public Tutorial getTutorial(Integer id) throws TutorialException;
   public Tutorial updateTutorial(Integer id) throws TutorialException;
   public Tutorial removeTutorial(Integer id) throws TutorialException;
   public String removeAllTutorial();
   public List<Tutorial> getByPublished();
   public List<Tutorial> getByTitle(String keyword);
   
}
