package co.uk.endava.controller;

import co.uk.endava.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(Model model) {
        model.addAttribute("user",new User());
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/login/{username}", method = RequestMethod.GET)
    public ModelAndView profile(@PathVariable String username) {
        User a=new User();
        a.setUsername("tiki");
        User b=new User();
        b.setUsername("taka");
        User c=new User();
        c.setUsername("toki");
        List<User> users=new ArrayList<User>();
        users.add(a);
        users.add(b);
        users.add(c);



        if(users.stream().findFirst().filter(user->username.equals(user.getUsername())).orElse(null)!=null)
            return new ModelAndView("profile","username","Exists");
        return new ModelAndView("profile","username","Does not exists");
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView verifyLogin(@ModelAttribute("user") User user,
                                    Model model) {
        boolean bool;
        if(user.getUsername().equals("bogdan")&&user.getPassword().equals("bodgan"))
            bool=true;
        else bool=false;
        return new ModelAndView("result","bool",bool);
    }
}