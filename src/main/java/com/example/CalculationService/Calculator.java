package com.example.CalculationService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {

    @RequestMapping("/calculate/{operand1}/{operand2}/{operator}")
    public String calculate(@PathVariable("operand1") String op1,@PathVariable("operand2") String op2,@PathVariable("operator") String op){
        if(op.equals("+"))
            return String.valueOf(Integer.parseInt(op1)+Integer.parseInt(op2));
        else if(op.equals("-"))
            return String.valueOf(Integer.parseInt(op1)-Integer.parseInt(op2));
        else if(op.equals("x"))
            return String.valueOf(Integer.parseInt(op1)*Integer.parseInt(op2));
        else if(op.equals("/"))
            return String.valueOf(Integer.parseInt(op1)/Integer.parseInt(op2));
        else
            return "Invalid operation.";

    }
}
