package org.study.config;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

/**
 *
 * 这个扩展点也只有一个方法：destroy()，其触发时机为当此对象销毁时，会自动执行这个方法。比如说运行applicationContext.registerShutdownHook时，就会触发这个方法。
 *
 * @author: lsw
 * @date: 2023/3/28 13:35
 */
@Component
public class Bean2DisposableBean implements DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("[DisposableBean] Bean2DisposableBean");
    }
}
