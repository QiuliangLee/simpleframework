package demo.pattern.factory.method;

import demo.pattern.factory.entity.Mouse;

public class Client {
    public static void main(String[] args) {
        MouseFactory mf = new HpMouseFactory();
        Mouse mouse = mf.createMouse();
        mouse.sayHi();
    }
}
