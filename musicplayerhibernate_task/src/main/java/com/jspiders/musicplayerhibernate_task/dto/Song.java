package com.jspiders.musicplayerhibernate_task.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "song")
public class Song {

	@Id
	private int id;
	private String songName;
	private String singerName;
	private double songDuration;
	private int ReleseYear;
}
