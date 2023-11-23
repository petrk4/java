package Task3;

// Конкретная реализация текстового документа
public class TextDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Text document opened.");
    }

    @Override
    public void save() {
        System.out.println("Text document saved.");
    }
}

