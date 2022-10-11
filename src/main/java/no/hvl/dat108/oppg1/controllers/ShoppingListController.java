package no.hvl.dat108.oppg1.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import no.hvl.dat108.oppg1.utils.AuthUtils;

@Controller
@RequestMapping("/shoppingList")
public class ShoppingListController {

    @GetMapping
    public String getView(HttpServletRequest request, RedirectAttributes ra) {
        if (!AuthUtils.isLoggedIn(request.getSession())) {
            return "redirect:/oppg1";
        }

        return "shoppingListView";
    }

    @PostMapping
    public String addItem(@RequestParam String item, HttpServletRequest request, RedirectAttributes ra) {
        return "redirect:shoppingList";
    }

}
