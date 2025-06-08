package jobstack.jobstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JobStackApplication {
//처음으로 세팅하고 프로그램을 운영시키는 역할
	public static void main(String[] args) {
		SpringApplication.run(JobStackApplication.class, args);
	}

}

/*                    🔑
@SpringBootApplication이 붙은 메인 클래스가 가장 먼저 실행되고,
그 후로 프로그램이 종료될 때까지 계속 작동하면서 사용자와 상호작용.
쉽게 말해, “스프링 부트의 문을 여는 열쇠 ” 같은 역할*/
