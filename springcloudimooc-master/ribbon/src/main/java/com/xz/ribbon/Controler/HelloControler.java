package com.xz.ribbon.Controler;

import com.xz.ribbon.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloControler
 * @Description TODO
 * @Author xz
 * @Date 2019/4/25 14:03
 * @Version 1.0
 **/

@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name)
    {
        return helloService.hiService(name);
    }


}
