package beady.controller;


import beady.domain.User;
import beady.domain.VO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/quick17")
    @ResponseBody
    public void save17(String username, MultipartFile uploadfile,MultipartFile uploadfile2) throws IOException {
        System.out.println(username);
        String filename = uploadfile.getOriginalFilename();
        uploadfile.transferTo(new File("E:\\upload\\"+filename));
        String filename2 = uploadfile2.getOriginalFilename();
        uploadfile2.transferTo(new File("E:\\upload\\"+filename2));

    }
    @RequestMapping(value = "/quick16")
    @ResponseBody
    public void save16(@RequestHeader(value ="User_Agent") String user_agent) {
        System.out.println(user_agent);
    }
    @RequestMapping(value = "/quick15")
    @ResponseBody
    public void save15(@CookieValue(value = "JSESSIONID") String jessionid) {
        System.out.println(jessionid);
    }
    @RequestMapping(value = "/quick14")
    @ResponseBody
    public void save14(Date date) {
        System.out.println(date);
    }


    @RequestMapping(value = "/quick13")
    @ResponseBody
    public void save13(@RequestParam(value="name",required =false,defaultValue ="itcom" ) String username) {
        System.out.println(username);

    }


    @RequestMapping(value = "/quick12")
    @ResponseBody
    public void save12(@RequestBody List<User> userList) {
        System.out.println(userList);
    }

    @RequestMapping(value = "/quick11")
    @ResponseBody
    public void save11(VO vo) {
        System.out.println(vo);
    }


    @RequestMapping(value = "/quick10")
    @ResponseBody
    public void save10(String[] hobby) {
        System.out.println(Arrays.toString(hobby));
    }

    @RequestMapping(value = "/quick9")
    @ResponseBody
    public void save9(User user) {
        System.out.println(user);
    }

    @RequestMapping(value = "/quick8")
    @ResponseBody
    public void save8(String username,int age) {
        System.out.println(username);
        System.out.println(age);
    }

    @RequestMapping(value = "/quick7")
    @ResponseBody
    public User save7() {
        User user=new User();
        user.setUsername("zhangsan");
        user.setAge(18);

        return user;
    }
    @RequestMapping(value = "/quick6")
    @ResponseBody
    public String save6(HttpServletResponse response) throws IOException {
        User user=new User();
        user.setUsername("zhangsan");
        user.setAge(18);
        ObjectMapper mapper=new ObjectMapper();
        String s = mapper.writeValueAsString(user);
        return s;
    }
    @RequestMapping(value = "/quick5")
    @ResponseBody
    public String save5(){
        return "hello world";
    }
    @RequestMapping(value = "/quick4")
    public String save4(Model model){
       model.addAttribute("username","lisi");
        return "success";
    }
    @RequestMapping(value = "/quick3")
    public ModelAndView save3(ModelAndView modelAndView){
        modelAndView.addObject("username","zhangsan");
        modelAndView.setViewName("success");
        return modelAndView;
    }
    @RequestMapping(value = "/quick2")
    public ModelAndView save2(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("username","zhangsan");
        modelAndView.setViewName("success");
        return modelAndView;
    }
    @RequestMapping(value = "/quick",params = {"username"})
    public String save(){
        System.out.println("Controller is running");
        return "success";
    }
}
