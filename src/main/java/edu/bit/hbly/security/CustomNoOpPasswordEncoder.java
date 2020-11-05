package edu.bit.hbly.security;

import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.extern.log4j.Log4j;

@Log4j
public class CustomNoOpPasswordEncoder implements PasswordEncoder{
	
	
	@Override
	//��� ��ȣȭ �����Ұ�����
	public String encode(CharSequence rawPassword) {
		// TODO Auto-generated method stub
		log.warn("before encode : "+rawPassword);
		return rawPassword.toString();
	}
	
	
	//��ȣȭ�Ȱ��� ��� ��Ī ��ų������
	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		// TODO Auto-generated method stub
		log.warn("matches: "+rawPassword.toString()+":"+encodedPassword);
		return rawPassword.toString().equals(encodedPassword);
	}
	
	

}
