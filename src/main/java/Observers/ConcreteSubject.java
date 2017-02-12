package Observers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mengyue on 2017/2/4.
 */
public class ConcreteSubject extends  Subject {


	private List<Observers> observers = new ArrayList();

	public void add(Observers obs){
		observers.add(obs);
	}


	public void delete(Observers obs){
		observers.remove(obs);
	}

	public void Notify(){

		for (Observers obs:observers) {
			obs.update();
		}
	}


}
