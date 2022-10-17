package no.hvl.dat108.oppg1.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import no.hvl.dat108.oppg1.utils.AuthUtils;

@Controller
public class AuthController {

    @Value("${app.password}")
    private String PASSWORD;

    @GetMapping("/loginView")
    public String getView() {
        return "loginView";
    }

    @PostMapping("/login")
    public String login(@RequestParam String password, HttpServletRequest request, RedirectAttributes ra) {
        if (password.equals(PASSWORD)) {
            AuthUtils.login(request);
            return "redirect:shoppingListView";
        }

        ra.addFlashAttribute("loginFailedMessage", "Wrong password, try again...");
        return "redirect:loginView";
    }

}
