package com.peter.codewars;

/**
 * Created by peter on 3/21/15.
 * Solution of Basic subclasses - Adam and Eve
 * http://www.codewars.com/kata/547274e24481cfc469000416/train/java
 */
public class God {
    private static Human[] humans = null;

    public static Human[] create() {
        if (humans == null) {
            humans = new Human[2];
            humans[0] = new Man();
            humans[1] = new Woman();
        }
        return humans;
    }

}


class Human {
}

class Man extends Human {
}

class Woman extends Human {
}

