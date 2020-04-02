package com.demo.Main;

import com.demo.Entity.Course;
import com.demo.Entity.Instructor;
import com.demo.Entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class InstructorCourses {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();
        Session session=factory.getCurrentSession();
        try{
            session.beginTransaction();
            Instructor instructor=session.get(Instructor.class,3);
            List<Course> courses=instructor.getCourses();
            System.out.println(courses);
            session.getTransaction().commit();

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
