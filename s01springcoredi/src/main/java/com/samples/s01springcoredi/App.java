package com.samples.s01springcoredi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/S01springcoredi/SpringConfig.xml");
       
//       Employee emp = (Employee) springContainer.getBean("emp"); 
//       Employee emp1 = (Employee) springContainer.getBean("emp1"); 
//       Employee emp2 = (Employee) springContainer.getBean("emp2"); 
//
//       System.out.println(emp);
//       System.out.println(emp);
//       System.out.println(emp);
       
       
//       Hospital hos = (Hospital) springContainer.getBean("hospital");
//       System.out.println(hos);
       	 
//       
//       Actors actor = (Actors) springContainer.getBean("Actors");
//       System.out.println(actor);
//       
//       Customer cust = (Customer) springContainer.getBean("customers");
//       System.out.println(cust);
       
       ShoppingCart sc = (ShoppingCart) springContainer.getBean("shoppingcart");
       System.out.println(sc);
       
    }
}