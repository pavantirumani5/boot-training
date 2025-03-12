package com.cloud.ms.training.controller;

import com.cloud.ms.training.controller.model.dto.OrderItemDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @GetMapping("/hello-world")
    public Integer getHelloWorld(@RequestParam("id")Integer id,@RequestParam("name") String name){
        System.out.println(id);
        System.out.println(name);
        return id;
}
    @PostMapping("/hello-world")
    public OrderItemDto insertHelloWorld(@RequestBody OrderItemDto orderDto) {
        return orderDto;
}
  @PutMapping("/hello-world")
    public OrderItemDto updateHelloWorld(@RequestBody OrderItemDto orderDto) {
        orderDto.setPrice(12000);
        return orderDto;
  }
    @ DeleteMapping("/hello-world/{id}/{name}")
    public Integer deleteHelloWorld(@PathVariable("id") Integer id,@PathVariable("name") String name){
        System.out.println(id);
        System.out.println(name);
        return id;
}
    @PatchMapping("/hello-world")
    public String partialUpdateHelloWorld() {

        return "HelloWorld Patch";
    }
}