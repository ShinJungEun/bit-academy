package com.douzone.container.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
	/*
	 * wiring할 때는
	 * @Autowired를 붙여주기.
	 */
	
	
	// Wiring01 : 바이너리 주입(CGLib) => best!
	// @Inject (Java 표준 wiring 어노테이션)
	@Autowired	// Spring wiring 어노테이션
	// @Qualifier("HSRapper3Final")
	@Qualifier("highSchoolRapper3Final")
	private CompactDisc cd;
	
	public CDPlayer() {
	}
	
	// Wiring02 : 생성자 주입
	// @Autowired
	public CDPlayer(@Qualifier("highSchoolRapper3Final") CompactDisc cd) {
		this.cd = cd;
	}
	
	// Wiring03 : setter 사용 
	// @Autowired
	public void setCompactDisc(@Qualifier("highSchoolRapper3Final") CompactDisc cd) {
		this.cd = cd;
	}
	
	// Wiring04 : 일반 메소드 사용
	// @Autowired	 
	public void insertCompactDisc(@Qualifier("highSchoolRapper3Final") CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
	}

}
