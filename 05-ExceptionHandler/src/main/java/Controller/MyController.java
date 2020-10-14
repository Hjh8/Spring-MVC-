package Controller;

import entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    @RequestMapping(value = "/some.do")
    @ResponseBody
    public Student doSome(){
        System.out.println("控制器方法执行");
        Student stu = new Student("codekiang", 18);
        return stu;
    }

}
