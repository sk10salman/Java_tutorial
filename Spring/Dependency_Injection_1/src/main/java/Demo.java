import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.Card;
import di.DebitCard;

public class Demo {

	public static void main(String[] args) {
		//DebitCard card = new DebitCard();
		//Card card = new DebitCard();
		//card.details();
		
		ApplicationContext ctn = new ClassPathXmlApplicationContext("application_context.xml");
//		Card card = (Card) ctn.getBean("ccard");
//		card.details();
		DebitCard obj=(DebitCard) ctn.getBean("dcard");
		obj.details();
	System.out.println(obj.address.name);
	System.out.println(obj.address.city);
		

	}

}
