package com.exam.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.sp.dao.ExamDAO;
import com.exam.sp.vo.ExamVO;

@Repository
public class ExamDAOImpl implements ExamDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<ExamVO> getExamlist() {
		return ss.selectList("com.exam.sp.EXAM.selectExamList");
	}

	@Override
	public ExamVO getExam(int num) {
		return ss.selectOne("com.exam.sp.EXAM.selectExam",num);
	}

	@Override
	public int insertExam(ExamVO ex) {
		return ss.insert("com.exam.sp.EXAM.insertExam",ex);
	}

	@Override
	public int updateExam(ExamVO ex) {
		return ss.update("com.exam.sp.EXAM.updateExam",ex);
	}

	@Override
	public int deleteExam(int num) {
		return ss.delete("com.exam.sp.EXAM.deleteExam",num);
	}

}
