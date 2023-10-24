package demo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

//    this is a method we have to call before execution starts
    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp){

//        join-point to get the details of anything in the pointcut
//        System.out.println(jp.getSignature());
        String arg = jp.getArgs()[0].toString();
        System.out.println("Before loggers with Argument: "+ arg);

//        so this is a point cut, what we have to run and where we have to run

        System.out.println("Before Loggers");
    }


//    1st star for any return type, 2nd for any package, 3rd for any class, two dots for whatever the parameters are there it should match


    @After("execution(* *.*.checkout(..))")
    public void afterLogger() {
        System.out.println("After Loggers");
    }

    @Pointcut("execution(* demo.ShoppingCart.quantity(..))")
    public void afterReturningPointcut(){

    }
    @AfterReturning(pointcut = "afterReturningPointcut()", returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("After Returning: "+retVal);
    }

}
