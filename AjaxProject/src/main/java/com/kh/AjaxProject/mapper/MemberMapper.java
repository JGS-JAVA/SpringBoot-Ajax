package com.kh.AjaxProject.mapper;

import com.kh.AjaxProject.dto.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// sql 문을 xml 에서 id 로 가져와 설정
@Mapper // Autowired 내장됨 자동으로 스프링부트가 매퍼파일을 관리
public interface MemberMapper {
   List<Member> getAllMembers();
}
