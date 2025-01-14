package com.kh.AjaxProject.controller;

import com.kh.AjaxProject.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RestController -> json 백엔드 형식 설정
public class MemberController {
    @Autowired
    private MemberService memberService;
    /*
    * ResponseEntity<>
    *       ResponseEntity.ok();
    * */

    @GetMapping
    public String index() {
        return "index";
    }
/*
    @GetMapping("/api/members")
    public ResponseEntity<List<Member> > getAllMembers() {

        return ResponseEntity.ok(memberService.getAllMembers());
    }

 */
}
