package com.ynz.democloud.guestroomservice.webservice;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "ROOM")
@Getter
@Setter
public class Room {
    @Id
    @GeneratedValue
    @Column(name = "ROOM_ID")
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ROOM_NUMBER")
    private String roomNum;

    @Column(name = "BED_INFO")
    private String bedInfo;
}
