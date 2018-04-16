package main.java.com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by: zs
 * Date-Time: 2017/8/9 21:51
 */
@Controller
public class TestController {

    //RequestMapping表示使用哪个URL来对应
    @RequestMapping({"／test","/"})
    public String test(){
        System.out.println("I Love China！");
        return "test";//test对应WEB-INF/jsp
    }

}