package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.douzone.hellospring.vo.UserVo;

/*
 * RequestMapping
 * Class + Method
 */

@Controller
@RequestMapping("/user")
public class UserController {

//	@ResponseBody
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join() {
		return "join";
	}
	
//	@ResponseBody
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(UserVo uservo) {
		System.out.println(uservo);
		return "redirect:/";
	}
	
	@ResponseBody
	@RequestMapping(value="/update")
	public String update(@RequestParam("n") String name) {
		/*
		 * 만일 n이라는 이름으로 파라미터가 없는 경우 400 Bad Request error 발생
		 */
		System.out.println(name);
		return "UserController:update";
	}
	
	@ResponseBody
	@RequestMapping(value="/update2")
	public String update2(@RequestParam(value="n", required=true, defaultValue="") String name) {
		/*
		 * 만일 n이라는 이름으로 파라미터가 없는 경우 400 Bad Request error 발생
		 */
		System.out.println("---"+name+"---");
		return "UserController:update2";
	}
	
	@ResponseBody
	@RequestMapping(value="/update3")
	public String update3(@RequestParam(value="n", required=true, defaultValue="") String name,
			@RequestParam(value="a", required=true, defaultValue="") String age) {
		/*
		 * 만일 n이라는 이름으로 파라미터가 없는 경우 400 Bad Request error 발생
		 */
		System.out.println("---"+name+"---"+age+"---");
		return "UserController:update3";
	}
	
}
