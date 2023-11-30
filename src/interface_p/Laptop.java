package interface_p;



public interface Laptop {
	
	public void cut();
	
	public void copy();
	
	public void paste();
	
	public void keyboard();
	
	default void Security() {
		commoncode();
		System.out.println("laptop security code");
	}
		
	static void audio() {
		commoncode();
		System.out.println("laptop audio");
	}
	
	private static void commoncode() {
		
		System.out.println("commoncode");
	
	
	
	}

}
