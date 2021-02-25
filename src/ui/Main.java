package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import src.Queue;

public class Main {
	//Buenas, acabo de importar esto (la clase Queue de el src) y me di cuenta que se llama igual que la clase Queue delas listas, sooo mala mía pero me da pereza cambiarlo
	public Queue objQueue;
	public BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	public BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

	
	public Main() {
		objQueue= new Queue();
	}
	public static void main(String[] args) {
		Main ui=new Main();
		ui.manageQueues();
	}


	public void manageQueues() {
		int queues=0;
		ArrayList<double[]> queue=new ArrayList<>();
		try {
			queues= Integer.parseInt(br.readLine());
			for(int c=0;c<queues;c++) {
				queue.add(giveValues());
			}
			for(int c=0;c<queues;c++) {
				bw.write(objQueue.sortQueue(queue.get(c))+"\n");
				bw.flush();
			}

		} catch (IOException e) {
			System.out.println("algo salio mal :c");
			e.printStackTrace();
		}

	}

	public double[] giveValues() {
		double[] newQueue = null; 
		String sQueue="";
		String[] ArraySQueue;
		try {
			sQueue=br.readLine();
			ArraySQueue= sQueue.split(" ");
			newQueue= new double[ArraySQueue.length];
			for(int c=0;c<ArraySQueue.length;c++) {
				newQueue[c]=Double.parseDouble(ArraySQueue[c]);
			}

		}catch (IOException e) {
			System.out.println("algo salio mal :c");
			e.printStackTrace();
		}
		return newQueue;
	}
}
