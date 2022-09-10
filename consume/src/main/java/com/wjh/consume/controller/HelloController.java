package com.wjh.consume.controller;

import com.wjh.consume.clinet.HelloClinet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloClinet helloClinet;

    @RequestMapping(value = "/eo171oy/{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string) {
        System.out.println("https://mp.weixin.qq.com/s?__biz=MjM5ODYxMDA5OQ==&mid=2651961368&idx=1&sn=82a59f41332e11a29c5759248bc1ba17&chksm=bd2d0dc48a5a84d293f5999760b994cee9b7e20e240c04d0ed442e139f84ebacf608d51f4342&scene=21#wechat_redirect");
        return helloClinet.echo(string);
    }

}
