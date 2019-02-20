public class EjecucionRunnable implements Runnable {

	private Countries countries;
	private long initialTime;

	public EjecucionRunnable(Countries countries, long initialTime) {
		this.countries = countries;
		this.initialTime = initialTime;
	}

	@Override
	public void run() {
		System.out.println(""La Ejecucion " + Thread.currentThread().getName() 
				+ "" COMIENZA A PROCESAR " + this.countries.getNombre() 
				+ " EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");

		for (int i = 0; i < this.countries.getCarroCompra().length; i++) { 			
                    this.esperarXsegundos(countries.getCarroCompra()[i]);
               	    System.out.println("Procesado el producto " + (i + 1) + " del " + this.countries.getNombre()+ 
                    "->Tiempo: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
		}

		System.out.println(""La Ejecucion " + Thread.currentThread().getName() + "" HA TERMINADO " 
				+ this.countries.getNombre() + " EN EL TIEMPO: "
				+ (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");

	}

	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

       // getter y setter


