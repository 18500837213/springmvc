package com.rf.dtd.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rf.dtd.model.TestBean;

@Controller
public class TestControler {
	@RequestMapping("/hello" )
	public @ResponseBody TestBean test(@RequestParam("a") int a) {
		TestBean tb= new TestBean(1, 2);
		tb.setI(a);
		return tb;
	}
}
