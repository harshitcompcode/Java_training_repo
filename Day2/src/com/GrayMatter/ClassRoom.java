package com.GrayMatter;

import java.util.Arrays;

public class ClassRoom {
	
	int classNum;
	int floorNum;
	Student st[];
	
	@Override
	public String toString() {
		return "ClassRoom [classNum=" + classNum + ", floorNum=" + floorNum + ", st=" + Arrays.toString(st) + "]";
	}

	

	public ClassRoom(int classNum, int floorNum, Student[] st) {
		super();
		this.classNum = classNum;
		this.floorNum = floorNum;
		this.st = st;
	}



	public ClassRoom() {
		super();
	}

	public ClassRoom(int classNum, int floorNum) {
		super();
		this.classNum = classNum;
		this.floorNum = floorNum;
	}
	
	
}
