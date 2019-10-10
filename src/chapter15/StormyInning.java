package chapter15;

interface Storm {
    void event() throws RainedOut, BaseballException;

    void rainHard() throws RainedOut;
}

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/10 2:04 下午
 */
class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

abstract class Inning {

    Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
        // Doesn't actually have to throw anything
    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {
    } // Throws no checked exception

}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

public class StormyInning extends Inning implements Storm {

    public StormyInning() throws BaseballException {
    }

    public StormyInning(String s) throws BaseballException {

    }

    @Override
    public void atBat() throws Strike, Foul {

    }

    @Override
    public void rainHard() throws RainedOut {

    }

    @Override
    public void event() throws BaseballException {
    }
}
