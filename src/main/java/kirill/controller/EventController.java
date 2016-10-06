package kirill.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import kirill.model.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by kirill on 03/10/16.
 */
@Controller
@SessionAttributes("event")
public class EventController {
    @RequestMapping(value = "/event",method = RequestMethod.GET)
    public String displayEventPage(Model model){
        Event event=new Event();
        model.addAttribute("event",event);
        return "event";
    }
    @RequestMapping(value = "/event",method = RequestMethod.POST)
    public String  setEvent(@ModelAttribute("event") Event event){
        System.out.println(event.getName());

        return "redirect:index.jsp";
    }
}
