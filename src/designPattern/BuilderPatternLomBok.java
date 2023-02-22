package designPattern;

import java.util.Objects;

import lombok.Builder;
import lombok.EqualsAndHashCode;

@Builder
public class BuilderPatternLomBok {
	private final String id;
	private final String pwd;
	private final int age;
	private final String email;
	
	@Override
	public int hashCode() {
		return Objects.hash(id, pwd);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BuilderPatternLomBok other = (BuilderPatternLomBok) obj;
		return Objects.equals(id, other.id) && Objects.equals(pwd, other.pwd);
	}
	
	
}
