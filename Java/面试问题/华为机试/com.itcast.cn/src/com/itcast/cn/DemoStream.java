package com.itcast.cn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

public class DemoStream {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream(new File("/c/d"));
			BufferedReader br = new BufferedReader(new Reader() {
				
				@Override
				public int read(char[] arg0, int arg1, int arg2) throws IOException {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public void close() throws IOException {
					// TODO Auto-generated method stub
					
				}
			});
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
