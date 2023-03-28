package org.study.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;
import org.study.service.OrderService;

/**
 *
 * 这个接口在读取项目中的beanDefinition之后执行，提供一个补充的扩展点
 *
 * 使用场景：你可以在这里动态注册自己的beanDefinition，可以加载classpath之外的bean
 *
 * @author: lsw
 * @date: 2023/3/27 15:39
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    // Bean定义之后调用
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        System.out.println("[BeanDefinitionRegistryPostProcessor] postProcessBeanDefinitionRegistry");
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(OrderService.class);
        beanDefinitionRegistry.registerBeanDefinition("orderService", rootBeanDefinition);
    }

    // Bean定义之后，初始化之前调用
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("[BeanDefinitionRegistryPostProcessor] postProcessBeanFactory");
        OrderService orderService = configurableListableBeanFactory.getBean(OrderService.class);
        orderService.orderMoney();
    }
}
