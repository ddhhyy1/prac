package com.nangcho.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nangcho.board.entity.QuestionBoard;

public interface QBoardRepository extends JpaRepository<QuestionBoard, Integer> {

}
