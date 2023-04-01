package com.quvideo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 通知类
 */
@Component
@Aspect
public class MyAdvice {

    /**
     * 定义切入点(Pointcut)
     * 切入点表达式标准格式: 动作关键字(访问修饰符 返回值类型 包名.类/接口名.方法名(参数) 异常名)
     * 例如: execution(public User com.quvideo.service.UserService.findById(int))
     * @动作关键字: 描述切入点的行为动作, 例如: execution表示执行到指定切入点时
     * @访问修饰符: public, private 等, 可以省略不写
     * @返回值类型: 一般采用通配符*表示允许任意类型的返回值
     * @包名.类/接口名.方法名: 一般指定到某个包下面使用通配符*匹配的一类方法, 例如: com.quvideo.dao.*Dao.*()
     * @参数: 一般使用通配符*表示任意参数, 使用通配符 .. 表示允许有参数或者没有参数并且无所谓有几个参数都可以
     * @异常名: 方法定义中抛出指定异常,可以省略
     * 此外,关于通配符:
     * @*: 单个独立的任意符号, 可以独立出现, 也可以作为前缀或者后缀的通配符出现, 例如: execution(* com.quvideo.*.*Dao.find*(*))
     * @..: 多个连续的任意符号, 可以独立出现, 常用于简化包名与参数的书写, 例如: execution(* com..BookDao.delete(..))
     * @+: 专用于匹配子类类型, 例如: execution(* *..*Service+.*(..)) 代表任意包下面的以Service结尾的类的子类, 不常用!!
     */
//    @Pointcut("execution(void com.quvideo.dao.BookDao.update())") // 切入点表达式
//    @Pointcut("execution(void com.quvideo.dao.impl.BookDaoImpl.update())") // 切入点表达式(描述切入点时一般只描述到接口,该方式不建议用)
//    @Pointcut("execution(* com.*.*.*Dao.*te())") // 切入点表达式
    @Pointcut("execution(* com.quvideo.*.*Dao.*te(..))") // 切入点表达式
    private void pt() {}

    /**
     * 通知(Advice)
     */
    @Before("pt()") // 关联通知和切入点的切面(Aspect)
    public void method() {
        System.out.println(System.currentTimeMillis()); //
    }
}
