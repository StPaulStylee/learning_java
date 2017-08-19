package com.training.java.libraries;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Internet {

	private static final String FLOWERS_SEED = "http://services.hanselandpetal.com/feeds/flowers.xml";
	
	public static void main(String[] args) throws IOException {
		
		BufferedInputStream buf = null;
		InputStream stream = null;	
		try {
			URL url = new URL(FLOWERS_SEED);
			stream = url.openStream();
			buf = new BufferedInputStream(stream);
			
			StringBuilder sb = new StringBuilder();
			
			while (true) {
				int data = buf.read();
				if(data == -1) {
					break;
				} else {
					sb.append((char)data);
				}
			}
			
			System.out.println(sb);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			stream.close();
			buf.close();
		}
		
	}

}
