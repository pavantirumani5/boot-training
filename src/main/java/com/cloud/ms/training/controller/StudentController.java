package com.cloud.ms.training.controller;

import com.cloud.ms.training.controller.model.dto.OrderItemDto;
import com.cloud.ms.training.controller.model.dto.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("student")
public  class StudentController {

    static List<Student> students = new ArrayList<>();

   static {
       Student student1 = new Student();
      student1.setName("Chinni");
       student1.setNumber(123);
       student1.setMarks(85);

        Student student2 = new Student();
        student2.setName("Sri");
       student2.setNumber(456);
      student2.setMarks(85);

        Student student3 = new Student();
        student3.setName("Hanu");

       student3.setNumber(789);
        student3.setMarks(85);
        students.add(student1);
      students.add(student2);
      students.add(student3);
    }

    @GetMapping()
    public Student getHelloWorld(@RequestParam("number") Integer number) {
         return students.stream().filter(student -> student.getNumber().equals(number)).findFirst().get();
    }
}
  @PostMapping()
  public Student insertHelloWorld(@RequestBody Student student) {
      students.add(student);
      return student;
  }
  //@PutMapping()
    //public OrderItemDto updateHelloWorld(@RequestBody OrderItemDto orderDto) {
       // orderDto.setPrice(12000);
        //return orderDto;
  //}
    //@ DeleteMapping()
   // public Integer deleteHelloWorld(@PathVariable("id") Integer id,@PathVariable("name") String name){
      //  System.out.println(id);
      //  System.out.println(name);
      //  return id;
//}
   // @PatchMapping()
   // public String partialUpdateHelloWorld() {

    //    return "HelloWorld Patch";
   // }
//}