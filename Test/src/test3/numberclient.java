package test3;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class numberclient {
	/*
	 * 
	 * - 클라이언트는 서버에 접속을 한다. - 서버에 접속 후 사용자로 부터 필요한 숫자를 입력 받음 - 받은 숫자를 서버로 전송함 - 서버로
	 * 전송 후 받은 약수 목록 및 약수들의 합을 출력할 것.
	 * 
	 */
	public static void main(String[] args) {
		Socket server = null;
		BufferedReader br = null;
		DataOutputStream dos = null;
		Scanner sc = null;
		try {
			server = new Socket("127.0.0.1",9999);
			dos = new DataOutputStream(server.getOutputStream());
			br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			sc = new Scanner(System.in);
			System.out.print("숫자 입력 : ");
			int ea = sc.nextInt();
			dos.writeInt(ea);
			dos.flush();
			String str = br.readLine();
			String[] arr = str.split("\t");
			int sum = 0;
			for(String s : arr)
				sum += Integer.parseInt(s);
			System.out.println("보낸 숫자의 약수들의 총합 : " + sum);
		
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null)br.close();
				if(dos != null)dos.close();
				if(server != null)server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}