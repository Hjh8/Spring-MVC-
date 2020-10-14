package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/user")
public class MyController {
    /*
    * 调用方法来处理用户的请求，方法名称自定义，可以有多种返回值类型，多种参数类型
    * Dispatcher是前端控制器，controller是后端控制器
    * */

    /*
    * @RequestMapping为请求映射，将一个请求地址和一个方法绑定在一起
    *   被修饰的方法叫做处理器方法或控制器方法，类似于servlet的doGet，doPost
    *   属性
    *       value：String类型，表示请求的url，必须唯一，一般以 “/” 开头。
    * =================================================================
    * 返回值ModelAndView
    *   Model：请求处理完成后要显示给用户的数据
    *   View：用户所见到的视图。
    * */
    @RequestMapping(value = "/some.do", method = RequestMethod.GET)
    public ModelAndView doSome(){
        //这里先不调用service，简单的处理一下
        System.out.println("======================");
        //创建返回值对象
        ModelAndView mav = new ModelAndView();
        //添加数据，框架会把数据放入到request的作用域，request.setAttribute()
        mav.addObject("msg", "欢迎使用SpringMVC");
        mav.addObject("name","codeKiang");
        //设置视图，指定数据的去向，request.getRequestDispatcher(路径).forward(request,response).
        mav.setViewName("show");

        return mav;
    }
}
