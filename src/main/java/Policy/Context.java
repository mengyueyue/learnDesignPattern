package Policy;

/**
 * Created by mengyue on 2017/2/4.
 */
public class Context {

	public Strategy strategy;


	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}


	public void executeStrategy(){
		strategy.operation();
	}

}
