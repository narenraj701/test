package com.demo.Main;

import com.demo.Entity.Instructor;
import com.demo.Entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();
        Session session=factory.getCurrentSession();
        try{
            Instructor tempInstructor=new Instructor("naren","raju","naren@gmail.com");
            InstructorDetail tempInstructorDetail=new InstructorDetail("youtube/naren","gaming");
            tempInstructor.setInstructorDetail(tempInstructorDetail);

            session.beginTransaction();

            session.save(tempInstructor);

            session.getTransaction().commit();

        }
        finally {
            factory.close();
        }
    }
}
