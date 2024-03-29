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

    @RequestMapping(value = "/e111231112sd3rsy/{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string) {
        System.out.println("822111");
        return helloClinet.echo(string);
    }

}
