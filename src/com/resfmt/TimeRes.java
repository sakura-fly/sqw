package com.resfmt;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeRes {
	public static String time(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());
	}
}
