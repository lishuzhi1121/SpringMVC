package com.quvideo.controller;

import com.quvideo.domain.Address;
import com.quvideo.domain.User;
import com.quvideo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 2. 定义表现层controller
 * 2.1 使用 @Controller 注解定义
 */
@Controller
/**
 * 2.2. 设置当前操作的访问路径, 加载类上表示当类所有方法访问路径的前缀
 */
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 2.2. 设置当前操作的访问路径, 加载方法上表示当前方法的访问路径
     */
    @RequestMapping("/save")
    /**
     * 2.3 设置当前操作的返回值类型, @ResponseBody 注解表示将当前操作的返回值作为响应体直接返回
     */
    @ResponseBody
    /**
     * 4. 使用 @RequestParam("name") 注解可以绑定请求参数名称和对应方法形参之间的映射关系, 例如: 请求参数为name,
     * 但是方法的形参定义为username, 则可以写成 (@RequestParam("name") String username), 此外, 还可以使用该
     * 注解为请求参数设置默认值 @RequestParam(value = "name", defaultValue = "Sands666")
     */
    public String save(@RequestParam(value = "name", defaultValue = "Sands666") String username) {
        System.out.println("User save: "+username);
//        User user = new User();
//        user.setUsername(username);
//        user.setAge(18);
//        user.setAddress("浙江省杭州市西湖区");
//        user.setPhone("13269231295");
//        userService.add(user);
        return "User save success: "+username;
    }

    @RequestMapping("/savePojo")
    @ResponseBody
    /**
     * 5. 请求参数接收: POST请求的form表单提交数据只要参数名称和对象属性名一致时, 就可以直接映射到一个对象,
     * 对于对象中存在引用类型的属性, 请求参数可以采用属性名.属性名的形式, 例如: address.country
     * 6. 请求参数接收: POST请求提交数组列表数据, 可以直接采用字符串逗号分割的形式
     */
    public String savePojo(User user) {
        System.out.println("User save: "+user);
//        User user = new User();
//        user.setUsername(username);
//        user.setAge(18);
//        user.setAddress("浙江省杭州市西湖区");
//        user.setPhone("13269231295");
//        userService.add(user);
        return "User save success: "+user.toString();
    }

    /**
     * 7. 请求参数接收: 当采用List集合对象接收时, 只写 listParam(List<String> books) 的话是无法接收的,
     * 原因是spring认为List是个对象, 然后就去构造这个对象, 之后在将参数set进去, 但事实上List只是一个接口,
     * 并不存在init方法, 所以报错信息中会提示找不到init方法的错误信息, 所以正确的写法应该是在前面加上 @RequestParam
     * 注解, 以便告诉spring只需要将参数塞进去就行了, 不要去构造对象
     */
    @RequestMapping("/books")
    @ResponseBody
    public String listParam(@RequestParam List<String> books) {
        System.out.println("List Param: "+books);
        return "listParam success: "+books.toString();
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(String name) {
        System.out.println("User delete: "+name);
        userService.delete(name);
        return "User delete success: "+name;
    }

    /**
     * 3. 请求参数接收: GET和POST请求参数的接收可以直接使用方法形参进行接收
     */
    @RequestMapping("/update")
    @ResponseBody
    public String update(String name, Integer age) {
        System.out.println("User update: "+name);
        User user = new User();
        user.setUsername(name);
        user.setAge(age);
        Address address = new Address();
        address.setCountry("China");
        address.setProvince("Zhejiang");
        address.setCity("Hangzhou");
        user.setAddress(address);
        user.setPhone("15238102487");
        userService.update(user);
        return "User update success: "+name;
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll() {
        System.out.println("User findAll...");
        List<User> users = userService.findAll();
        System.out.println(users);
        return "User findAll success: "+users.toString();
    }

    @RequestMapping("/findById")
    @ResponseBody
    public String findById(Integer id) {
        System.out.println("User findById...");
        User user = userService.findById(id);
        System.out.println(user);
        return "User findById success: "+user.toString();
    }

}
