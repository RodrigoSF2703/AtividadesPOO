package View;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import Models.Proprietario;
import Models.Animal;
import Models.Cao;
import Models.Gato;
import Models.Passaro;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class RelatorioPDFView {
    public static void gerarRelatorioPDF(List<Proprietario> proprietarios, String cpfFiltro, int idAnimalFiltro) {
        Document document = new Document();
        
        try {
            PdfWriter.getInstance(document, new FileOutputStream("relatorio.pdf"));
            document.open();
            
            for (Proprietario proprietario : proprietarios) {
                if (cpfFiltro == null || cpfFiltro.equals(proprietario.getCpf())) {
                    document.add(new Paragraph("Nome do Proprietário: " + proprietario.getNome()));
                    document.add(new Paragraph("Animais:"));
                    
                    for (Animal animal : proprietario.getAnimais()) {
                        if (idAnimalFiltro == 0 || idAnimalFiltro == animal.getId()) {
                            String tipoAnimal = "";
                            
                            if (animal instanceof Cao) {
                                tipoAnimal = "Cão";
                            } else if (animal instanceof Gato) {
                                tipoAnimal = "Gato";
                            } else if (animal instanceof Passaro) {
                                tipoAnimal = "Pássaro";
                            }
                            
                            document.add(new Paragraph("Nome do Animal: " + animal.getNome() + ", Tipo de Animal: " + tipoAnimal));
                        }
                    }
                    
                    document.add(new Paragraph("--------------------------"));
                }
            }
            
            document.close();
            System.out.println("Relatório em PDF gerado com sucesso!");
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }
}

