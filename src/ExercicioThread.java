
public class ExercicioThread {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {

		    @Override
		    public void run() {
		        System.out.println("Executando um Runnable");
		    }

		}).start();

	}
	
}
