package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Tutorial;
import com.masai.exception.TutorialException;
import com.masai.service.TutorialService;

@RestController
@RequestMapping("/api/tutorials")
public class TutorialController {
	 @Autowired
     private TutorialService tutorialService;
	 
	 @PostMapping
	 public ResponseEntity<Tutorial> addTutorialHandler(@RequestBody Tutorial tutorial){
		 return new ResponseEntity<>(tutorialService.addTutorial(tutorial),HttpStatus.ACCEPTED);
	 }
	 
	 @GetMapping(value="/")
	 public ResponseEntity<List<Tutorial>> getAllTutorialHandler(){
		 return new ResponseEntity<>(tutorialService.getAllTutorial(),HttpStatus.FOUND);
	 }
	 
	 @GetMapping(value="/{id}")
	 public ResponseEntity<Tutorial> getTutorialHandler(@PathVariable ("id") Integer id) throws TutorialException{
		 return new ResponseEntity<>(tutorialService.getTutorial(id),HttpStatus.FOUND);
	 }
	 @PutMapping(value="/{id}")
	 public ResponseEntity<Tutorial> updateTutorialHandler(@PathVariable ("id") Integer id) throws TutorialException{
		 return new ResponseEntity<>(tutorialService.updateTutorial(id),HttpStatus.CREATED);
	 }
	 
	 @DeleteMapping(value="/{id}")
	 public ResponseEntity<Tutorial> removeTutorialHandler(@PathVariable ("id") Integer id) throws TutorialException{
		 return new ResponseEntity<>(tutorialService.removeTutorial(id),HttpStatus.ACCEPTED);
	 }
	 
	 @DeleteMapping
	 public ResponseEntity<String> removeAllHandler(){
		 return new ResponseEntity<>(tutorialService.removeAllTutorial(),HttpStatus.ACCEPTED);
	 }
	 @GetMapping(value="/published")
	 public ResponseEntity<List<Tutorial>> getTutorialByPublishedHandler(){
		 return new ResponseEntity<>(tutorialService.getByPublished(),HttpStatus.FOUND);
	 }
	 
	 @GetMapping
	 public ResponseEntity<List<Tutorial>> getTutorialByTitleHandler(@RequestParam String title){
		 return new ResponseEntity<>(tutorialService.getByPublished(),HttpStatus.FOUND);
	 }
	 
	 
	 
	 
	 
}
