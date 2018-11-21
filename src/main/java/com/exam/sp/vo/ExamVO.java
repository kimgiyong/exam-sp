package com.exam.sp.vo;

import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Commit;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Data
public class ExamVO {
	
	private Integer num;
	private String name;
	private Integer age;

}
