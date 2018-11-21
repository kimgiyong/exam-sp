package com.exam.sp.dao;

import java.util.List;

import com.exam.sp.vo.ExamVO;

public interface ExamDAO {

	public List<ExamVO> getExamlist();
	public ExamVO getExam(int num);
	public int insertExam(ExamVO ex);
	public int updateExam(ExamVO ex);
	public int deleteExam(int num); 
}
