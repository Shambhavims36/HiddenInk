package in.shambhavi.serviceImpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import in.shambhavi.service.PdfService;

public class PdfServiceImpl implements PdfService{

	@Override
	public byte[] generatePdf(String content) {
		
		return content.getBytes();
	}

	@Override
	public String savePdf(byte[] pdfBytes) {
		
		String path="files/" + System.currentTimeMillis()+".pdf";
		
		try {
			Files.write(Path.of(path), pdfBytes);
		}
		catch(IOException e) {
			throw new RuntimeException(e);
			
		}
		
		return path;
	}

}
