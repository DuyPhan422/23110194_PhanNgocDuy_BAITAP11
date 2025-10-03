package vn.iotstar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @PostMapping("/login_success_handler")
    public String loginSuccessHandler() {
        System.out.println("✅ User login success...");
        return "redirect:/";
    }

    @PostMapping("/login_failure_handler")
    public String loginFailureHandler() {
        System.out.println("❌ Login failure...");
        return "redirect:/login?error=true";
    }
}