package Observers;

/**
 * Created by mengyue on 2017/2/4.
 */
public class ConcreteObservers extends Observers {

	private String name;

	public void user(String name){
		this.name = name ;
	}

	public void update(){
		System.out.println("去收鱼");
	}
}
