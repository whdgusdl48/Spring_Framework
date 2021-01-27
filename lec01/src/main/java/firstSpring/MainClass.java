package firstSpring;

import org.springframework.context.support.GenericXmlApplicationContext;
// 스프링 컨테이너 접근

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		// xml 파일에서 선언한 컨테이너 객체를 가져오는 함수이다. 안의 매개변수로는 선언한 xml 파일의 이름을 넣어준다.
		TransportationWait transportationWalk = ctx.getBean("tWalk",TransportationWait.class);
		// xml파일에서 선언한 객체를 가져오기 위해서 getBean이라는 함수를 통해서 선언한 id값을 가지고 그 해당하는 컨테이너의 객체를 반환
		transportationWalk.move();
		// 함수 실행
		ctx.close();
		// 메모리 반환 요즘에는 어노테이션을 많이 이용함...
	}

}
