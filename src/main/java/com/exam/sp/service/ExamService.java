package com.exam.sp.service;

import java.util.List;

import com.exam.sp.vo.ExamVO;

public interface ExamService {
	
	public List<ExamVO> getExamlist();
	public ExamVO getExam(int num);
	public int insertExam(ExamVO ex);
	public int updateExam(ExamVO ex);
	public int deleteExam(int num);
}
