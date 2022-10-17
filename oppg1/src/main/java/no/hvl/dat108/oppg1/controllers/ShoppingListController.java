package no.hvl.dat108.oppg1.controllers;

import no.hvl.dat108.oppg1.model.ShoppingList;
import no.hvl.dat108.oppg1.model.ShoppingListItem;
import no.hvl.dat108.oppg1.utils.AuthUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ShoppingListController {
    private final ShoppingList list = new ShoppingList();

    @GetMapping("/shoppingListView")
    public String getView(HttpServletRequest request, RedirectAttributes ra, ModelMap model) {
        if (!AuthUtils.isLoggedIn(request.getSession())) {
            return "redirect:loginView";
        }

        model.put("list", list);
        return "shoppingListView";
    }

    @PostMapping("/add")
    public String addItem(@RequestParam String item, HttpServletRequest request, RedirectAttributes ra) {
        if (!AuthUtils.isLoggedIn(request.getSession())) {
            return "redirect:loginView";
        }

        if (item.trim().length() > 0 && !item.contains("\"")) {
            list.addItem(new ShoppingListItem(item));
        }

        return "redirect:shoppingListView";
    }

    @PostMapping("/delete")
    public String removeItem(@RequestParam String item, HttpServletRequest request, RedirectAttributes ra) {
        if (!AuthUtils.isLoggedIn(request.getSession())) {
            return "redirect:loginView";
        }

        list.removeItem(item);
        return "redirect:shoppingListView";
    }

}
