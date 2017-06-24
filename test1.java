package com.damnivic.qrcode;

import java.io.File;
import java.util.Hashtable;
import com.google.zxing.BarcodeFormat;   
import com.google.zxing.EncodeHintType;   
import com.google.zxing.MultiFormatWriter;   
import com.google.zxing.client.j2se.MatrixToImageWriter;   
import com.google.zxing.common.BitMatrix;    

public class test1 {
	public static void main(String []args)throws Exception{   
        String text = "http://blog.csdn.net/feiyu84/article/details/9089497";   
        int width = 500;   
        int height = 500;   
        String format = "png";   
        Hashtable<EncodeHintType, String> hints= new Hashtable<EncodeHintType, String>();   
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");   
         BitMatrix bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, width, height,hints);   
         File outputFile = new File("new.png");
         MatrixToImageWriter.writeToPath(bitMatrix, format, outputFile.toPath());   
    }   

}
