package demo.pattern.factory.simple;

import demo.pattern.factory.entity.Mouse;

/**
 * @author liqiuliang
 * @create 2023-09-10 4:55
 */
public class Client {
    public static void main(String[] args) {
        Mouse mouse = MouseFactory.createMouse(1);
        mouse.sayHi();
    }
}
