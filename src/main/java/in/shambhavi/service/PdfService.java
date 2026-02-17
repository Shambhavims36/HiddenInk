package in.shambhavi.service;

public interface PdfService {
	
	public byte[] generatePdf(String content);

    public String savePdf(byte[] pdfBytes);

}
