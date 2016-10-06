package kirill.service;

import kirill.model.Event;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kirill on 06/10/16.
 */
@Service("eventService")
public class EventService {
    public List<Event> addEvents(){
        List<Event> events=new ArrayList<Event>();
        Event event=new Event();
        event.setName("Java User Group");
        Event event2=new Event();
        event2.setName("Angular User Group");
        events.add(event);
        events.add(event2);
        return events;

    }
}
