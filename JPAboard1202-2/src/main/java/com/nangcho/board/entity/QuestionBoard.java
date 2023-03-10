package com.nangcho.board.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionBoard {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(length = 200)
	private String subject;
	
	@Column(columnDefinition = "varchar(1000) default 'TEXT'")
	private String content;
	
	@CreatedDate
	private LocalDateTime createdate;
}
