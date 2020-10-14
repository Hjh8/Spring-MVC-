package Controller;

import entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.StudentService;
import javax.annotation.Resource;

@Controller
public class RegisterController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/addStudent")
    public ModelAndView addStudent(Student student){
        ModelAndView mv = new ModelAndView();
        int num = studentService.addStudent(student);
        if (num > 0) {
            mv.addObject("tips", "注册成功");
        } else {
            mv.addObject("tips", "注册失败");
        }
        mv.setViewName("result");
        return mv;
    }
}
