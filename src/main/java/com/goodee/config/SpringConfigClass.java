package com.goodee.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// 전체 환경설정을 해주는 엔트리 클래스
// AbstractAnnotationConfigDispatcherServletInitializer 여러가지 설정정보를 담고있는 추상클래스
public class SpringConfigClass extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	// 프로젝트에서 사용할 Bean들을 정의하기 위한 클래스는 지정한다.
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {RootAppContext.class};
	}
	
	// Spring MVC 프로젝트 설정을 위한 클래스를 지정한다.
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {ServletAppContext.class};
	}
	
	// DispatcherServlet에 매핑할 요청 주소를 세팅한다.
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}
	
	// 파라미터 인코딩 필터 설정 , 전역으로 utf-8 세팅
	@Override
	protected Filter[] getServletFilters() {
		// TODO Auto-generated method stub
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		return new Filter[] {encodingFilter};
	}
}
