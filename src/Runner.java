import utils.ErrorsText;
import utils.MoneyUtils;

public class Runner {

    public static void main(String[] args) {

        int count = StaticExample.counter;
        System.out.println(count);

        StaticExample staticExample = new StaticExample();
        StaticExample staticExample1 = new StaticExample();
        StaticExample staticExample3 = new StaticExample();
        System.out.println(StaticExample.counter);


        int alicaMoney = MoneyUtils.countMoney(4, 3);
        String errorTExt = ErrorsText.unknownErrorText;
        System.out.println(errorTExt);

        System.out.println("45");


    }
}
