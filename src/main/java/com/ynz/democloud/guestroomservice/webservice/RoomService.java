package com.ynz.democloud.guestroomservice.webservice;

import com.ynz.democloud.guestroomservice.exceptions.NoSuchRoomException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rooms")
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository roomRepository;

    @GetMapping
    public ResponseEntity<List<Room>> getAllRooms() {
        List<Room> rooms = new ArrayList<>();
        roomRepository.findAll().forEach(rooms::add);
        return new ResponseEntity<>(rooms, HttpStatus.OK);
    }

    @GetMapping(value = "/{name}/names")
    public ResponseEntity<List<Room>> getRoomsByRoomName(@PathVariable("name") String name) {
        List<Room> rooms = roomRepository.findByNameIgnoreCase(name);
        return new ResponseEntity<>(rooms, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Room> getRoomsByRoomId(@PathVariable("id") long id) {
        CharSequence msg = new StringBuilder("Room").append(" id: ").append(id).append(" is not found.");
        Room room = roomRepository.findById(id).orElseThrow(() -> new NoSuchRoomException(msg));
        return new ResponseEntity<>(room, HttpStatus.OK);
    }

}
