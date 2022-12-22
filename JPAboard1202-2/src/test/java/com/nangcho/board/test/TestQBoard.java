package com.nangcho.board.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.nangcho.board.entity.QuestionBoard;
import com.nangcho.board.repository.QBoardRepository;

@SpringBootTest
@TestPropertySource(locations = "classpath:application_test.properties")
public class TestQBoard {

	@Autowired
	QBoardRepository qBoardRepository;
	
	@Test
	@DisplayName("저장 테스트")
	public void createQuestion() {
		
		
		QuestionBoard qBoard = new QuestionBoard();
		
		qBoard.setSubject("원붕이 강림");
		qBoard.setContent("원붕이 불금킷타");
	
		qBoardRepository.save(qBoard);
	}
}
