package com.example.mybatistest.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MemberController {


    @Autowired
    MemberRepository memberRepository;

        @GetMapping("aa")
        public String doA(){

            memberRepository.insert();


            return "aa 돌려줌";
        }

    }

