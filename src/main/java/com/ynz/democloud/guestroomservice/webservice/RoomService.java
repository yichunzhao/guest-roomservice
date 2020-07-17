package com.ynz.democloud.guestroomservice.webservice;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rooms")
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository roomRepository;

    @GetMapping("")
    public ResponseEntity<List<Room>> getAllRooms() {
        List<Room> rooms = new ArrayList<>();
        roomRepository.findAll().forEach(room -> rooms.add(room));
        return new ResponseEntity(rooms, HttpStatus.OK);
    }

    @GetMapping(value = "/name/{name}", params = "name")
    public ResponseEntity<List<Room>> getRoomsByRoomName(@PathVariable("name") String name) {
        List<Room> rooms = roomRepository.findByNameIgnoreCase(name);
        return new ResponseEntity(rooms, HttpStatus.OK);
    }

    @GetMapping(value = "/name/{roomNum}",params = "num")
    public ResponseEntity<List<Room>> getRoomsByRoomNum(@PathVariable("roomNum") String roomNum) {
        List<Room> rooms = roomRepository.findByRoomNumIgnoreCase(roomNum);
        return new ResponseEntity(rooms, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Room> createRoom(@RequestBody Room room) {
        Room saved = roomRepository.save(room);
        return new ResponseEntity(saved, HttpStatus.OK);
    }

}
