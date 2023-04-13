package com.jspiders.musicplayerhibernate_task.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.musicplayerhibernate_task.dto.Song;

public class SongOperation {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	private static String jpqlQuery;
	private static javax.persistence.Query query;
	private static String query1;
	Scanner sc = new Scanner(System.in);

	private static void openConnection() {

		entityManagerFactory = Persistence.createEntityManagerFactory("musicPlayer");

		entityManager = entityManagerFactory.createEntityManager();

		entityTransaction = entityManager.getTransaction();
	}

	private static void closeConnection() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if (entityManager != null) {
			entityManager.close();
		}
//		if(entityTransaction.isActive()) {
//			entityTransaction.rollback();
//		}
	}

	public void allSong() {
		try {

			openConnection();

			entityTransaction.begin();

			jpqlQuery = "from Song";
			query = entityManager.createQuery(jpqlQuery);
			List<Song> songs = query.getResultList();

			for (Song song : songs) {
				System.out.println(songs);
			}

			entityTransaction.commit();
		} finally {
			closeConnection();
		}

	}

	public void deleteSong() {
		try {

			openConnection();

			entityTransaction.begin();

			 query = entityManager.createQuery("DELETE FROM Song s WHERE s.songName = :songName ");
		      query.setParameter("songName", "Kevdyach_pan_tu");
		      int rowsDeleted = query.executeUpdate();
		      System.out.println("entities deleted: " + rowsDeleted);

			entityTransaction.commit();
		} finally {
			closeConnection();
		}
	}

	public void updateSong() {
		try {

			openConnection();

			entityTransaction.begin();

			   query = entityManager.createQuery("UPDATE Song SET id = :id  "
		              + "WHERE songName = :songName");
		      query.setParameter("id", 2);
		      query.setParameter("songName", "Kevdyach_Pan_tu");
		      int rowsUpdated = query.executeUpdate();
		      System.out.println("entities Updated: " + rowsUpdated);

			entityTransaction.commit();
		} finally {
			closeConnection();
		}
	}

	public void addSongs() {
		try {

			openConnection();

			entityTransaction.begin();

			Song song = new Song();
			System.out.print("Enter Song ID :- ");
			song.setId(sc.nextInt());
			System.out.print("Enter Singer Name :- ");
			song.setSingerName(sc.next());
			System.out.print("Enter Song Name :- ");
			song.setSongName(sc.next());
			System.out.print("Enter Song Duaration :- ");
			song.setSongDuration(sc.nextDouble());
			System.out.print("Enter song Relese Year");
			song.setReleseYear(sc.nextInt());

			entityManager.persist(song);

			entityTransaction.commit();
		} finally {
			closeConnection();
		}
	}
	public void findSong(){
		try {
			openConnection();
			
			entityTransaction.begin();
			
			  query = entityManager.createQuery(
		              "SELECT s FROM Song s");
		      List<Song> resultList = query.getResultList();
		      System.out.println("Song count: "+resultList.size());
		      resultList.forEach(System.out::println);
		      
		      entityTransaction.commit();
			
		}finally {
			closeConnection();
		}
	}
}
