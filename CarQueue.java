import java.util.*;

public class CarQueue {

	public static final int UP = 0;
	public static final int DOWN = 1;
	public static final int RIGHT = 2;
	public static final int LEFT = 3;

	private ArrayDeque<Integer> queue;
	private Random random = new Random();

	/*
	 * 3. In your constructor, place 5 or 6 numbers in the queue so that when the
	 * animation starts – there will be something to retrieve from the queue
	 */
	public CarQueue() {

		// new instance of queue
		queue = new ArrayDeque<Integer>();

		// add directions to the queue

		for (int i = 0; i < 5; i++) {
			// place 5 or 6 numbers in the queue
			queue.add(random.nextInt(4));
		}
	}

	/*
	 * The addToQueue method that has a class that implements runnable, define the
	 * run method (add random directions into the queue and then sleep), creates an
	 * instance of the runnable object, creates a thread and starts the thread.
	 */
	public void addToQueue() {

		class Animation implements Runnable {

			// Run method
			@Override
			public void run() {

				// if running

				while (true) {

					try {
						// add random directions between 0 - 4
						queue.add(random.nextInt(4));

						// sleep
						Thread.sleep(400);

					} catch (java.lang.InterruptedException e) {

						// thrown when a thread is interrupted while it's waiting, sleeping, or
						// otherwise occupied
						e.printStackTrace();
					}
				}

			}

		}

		// Create an instance of the runnable object
		Animation moveCar = new Animation();

		// Create a thread instance
		Thread thread = new Thread(moveCar);

		// starts the thread.
		thread.start();

	}

	public int deleteQueue() {

		int deletedQueue = queue.remove();

		return deletedQueue;

	}

}
