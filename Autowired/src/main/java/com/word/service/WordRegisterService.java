package com.word.service;

import com.word.WordSet;
import com.word.dao.WordDao;

public class WordRegisterService {
	
	private WordDao wordDao;
	
	public WordRegisterService(WordDao wordDao) {
		this.wordDao = wordDao;
	}
	
	public void register(WordSet wordSet) {
		String wordkey = wordSet.getWordKey();
		if(verify(wordkey)) {
			wordDao.insert(wordSet);
		}
		else {
			System.out.println("이 단어는 이미 등록되어있습니다.");
		}
	}
	
	public boolean verify(String wordkey) {
		WordSet wordSet = wordDao.select(wordkey);
		return wordSet == null ? true : false;
	}
	
	public void setWordDao(WordDao wordDao) {
		this.wordDao = wordDao;
	}
}
