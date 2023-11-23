package Task3;

// Фабрика для создания текстового документа
public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        System.out.println("Creating a new text document.");
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        System.out.println("Opening a text document.");
        return new TextDocument();
    }
}

