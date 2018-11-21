package com.exam.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.sp.dao.ExamDAO;
import com.exam.sp.service.ExamService;
import com.exam.sp.vo.ExamVO;

@Service
public class ExamServiceImpl implements ExamService {

	@Autowired
	private ExamDAO ed;
	
	@Override
	public List<ExamVO> getExamlist() {
		return ed.getExamlist();
	}

	@Override
	public ExamVO getExam(int num) {
		return ed.getExam(num);
	}

	@Override
	public int insertExam(ExamVO ex) {
		return ed.insertExam(ex);
	}

	@Override
	public int updateExam(ExamVO ex) {
		return ed.updateExam(ex);
	}

	@Override
	public int deleteExam(int num) {
		return ed.deleteExam(num);
	}

}
