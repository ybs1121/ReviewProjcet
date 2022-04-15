package com.example.reviewprojcet.controller;


import com.example.reviewprojcet.dto.ArticleDto;
import com.example.reviewprojcet.dto.MemberDto;
import com.example.reviewprojcet.dto.MemberLoginDto;
import com.example.reviewprojcet.entity.Article;
import com.example.reviewprojcet.entity.Member;
import com.example.reviewprojcet.repository.ArticleRepostory;
import com.example.reviewprojcet.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class LoginController {
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    ArticleRepostory articleRepostory;


    @GetMapping("/")
    public String Domin(){
        return"domain";
    }

    @GetMapping("/join")
    public String Join(){
        return"join";
    }

    @PostMapping("/login/update")
    public String JoinUpdate(MemberDto memberDto){
        System.out.println(memberDto.toString());
        Member member = memberDto.toEntity();
        Member saved = memberRepository.save(member);

        System.out.println(saved.toString());

        return "redirect:/";
    }


    @PostMapping("/login/check")
    public String Login(MemberLoginDto memberLoginDto){
        System.out.println(memberLoginDto.getId());
        List<Member> inform = memberRepository.findByMemberIdPassword(memberLoginDto.getId(),memberLoginDto.getPassword());
        if (inform.isEmpty() == true){

            return "loginFail";
        }
        else{

            return "redirect:/" + memberLoginDto.getId();
        }
        }


//
//    @GetMapping("/edit/{id}")
//    public String Edit(@PathVariable String id){
//        System.out.println("edit : " + id);
//        return "edit";
//    }
//
//    @PostMapping("/login/edit/{id}")
//    public String EditSave(@PathVariable String id, ArticleDto articleDto){
//        Article article = articleDto.toEntity(id);
//        System.out.println(article.toString());
//        Article saved = articleRepostory.save(article);
//
//        return "test";
//    }



}
