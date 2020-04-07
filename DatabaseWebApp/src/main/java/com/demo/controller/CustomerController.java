package com.demo.controller;

import com.demo.DAO.CustomerDAO;
import com.demo.Entity.Customer;
import com.demo.service.CustomerService;
import com.demo.service.CustomerServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value="/customer",method = RequestMethod.GET)
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @RequestMapping(value="/list",method = RequestMethod.GET)
    public String listCustomers(Model theModel){
        List<Customer> theCustomers=customerService.getCustomers();
        theModel.addAttribute("customers",theCustomers);
        return "list-customers";
    }
    @RequestMapping(value="/showFormForAdd",method = RequestMethod.GET)
    public String showFormForAdd(Model theModel){
        Customer customer=new Customer();
        theModel.addAttribute("customer",customer);

        return "customer-form";
    }
    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer){

        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }
    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int theId,
                                    Model theModel){
        Customer customer=customerService.getCustomer(theId);
        theModel.addAttribute("customer",customer);
        return "customer-form";

    }
    @GetMapping("/delete")
    public String delete(@RequestParam("customerId") int theId,
                         Model theModel){
        customerService.delete(theId);
        return "redirect:/customer/list";




    }

}
