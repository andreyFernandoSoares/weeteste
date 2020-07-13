package com.teste.weecode.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	public Date converterData(String data) {
		try {
			if (data != null && !"".equals(data))
				return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(data);
			else 
				return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
