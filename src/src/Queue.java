package src;


import java.text.DecimalFormat;


public class Queue {
	private static DecimalFormat df = new DecimalFormat("0.00");
	public String sortQueue(double[] queue) {
		boolean changed=true;
		double flag=0;
		double fullCicle=queue.length-1;
		double innerCicle=0.0;
		for(int c=1;c <queue.length && changed;c++) {
			changed=false;
			for(int i=0;i<queue.length-c;i++) {
				if(queue[i]>queue[i+1]) {
					flag=queue[i];
					queue[i]=queue[i+1];
					queue[i+1]=flag;
					changed=true;
					innerCicle++;

				}

			}
		}

		return  (df.format((((innerCicle/fullCicle)*100.0)/100.0)) +"-"+ printQueue(queue)) ;
	}

	public String printQueue(double[] queue) {
		String arrayS="";

		for(int c=0;c<queue.length;c++) {
			if(c==0) {
				arrayS+=queue[0];
			}else {
				arrayS+=" "+queue[c];
			}
		}
		return arrayS;
	}
}
