package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 사용자가 요청 -> 응답 (HTML 파일)
// @Controller

// 사용자가 요청 -> 응답 (Data)
@RestController
public class HttpControllerTest {
	
	// 인터넷 브라우저 요청은 무조건 get 요청밖에 할 수 없다
	// http://localhost:8080/http/get (SELECT)
	@GetMapping("/http/get")
	public String getTest(Member m) {
		return "get 요청 : " + m.getId() + " , " + m.getUsername();
	}
	
	// http://localhost:8080/http/post (INSERT)
	@PostMapping("/http/post")
	public String postTest() {
		return "post 요청";
	}
	
	// http://localhost:8080/http/put (UPDATE)
	@PutMapping("/http/put")
	public String putTest() {
		return "put 요청";
	}
	
	// http://localhost:8080/http/delete (DELETE)
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
}
