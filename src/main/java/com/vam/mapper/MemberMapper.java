package com.vam.mapper;

import com.vam.model.MemberVO;

public interface MemberMapper {

	//회원등록 insert 쿼리를 실행시켜 줄 메서드 
	public void memberJoin(MemberVO member);
}
