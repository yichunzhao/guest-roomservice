package com.ynz.democloud.guestroomservice.webservice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
    List<Room> findByRoomNumIgnoreCase(String roomNum);

    List<Room> findByNameIgnoreCase(String name);

}
