package de.hska.iwi.avg.uebung.g14.ordersystem.service;

public class StoreException extends IllegalArgumentException {
	 private static final long serialVersionUID = 4867667611097919943L;
	    	    
	    public StoreException() {
	        super("Der eingegebene Datensatz konnte nicht gespeichert werden.");
	    }

}
