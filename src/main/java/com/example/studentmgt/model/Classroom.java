package com.example.studentmgt.model;

import javax.persistence.*;

@Entity
@Table(name="classrroms")
public class Classroom {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    private Long classroomId;
    private String bulidingName;
    private String roomNumber;

    public Classroom(Long classroomId, String bulidingName, String roomNumber) {
        this.classroomId = classroomId;
        this.bulidingName = bulidingName;
        this.roomNumber = roomNumber;
    }

    public Classroom() {

    }

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }

    public String getBulidingName() {
        return bulidingName;
    }

    public void setBulidingName(String bulidingName) {
        this.bulidingName = bulidingName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
