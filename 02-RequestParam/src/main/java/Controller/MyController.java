package Controller;

import entity.ParamObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

@Controller
public class MyController {
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(String name, int age){
        //创建返回值对象
        ModelAndView mav = new ModelAndView();
        System.out.println("===================");
        System.out.println(name+"  "+age);
        mav.addObject("name", name);
        mav.addObject("age",age);

        mav.setViewName("show");

        return mav;
    }

    @RequestMapping(value = "/requestParamObj.do")
    public ModelAndView doObj(ParamObj obj){
        //创建返回值对象
        ModelAndView mav = new ModelAndView();
        mav.addObject("name", obj.getName());
        mav.addObject("age",obj.getAge());
//        mav.setViewName("show");
        mav.setView(new InternalResourceView("/WEB-INF/view/show.jsp"));
        return mav;
    }

//    @RequestMapping(value = "/requestParamObj.do")
//    public String returnStr(){
//        return "show";
//    }
}
