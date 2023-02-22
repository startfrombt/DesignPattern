package designPattern;

import java.util.Objects;

//Effective Java의 Builder Pattern
public class BuilderPattern {
	private final String id;
    private final String pwd;
    private final int age;
    private final String email;
    
 // 반드시 Builder 를 사용하여 객체를 생성하도록 하기 위해 private
    private BuilderPattern(Builder builder) {
        this.id = builder.id;
        this.pwd = builder.pwd;
        this.age = builder.age;
        this.email = builder.email;
    }
    
    public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}


	public static class Builder {
        // Required parameters(필수 인자)
        private String id;
        private String pwd;

        // Optional parameters - initialized to default values(선택적 인자는 기본값으로 초기화)
        private int age = 0;
        private String email = "";

        public Builder(String id, String pwd) {
            this.id = id;
            this.pwd = pwd;
        }

        public Builder id(String id) {
            this.id = id;
            return this; // 이렇게 하면 . 으로 체인을 이어갈 수 있다.
        }

        public Builder pwd(String pwd) {
            this.pwd = pwd;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuilderPattern user = (BuilderPattern) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

