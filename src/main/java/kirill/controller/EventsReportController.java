package kirill.controller;

import kirill.model.Event;
import kirill.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kirill on 06/10/16.
 */
@RestController
public class EventsReportController {
    @Autowired
    EventService eventService;
    @RequestMapping(value = "/events")
    public List<Event> getEvents(){
        return eventService.addEvents();
    }
}
