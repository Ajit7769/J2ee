package com.jspiders.musicplayerhibernate_task.dao;

import java.util.Scanner;

public class MusicPlayer {

	static boolean loop = true;

	public static void main(String[] args) {

		while (loop) {
			MusicPlayer musicPlayer = new MusicPlayer();
			musicPlayer.opration();
		}

	}

	Scanner scanner = new Scanner(System.in);

	private void opration() {

		SongOperation songOpertions = new SongOperation();

		System.out.println(
				"Menu \n 1.Play Song \n 2.Add Song \n 3.Update Song \n 4.Remove Song \n 5.Find Song \n 6.Exit");

		System.out.println("======= Enter Your Choice =========");

		switch (scanner.nextInt()) {
		case 1:
			System.out.println("1.show_All_Songs \n 2.Choose Song  \n 3.Go Back");

			System.out.println("============ Enter Your Choice =========");

			switch (scanner.nextInt()) {
			case 1:
				System.out.println("================ show All songs ===================");
				songOpertions.allSong();
				break;
			case 2:
				System.out.println("================ see your chose song ===================");

				break;
			case 3:
				System.out.println("Menu \n 1.Play Song \n 2.Add Song \n 3.Update Song \n 4.Exit");
				break;

			default:
				System.out.println(" Enter Invalid Number ");
			}
			break;

		case 2:
			System.out.println("=========== Adding Songs ==========");
			songOpertions.addSongs();
			break;

		case 3:
			System.out.println("========= Update the song ===============");
			songOpertions.updateSong();
			break;

		case 4:
			System.out.println("=========== Delete Songs ==========");
			songOpertions.deleteSong();
			break;

		case 5:
			System.out.println("=========== Find Songs ==========");
			songOpertions.findSong();
			break;
		case 6:
			loop = false;
		default:
			System.out.println(" Enter Invalid Number ");
		}
	}
}
