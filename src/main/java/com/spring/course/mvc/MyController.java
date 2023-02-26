package com.spring.course.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
//@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {

        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails() {
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//        String employeeNameame = request.getParameter("employeeName");
//        employeeNameame = "Mr. " + employeeNameame;
//        model.addAttribute("nameAttribute", employeeNameame);
//        model.addAttribute("description", "- instructor");
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {
//        empName = "Mr. " + empName + " - ";
//        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("description", "instructor");
//        return "show-emp-details-view";
//    }


//    @RequestMapping("/showDetails")
//    public String showEmpDetails(@ModelAttribute("employee") Employee emp) {
//
//        String name = emp.getName();
//        emp.setName("Mr " + name);
//
//        String surname = emp.getSurname();
//        emp.setSurname(surname + "!");
//
//        int salary = emp.getSalary();
//        emp.setSalary(salary * 10);
//        return "show-emp-details-view";
//    }

//    @RequestMapping(path = "/showDetails", method = RequestMethod.GET)
    @GetMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp,
                                 BindingResult bindingResult) {

//        System.out.println("surname length - " + emp.getSurname().length());
        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        } else {
            return "show-emp-details-view";
        }
    }
}
