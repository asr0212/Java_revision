package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dao.TutorialDao;
import com.masai.entity.Tutorial;
import com.masai.exception.TutorialException;

@Service
public class TutorialServiceImpl implements TutorialService{
    @Autowired
	private TutorialDao tutorialDao;
    
	@Override
	public Tutorial addTutorial(Tutorial tutorial) {
		Tutorial t = tutorialDao.save(tutorial);
		return t;
	}

	@Override
	public List<Tutorial> getAllTutorial() {
		List<Tutorial> list = tutorialDao.findAll();
		return list;
	}

	@Override
	public Tutorial getTutorial(Integer id) throws TutorialException {
		Optional<Tutorial> opt = tutorialDao.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		else {
			throw new TutorialException("Tutorial not found...");
		}
	}

	@Override
	public Tutorial updateTutorial(Integer id) throws TutorialException {
		Optional<Tutorial> opt = tutorialDao.findById(id);
		if(opt.isPresent()) {
			Tutorial t = opt.get();
			t.setPublished(true);
			Tutorial updated = tutorialDao.save(t);
			return updated;
		}
		else {
			throw new TutorialException("Tutorial not found...");
		}
	}

	@Override
	public Tutorial removeTutorial(Integer id) throws TutorialException {
		Optional<Tutorial> opt = tutorialDao.findById(id);
		if(opt.isPresent()) {
			tutorialDao.delete(opt.get());
			return opt.get();
		}
		else {
			throw new TutorialException("Tutorial not found...");
		}
	}

	@Override
	public String removeAllTutorial() {
		tutorialDao.deleteAll();
		return "all tutorials deleted..";
	}

	@Override
	public List<Tutorial> getByPublished(){
		List<Tutorial> list = tutorialDao.findByPublished();
		return list;
	}

	@Override
	public List<Tutorial> getByTitle(String keyword) {
		List<Tutorial> list = tutorialDao.findByTitle(keyword);
		return list;
	}

}
