package com.exam.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exam.sp.service.ExamService;
import com.exam.sp.vo.ExamVO;

@Controller
public class ExamController {
	
	@Autowired
	private ExamService es;
	
	@GetMapping(value="/exams")
	public @ResponseBody List<ExamVO> getExamList(){
		return es.getExamlist();
	}
	@GetMapping(value="/exams/{num}")
	public @ResponseBody ExamVO getExam(@PathVariable int num) {
		return es.getExam(num);
	}
	@PostMapping(value="/exam")
	public @ResponseBody int insertExam(@RequestBody ExamVO ex) {
		return es.insertExam(ex);
	}
	@PutMapping(value="/exam/{num}")
	public @ResponseBody int updateExam(@RequestBody ExamVO ex) {
		return es.updateExam(ex);
	}
	@DeleteMapping(value="/exam/{num}")
	public @ResponseBody int deleteExam(@PathVariable int num) {
		return es.deleteExam(num);
	} 
}

