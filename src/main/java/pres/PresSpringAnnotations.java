package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringAnnotations {
    public static void main(String[] args) throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        IMetier metier=context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
