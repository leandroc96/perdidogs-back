package com.perdidogs.PerdidogsBackend.helper;

import com.fasterxml.jackson.databind.util.StdConverter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class LocalDateTimeDeserializer extends StdConverter<String, LocalDateTime> {
	private static final long serialVersionUID = 1L;
	
	/**
     * Attempt to parse the given string of form: yyyy-MM-dd[THH:mm:ss[.SSS][Z]]
     * as a Date. If the string is not of that form, return null.
     * 
     * @param dateString
     *            the date string to parse
     * @return Date the date, if parse was successful; null otherwise
     */
    public static LocalDateTime parseDateAsUTC(String dateString) {
        if (dateString == null || dateString.length() == 0) {
            return null;
        }
        String pattern = "";
        int length = dateString.length();
        if (dateString.startsWith("-")) {
            length--;
        }
        if (dateString.endsWith("Z")) {
            if (length == 11) {
            	pattern = "yyyy-MM-dd'Z'";
            } else if (length == 20) {
            	pattern =  "yyyy-MM-dd'T'HH:mm:ss'Z'";
            } else if (length == 22) {
            	pattern = "yyyy-MM-dd'T'HH:mm:ss.S'Z'";
            } else if (length == 23) {
            	pattern = "yyyy-MM-dd'T'HH:mm:ss.SS'Z'";
            } else if (length == 24) {
            	pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
            }
        } else {
            if (length == 10) {
            	pattern = "yyyy-MM-dd";
            } else if (length == 19) {
            	pattern = "yyyy-MM-dd'T'HH:mm:ss";
            } else if (length == 21) {
            	pattern = "yyyy-MM-dd'T'HH:mm:ss.S";
            } else if (length == 22) {
            	pattern = "yyyy-MM-dd'T'HH:mm:ss.SS";
            } else if (length == 23) {
            	pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS";
            } else if (dateString.endsWith("GMT") || dateString.endsWith("UTC")) {
            	pattern = "EEE, dd MMMM yyyyy HH:mm:ss z";
            }
        }
		
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern); 
		return LocalDateTime.parse(dateString, formatter);

    }

	@Override
	public LocalDateTime convert(String value) {
		return parseDateAsUTC(value);
	}

}
