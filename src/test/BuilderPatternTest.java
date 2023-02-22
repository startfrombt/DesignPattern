package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import designPattern.BuilderPattern;

public class BuilderPatternTest {

	@Test
	public void builderTest() {
		BuilderPattern bp1 = new BuilderPattern.Builder("홍길동", "1234").build();
		BuilderPattern bp2 = new BuilderPattern.Builder("홍길동", "1234").build();
		
		// eqauls() 는 id 값만 비교하고 있음
		assertTrue(bp1.equals(bp2));
		
		BuilderPattern bp3 = new BuilderPattern.Builder("홍길동", "1234")
				.age(28)
				.email("naver.com")
				.build();
		
		BuilderPattern bp4 = new BuilderPattern.Builder("홍길동", "1234")
				.age(30)
				.email("daum.net")
				.build();
		
		assertTrue(bp3.getAge() != bp4.getAge());
	}

}
