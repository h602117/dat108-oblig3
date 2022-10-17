package no.hvl.dat108.oppg1.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class AuthUtils {

    private static Integer MAX_INACTIVE_INTERVAL = 60;

    public static void login(HttpServletRequest request) {
        logout(request.getSession());

        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(MAX_INACTIVE_INTERVAL);
        session.setAttribute("is_authenticated", true);
    }

    public static void logout(HttpSession session) {
        session.invalidate();
    }

    public static boolean isLoggedIn(HttpSession session) {
        return session != null && session.getAttribute("is_authenticated") != null;
    }

}
