package br.com.viniciusls.hourcontrol.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.viniciusls.hourcontrol.models.TimeTrackingItem;
import br.com.viniciusls.hourcontrol.rest.services.TimeTrackingItemService;

/**
 * Created by vinicius.silva on 22/11/2016.
 */
@RestController
@RequestMapping("/api/time-tracking")
public class TimeTrackingItemController {
    @Autowired
    private TimeTrackingItemService timeTrackingItemService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<TimeTrackingItem> index() {
        return timeTrackingItemService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public TimeTrackingItem view(@PathVariable("id") Long id) {
        return timeTrackingItemService.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public TimeTrackingItem create(@RequestBody TimeTrackingItem contact) {
        return timeTrackingItemService.save(contact);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = "application/json")
    @ResponseBody
    public TimeTrackingItem edit(@PathVariable("id") Long id, @RequestBody TimeTrackingItem timeTrackingItem) {
        timeTrackingItem.setId(id);

        return timeTrackingItemService.save(timeTrackingItem);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    @ResponseBody
    public boolean delete(@PathVariable("id") Long id) {
        timeTrackingItemService.delete(id);

        return true;
    }

}
