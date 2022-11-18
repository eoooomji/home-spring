package sample03;

/*
 * factory를 이용하면 결합도는 인터페이스보다 낮지만
 * factory가 정확히 구현되어 있지 않으면 참조하는 객체에 영향이 간다.
 */
public class HelloSpring {

	public static void main(String[] args) {
		MessageBean bean = null;
		bean = MessageBeanFactory.getInstance("ko");
		display(bean, "스프링");

//		bean = MessageBeanFactory.getInstance("en");
//		display(bean, "Spring");
	}

	public static void display(MessageBean bean, String subject) {
//		bean.sayHello("스프링");
//		bean.sayHello("Spring");
		bean.sayHello(subject);
	}

}
