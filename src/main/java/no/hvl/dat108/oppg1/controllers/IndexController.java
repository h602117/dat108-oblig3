package no.hvl.dat108.oppg1.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import no.hvl.dat108.oppg1.utils.AuthUtils;

@Controller
public class IndexController {

    @GetMapping
    public String getView(HttpServletRequest request, RedirectAttributes ra) {
        if (AuthUtils.isLoggedIn(request.getSession())) {
            return "redirect:/oppg1/shoppingList";
        }

        return "redirect:/oppg1/auth";
    }

}
