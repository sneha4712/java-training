package com.celcom.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ImageCopy {

	public static void main(String[] args) throws IOException {
		FileInputStream fr = new FileInputStream("D://Flower.jpg");
		FileOutputStream fw = new FileOutputStream("D://Flower1.jpg");
		int ch=0;
		while((ch=fr.read())!= -1) {
			
		}
		fr.close();
		fw.close();
		System.out.println("Image Copied");

	}

}
