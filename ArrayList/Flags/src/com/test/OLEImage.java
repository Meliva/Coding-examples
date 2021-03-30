package com.test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class OLEImage 
{
	private Map<String, String> imagesBeginBlock;

	public OLEImage()
	{
		imagesBeginBlock = new HashMap<String, String>();
		imagesBeginBlock.put("JPEG", "\u00FF\u00D8\u00FF");
		imagesBeginBlock.put("PNG", "\u0089PNG\r\n\u001a\n");
		imagesBeginBlock.put("GIF", "GIF8");
		imagesBeginBlock.put("TIFF", "II*\u0000");
		imagesBeginBlock.put("BMP", "BM");
	}

	public byte[] getByteImgFromOLEInputStream(InputStream input, String imageFormat)
	{
		String beginBlock = imagesBeginBlock.get(imageFormat);
		if(beginBlock == null)
		{
			throw new RuntimeException("Unsupported image format parameter value.");
		}
		try
		{
			byte[] b = toByteArray(input);
			String str = new String(b, "ISO-8859-1");
			int index = str.indexOf(beginBlock);
			if(index == -1)
			{
				throw new RuntimeException("Unable to determine image format");
			}
			byte[] buffer = new byte[b.length - index];
			for(int i = 0, a = index; a < b.length; i++, a++)
			{
				buffer[i] = b[a];
			}
			return buffer;
		} catch(IOException e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public byte[] toByteArray(InputStream is) throws IOException
	{
		int len;
		int size = 1024;
		byte[] buf;
		if(is instanceof ByteArrayInputStream)
		{
			size = is.available();
			buf = new byte[size];
			len = is.read(buf, 0, size);
		}else
		{
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			buf = new byte[size];
			while ((len = is.read(buf, 0, size)) != -1)
			{
				bos.write(buf, 0, len);
			}
			buf = bos.toByteArray();
		}
		return buf;
	}
}
