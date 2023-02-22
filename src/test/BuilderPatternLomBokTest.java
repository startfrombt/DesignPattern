package test;

import static org.junit.Assert.*;

import org.junit.Test;

import designPattern.BuilderPatternLomBok;

public class BuilderPatternLomBokTest {

	@Test
	public void builderLomBokTest() {
		BuilderPatternLomBok bpl1 = BuilderPatternLomBok.builder()
										.id("홍길동")
										.pwd("1234")
										.age(28)
										.email("naver.com")
										.build();
		
		BuilderPatternLomBok bpl2 = BuilderPatternLomBok.builder()
										.id("홍길동")
										.pwd("4321")
										.age(82)
										.email("moc.revan")
										.build();
		
		BuilderPatternLomBok bpl3 = BuilderPatternLomBok.builder()
										.id("홍길동")
										.pwd("1234")
										.age(82)
										.email("daum.net")
										.build();
		
		// id 와 pwd 로 비교
		assertTrue(!bpl1.equals(bpl2));	// false
		assertTrue(bpl1.equals(bpl3));	// true
		
	}

}
