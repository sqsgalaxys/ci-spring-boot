package com.gabrielfeitosa.contro;

import com.gabrielfeitosa.entity.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 最简单的控制类
 *
 * @author Lidy
 */
@RestController
public class HelloController {

    /**
     * Spring Boto默认使用的的json解析框架是jackson
     * 自动将对象解析成json数据
     *
     * @return
     */
    @RequestMapping("/test")
    public Demo getDemo() {
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("test");
        return demo;
    }
    @RequestMapping("/testEx")
    public Demo getDemoEx() {
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("刘营");
        return demo;
    }

    @RequestMapping("/testExx")
    public String getDemoExx() {
        return "史秋实Ex";
    }
}