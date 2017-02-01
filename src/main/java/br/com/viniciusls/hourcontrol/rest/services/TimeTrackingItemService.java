package br.com.viniciusls.hourcontrol.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.viniciusls.hourcontrol.models.TimeTrackingItem;
import br.com.viniciusls.hourcontrol.rest.repositories.TimeTrackingItemRepository;

/**
 * Created by vinicius.silva on 01/02/2017.
 */
@Service
@Transactional
public class TimeTrackingItemService {
    @Autowired
    private TimeTrackingItemRepository timeTrackingItemRepository;

    public List<TimeTrackingItem> findAll(){
        return timeTrackingItemRepository.findAll();
    }

    public TimeTrackingItem findOne(Long id){
        return timeTrackingItemRepository.findOne(id);
    }

    public TimeTrackingItem save(TimeTrackingItem timeTrackingItem) {
        return timeTrackingItemRepository.save(timeTrackingItem);
    }

    public void delete(Long id){
        timeTrackingItemRepository.delete(id);
    }
}
