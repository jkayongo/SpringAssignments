package customauthenticationworkspace.CustomAuthentication.controller;

import java.nio.charset.StandardCharsets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SessionController {
	@RequestMapping(value = "/kloe", method = RequestMethod.GET)
    @ResponseBody
    public String getSession(HttpServletRequest request, HttpServletResponse response) {
        String authHeader = request.getHeader("Authorization");
        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return "Missing or invalid Authorization header";
        }
 
        System.out.println("THE AUTHHEADER THAT HAS BEEN PASSED IS"+ authHeader);
        //Basic username:password
        String base64Credentials = authHeader.substring(6);
        System.out.println("THE substring"+ authHeader);
 
        String credentials = new String(Base64.decodeBase64(base64Credentials), StandardCharsets.UTF_8);
        System.out.println("THE credentials"+ credentials);
        String[] values = credentials.split(":", 2);
        System.out.println("THE values"+ authHeader);
 
        if ("admin".equals(values[0]) && "password".equals(values[1])) {
            HttpSession session = request.getSession();
            session.setAttribute("user", values[0]);
            return "Session Token: " + session.getId();
        } else {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return "Invalid credentials";
        }
    }
 
    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    @ResponseBody
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
            return "Logged out successfully";
        }
        return "No active session";
    }

}
