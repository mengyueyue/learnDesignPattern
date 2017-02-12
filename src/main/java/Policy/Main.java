package Policy;

/**
 * Created by mengyue on 2017/2/4.
 */
public class Main {


	public static void main(String[] args) {

		Context c = new Context();
		Strategy strategy = new ConcreteStrategyPlus();
		c.setStrategy(strategy);
		c.executeStrategy();
	}


}
