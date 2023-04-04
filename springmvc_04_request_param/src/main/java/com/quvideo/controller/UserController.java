package com.quvideo.controller;

import com.quvideo.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 1. 普通参数直接用方法形参接收, 要求请求参数与方法形参名称一致
     */
    @RequestMapping("/common")
    @ResponseBody
    public String commonParam(String name, int age) {
        System.out.println("commonParam: "+name+", "+age);
        return "commonParam name: "+name+", age: "+age;
    }

    /**
     * 2. 普通参数直接用方法形参接收, 当请求参数与形参名称不一致时, 使用 @RequestParam("name") 注解进行绑定
     */
    @RequestMapping("/commonDiff")
    @ResponseBody
    public String commonParamDiffName(@RequestParam("name") String username, int age) {
        System.out.println("commonParam: "+username+", "+age);
        return "commonParam username: "+username+", age: "+age;
    }

    /**
     * 3. POJO参数接收: 请求参数构造成与POJO对象的属性名称一致即可自动转换
     */
    @RequestMapping("/pojo")
    @ResponseBody
    public String pojoParam(User user) {
        System.out.println("pojoParam: "+user);
        return "pojoParam success: "+user.toString();
    }

    /**
     * 4. 嵌套POJO参数接收: 请求参数构造成与POJO对象的属性名称一致即可自动转换,
     * 当POJO对象有引用属性时, 按照属性.属性名的方式传参数即可, 例如: address.country
     */
    @RequestMapping("/pojoContain")
    @ResponseBody
    public String pojoContainParam(User user) {
        System.out.println("pojoParam: "+user);
        return "pojoParam success: "+user.toString();
    }

    /**
     * 5. 数组参数接收: 请求参数使用同样的参数名称, 或者同一个参数名称对应值使用逗号分割即可
     */
    @RequestMapping("/array")
    @ResponseBody
    public String arrayParam(String[] likes) {
        System.out.println("arrayParam: "+ Arrays.toString(likes));
        return "arrayParam success: "+ Arrays.toString(likes);
    }

    /**
     * 6. List集合对象参数接收: 与数组参数接收请求参数构造方式一致, 但是对应方法参数需要使用 @RequestParam 注解
     * 表明需要将请求参数直接放到List集合中
     */
    @RequestMapping("/list")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes) {
        System.out.println("listParam: "+ likes);
        return "listParam success: "+ likes.toString();
    }

    /**
     * 7. JSON对象参数接收:
     * 7.1 在Pom文件中引入jackson坐标(spring内置默认的JSON转换包)
     *      <!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind -->
     *      <dependency>
     *          <groupId>com.fasterxml.jackson.core</groupId>
     *          <artifactId>jackson-databind</artifactId>
     *          <version>2.14.2</version>
     *      </dependency>
     * 7.2 需要在SpringMVC的配置中, 使用@EnableWebMvc注解开启JSON序列化与反序列化功能.(该注解功能强大, 开启的不仅仅时JSON功能)
     * 7.3 发送JSON数据时, 参数不再是在请求参数里了, 而是在请求体中, 所以需要使用@RequestBody注解来表明需要将请求参数直接放到List集合中
     */
    @RequestMapping("/jsonList")
    @ResponseBody
    public String jsonListParam(@RequestBody List<String> likes) {
        System.out.println("jsonListParam: "+ likes);
        return "jsonListParam success: "+ likes.toString();
    }

    @RequestMapping("/jsonPojo")
    @ResponseBody
    public String jsonPojoParam(@RequestBody User user) {
        System.out.println("jsonPojoParam: "+ user);
        return "jsonPojoParam success: "+ user.toString();
    }

    @RequestMapping("/jsonArray")
    @ResponseBody
    public String jsonArrayParam(@RequestBody String[] likes) {
        System.out.println("jsonArrayParam: "+ Arrays.toString(likes));
        return "jsonArrayParam success: "+ Arrays.toString(likes);
    }

    /**
     * 8. JSON对象列表参数接收, 请求参数中写成多个JSON对象即可
     */
    @RequestMapping("/jsonListPojo")
    @ResponseBody
    public String jsonListPojoParam(@RequestBody List<User> users) {
        System.out.println("jsonListPojoParam: "+ users);
        return "jsonListPojoParam success: "+ users.toString();
    }

    /**
     * 9. Date日期类型参数接收: spring默认只能转换斜杠形式的日期字符串, 例如: 2023/04/04,
     * 如果需要转换其他格式, 则需要使用 @DateTimeFormat(pattern = "yyyy-MM-dd") 注解进行指定
     */
    @RequestMapping("/date")
    @ResponseBody
    public String dateParam(Date date, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date otherDate) {
        System.out.println("dateParam: "+ date);
        System.out.println("otherDateParam: "+ otherDate);
        return "dateParam success: "+ date.toString() + "otherDate: " + otherDate.toString();
    }

}
