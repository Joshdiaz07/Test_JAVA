public class MainExecutor {
    
    private static final int numEjecuciones = 2;

    public static void main(String[] args) {

        ArrayList<Countries>countries = new ArrayList<Countries>();
        countries.add(new Countries("United States", new int[] { 2, 2, 1, 5, 2 })); // 12 Seg
        countries.add(new Countries("England", new int[] { 1, 1, 5, 1, 1 })); //  9 Seg
        countries.add(new Countries("Germany", new int[] { 5, 3, 1, 5, 2 })); // 16 Seg
        countries.add(new Countries("Netherlands", new int[] { 2, 4, 3, 2, 5 })); // 16 Seg
        countries.add(new Countries("Slovenia", new int[] { 1, 3, 2, 2, 3 })); // 11 Seg
        
        long init = System.currentTimeMillis();  // Instante inicial del procesamiento
        
        ExecutorService executor = Executors.newFixedThreadPool(numEjecuciones);
        for (Countries countries: countries) {
            Runnable ejecucion = new EjecucionRunnable(countries, init);
            executor.execute(ejecucion);
        }
        executor.shutdown();	// Cierro el Executor
        while (!executor.isTerminated()) {
        	// Espero a que terminen de ejecutarse todos los procesos 
        	// para pasar a las siguientes instrucciones 
        }
        
        long fin = System.currentTimeMillis();	// Instante final del procesamiento
        System.out.println("Tiempo total de procesamiento: "+(fin-init)/1000+" Segundos");
    }
}