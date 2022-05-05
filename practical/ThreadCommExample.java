class Producer extends Thread{
	Data d;
	public Producer(Data d) {
	this.d=d;
	}
	public void run() {
	for(int j =1;j<=5;j++)
	{
	d.produce(j);
	}
	}
}
class Consumer extends Thread{
	Data d;
	public Consumer(Data d) {
	this.d=d;
	}
	public void run() {
	for(int K =1;K<=5;K++)
	{
	d.consumer();
	}
	}
}
public class ThreadCommExample {
public static void main(String[] args) {
	Data d = new Data();
	Producer p = new Producer(d);
	Consumer c = new Consumer(d);
	p.start();
	c.start();

	}

}
