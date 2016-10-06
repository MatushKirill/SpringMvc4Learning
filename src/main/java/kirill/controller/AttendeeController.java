package kirill.controller;

import kirill.model.Attendee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by kirill on 03/10/16.
 */
@Controller
public class AttendeeController {

    @RequestMapping(value = "/attendee",method = RequestMethod.GET)
    public String showAttendee(Model model ){
        Attendee attendee=new Attendee();
        model.addAttribute("attendee" ,attendee);
        return "attendee";

    }
    @RequestMapping(value = "/attendee",method = RequestMethod.POST)
    public String showAttendee(@Valid @ModelAttribute("attendee") Attendee attendee , BindingResult result){

        System.out.println(attendee);
        if(result.hasErrors()){
            return "attendee";
        }else {
            return "redirect:index.jsp";
        }

    }
}
