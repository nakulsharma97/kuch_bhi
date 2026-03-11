package com.scm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scm.entities.User;
import com.scm.entities.User.UserBuilder;
import com.scm.forms.UserForm;
import com.scm.services.UserService;

@Controller
public class pagecontroller {
    
    @Autowired
    private UserService userService ;
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Home Page");
        return "index";
    }

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "Home Page");
        model.addAttribute("github", "https://github.com/nakulsharma97");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(Model model) {
        return "about";
    }

    @RequestMapping("/services")
    public String servicesPage(Model model) {
        return "services";
    }

    @RequestMapping("/contact")
    public String contactPage(Model model) {
        return "contact";
    }

    @GetMapping("/login")
    public String loginPage(Model model) {
        return "login";
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        UserForm userForm = new UserForm();
       // userForm.setName("Nakul Sharma");
        model.addAttribute("userForm", userForm) ;
        return "register";
    }
     //processing register
     @RequestMapping(value ="/register" , method = RequestMethod.POST)
      public String processRegister(@ModelAttribute UserForm userForm){
        System.out.println("Registering user...");  
        //fetch form  da ta
        //validate form data
        // save to db
       //  userservice

       //userFrom --> user 
User user = User.builder()
.name(userForm.getName())
.email(userForm.getEmail())
.password(userForm.getPassword())
.About(userForm.getAbout()) 
.phonenumber(userForm.getPhoneNumber()) 
.profilePic("fvd.png")
   
.build() ;
     User savedUser =   userService.saveUser(user) ;    
        //message ="registration successfully
        // redirect to login page"
        return "redirect:/register"  ;
      }

    


}
