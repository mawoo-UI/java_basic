package lesson18_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DateInOutEx2 {
	public static void main(String[] args) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("원주율2.txt"));
		dos.writeInt(1);
		dos.writeLong('10');
		dos.writeChar('가');
		dos.writeChar('a');
		dos.writeChars("");
		
		
		
		
		dos.close();
		DataInputStream dis = new DataInputStream(new FileInputStream("원주율2.txt"));
		int d = dis.readInt();
		System.out.println(dis.read());
		System.out.println(dis.readInt());
		System.out.println(dis.readInt());
		System.out.println(dis.readShort());
		dis.close();
	}
}
