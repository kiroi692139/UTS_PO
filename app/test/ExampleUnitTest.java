public class PDFReaderTest {
    @Test
    public void testPDFLoading() {
        // Test logika bisnis tanpa Android runtime
        PDFReader reader = new PDFReader();
        assertNotNull(reader.loadDocument("sample.pdf"));
    }
}