package com.golflearn.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.golflearn.dto.Lesson;
import com.golflearn.exception.AddException;
import com.golflearn.exception.FindException;
import com.golflearn.sql.MyConnection;

public interface LessonRepository {
	/**
	 * 레슨을 등록한다
	 * @param lesson 레슨
	 * @throws AddException 레슨번호가 중복될 경우 "이미 존재하는 레슨입니다" 상세메시지를 갖는 예외가 발생한다
	 */
	public void insert(Lesson lesson) throws AddException;
	
	/**
	 * 레슨번호로 레슨검색한다
	 * @param lsnNo 레슨번호
	 * @return 레슨객체
	 * @throws FindException 레슨번호에 해당하는 상품이 없으면 "레슨이 없습니다" 상세메시지를 갖는 예외가 발생한다
	 */
	public Lesson selectByLsnNo(String userId, int lsnNo) throws FindException;
	
	/**
	 * 모든 레슨을 조회한다.
	 * @param
	 * @return void
	 * @throws FindException
	 */
	public List<Lesson> selectAll() throws FindException;
}