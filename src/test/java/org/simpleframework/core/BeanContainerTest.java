package org.simpleframework.core;

import com.imooc.controller.frontend.MainPageController;
import com.imooc.service.solo.HeadLineService;
import com.imooc.service.solo.impl.HeadLineServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.simpleframework.core.annotation.Controller;
import org.simpleframework.mvc.DispatcherServlet;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BeanContainerTest {
    private static BeanContainer beanContainer;

    @BeforeAll
    static void init() {
        beanContainer = BeanContainer.getInstance();
    }

    @DisplayName("加载目标类及其实例到BeanContainer：loadBeansTest")
    @Order(1)
    @Test
    public void loadBeansTest() {
        Assertions.assertFalse(beanContainer.isLoaded());
        beanContainer.loadBeans("com.imooc");
        Assertions.assertEquals(6, beanContainer.size());
        Assertions.assertTrue(beanContainer.isLoaded());
    }

    @DisplayName("根据类获取其实例：getBeanTest")
    @Order(2)
    @Test
    public void getBeanTest() {
        MainPageController controller = (MainPageController) beanContainer.getBean(MainPageController.class);
        Assertions.assertNotNull(controller);
        DispatcherServlet dispatcherServlet = (DispatcherServlet) beanContainer.getBean(DispatcherServlet.class);
        Assertions.assertNull(dispatcherServlet);
    }

    @DisplayName("根据注解获取对应的实例：getClassesByAnnotationTest")
    @Order(3)
    @Test
    public void getClassesByAnnotationTest() {
        Assertions.assertTrue(beanContainer.isLoaded());
        Assertions.assertEquals(3, beanContainer.getClassesByAnnotation(Controller.class).size());
    }

    @DisplayName("根据接口获取实现类：getClassesBySuperTest")
    @Order(4)
    @Test
    public void getClassesBySuperTest() {
        Assertions.assertTrue(beanContainer.isLoaded());
        Assertions.assertTrue(beanContainer.getClassesBySuper(HeadLineService.class).contains(HeadLineServiceImpl.class));
    }

}
