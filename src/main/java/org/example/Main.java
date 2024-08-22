package org.example;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.example.config.FactoryConfiguration;
import org.example.embed.FullName;
import org.example.entity.Student;
import org.example.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(MysqlxDatatypes.Scalar.String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();

        FullName fullName = new FullName("Kamal","Perera");
        Student student = new Student();
        student.setId(6);
        student.setFullName(fullName);
        student.setAddress("Galle");

        Transaction transaction = session.beginTransaction();

        //Save
        session.save(student);
        //Delete
        session.delete(student);
        //Get
        Student student1 = session.get(Student.class,5);
        System.out.println(student1.toString());

        /*Teacher teacher = new Teacher();
        FullName fullName1 = new FullName("Kasun","Perera");

        teacher.setId(1);
        teacher.setName(fullName1);
        teacher.setAddress("Panadura");
        teacher.setTelNo("0781234578");
        session.save(teacher);*/

        transaction.commit();
        session.close();
    }
}