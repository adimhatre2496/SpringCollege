package com.example.SpringCollege.service;

import com.example.SpringCollege.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService
    {
        public List<Student> getStudent(Long studentId)
        {

            List<Student>list=new ArrayList<Student>();

            list.add(new Student("Aditya","Mhatre","16/02/2000",90045,"Kisan","Thane",400604));
            list.add(new Student("Rushi","Kandekar","23/101998",9004575,"Kisan","Thane",400604));
            list.add(new Student("Tzuyu","Chou","24/06/1999",9004572,"Kisan","Seoul",400604));
            list.add(new Student("Sana","Twice","4/08/1996",9004572,"Kisan","Kyoto",400604));

            return list;
        }
    }
