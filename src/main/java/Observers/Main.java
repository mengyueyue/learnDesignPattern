package Observers;

/**
 * Created by mengyue on 2017/2/4.
 */
public class Main {


	public static void main(String[] args) {

		ConcreteSubject cs = new ConcreteSubject();
		ConcreteObservers co = new ConcreteObservers();
		cs.add(co);
		cs.Notify();
	}




}
